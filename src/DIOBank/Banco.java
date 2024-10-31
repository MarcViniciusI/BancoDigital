package DIOBank;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    // Construtor que inicializa o nome do banco e as listas de contas e clientes
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();  // Inicializa a lista de contas como um ArrayList vazio
        this.clientes = new ArrayList<>();  // Inicializa a lista de clientes como um ArrayList vazio
    }

    // Retorna o nome do banco
    public String getNome() {
        return nome;
    }

    // Define o nome do banco
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna a lista de contas do banco
    public List<Conta> getContas() {
        return contas;
    }

    // Adiciona uma nova conta à lista de contas do banco
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Adiciona um novo cliente à lista de clientes do banco
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // Lista todos os clientes do banco, imprimindo cada um no console
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);  // Usa o método toString() de Cliente para exibir as informações
        }
    }
}

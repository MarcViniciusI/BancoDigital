package DIOBank;

import java.util.Objects;

public class Cliente {
    private final String nome;
    private String cpf;
    private String email;
    private String telefone;
    
    // Construtor que inicializa todos os atributos do cliente
    public Cliente(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // Método para comparar clientes com base em CPF e email
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf == cliente.cpf && Objects.equals(email, cliente.email);
    }
    // Método hashCode para gerar um hash único baseado em CPF e email
    @Override
    public int hashCode() {
        return Objects.hash(cpf, email);
    }
    // Método toString para exibir informações resumidas do cliente
    @Override
    public String toString() {
        return "Cliente {" + "nome='" + nome + '\'' + ", cpf=" + cpf + ", email='" + email + '\'' + '}';
    }
}
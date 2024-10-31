package DIOBank;

public class BancoService {

    // Instância do banco associada ao serviço, usada para operações de contas e clientes
    private final Banco banco;

    // Construtor que recebe uma instância de Banco para operações de serviço
    public BancoService(Banco banco) {
        this.banco = banco;
    }

    // Método para criar uma conta corrente para o cliente fornecido
    public void criarContaCorrente(Cliente cliente) {
        // Cria uma nova conta corrente associada ao cliente
        ContaCorrente novaConta = new ContaCorrente(cliente);
        
        // Adiciona a nova conta e o cliente ao banco
        banco.adicionarConta(novaConta);
        banco.adicionarCliente(cliente);
    }

    // Método para criar uma conta poupança para o cliente fornecido
    public void criarContaPoupanca(Cliente cliente) {
        // Cria uma nova conta poupança associada ao cliente
        ContaPoupanca novaConta = new ContaPoupanca(cliente);
        
        // Adiciona a nova conta e o cliente ao banco
        banco.adicionarConta(novaConta);
        banco.adicionarCliente(cliente);
    }

    // Método para realizar uma transferência entre contas
    public void transferir(Conta origem, Conta destino, double valor) {
        // Invoca o método de transferência da conta de origem para enviar o valor à conta de destino
        origem.transferir(valor, destino);
    }

    // Método para listar todos os clientes do banco
    public void listarClientes() {
        // Chama o método listarClientes do banco para imprimir todos os clientes cadastrados
        banco.listarClientes();
    }
}

package DIOBank;

public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco("DIO Bank");
        BancoService bancoService = new BancoService(bancoInicial);

        // Criação de clientes e contas
        Cliente manoel = new Cliente("Manoel Figueira", "09799950090", "Manoel Figueira@exemplo.com", "123456789");
        bancoService.criarContaCorrente(manoel);

        Cliente josebenedito = new Cliente("Jose Benedito", "09999950090", "josebenedito@exemplo.com", "8199555555");
        bancoService.criarContaPoupanca(josebenedito);

        // Depositando em conta do Manoel e imprimindo extratos
        Conta contaManoel = bancoInicial.getContas().get(0);
        contaManoel.depositar(100);
        contaManoel.imprimirExtrato();

        Conta contaJosebenedito = bancoInicial.getContas().get(1);
        contaJosebenedito.imprimirExtrato();

        // Transferindo valores entre contas
        bancoService.transferir(contaManoel, contaJosebenedito, 48);
        contaManoel.imprimirExtrato();
        contaJosebenedito.imprimirExtrato();

        // Listar todos os clientes
        bancoService.listarClientes();
    }
}

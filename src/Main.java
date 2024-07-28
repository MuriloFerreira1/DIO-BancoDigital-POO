
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		Cliente murilo = new Cliente("Murilo");
		
		Conta corrente = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Conta contaMurilo = new ContaCorrente(murilo);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco itau = new Banco();
		
		itau.adicionaConta(poupanca);
		itau.adicionaConta(corrente);
		itau.adicionaConta(contaMurilo);
		
		System.out.println("Todas as contas:");
		itau.getContas().forEach(Conta::imprimirInfosComuns);
		
		System.out.println("Contas do Venilton:");
		itau.encontrarContas(venilton).forEach(Conta::imprimirInfosComuns);
	}

}

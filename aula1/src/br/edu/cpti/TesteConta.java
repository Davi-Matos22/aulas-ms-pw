package br.edu.cpti;

public class TesteConta {
	public static void main(String[] args) {
		//conta 1
		Conta conta1 = new Conta();
		
		conta1.setNumeroConta("500");
		conta1.setSaldo(5000.);
		conta1.deposito(100.0);
		System.out.println("Conta: " + conta1.getNumeroConta() + "\n" +  "Saldo: "+ conta1.getSaldo());
		System.out.println(conta1.saque(1000.) + " Saldo após saque: "+ conta1.getSaldo());
		
		
		//conta 2
		Conta conta2 = new Conta();
		
		conta2.setNumeroConta("200");
		conta2.setSaldo(2000.);
		conta2.deposito(200.0);
		System.out.println("Conta: " + conta2.getNumeroConta()  + "\n" + "Saldo: "+ conta2.getSaldo());
		System.out.println(conta2.saque(2000.) + " Saldo após saque: "+ conta2.getSaldo());
	}
}

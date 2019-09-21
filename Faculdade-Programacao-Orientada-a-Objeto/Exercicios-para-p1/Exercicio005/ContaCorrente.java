package Exercicio005;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
	
	private double taxaDeOperacao;
	
	public ContaCorrente(int conta, int saldo) {
		
		super(conta, saldo);
		this.taxaDeOperacao = 5.0;
	}

	@Override
	public void sacar(double p) {
		
		if ( (this.saldo - (p+this.taxaDeOperacao)) >= 0 ) {
			this.saldo -= (p+this.taxaDeOperacao);
			System.out.println("Saldo atual: " + this.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void depositar(double p) {
		
		if ( (this.saldo + p) - this.taxaDeOperacao >= 0 ) {
			this.saldo += (p - this.taxaDeOperacao);
			System.out.println("Saldo atual: " + this.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("Saldo: " + this.saldo);
	}

}

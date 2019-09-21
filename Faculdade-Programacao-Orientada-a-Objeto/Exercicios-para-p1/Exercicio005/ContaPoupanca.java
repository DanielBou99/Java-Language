package Exercicio005;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{

	private double limite;
	
	public ContaPoupanca(int conta, int saldo) {
		
		super(conta, saldo);
		this.limite = 50;
	}

	@Override
	public void sacar(double p) {
		
		if ( ((this.saldo + this.limite) - p) >= 0) {
			this.saldo -= p;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	@Override
	public void depositar(double p) {

		this.saldo += p;
	}
	
	@Override
	public void mostrarDados() {
		
		System.out.println("Saldo: " + this.saldo);
	}
}

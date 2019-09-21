package Exercicio005;

public abstract class ContaBancaria {
	
	protected int conta;
	protected int saldo;
	
	public ContaBancaria(int conta, int saldo) {
		
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public abstract void sacar(double p);
	
	public abstract void depositar(double p);

}

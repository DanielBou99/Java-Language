package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double totalASacar = valor + 0.2;
		return super.saca(totalASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getValorImposto() {
		return 100;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
}

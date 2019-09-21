package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma conta no bytebank.
 * 
 * @author Daniel Bou
 *
 */

public abstract class Conta implements Comparable<Conta>{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia,int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Conta criada.");
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @return
	 */
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			destino.deposita(valor);
			this.saldo -= valor;
			return true;
		} return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.getAgencia() + " Conta: " + this.getNumero();
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outra = (Conta) obj;
		
		if (this.agencia == outra.getAgencia()) {
			if (this.numero == outra.getNumero()) {
				return true;
			}
		}
		return false;
	}
	
	/*@Override
	public int compareTo(Conta o) {
		return Integer.compare(this.agencia, o.agencia);
	} */ // Ordenar a lista pelo numero da agencia.
	
	@Override
	public int compareTo(Conta o) {
		return this.getTitular().getNome().compareTo(o.titular.getNome());
	} // Ordenar a lista pelo nome do titular.
	
}
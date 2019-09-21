package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToStringObject {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(1,2);
		Conta cp = new ContaPoupanca(4,5);
		
		System.out.println(cc);
		System.out.println(cp);
		
	}

}

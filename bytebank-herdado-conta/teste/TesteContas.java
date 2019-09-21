package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaPoupanca CP = new ContaPoupanca(133, 133);
		ContaCorrente CC = new ContaCorrente(117, 117);
		
		CP.deposita(100);
		CC.deposita(200);
		CP.transfere(50, CC);
		CC.saca(40);
		
		System.out.println("CC: " + CC.getSaldo());
		System.out.println("CP: " + CP.getSaldo());
		
		
	}

}

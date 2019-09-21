package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(111,111);
		contas.add(cc);
		
		ContaPoupanca cp = new ContaPoupanca(555, 555);
		contas.add(cp);
		
		ContaCorrente cc2 = new ContaCorrente(111,111);
		
		boolean existe = contas.contains(cc2);
		System.out.println("Existe? " + existe);
		
		for (Conta x: contas) {
			System.out.println(x);
		}

	}

}

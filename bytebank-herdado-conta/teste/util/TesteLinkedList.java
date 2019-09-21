package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		List<Conta> contas = new LinkedList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(111,111);
		contas.add(cc);
		
		ContaPoupanca cp = new ContaPoupanca(555, 555);
		contas.add(cp);
		
		System.out.println("Total de contas: " + contas.size());
		
		Conta ref = contas.get(0);
		System.out.println(ref);
		
		contas.remove(0);
		
		System.out.println("Tamanho da conta: " + contas.size());
		
		cc = new ContaCorrente(555, 777);
		contas.add(cc);
		cp = new ContaPoupanca(111, 999);
		contas.add(cp);
		cc = new ContaCorrente(555, 888);
		contas.add(cc);
		System.out.println("Tamanho da conta: " + contas.size());
		
		for (Conta x: contas) {
			System.out.println(x);
		}

	}

}

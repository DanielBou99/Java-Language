package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto ArrayList: " + tempoDeExecucao);
        
        Collection<Integer> numeros2 = new HashSet<Integer>();

        long inicio2 = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros2.add(i);
        }

        for (Integer numero : numeros2) {
            numeros2.contains(numero);
        }

        long fim2 = System.currentTimeMillis();

        long tempoDeExecucao2 = fim2 - inicio2;

        System.out.println("Tempo gasto HashSet: " + tempoDeExecucao2);

	}

}

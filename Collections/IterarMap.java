package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class IterarMap {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        System.out.println("Nomes:"); 
        pessoas.keySet().forEach(idade -> { System.out.println(pessoas.get(idade)); }); // 1a maneira de fazer
        
        for (Integer x : pessoas.keySet()) { // 2a maneira de fazer
			System.out.println(pessoas.get(x));
		}

	}

}

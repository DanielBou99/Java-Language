package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
	
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String x : aulas) {
			System.out.println("Aula: " + x);
		}
		
		String primeiraAula = aulas.get(0);
		
		System.out.println("A 1� aula � " + primeiraAula);
		
		for (int i=0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula -> { System.out.println("Percorrendo: " + aula); });
		
		aulas.add("Aumentando nosso conhecimento");
		
		System.out.println("Nao ordenado: " + aulas);
		Collections.sort(aulas);
		System.out.println("Ordenado: " + aulas);
		
	}
}

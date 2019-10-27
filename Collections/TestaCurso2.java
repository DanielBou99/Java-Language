package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso colecoesJava = new Curso("Java","Daniel Bou");
	
		colecoesJava.AdicionaAula(new Aula("Segunda aula", 30));
		colecoesJava.AdicionaAula(new Aula("Terceira aula", 40));
		colecoesJava.AdicionaAula(new Aula("Primeira aula", 20));
		
		List<Aula> aulasImutaveis = colecoesJava.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);	
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(colecoesJava.getTempoTotal());

		System.out.println(colecoesJava);
		
	}

}

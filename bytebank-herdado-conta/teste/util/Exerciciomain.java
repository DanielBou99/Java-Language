package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exerciciomain {

	public static void main(String[] args) {
	    Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);
	    Aula aulaIntro = new Aula("Introdução às Coleções", 20);
	    Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);


	    List<Aula> aulas = new ArrayList<Aula>();
	    aulas.add(aulaIntro);
	    aulas.add(aulaModelando);
	    aulas.add(aulaSets);

	    Collections.sort(aulas);
	    
	    //Collections.shuffle(aulas); // Embaralhar
	    //Collections.rotate(aulas, 1); // Rotacionar
	    //	Collections.reverse(aulas); // Inverter
	    
	    for (Aula aula : aulas) {
	        System.out.println(aula);
	    }
	}
	
}

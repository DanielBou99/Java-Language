package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<String>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche");
		
		System.out.println(alunos);
		
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos);
	}
}

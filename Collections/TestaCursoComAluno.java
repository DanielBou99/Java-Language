package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("Java", "Daniel");
	
		java.AdicionaAula(new Aula("Primeira aula", 20));
		java.AdicionaAula(new Aula("Segunda aula", 10));
		java.AdicionaAula(new Aula("Terceira aula", 10));
		
		java.adicionaAluno(new Aluno("Joao", 1));
		java.adicionaAluno(new Aluno("Maria", 2));
		java.adicionaAluno(new Aluno("Jorge", 3));
		
		System.out.println(	java.estaMatriculado(new Aluno("Joao", 1)));

		Aluno busca = java.buscaMatriculado(7);
		
		System.out.println("Aluno: " + busca);
		
	}
}

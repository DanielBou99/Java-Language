package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso colecoesJava = new Curso("Java","Daniel Bou");
		
		colecoesJava.AdicionaAula(new Aula("Primeira aula", 20));
		colecoesJava.AdicionaAula(new Aula("Segunda aula", 30));
		
		System.out.println(colecoesJava.getAulas());

	}

}

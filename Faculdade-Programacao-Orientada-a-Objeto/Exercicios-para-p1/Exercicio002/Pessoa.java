package Exercicio002;

import java.util.Calendar;

/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, 
 * ano de nascimento e altura. Crie os métodos públicos sets e gets e também um 
 * método que retorna a idade da pessoa. Utilize a classe Calendar para pegar o 
 * ano atual (https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)*/

public class Pessoa {

	private String nome;
	private int anoDeNascimento;
	private double altura;
	
	public Pessoa(String nome, int anoDeNascimento, double altura) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeNascimento() {
		return this.anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void idade() {
		
		Calendar c = Calendar.getInstance();
        System.out.println("Idade: " + (c.get(Calendar.YEAR) - this.anoDeNascimento) );
	}
	
	
	
	
	
}

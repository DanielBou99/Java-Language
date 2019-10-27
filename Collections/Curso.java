package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void AdicionaAula(Aula aula) {
		this.aulas.add(aula);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public void adicionaAluno(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", Tempo total: " + this.getTempoTotal() + " - Instrutor: " + this.getInstrutor() + "]";
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int matricula) {
		if (!this.matriculaParaAluno.containsKey(matricula))
			throw new NoSuchElementException();
		return this.matriculaParaAluno.get(matricula);
	}
	
}

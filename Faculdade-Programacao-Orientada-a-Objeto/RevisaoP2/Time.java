package RevisaodaP2;

public class Time implements Comparable<Time>{
	
	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int pontos;

	public Time(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getPontos() {
		return this.pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public void calcularPontos() {
		this.pontos = this.vitorias * 3 + this.empates;
	}
	@Override
	public int compareTo(Time o) {
		return this.pontos - o.getPontos();
	}
	@Override
	public boolean equals(Object obj) {
		Time outro = (Time) obj;
		return this.nome.compareTo(outro.getNome()) == 0;
	}
}

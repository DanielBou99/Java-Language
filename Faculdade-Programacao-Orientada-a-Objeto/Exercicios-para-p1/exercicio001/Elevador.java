package exercicio001;

/*Crie uma classe denominada Elevador para armazenar informações 
 * de um elevador dentro de um prédio. A classe deve armazenar o 
 * andar atual (térreo=0), total de andares no prédio (desconsiderando 
 * o térreo), capacidade do elevador e quantas pessoas estão presentes 
 * nele. A classe deve também disponibilizar os seguintes métodos:
 * 
- construtor: deve receber como parâmetros a capacidade do elevador 
e o total de andares no prédio;
- receber: deve acrescentar uma pessoa ao elevador (só deve acrescentar 
se ainda tiver espaço)
- entregar: deve remover uma pessoa ao elevador (só deve remover se tiver 
alguém no elevador)
- subir: acrescentar 1 ao andar atual (não pode subir se já estiver no último andar);
- descer: remover 1 ao andar atual (não pode descer no térreo);*/
public class Elevador {
	
	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeElevador;
	private int pessoasNoElevador;
	
	public Elevador(int capacidadeElevador, int totalDeAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalDeAndares = totalDeAndares;
		this.andarAtual = 0;
		this.pessoasNoElevador = 0;
	}
	
	public void receber() {
		if(this.pessoasNoElevador < this.capacidadeElevador) {
			this.pessoasNoElevador++;
			System.out.println("+1 pessoa entrou no elevador.");
		} else {
			System.out.println("O elevador esta cheio.");
		}
	}
	
	public void entregar() {
		if(this.pessoasNoElevador > 0) {
			this.pessoasNoElevador--;
			System.out.println("1 pessoa saiu do elevador.");
		} else {
			System.out.println("O elevador esta vazio.");
		}
	}
	
	public void subir() {
		if(this.andarAtual < this.totalDeAndares) {
			this.andarAtual++;
			System.out.println("O elevador subiu 1 andar.");
		} else {
			System.out.println("O elevador esta no ultimo andar.");
		}
	}
	
	public void descer() {
		if(this.andarAtual > 0) {
			this.andarAtual++;
			System.out.println("O elevador desceu 1 andar.");
		} else {
			System.out.println("O elevador esta no terreo.");
		}
	}

}

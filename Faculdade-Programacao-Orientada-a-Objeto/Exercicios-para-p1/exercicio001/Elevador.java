package exercicio001;

/*Crie uma classe denominada Elevador para armazenar informa��es 
 * de um elevador dentro de um pr�dio. A classe deve armazenar o 
 * andar atual (t�rreo=0), total de andares no pr�dio (desconsiderando 
 * o t�rreo), capacidade do elevador e quantas pessoas est�o presentes 
 * nele. A classe deve tamb�m disponibilizar os seguintes m�todos:
 * 
- construtor: deve receber como par�metros a capacidade do elevador 
e o total de andares no pr�dio;
- receber: deve acrescentar uma pessoa ao elevador (s� deve acrescentar 
se ainda tiver espa�o)
- entregar: deve remover uma pessoa ao elevador (s� deve remover se tiver 
algu�m no elevador)
- subir: acrescentar 1 ao andar atual (n�o pode subir se j� estiver no �ltimo andar);
- descer: remover 1 ao andar atual (n�o pode descer no t�rreo);*/
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

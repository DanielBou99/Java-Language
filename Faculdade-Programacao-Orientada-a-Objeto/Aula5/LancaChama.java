package Exercicio001;

public class LancaChama extends Arma implements Disparavel {
	
	private double gas;
	
	public LancaChama() {
		this.destruicao = 200;
		this.gas = 100;
	}

	@Override
	public void disparar() {
		System.out.print("Lança Chamas - Disparo - Antes: " + this.gas);
		
		if (this.gas > 0) {
			this.gas -= 10;
		}
		System.out.println(" - Quantidade atual: " + this.gas);

	}

	@Override
	public void recarregar() {
		this.gas += 100;
		System.out.println("+100 Gas. Quantidade atual: " + this.gas);

	}
	
	@Override
	public void golpear() {
		System.out.println("Golpe com o Lança Chamas!!" + this.destruicao);
	}

}

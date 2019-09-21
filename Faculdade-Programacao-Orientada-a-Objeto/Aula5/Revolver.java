package Exercicio001;

public class Revolver extends Arma implements Disparavel {
	
	private int cartucho;
	
	public Revolver() {
		this.destruicao = -100;
		this.cartucho = 10;
	}

	@Override
	public void disparar() {
		System.out.print("Revolver - Disparo - Antes: " + this.cartucho);
		
		if (this.cartucho > 0) {
			this.cartucho--;
		}
		System.out.println(" - Quantidade atual: " + this.cartucho);
		
	}

	@Override
	public void recarregar() {
		this.cartucho += 6;
		System.out.println("+6 Cartuchos. Quantidade atual: " + this.cartucho);
	}

	@Override
	public void golpear() {
		System.out.println("Golpe com o revolver!!" + this.destruicao);
	}
	
	
	
}

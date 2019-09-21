package Exercicio001;

public class Faca extends Arma {

	private int lamina;
	
	public Faca() {
		this.lamina = -10;
	}
	
	public void golpear() {
		System.out.println("Golpe de lamina!! " + this.lamina);
	}
	
}

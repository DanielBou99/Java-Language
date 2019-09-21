package Carro;
/* 
* Vamos fazer um programa para controlar o nível do
* tanque e a kilometragem de 3 carros, em tempo real;

* Devem ser definidas o consumo médio dos carros
* (km/l), cada carro pode ter o seu consumos
* diferentes.

* Uma vez informada a velocidade média do carro, e
* por quanto tempo o carro ficou nesta velocidade,
* deve-se atualizar a kilometragem e o nível do tanque
* de combustível.
*/

public class Carro {
	
	private float tanque = 0;
	private float odometro = 0;
	private float consumoMedio = 0;
	boolean trocapneu;

	public Carro(float consumo, float tanque) {
		 this.trocapneu = false;
		 this.consumoMedio = consumo;
		 this.odometro = 0;
		 this.tanque = tanque;
		 System.out.println("Tanque = " + this.tanque + "L.");
	}

	public void setarVelocidade(float vm, float tempo){	

			 float distancia = vm * tempo;
			 this.odometro += distancia;
			 float litros = distancia / this.consumoMedio;
			 this.tanque -= litros;
			 System.out.println("Tanque = " + this.tanque + "L.");
			 System.out.println("Odometro = " + this.odometro + "Km.");
			 
			 if (odometro >= 30000) {
				 this.trocapneu = true;
			 }		 
	}
	
	public void validarPneu() {
		if (this.trocapneu) {
			System.out.println("Você precisa trocar pneu!!");
		} else {
			System.out.println("Você não precisa trocar o pneu ainda.");
		}
	}
	
	public float getConsumoMedio() {
		return this.consumoMedio;
	}
	
	public void setConsumoMedio(float consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	public float getTanque() {
		return this.tanque;
	}

	public void setTanque(float tanque) {
		this.tanque = tanque;
	}

	public float getOdometro() {
		return this.odometro;
	}

	public void setOdometro(float odometro) {
		this.odometro = odometro;
	}
	
	
		 
}
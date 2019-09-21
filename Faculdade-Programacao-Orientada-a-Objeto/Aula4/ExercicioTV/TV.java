package ExercicioTV;

public class TV {
	
	public static final byte ligar = 0x01;
	public static final byte desligar = 0x02;
	public static final byte aumentaCanal = 0x03;
	public static final byte diminuiCanal = 0x04;
	public static final byte aumentaVol = 0x05;
	public static final byte diminuiVol = 0x06;
	private int canal;
	private int volume;
	private String bateria;
	
	public TV() {
		this.canal = 0;
		this.volume = 0;
	}
	
	public void ligarControle() {
		this.bateria = "Normal";
	}
	
	public void enviar(int opcao) {
		switch (opcao) {
		
			case 1: // ligar
				System.out.println("Codigo enviado: " + TV.ligar);
				break;
			case 2: // desligar
				System.out.println("Codigo enviado: " + TV.desligar);
				break;
			case 3: // aumentar canal
				if (this.canal == 10) {
					this.canal = 0;
				} else {
					this.canal++;
				}
				System.out.println("Codigo enviado: " + TV.aumentaCanal);
				System.out.println("Canal atual: " + this.canal);
				break;
			case 4: // diminuir canal
				if (this.canal == 0) {
					this.canal = 10;
				} else {
					this.canal--;
				}
				System.out.println("Codigo enviado: " + TV.diminuiCanal);
				System.out.println("Canal atual: " + this.canal);
				break;
			case 5: // aumentar volume
				if (this.volume != 30) {
					this.volume++;
				}
				System.out.println("Codigo enviado: " + TV.aumentaVol);
				System.out.println("Volume atual: " + this.volume);
				break;
			case 6: // diminuir volume
				if (this.volume != 0) {
					this.volume--;
				}
				System.out.println("Codigo enviado: " + TV.diminuiVol);
				System.out.println("Volume atual: " + this.volume);
				break;
			default:
				System.out.println("Opção invalida, nenhum cod. enviado.");
		}
	}
	
	

}

package Tanque;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vip tanque = new Vip(100);
		System.out.println("Informe o volume maximo: ");
		float vmax = sc.nextFloat();
		System.out.println("Informe o volume minimo: ");
		float vmin = sc.nextFloat();
		
		tanque.setVolumeMax(vmax);
		tanque.setVolumeMin(vmin);
		int c = 1;
		System.out.println(tanque.exibirInfos());
		
		do {
			if(tanque.getBomba() == true) {
				tanque.encher(10);
			}else {
				tanque.esvaziar(10);
			}
			System.out.println(tanque.getBomba());
			System.out.println(tanque.exibirInfos());
			
			System.out.println("Deseja continuar?");
			c = sc.nextInt();
			
			
		}while(c == 1);
	}

}

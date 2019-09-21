package Aula1;
/*
* 3) Entre com um valor numérico como
* parâmetro pela linha de comando e calcule e
* exiba na tela o fatorial deste número.
*/

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		// int num = Integer.parseInt(args[0]);
		
		int num = entrada.nextInt();
		int guardar = num;
		int i;
		
		for (i=1; i < guardar; i++) {
			num *= i;
		}
		
		System.out.println("Fatorial do numero " + guardar + " é " + num );
	}
	
}

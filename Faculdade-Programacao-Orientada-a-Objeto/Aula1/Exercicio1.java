package Aula1;
/*1) Fa�a um programa que deve receber atrav�s da linha
de comando 3 par�metros (1 nome pr�prio, 1 verbo e
1 substantivo). O programa deve montar uma frase a
sua escolha de forma a receber esses 3 par�metros.
Caso receba uma quantidade de par�metros inferior,
ou superior a este, deve exibir uma mensagem
informando quais par�metros devem ser passados.*/

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// if (args.length == 3) {
		// String nomeProprio = args[0];
		// String verbo = args[1];
		// String substantivo = args[2];
		// }
		
		String nomeProprio = entrada.nextLine();
		String verbo = entrada.nextLine();
		String substantivo = entrada.nextLine();
		
		String frase = verbo + " " + nomeProprio + " " + substantivo;
		
		System.out.println(frase);
		
	}

}

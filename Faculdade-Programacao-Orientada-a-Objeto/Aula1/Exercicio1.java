package Aula1;
/*1) Faça um programa que deve receber através da linha
de comando 3 parâmetros (1 nome próprio, 1 verbo e
1 substantivo). O programa deve montar uma frase a
sua escolha de forma a receber esses 3 parâmetros.
Caso receba uma quantidade de parâmetros inferior,
ou superior a este, deve exibir uma mensagem
informando quais parâmetros devem ser passados.*/

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

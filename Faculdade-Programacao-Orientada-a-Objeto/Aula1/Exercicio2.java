package Aula1;

/* 
* 2) Fa�a um programa que recebe dois
* par�metros num�ricos pela linha de
* comando, e voc� deve exibir na tela qual �
* o maior, qual � o menor, e realizar a
* subtra��o do maior pelo menor, exibindo o
* resultado na tela. 
* */

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
	
		// int num1 = Integer.parseInt(args[0]);
		// int num2 = Integer.parseInt(args[1]);
		
	Scanner entrada = new Scanner(System.in); 
				
	int num1 = entrada.nextInt();
	int num2 = entrada.nextInt();
	
	 System.out.print("Maior n�mero: ");
	 if (num1 > num2)  {
		 System.out.println(num1);
		 System.out.println("Subtra��o: " + num1 + " - " + num2 + " = " + (num1 - num2));
	 } else {
		 System.out.println(num2);
		 System.out.println("Subtra��o: " + num2 + " - " + num1 + " = " + (num2 - num1));
	 }
 
		 

		
	}
	
	
}

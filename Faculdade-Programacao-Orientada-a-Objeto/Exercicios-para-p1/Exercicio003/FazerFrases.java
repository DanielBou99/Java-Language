package Exercicio003;

import java.util.Scanner;

public class FazerFrases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fraseUsuario = sc.nextLine();
		
		System.out.println(fraseUsuario);
		
		Frase frase = new Frase(fraseUsuario);
		
		System.out.println(frase.obterCaracteres());
		System.out.println(frase.getSentenca());
		
	}
	
}

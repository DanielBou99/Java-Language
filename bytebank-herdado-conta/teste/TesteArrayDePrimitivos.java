package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[10];

		for (int i=10; i < 10+idades.length; i++) {
			idades[i-10] = i;
		}
		
		System.out.println("Primeira idade: " + idades[0]);
		System.out.println("Tamanho do array: " + idades.length);
		
	}

}

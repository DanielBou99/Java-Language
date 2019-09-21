package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "daniel bou de souza";
		
		System.out.println(nome);
		
		System.out.println(nome.toUpperCase());
		
		System.out.println(nome.replace('A', 'a'));
		
		System.out.println(nome.charAt(1));
		
		System.out.println(nome.indexOf('z'));
		
		System.out.println(nome.charAt(nome.indexOf('z')));
		
		System.out.println(nome.substring(7));
		
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.print(nome.charAt(i));
		}
		
		String teste  = "     daniel    ";
		
		System.out.println("\n" + teste.trim()); // retira os espaços do começo e do final
		
		System.out.println(nome.contains("za"));
	}

}

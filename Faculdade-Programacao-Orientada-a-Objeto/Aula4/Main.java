/*
*	1- Crie uma classe que retorna o valor da
* constante matemática PI em vários formatos
* primitivos. Faça a adequação necessária
* para que não haja estouro de casas
* decimais.
*	2- No método main( ) crie uma lógica com uma
* escolha do usuário para a exibição do valor
* de PI. 
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//ValorPiComWrapperClass pi = new ValorPiComWrapperClass();
		Scanner sc = new Scanner(System.in);
		int controle = 0;
		
		do {
			System.out.println("Opções para exibir o valor de PI:");
			System.out.println("0 - Sair");
			System.out.println("1- Byte");
			System.out.println("2- String");
			System.out.println("3- Double");
			System.out.println("4- Int");
			controle = sc.nextInt();
			
			switch(controle) {
				
				case 0:
					System.out.println("Bye!!");
					break;
				case 1:
					System.out.println(ValorPiComWrapperClass.ConvertToByte());
					break;
				case 2:
					String palavra = "O resultado de PI é " + ValorPiComWrapperClass.ConvertToString();
					System.out.println(palavra);
					break;
				case 3:
					System.out.println(ValorPiComWrapperClass.ConvertToDouble());
					break;
				case 4:
					int SomarInteiroComWrapper = 10 + ValorPiComWrapperClass.ConvertToInt();
					System.out.println("Resultado da soma: " + SomarInteiroComWrapper);
					break;
				default:
					System.out.println("Opção inválida.");
			}
			
		}	while (controle != 0);

	}

}

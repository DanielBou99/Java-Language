/*
*	1- Crie uma classe que retorna o valor da
* constante matem�tica PI em v�rios formatos
* primitivos. Fa�a a adequa��o necess�ria
* para que n�o haja estouro de casas
* decimais.
*	2- No m�todo main( ) crie uma l�gica com uma
* escolha do usu�rio para a exibi��o do valor
* de PI. 
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//ValorPiComWrapperClass pi = new ValorPiComWrapperClass();
		Scanner sc = new Scanner(System.in);
		int controle = 0;
		
		do {
			System.out.println("Op��es para exibir o valor de PI:");
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
					String palavra = "O resultado de PI � " + ValorPiComWrapperClass.ConvertToString();
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
					System.out.println("Op��o inv�lida.");
			}
			
		}	while (controle != 0);

	}

}

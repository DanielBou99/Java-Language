package ExercicioTV;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		TV plasma = new TV();
		int choice, choice2;
		
		do {
			
			System.out.println("1 - Ligar o controle.");
			System.out.println("2 - Ir dormir.");
			choice = sc.nextInt();
			
			if (choice == 1) {
				do {
					
					System.out.println("1- Ligar.");
					System.out.println("2- Desligar.");
					System.out.println("3- Aumentar canal.");
					System.out.println("4- Diminuir Canal.");
					System.out.println("5- Aumentar Volume.");
					System.out.println("6- Diminuir Volume.");
					
					choice2 = sc.nextInt();
					
						switch (choice2) {
							case 1:
								plasma.enviar(1);
								break;
							case 2:
								plasma.enviar(2);
								choice = 2;
								break;
							case 3:
								plasma.enviar(3);
								break;
							case 4:
								plasma.enviar(4);
								break;
							case 5:
								plasma.enviar(5);
								break;
							case 6:
								plasma.enviar(6);
								break;
	
					}
					
				} while (choice == 1);
				
			}
			
			if (choice == 2) {
				System.out.println("ZZZZzzzzzzzzzzzz...");
			} else {
				System.out.println("Opção invalida.");
			}
			
		} while (choice == 1 || choice != 2);
		
		
		
	}

}

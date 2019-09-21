
public class TestaBreak {

	public static void main(String[] args) {
		
		for (int coluna=0; coluna < 10; coluna++) {
			for (int linha=0; linha < 10; linha++) {
				if (linha > coluna) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

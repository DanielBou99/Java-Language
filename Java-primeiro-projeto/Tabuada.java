
public class Tabuada {

	public static void main(String[] args) {
		
		for (int multiplicador = 1; multiplicador <=10; multiplicador++) {
			for (int multiplicado = 1; multiplicado <=10; multiplicado++) {
				System.out.println(multiplicador + " x " + multiplicado + " = " + multiplicador*multiplicado);
			}
			System.out.println("------------------");
		}
	}
}

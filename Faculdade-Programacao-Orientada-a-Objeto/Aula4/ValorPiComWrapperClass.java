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

public class ValorPiComWrapperClass {

	private static final double PI = Math.PI;
	
	static Double PiWrapper = new Double(PI);
	
	public static String ConvertToString() {
		return PiWrapper.toString();
	}
	
	public static double ConvertToDouble() {
		return PiWrapper.doubleValue();
	}
	
	public static int ConvertToInt() {
		return PiWrapper.intValue();
	}
	
	public static float ConvertToByte() {
		return PiWrapper.floatValue();
	}
	
}

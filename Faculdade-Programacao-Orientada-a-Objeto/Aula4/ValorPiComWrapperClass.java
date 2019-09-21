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

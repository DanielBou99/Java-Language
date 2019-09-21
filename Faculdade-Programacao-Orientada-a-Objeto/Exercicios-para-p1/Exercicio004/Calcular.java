package Exercicio004;

/*Crie a classe Calcular que possui os métodos estáticos somar, 
 * subtrair, multiplicar e dividir, todos os métodos devem 
 * ter versões para receber inteiros ou números reais, e também 
 * versões para retornar números inteiros, reais e String (sobre 
 * carga de métodos e se utilize das Wrapper Classes). Crie um 
 * classe Calculadora que possui o método main, solicita ao 
 * usuário qual a operação desejada, a entrada de dois números 
 * realiza o cálculo usando os métodos estáticos da classe 
 * Calcular e exibe na tela o resultado.
 */

public class Calcular {
	

	public static int somar(int num1, int num2) {
		return num1+num2;	
	}
	public static double somar(double num1, double num2) {
		return num1+num2;	
	}
	public static String somar(String num1, String num2) {
		return String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));	
	}
	
	
	
	public static int subtrair(int num1, int num2) {
		return num1-num2;	
	}
	public static double subtrair(double num1, double num2) {
		return num1-num2;	
	}
	public static String subtrair(String num1, String num2) {
		return String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2));		
	} 
	
	
	
	public static int multiplicar(int num1, int num2) {
		return num1*num2;	
	}
	public static double multiplicar(double num1, double num2) {
		return num1*num2;	
	}
	public static String multiplicar(String num1, String num2) {
		return String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));		
	} 
	
	
	
	public static int dividir(int num1, int num2) {
		return num1/num2;	
	}
	public static double dividir(double num1, double num2) {
		return num1/num2;	
	}
	public static String dividir(String num1, String num2) {
		return String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2));		
	} 
	
}

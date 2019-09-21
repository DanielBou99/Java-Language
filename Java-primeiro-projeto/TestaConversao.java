
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.5;
		int valor = (int) salario;
		
		System.out.println("Valor = " + valor);
		
		long numeroGrande = 323252352352L;
		short valorPequeno = 2131;
		byte muitoPequeno = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Total = " + total);
	}
}

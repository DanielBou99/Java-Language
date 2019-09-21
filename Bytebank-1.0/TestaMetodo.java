
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoDaniel = new Conta();
		contaDoDaniel.saldo = 100;
		contaDoDaniel.deposita(50);
		System.out.println("Conta do Daniel: "+contaDoDaniel.saldo);
		
		Conta contadoZe = new Conta();
		contadoZe.deposita(100);
		contadoZe.deposita(100);
		System.out.println("Conta do Ze: "+contadoZe.saldo);
		
		if (contadoZe.saca(100)) {
			System.out.println("Saque feito com sucesso!");
		} else {
			System.out.println("Valor insuficiente!");
		}
		
		System.out.println("Conta do Ze: "+contadoZe.saldo);
		System.out.println("Conta do Daniel: "+contaDoDaniel.saldo);
		
		if (contaDoDaniel.transfere(10, contadoZe)) {
			System.out.println("Valor transferido com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Conta do Ze: "+contadoZe.saldo);
		System.out.println("Conta do Daniel: "+contaDoDaniel.saldo);
		
		contaDoDaniel.titular = "Daniel Bou de Souza";
		
	}
}

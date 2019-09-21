
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo = 100;
		segundaConta.saldo += 600;
		
		System.out.println(segundaConta.saldo);
		
	}
}

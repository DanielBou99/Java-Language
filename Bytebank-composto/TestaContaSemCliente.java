
public class TestaContaSemCliente {

	
	public static void main(String[] args) {
		
		Conta ContaDaMarcela = new Conta(1337,236548);
		System.out.println(ContaDaMarcela.getSaldo());
		
		ContaDaMarcela.setTitular(new Cliente());
		
		System.out.println(ContaDaMarcela.getTitular());
		
		ContaDaMarcela.getTitular().setNome("Marcela");
		
		System.out.println(ContaDaMarcela.getTitular().getNome());
		
	}
}


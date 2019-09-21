
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente daniel = new Cliente();
		
		
		daniel.setNome("Daniel Bou de Souza");
		daniel.setCpf("111.111.111-22");
		daniel.setProfissao( "Programador");
		
		Conta contaDaniel = new Conta(1337,2568952);
		
		contaDaniel.deposita(100);
		contaDaniel.setTitular(daniel);
		
		System.out.println(contaDaniel.getTitular().getNome());
		System.out.println(contaDaniel.getTitular().getProfissao());
		
		
		
	}
}

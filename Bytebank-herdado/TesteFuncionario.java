
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		
		f1.setNome("Daniel Bou");
		f1.setCpf("144.123.125-45");
		f1.setSalario(8500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());

	}

}

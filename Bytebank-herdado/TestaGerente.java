
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente Gustavo = new Gerente();

		Gustavo.setNome("Gustavo");
		Gustavo.setCpf("125.256.235-96");
		Gustavo.setSalario(12500);
		Gustavo.setSenha(1558);
		
		System.out.println("Nome: " + Gustavo.getNome());
		System.out.println("CPF: " + Gustavo.getCpf());
		System.out.println("Salário: " + Gustavo.getSalario());
		System.out.println("Senha: " + Gustavo.autentica(1558));
		System.out.println("Bonificação: " + Gustavo.getBonificacao());
	}

}

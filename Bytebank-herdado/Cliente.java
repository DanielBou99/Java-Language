
public class Cliente implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Cliente( ) {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int Senha) {
		this.autenticador.autentica(Senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}

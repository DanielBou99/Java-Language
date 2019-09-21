
public class TesteSistema {

	public static void main(String[] args) {

		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Administrador adm = new Administrador();
		adm.setSenha(123);
		
		si.autentica(adm);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		si.autentica(cliente);
		
		

	}

}


public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		EditorVideo ed1 = new EditorVideo();
		Designer d1 = new Designer();
		
		g1.setSalario(1000);
		ed1.setSalario(50);
		d1.setSalario(5000);
		
		ControleBonificacao controleBoni = new ControleBonificacao();
		
		controleBoni.registra(g1);
		controleBoni.registra(ed1);
		controleBoni.registra(d1);
		
		System.out.println("Total Bonificacao: R$ " + controleBoni.getSoma());
	}
	
}


public class TestaStatic {

	public static void main(String[] args) {
		
		Conta daniel = new Conta(1337, 15758565);
		Conta leniza = new Conta(1337, 15856948);
		Conta Fabio = new Conta(1337,1255524);
		
		System.out.println(Conta.getTotal());
	}
}


public class AliquotaComIfs {

	public static void main(String[] args) {
		/*
		 * De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de
		 * R$ 142 De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350 De 3751.01
		 * at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636
		 */

		double salario = 3300.0;

		if (salario <= 2800.0) {
			System.out.println("De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		} else if (salario <= 3751) {
			System.out.println("De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350");
		} else {
			System.out.println("De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636");
		}

	}
}

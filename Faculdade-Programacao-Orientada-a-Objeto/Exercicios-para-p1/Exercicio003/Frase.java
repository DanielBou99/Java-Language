package Exercicio003;

/*Crie uma classe chamada Frase, que possui um atributo privado do 
 * tipo String chamado sentenca. Al�m dos m�todos sets e gets para sentenca, 
 * crie m�todos p�blicos:
- obterCaracteres : retorna a quantidade de caracteres de sentenca
- retornarCaixaAlta: retorna sentenca em caixa alta
Crie a classe FazerFrases que possui um m�todo main e solicita ao 
usu�rio que entre com uma frase, logo em seguida instancia o objeto 
da classe Frase e exibe na tela a quantidade de caracteres da frase e a 
frase escrita toda em caixa alta.*/

public class Frase {

	private String sentenca;
	
	public Frase(String fraseUsuario) {
		this.sentenca = fraseUsuario;
	}

	public void setSentenca(String sentenca) {
		this.sentenca = sentenca;
	}
	
	public String getSentenca() {
		return this.sentenca;
	}
	
	public int obterCaracteres() {
		return this.sentenca.length();
	}
	
	public String retornarCaixaAlta() {
		return this.sentenca.toUpperCase();
	}
	
	
	
	
	
}

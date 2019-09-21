package Exercicio001;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		Revolver revolver = new Revolver();
		LancaChama lancaChamas = new LancaChama();
		Faca faca = new Faca();
		
		ArrayList<Disparavel> listaDisparavel = new ArrayList<Disparavel>();
		
		listaDisparavel.add(revolver);
		listaDisparavel.add(lancaChamas);
		
		for (Disparavel x: listaDisparavel) {
			disparavel(x);
			recarregar(x);
		}
		
		ArrayList<Arma> listaArmas = new ArrayList<Arma>();
		
		listaArmas.add(revolver);
		listaArmas.add(faca);
		listaArmas.add(lancaChamas);
		
		for (Arma x: listaArmas) {
			agredir(x);
		}
		
		
	}
	
	public static void agredir(Arma a) {
		a.golpear();
	}
	
	public static void disparavel(Disparavel d) {
		d.disparar();
	}
	
	public static void recarregar(Disparavel d) {
		d.recarregar();
	}

}


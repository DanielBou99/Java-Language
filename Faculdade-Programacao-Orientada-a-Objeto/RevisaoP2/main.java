package RevisaodaP2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Campeonato campeonatos = new Campeonato();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		while(true) {
			
			System.out.println("1- Sair.");
			System.out.println("2- Adicionar time.");
			System.out.println("3- Remover time.");
			System.out.println("4- Realizar jogos.");
			System.out.println("5- Classificação.");
			System.out.print(">>> ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					break;
				case 2:
					System.out.println("Nome: ");
					Time nome = new Time(sc.nextLine());
					campeonatos.addTime(nome);
					break;
				case 3:
					String nome2 = sc.nextLine();
					try {
						campeonatos.removeTime(nome2);
					} catch (Exception x) {
						System.out.println(x.getMessage());
					}
					break;
				case 4:
					try {
						System.out.println("Time 1: ");
						String t1 = sc.nextLine();	
						Time t1obj = campeonatos.getTime(t1);
						
						System.out.println("Vitorias: ");
						t1obj.setVitorias(sc.nextInt());
						System.out.println("Derrotas: ");
						t1obj.setDerrotas(sc.nextInt());
						System.out.println("Empates: ");
						t1obj.setEmpates(sc.nextInt());
						
						sc.nextLine();
						
						System.out.println("Time 2: ");
						String t2 = sc.nextLine();
						Time t2obj = campeonatos.getTime(t2);
						
						System.out.println("Vitorias: ");
						t2obj.setVitorias(sc.nextInt());
						System.out.println("Derrotas: ");
						t2obj.setDerrotas(sc.nextInt());
						System.out.println("Empates: ");
						t2obj.setEmpates(sc.nextInt());
					} catch (Exception x) {
						System.out.println(x.getMessage());
					}
					break;
				case 5:
					ArrayList<Time> classificacao = new ArrayList(campeonatos.getClassificacao());
					
					for (Time x: classificacao) {
						System.out.println("Pontos: " + x.getPontos() + " - " + x.getNome());
					}
					break;
			}
		}
	}

}

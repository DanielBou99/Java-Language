package Carro;
/*2) O seu programa agora deverá perguntar ao
usuário qual o consumo médio do carro, e
quantos litros ele possui no tanque. Depois
deve entrar em um loop perguntando qual a
velocidade média e quanto tempo o carro
permaneceu nela, cada vez informado deverá
exibir o tanque e o odometro. Deverá sair do
loop quando o tanque esvaziar. */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float cm,tanque;
		
		System.out.println("Qual o consumo médio do carro?");
		cm = sc.nextFloat();
		System.out.println("Quantos litros tem o tanque?");
		tanque = sc.nextFloat();
		
		Carro c1 = new Carro(cm, tanque);
		
		do {
			
			System.out.println("Informe a velocidade media: ");
			float vm = sc.nextFloat();
			System.out.println("Informe a tempo: ");
			float tempo = sc.nextFloat();
			
			c1.setarVelocidade(vm,tempo);
		
		} while (c1.getTanque() > 0);
		
		c1.validarPneu();
		
	}
	
}

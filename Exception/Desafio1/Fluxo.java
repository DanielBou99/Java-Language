package Desafio1;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            try {
            	int a = i / 0;
            }
            catch (ArithmeticException ex) {
            	System.out.println("Divisao by 0!! " + ex.getMessage());
            }
        }
        System.out.println("Fim do metodo2");
    }
}
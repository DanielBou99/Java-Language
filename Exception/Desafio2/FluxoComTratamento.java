package Desafio2;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (MinhaExcecao2 ex) {
        	System.out.println(ex.getMessage());
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao2 {
        System.out.println("Ini do metodo1");
       try {
    	   metodo2();
       } catch (MinhaExcecao ex) {
    	   System.out.println(ex.getMessage());
       }
        
        System.out.println("Fim do metodo1");
        
        throw new MinhaExcecao2("Error: Checked.");
        
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Error: MinhaExcecao");
        // System.out.println("Fim do metodo2");
    }
}
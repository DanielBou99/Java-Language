package jjava.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {
	
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		String linha;
		while (scanner.hasNextLine()) {
			linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %05.2f %n", tipo, agencia, numero, titular, saldo);
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores[3]));
			
			linhaScanner.close();
		
		}
		
		scanner.close();
	}
}

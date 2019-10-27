package jjava.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		 //Fluxo de Entrada com Arquivo
       /* OutputStream fos = new FileOutputStream("entrada.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw); */
		
		FileWriter fw = new FileWriter("saida.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("asdddddd");

        bw.close();

	}

}

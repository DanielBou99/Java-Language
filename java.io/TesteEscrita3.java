package jjava.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita3 {
		
		public static void main(String[] args) throws IOException {

	        //Fluxo de Entrada com Arquivo
	        //OutputStream fos = new FileOutputStream("lorem2.txt");
	        //Writer osw = new OutputStreamWriter(fos);
	        //Buff3eredWriter bw = new BufferedWriter(osw);

	        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
            //PrintStream ps = new PrintStream(new File("lorem2.txt"));

            PrintWriter ps = new PrintWriter("saida.txt", "UTF-8");

	        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	        ps.println();
            ps.println("asfasdfsafdas dfs sdf asf assd�");

	        ps.close();
	}

}

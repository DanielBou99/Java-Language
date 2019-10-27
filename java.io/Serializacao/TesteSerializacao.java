package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel");
		cliente.setProfissao("Dev");
		cliente.setCpf("444.444.444-55");
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.setTitular(cliente);
		cc.deposita(150);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(cc);
		oos.close(); 
		
	}

}

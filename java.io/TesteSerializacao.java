package jjava.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Daniel");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("444.444.444-55");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(cliente);
//		oos.close(); 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Cliente nome2 = (Cliente) ois.readObject();
		ois.close();
 		System.out.println(nome2.getNome());
		

	}

}

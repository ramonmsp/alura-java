package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Ramon");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("12312312312312");
//		
//		
//		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		obj.writeObject(cliente);
		
		
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) obj.readObject();
		
		obj.close();
		
		System.out.println(cliente.getNome());
		
		
	}

}

package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura { 

	public static void main(String[] args) throws IOException{
		
		//fluxo de entrada com um arquivo.
		
		InputStream file = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(file);
		BufferedReader buffer = new BufferedReader(isr);
		
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		
		
		
	}

}

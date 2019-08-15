package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo { 

	public static void main(String[] args) throws IOException{
		
		//fluxo de entrada com um arquivo.
		
		InputStream file = System.in; //new FileInputStream(file)
		Reader isr = new InputStreamReader(file);
		BufferedReader bufferIn = new BufferedReader(isr);
				
		OutputStream fos = System.out;// new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bufferOut = new BufferedWriter(osw);
		
		String linha = bufferIn.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bufferOut.write(linha);
			bufferOut.newLine();
			bufferOut.flush();
			linha = bufferIn.readLine();
		}
		
		bufferIn.close();
		bufferOut.close();
		
	}

}

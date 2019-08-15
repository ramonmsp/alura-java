package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita { 

	public static void main(String[] args) throws IOException{
		
				
		OutputStream file = new FileOutputStream("lorem2.txt");
		Writer isw = new OutputStreamWriter(file);
		BufferedWriter buffer = new BufferedWriter(isw);
		
		buffer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		buffer.newLine();
		buffer.newLine();
		buffer.write("jqwkeljqkwljelkqwjeklqwjeklqwj");
		
		buffer.close();
		
	}

}

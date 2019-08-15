package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter { 

	public static void main(String[] args) throws IOException{
		
				
//		OutputStream file = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(file);
//		BufferedWriter buffer = new BufferedWriter(isw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("jqwkeljqkwljelkqwjeklqwjeklqwj");
		
		bw.close();
		
	}

}

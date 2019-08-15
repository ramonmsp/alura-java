package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter { 

	public static void main(String[] args) throws IOException{
		
				
//		OutputStream file = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(file);
//		BufferedWriter buffer = new BufferedWriter(isw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("jqwkeljqkwljelkqwjeklqwjeklqwj");
		
		ps.close();
		
	}

}

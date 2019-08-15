package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		//<> generics
		ArrayList <Conta>lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(222,  333);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222,  444);
		lista.add(cc2);

		
		for (Conta conta : lista){
			if (conta.equals(cc2)){
				System.out.println("Já tenho essa referência!");
			}
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}
		
}

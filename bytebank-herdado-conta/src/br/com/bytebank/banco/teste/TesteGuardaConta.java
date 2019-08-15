package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardaConta {

	public static void main(String[] args) {
		GuardadorDeContas guardador =  new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(222,  333);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(222,  444);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("O tamanho é: " + tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
	

}

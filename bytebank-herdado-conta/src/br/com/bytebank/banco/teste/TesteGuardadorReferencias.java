package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencia;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		
		GuardadorDeReferencia guardador = new GuardadorDeReferencia();
		
		Conta cc = new ContaCorrente(222, 333);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(222, 444);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}

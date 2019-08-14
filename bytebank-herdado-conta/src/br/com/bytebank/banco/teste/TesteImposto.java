package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.SeguroDeVida;;


public class TesteImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seg = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seg);
		System.out.println(calc.getTotalImposto());
		
		
	}

}

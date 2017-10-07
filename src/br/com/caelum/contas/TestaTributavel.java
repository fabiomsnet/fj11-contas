package br.com.caelum.contas;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		
		//Testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}

}

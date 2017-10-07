package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaClasses {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.deposita(1000);
		c.setTitular("Fabio");

		System.out.println(c);

		Conta c2 = new ContaCorrente();
		c2.deposita(1000);
		c2.setTitular("Fabio");

		if (c.equals("XPTO")) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}

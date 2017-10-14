package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		double soma = 0.0;
		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}
		
		for (int i = 0; i < contas.length; i++) {
			soma = soma + contas[i].getSaldo();
		}
		
		System.out.println("Media: " + soma / contas.length);
	}

}

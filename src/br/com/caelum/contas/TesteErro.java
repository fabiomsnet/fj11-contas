package br.com.caelum.contas;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}

	static void metodo2() {
		System.out.println("Inicio metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <= 15; i++) {
			cc.deposita(i + 1000);
			System.out.println(cc.getSaldo() + " Variavel: " + i);
			if (i == 5) {
				cc = null;
			}
		}
		System.out.println("Fim metodo2");
	}
}

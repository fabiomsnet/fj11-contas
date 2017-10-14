package br.com.caelum.contas.modelo;

/**
 * @author Fabio Moreira
 *
 *         Classe responsável pela manipulaçao de uma conta
 * 
 */

public abstract class Conta implements Comparable<Conta>{

	protected double saldo;
	String titular;
	int numero;
	String agencia;

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * Incrementa o saldo da conta
	 * 
	 * @param valor
	 *            Não aceita valores negativos
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar"
					+ " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar"
					+ " um valor negativo");
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	// public boolean saca(double valor) {
	// if (this.saldo >= valor) {
	// this.saldo -= valor;
	// return true;
	// } else {
	// return false;
	// }
	// }

//	@Override
//	public String toString() {
//		return "A conta do " + titular + " tem: " + saldo;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Conta)) {
//			return false;
//		}
//		Conta c = (Conta) obj;
//		return this.titular == c.titular;
//	}
	
	public abstract String getTipo();
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}

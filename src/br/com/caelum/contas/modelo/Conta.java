package br.com.caelum.contas.modelo;

/**
 * @author Fabio Moreira
 *
 *         Classe responsável pela manipulaçao de uma conta
 * 
 */

public abstract class Conta {

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
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

//	public boolean saca(double valor) {
//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			return true;
//		} else {
//			return false;
//		}
//	}

	public abstract String getTipo();
}

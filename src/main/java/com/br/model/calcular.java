package com.br.model;

public class calcular {


	private int valor1;
	private int valor2;

	public calcular(int valor1, int valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	

	public int somar() {
		int resultado;
		resultado = this.valor1 + this.valor2;
		return resultado;
	}

	public int subtrair() {
		int resultado;
		resultado = this.valor1 - this.valor2;
		return resultado;
	}

	public int multiplicar() {
		int resultado;
		resultado = this.valor1 * this.valor2;
		return resultado;
	}

	public int dividir() {
		int resultado;
		resultado = this.valor1 / this.valor2;
		return resultado;
	}

}
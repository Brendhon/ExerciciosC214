package br.inatel.C214;

public class Calculadora {
	
	private int num1;
	private int num2;
	
	public Calculadora(int numero1, int numero2) {
		this.num1 = numero1;
		this.num2 = numero2;
	}
	
	public double exponenciacao() {
		if (num1 == 0 &&  num2 == 0) {
			throw new IndeterminacoesException("Indeterminação tipo: 0 ^ 0");
		} else {
			return (double) Math.pow(num1,num2);			
		}
	}

	public double raiz() {
		if (num2 == 0) {
			throw new IndeterminacoesException("Indeterminação tipo: N ^ 1/0");
		} else {
			return Math.pow(num1, (1.0/num2));
		}
	}

	public double porcentagem() {
		if (num1 == 0) {
			throw new IndeterminacoesException("Indeterminação tipo: N/0");
		} else {
			return (double) num2/num1 * 100;
		}
	}

	public double divisao() {
		if (num2 == 0) {
			throw new IndeterminacoesException("Indeterminação tipo: N/0");
		} else {
			return (double) num1/num2;
		}
	}

}

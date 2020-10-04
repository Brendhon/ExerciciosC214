package br.inatel.C214;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import br.inatel.C214.Calculadora;

public class CalculadoraTeste {
	
	private Calculadora calculadora;

	@Test
	public void testeExponenciacao() {
		calculadora  = new Calculadora(2,2);
		assertEquals(4, calculadora.exponenciacao(), 0.01);
	}
	
	@Test(expected = IndeterminacoesException.class)
	public void testeExponenciacaoErro() {
		calculadora  = new Calculadora(0,0);
		calculadora.exponenciacao();
	}
	
	@Test
	public void testeRaiz() {
		calculadora  = new Calculadora(133,2);
		assertEquals(11.53, calculadora.raiz(), 0.01);
	}
	
	@Test(expected = IndeterminacoesException.class)
	public void testeRaizErro() {
		calculadora  = new Calculadora(0,0);
		calculadora.raiz();
	}
	
	@Test
	public void testePorcentagem() {
		calculadora  = new Calculadora(100,50);
		assertEquals(50, calculadora.porcentagem(), 0.01);
	}
	
	@Test(expected = IndeterminacoesException.class)
	public void testePorcentagemErro() {
		calculadora  = new Calculadora(0,0);
		calculadora.porcentagem();
	}
	
	@Test
	public void testeDivisao() {
		calculadora  = new Calculadora(1,2);
		assertEquals(0.5, calculadora.divisao(), 0.01);
	}
	
	@Test(expected = IndeterminacoesException.class)
	public void testeDivisaoErro() {
		calculadora  = new Calculadora(0,0);
		calculadora.divisao();
	}
}

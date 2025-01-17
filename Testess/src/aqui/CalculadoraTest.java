package aqui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	private Calculadora calculadora;
	
	@Before
	public void criaCalculadora() {
		
	calculadora =  new Calculadora();
	}
	
	@Test
	public void testarSomaComNumeroNegativos() {
		int numeroEsperado = -10;
		
		assertEquals(numeroEsperado, calculadora.somar(-5,-5));
	}
	
	@Test
	public void testarDividirComNumeroNegativos() {
		double numeroEsperado = 7.5;

		assertEquals(numeroEsperado, calculadora.dividir(-15, -2),0.00000001);
	}
	
	@Test
	public void tentandoLancarExcecao() {
		IllegalArgumentException verMensagem = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(15,0));
		System.out.println(verMensagem.getMessage());
	}
	
	@Test
	public void testarDividirComZeroDividendo() {
		double numeroEsperado = 0;

		assertEquals(numeroEsperado, calculadora.dividir(0, -8),0.00000001);
	}
	
	}

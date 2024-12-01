package LivroTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AvaliadorTest {
	
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
	
	Usuario joao = new Usuario("Joao");
	Leilao leilao = new Leilao("Playstation 3 Novo");

	leilao.propoe(new Lance(joao,1000.0));
	
	Avaliador leiloeiro = new Avaliador();
	
	leiloeiro.avalia(leilao);
	
	// veja que não precisamos mais da palavra Assert!
	assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
	assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
	}

	
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		// cenário: 3 lances em ordem crescente
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 Novo");

		leilao.propoe(new Lance(maria, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));

		// executando a ação
		Avaliador leiloeiro = new Avaliador();

		leiloeiro.avalia(leilao);

		// comparando a saída com o esperado
		double maiorEsperado = 400;
		double menorEsperado = 250;

		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);

		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}
}

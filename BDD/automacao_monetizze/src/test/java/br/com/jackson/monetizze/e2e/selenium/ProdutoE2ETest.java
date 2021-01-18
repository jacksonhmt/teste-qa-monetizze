package br.com.jackson.monetizze.e2e.selenium;

import org.junit.jupiter.api.Test;

import br.com.jackson.monetizze.e2e.pages.ProdutoPage;

public class ProdutoE2ETest extends E2ETestBase{
	
	@Test
	public void adicionandoAoCarrinho() {
		ProdutoPage ProdutoPage = new ProdutoPage(getDriver());
		ProdutoPage.acessarPaginaProduto();
		ProdutoPage.estaNaPaginaDeProduto();
		
		ProdutoPage.adicionarAoCarrinho();
	}
}

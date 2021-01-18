package br.com.jackson.monetizze.e2e.selenium;

import org.junit.jupiter.api.Test;

import br.com.jackson.monetizze.e2e.pages.CarrinhoPage;
import br.com.jackson.monetizze.e2e.pages.ProdutoPage;

public class CarrinhoPageE2ETest extends E2ETestBase{
	private CarrinhoPage carrinhoPage; 
	
	@Test
	public void adicionandoAoCarrinho() {
		ProdutoPage produtoPage = new ProdutoPage(getDriver());
		produtoPage.acessarPaginaProduto();
		produtoPage.estaNaPaginaDeProduto();
		produtoPage.adicionarAoCarrinho();
		
		carrinhoPage.estaNaPaginaCarrinho();
	}
}

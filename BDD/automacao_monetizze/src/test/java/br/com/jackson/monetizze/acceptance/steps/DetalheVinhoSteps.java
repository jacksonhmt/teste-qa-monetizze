package br.com.jackson.monetizze.acceptance.steps;

import br.com.jackson.monetizze.e2e.pages.Browser;
import br.com.jackson.monetizze.e2e.pages.CarrinhoPage;
import br.com.jackson.monetizze.e2e.pages.DetalheVinhoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DetalheVinhoSteps {
	
	private Browser browser;
	private DetalheVinhoPage detalheVinhoPage;
	private CarrinhoPage carrinhoPage;
	
	@Dado("que o usuário está na página DETALHES DO VINHO")
	public void que_o_usuário_está_na_página_detalhes_do_vinho() {
		browser = new Browser();
		detalheVinhoPage = browser.getDetalheVinhoPage();
		detalheVinhoPage.acessarPaginaDetalheVinho();
	}

	@Quando("o usuario aciona o botao COMPRAR")
	public void o_usuario_aciona_o_botao_comprar() {
		detalheVinhoPage.acionarBotaoComprar();
	}
	
	@Entao("o sistema adiciona o vinho no carrinho de compras")
	public void o_sistema_adiciona_o_vinho_no_carrinho_de_compras() {
		carrinhoPage = browser.getCarrinhoPage();
		carrinhoPage.verificandoProdutoAdicionado();
	}
	
	@Entao("direciona para a tela CARRINHO DE COMPRAS")
	public void direciona_para_a_tela_carrinho_de_compras() {
		carrinhoPage.estaNaPaginaCarrinho();
		browser.clean();
	}
}

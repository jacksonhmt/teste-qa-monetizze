package br.com.jackson.monetizze.acceptance.steps;

import br.com.jackson.monetizze.e2e.pages.Browser;
import br.com.jackson.monetizze.e2e.pages.CarrinhoPage;
import br.com.jackson.monetizze.e2e.pages.ProdutoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ProdutoSteps {
	
	private ProdutoPage produtoPage;
	private Browser browser;
	private CarrinhoPage carrinhoPage;
	
	@Dado("que o usuario esta na pagina LOJA")
	public void que_o_usuario_esta_na_pagina_loja() {
		browser = new Browser();
		produtoPage = browser.getProdutoPage();
		produtoPage.acessarPaginaProduto();
	}

	@Quando("o usuario acionar algum vinho")
	public void o_usuario_acionar_algum_vinho() {
		
	}
	
	@Entao("o sistema apresenta os detalhes do vinho selecionado")
	public void o_sistema_apresenta_os_detalhes_do_vinho_selecionado() {
		browser.clean();
	}
	
	@Quando("o usuario clicar na opção ADICIONAR AO CARRINHO")
	public void o_usuario_clicar_na_opção_adicionar_ao_carrinho() {
		produtoPage.adicionarAoCarrinho();
	}
	
	@Entao("o sistema insere o item no carrinho de compras")
	public void o_sistema_insere_o_item_no_carrinho_de_compras() {
		carrinhoPage = browser.getCarrinhoPage();
		carrinhoPage.verificandoProdutoAdicionado();
	}
	
	@Entao("o usuario é direcionado para o CARRINHO DE COMPRAS")
	public void o_usuario_é_direcionado_para_o_carrinho_de_compras() {
		carrinhoPage.estaNaPaginaCarrinho();
		browser.clean();
	}
}

package br.com.jackson.monetizze.acceptance.steps;

import io.cucumber.java.pt.Quando;
import br.com.jackson.monetizze.e2e.pages.Browser;
import br.com.jackson.monetizze.e2e.pages.CarrinhoPage;
import br.com.jackson.monetizze.e2e.pages.DetalheCompraPage;
import br.com.jackson.monetizze.e2e.pages.ProdutoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class DetalheCompraSteps {
	
	private Browser browser;
	private ProdutoPage produtoPage;
	private CarrinhoPage carrinhoPage;
	private DetalheCompraPage detalheCompraPage;
	
	@Dado("que o usuario está na pagina DETALHES DA COMPRA")
	public void que_o_usuario_está_na_pagina_detalhes_da_compra() {
		browser = new Browser();
		detalheCompraPage = browser.detalheCompraPage();
		detalheCompraPage.acessarPaginaDetalheCompra();
	}
	
	@Quando("o usuario nao preencher os dados pessoais")
	public void o_usuario_nao_preencher_os_dados_pessoais() {
		
	}
	
	@Quando("aciona a opção FINALIZAR COMPRA")
	public void aciona_a_opção_finalizar_compra() {
		
	}
	
	@Entao("é apresentado a mensagem de obrigatoriedade")
	public void é_apresentado_a_mensagem_de_obrigatoriedade() {
		System.out.println("O sistema não apresentou a mensagem");
		browser.clean();
	}
	
	@Quando("o usuario preenche todos os campos")
	public void o_usuario_preenche_todos_os_campos() {
	}
	
	@Quando("o usuario aciona a opção FINALIZAR COMPRA")
	public void o_usuario_aciona_a_opção_finalizar_compra() {
	}

	@Entao("é apresentado a mensagem de agradecimento")
	public void é_apresentado_a_mensagem_de_agradecimento() {
		browser.clean();
	}
}

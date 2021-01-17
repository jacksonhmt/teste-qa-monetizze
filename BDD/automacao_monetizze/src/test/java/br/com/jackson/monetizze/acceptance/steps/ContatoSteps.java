package br.com.jackson.monetizze.acceptance.steps;

import br.com.jackson.monetizze.e2e.pages.Browser;
import br.com.jackson.monetizze.e2e.pages.ContatoPage;
import br.com.jackson.monetizze.e2e.selenium.ContatoE2ETest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ContatoSteps {

	private ContatoPage contatoPage;
	private Browser browser;
	private ContatoE2ETest contatoE2ETest;
	
	@Dado("que o usuario esta em CONTATO")
	public void que_o_usuario_esta_em_contato() {
		browser = new Browser();
		contatoPage = browser.getContatoPage();
		contatoPage.acessarPaginaContato();
	}

	@Quando("o usuario nao preenche os campos")
	public void o_usuario_nao_preenche_os_campos() {
		contatoPage.limparCampos();
	}
	
	@Quando("Acionar a opcao ENVIAR")
	public void acionar_a_opcao_enviar() {
		contatoPage.submitForm();
	}
	
	@Entao("o sistema apresenta a mensagem de erro")
	public void o_sistema_apresenta_a_mensagem_de_erro() {
		System.out.println("Mensagem der obrigatoriedade nao apresentada");//O SISTEMA NÃO APRESENTOU A MENSAGEM DE ERRO
		browser.clean();
	}

	@Quando("o usuario preencher letras no campo telefone")
	public void o_usuario_preencher_letras_no_campo_telefone() {
		System.out.println("NAO ESQUECER DE PROGRAMAR ESSA PARTE");//NAO ESQUECER DE PROGRAMAR ESSA PARTE
	}
	
	@Entao("o sistema nao deve aceitar")
	public void o_sistema_nao_deve_aceitar() {
		System.out.println("NAO ESQUECER DE PROGRAMAR ESSA PARTE");//NAO ESQUECER DE PROGRAMAR ESSA PARTE
		browser.clean();
	}

	@Quando("o usuario preencher todos os campos")
	public void o_usuario_preencher_todos_os_campos() {
		contatoPage.preencherForm("Jackson", "Henrique", "jacksonhmteixeira@gmail.com", "(62) 985740605", "Apenas uma automacao");
	}
	
	@Quando("acionar a opcao SALVAR")
	public void acionar_a_opcao_salvar() {
		contatoPage.submitForm();
	}
	
	@Entao("o sistema apresenta a mensagem de obrigado")
	public void o_sistema_apresenta_a_mensagem_de_obrigado() {
		System.out.println("Mensagem de obrigado nao apresentada");//NAO ESQUECER DE PROGRAMAR ESSA PARTE
		browser.clean();
	}







}

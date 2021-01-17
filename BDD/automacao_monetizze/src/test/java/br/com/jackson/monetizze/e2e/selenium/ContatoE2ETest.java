package br.com.jackson.monetizze.e2e.selenium;

import org.junit.jupiter.api.Test;

import br.com.jackson.monetizze.e2e.pages.ContatoPage;

public class ContatoE2ETest extends E2ETestBase{
	
	@Test
	public void verificarCamposObrigatorios() {
		ContatoPage contatoPage = new ContatoPage(getDriver());
		contatoPage.acessarPaginaContato();
		contatoPage.estaNaPaginaDeContato();
		
		contatoPage.limparCampos();
		contatoPage.submitForm();
	}
	
	
	@Test
	public void enviarUmContato() {
		ContatoPage contatoPage = new ContatoPage(getDriver());
		contatoPage.acessarPaginaContato();
		contatoPage.estaNaPaginaDeContato();
		
		contatoPage.enviarContato("Jackson", "Henrique", "jacksonhmteixeira@gmail.com", "(62) 985740605", "Apenas um teste");
	}
}

package br.com.jackson.monetizze.e2e.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContatoPage {
	
	private WebDriver driver;
	
	private static String PAGE_URL = "http://monetizzetesteqa.s3-website-us-east-1.amazonaws.com/contact.html";
	
	public ContatoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessarPaginaContato() {
		driver.get(PAGE_URL);
	}
	
	public boolean estaNaPaginaDeContato() {
		esperaCarregarPaginaDeContato();
		return this.driver.getCurrentUrl().endsWith("/contact.html");
	}
	
	public void esperaCarregarPaginaDeContato() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Contato')]")));
	}
	
	public void enviarContato(String nome, String sobrenome, String email, String telefone, String mensagem) {
		preencherForm(nome, sobrenome, email, telefone, mensagem);
		submitForm();
	}
	
	public void preencherForm(String nome, String sobrenome, String email, String telefone, String mensagem) {
		WebElement campoNome = driver.findElement(By.id("fname"));
		campoNome.clear();
		campoNome.sendKeys(nome);
		
		WebElement campoSobrenome = driver.findElement(By.id("lname"));
		campoSobrenome.clear();
		campoSobrenome.sendKeys(sobrenome);
		
		WebElement campoEmail = driver.findElement(By.id("eaddress"));
		campoEmail.clear();
		campoEmail.sendKeys(email);
		
		WebElement campoTelefone = driver.findElement(By.id("tel"));
		campoTelefone.clear();
		campoTelefone.sendKeys(telefone);
		
		WebElement campoMensagem = driver.findElement(By.id("message"));
		campoMensagem.clear();
		campoMensagem.sendKeys(mensagem);
	}
	
	public void limparCampos() {
		WebElement campoNome = driver.findElement(By.id("fname"));
		campoNome.clear();
		
		WebElement campoSobrenome = driver.findElement(By.id("lname"));
		campoSobrenome.clear();
		
		WebElement campoEmail = driver.findElement(By.id("eaddress"));
		campoEmail.clear();
		
		WebElement campoTelefone = driver.findElement(By.id("tel"));
		campoTelefone.clear();
		
		WebElement campoMensagem = driver.findElement(By.id("message"));
		campoMensagem.clear();
	}
	
	public void submitForm() {
		WebElement button = driver.findElement(By.className("btn-primary"));
		button.submit();
	}
}

package br.com.jackson.monetizze.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetalheCompraPage {
	
	private WebDriver driver;
	
	private static String PAGE_URL = "http://monetizzetesteqa.s3-website-us-east-1.amazonaws.com/shop-single.html";
	
	public DetalheCompraPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessarPaginaDetalheCompra() {
		driver.get(PAGE_URL);
	}
	
	public boolean estaNaPaginaDetalheCompra() {
		esperaCarregarPaginaDetalheCompra();
		return this.driver.getCurrentUrl().endsWith("/shop-single.html");
	}
	
	public void esperaCarregarPaginaDetalheCompra() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Trius Cabernet France 2011')]")));
	}
	
	public void realizarContato(String pais, String nome, String sobrenome, String nomeEmpresa, 
			String endereco, String estado, String cep, String email, String telefone, String detalhesAdicionais) {
		preencherDetalhesCompra(pais, nome, sobrenome, nomeEmpresa, endereco, estado, cep, email, telefone, detalhesAdicionais);
		submitFinalizarCompra();
	}

	public void preencherDetalhesCompra(String pais, String nome, String sobrenome, String nomeEmpresa, 
			String endereco, String estado, String cep, String email, String telefone, String detalhesAdicionais) {
		WebElement campoPais = driver.findElement(By.id("c_country"));
		campoPais.clear();
		campoPais.sendKeys(pais);
		
		WebElement campoNome = driver.findElement(By.id("c_fname"));
		campoNome.clear();
		campoNome.sendKeys(nome);
		
		WebElement campoSobrenome = driver.findElement(By.id("c_lname"));
		campoSobrenome.clear();
		campoSobrenome.sendKeys(sobrenome);
		
		WebElement campoEmpresa = driver.findElement(By.id("c_companyname"));
		campoEmpresa.clear();
		campoEmpresa.sendKeys(nomeEmpresa);
		
		WebElement campoEndereco = driver.findElement(By.id("c_address"));
		campoEndereco.clear();
		campoEndereco.sendKeys(endereco);
		
		WebElement campoEstado = driver.findElement(By.id("c_state_country"));
		campoEstado.clear();
		campoEstado.sendKeys(estado);
		
		WebElement campoCep = driver.findElement(By.id("c_postal_zip"));
		campoCep.clear();
		campoCep.sendKeys(cep);
		
		WebElement campoEmail = driver.findElement(By.id("c_email_address"));
		campoEmail.clear();
		campoEmail.sendKeys(cep);
		
		WebElement campoTelefone = driver.findElement(By.id("c_phone"));
		campoTelefone.clear();
		campoTelefone.sendKeys(telefone);
		
		WebElement campoDetalhesAdicionais = driver.findElement(By.id("c_order_notes"));
		campoDetalhesAdicionais.clear();
		campoDetalhesAdicionais.sendKeys(detalhesAdicionais);
	}
	
	public void limparDetalhesCompra() {
		WebElement campoPais = driver.findElement(By.id("c_country"));
		campoPais.clear();
		
		WebElement campoNome = driver.findElement(By.id("c_fname"));
		campoNome.clear();
		
		WebElement campoSobrenome = driver.findElement(By.id("c_lname"));
		campoSobrenome.clear();
		
		WebElement campoEmpresa = driver.findElement(By.id("c_companyname"));
		campoEmpresa.clear();
		
		WebElement campoEndereco = driver.findElement(By.id("c_address"));
		campoEndereco.clear();
		
		WebElement campoEstado = driver.findElement(By.id("c_state_country"));
		campoEstado.clear();
		
		WebElement campoCep = driver.findElement(By.id("c_postal_zip"));
		campoCep.clear();
		
		WebElement campoEmail = driver.findElement(By.id("c_email_address"));
		campoEmail.clear();
		
		WebElement campoTelefone = driver.findElement(By.id("c_phone"));
		campoTelefone.clear();
		
		WebElement campoDetalhesAdicionais = driver.findElement(By.id("c_order_notes"));
		campoDetalhesAdicionais.clear();
	}
	
	public void submitFinalizarCompra() {
		WebElement button = driver.findElement(By.className("btn-primary"));
		button.submit();
	}
}

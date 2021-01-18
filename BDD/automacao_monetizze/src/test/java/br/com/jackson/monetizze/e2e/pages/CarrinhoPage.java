package br.com.jackson.monetizze.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoPage {
	private WebDriver driver;
	
	public CarrinhoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean estaNaPaginaCarrinho() {
		return this.driver.getCurrentUrl().endsWith("/cart.html");
	}
	
	public void verificandoProdutoAdicionado() {
		driver.findElement(By.xpath("//h2[contains(text(),'Trius Cabernet France 2011')]")).isDisplayed();
	}
	
	public void finalizarCompra() {
		driver.findElement(By.xpath("//button[contains(text(),'Prosseguir')]\"")).click();
	}
	
}

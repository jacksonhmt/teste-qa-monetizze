package br.com.jackson.monetizze.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetalheVinhoPage {
	
	private WebDriver driver;
	
	private static String PAGE_URL = "http://monetizzetesteqa.s3-website-us-east-1.amazonaws.com/shop-single.html";
	
	public DetalheVinhoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessarPaginaDetalheVinho() {
		driver.get(PAGE_URL);
	}
	
	public boolean estaNaPaginaDetalheVinho() {
		esperaCarregarPaginaDetalheVinho();
		return this.driver.getCurrentUrl().endsWith("/shop-single.html");
	}
	
	public void esperaCarregarPaginaDetalheVinho() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Trius Cabernet France 2011')]")));
	}
	
	public void aumentarQuantidade() {
		
	}

	public void acionarBotaoComprar() {
		driver.findElement(By.linkText("Comprar")).click();
	}
}

package br.com.jackson.monetizze.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarrinhoPage {
	private WebDriver driver;
	
	public boolean estaNaPaginaCarrinho() {
		return true;
	}
	
	public void esperaCarregarPaginaCarrinho() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Meu carrinho')]")));
	}
}

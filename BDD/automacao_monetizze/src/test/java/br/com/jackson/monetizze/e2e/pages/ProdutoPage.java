package br.com.jackson.monetizze.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdutoPage {

	private WebDriver driver;
	
	private static String PAGE_URL = "http://monetizzetesteqa.s3-website-us-east-1.amazonaws.com/shop.html";
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessarPaginaProduto() {
		driver.get(PAGE_URL);
	}
	
	public boolean estaNaPaginaDeProduto() {
		esperaCarregarPaginaProduto();
		return this.driver.getCurrentUrl().endsWith("/shop.html");
	}
	
	public void esperaCarregarPaginaProduto() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Nossos Produtos')]")));
	}
	
	public void adicionarAoCarrinho() {
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div/a"));
		action.moveToElement(btn).perform();
		driver.findElement(By.linkText("Adicionar ao carrinho")).click();
	}
}

package br.com.jackson.monetizze.e2e.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Browser {
	
	private WebDriver driver;

	public Browser() {
		this.driver = new BrowserFactory().createWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	protected WebDriver getDriver() {
		return driver;
	}
	
	public ContatoPage getContatoPage() {
		return new ContatoPage(driver);
	}
	
	public DetalheVinhoPage getDetalheVinhoPage() {
		return new DetalheVinhoPage(driver);
	}
	
	public ProdutoPage getProdutoPage() {
		return new ProdutoPage(driver);
	}
	
	public CarrinhoPage getCarrinhoPage() {
		return new CarrinhoPage(driver);
	}
	
	public DetalheCompraPage detalheCompraPage() {
		return new DetalheCompraPage(driver);
	}

	public void clean() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}

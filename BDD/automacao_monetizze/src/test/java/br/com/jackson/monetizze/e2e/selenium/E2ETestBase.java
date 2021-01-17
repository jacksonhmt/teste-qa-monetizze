package br.com.jackson.monetizze.e2e.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import br.com.jackson.monetizze.e2e.pages.BrowserFactory;

public class E2ETestBase {
	private static WebDriver driver;
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	@BeforeAll
	public static void SetUpAll() {
		driver = new BrowserFactory().createWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}

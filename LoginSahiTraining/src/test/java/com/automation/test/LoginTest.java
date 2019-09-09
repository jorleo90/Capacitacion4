package com.automation.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage pepitoLogin;

	@Before
	public void abrirConexion() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		pepitoLogin = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void test() {
		pepitoLogin.iniciarSesion("test", "secret");
		assertFalse("Fallo de inicio de sesión!", pepitoLogin.validarInicioSesion());
	}
	
	@After
	public void cerrarConexion() {
		driver.quit();
	}	
	

}

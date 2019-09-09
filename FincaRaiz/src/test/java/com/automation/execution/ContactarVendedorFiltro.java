package com.automation.execution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.FiltrosPage;
import com.automation.pages.ResultadoPage;
import com.automation.pages.ResultadosBusquedaPage;
import com.automation.utils.UtilsFunctions;

public class ContactarVendedorFiltro {

	WebDriver driver;
	FiltrosPage pageFiltros;
	ResultadosBusquedaPage pageResultados;
	ResultadoPage pageResultado;
	UtilsFunctions utils;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageFiltros = PageFactory.initElements(driver, FiltrosPage.class);
		pageResultados = PageFactory.initElements(driver, ResultadosBusquedaPage.class);
		pageResultado = PageFactory.initElements(driver, ResultadoPage.class);
		utils = new UtilsFunctions(driver);
		driver.get("https://www.fincaraiz.com.co/");
	}
	
	@Test
	public void test() throws InterruptedException {
		pageFiltros.busquedaInmueble("Apartamento", "Venta", "Bogotá");
		pageResultados.seleccionarPrimerResultado();
		pageResultado.contactarVendedor("Jorge Rubio");
		utils.tomarPantalla();
	}
	
	@After
	public void cerrarDriver() {
		driver.quit();
	}

}

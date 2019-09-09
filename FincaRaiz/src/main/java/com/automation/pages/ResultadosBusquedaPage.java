package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadosBusquedaPage extends PageFactory {

	@FindBy(xpath = "//*[@id='rowIndex_0']")
	WebElement lblPrimerResultado;
	
	public void seleccionarPrimerResultado() {
		lblPrimerResultado.click();
	}
	
}

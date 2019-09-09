package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadoPage extends PageFactory {

	@FindBy(xpath = "//*[@id='pnlContact']//*[@id='txtName']")
	WebElement txtNombre;
	
	public void contactarVendedor(String nombre) throws InterruptedException {
		txtNombre.sendKeys(nombre);
		Thread.sleep(5000);
	}
	
}

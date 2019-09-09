package com.automation.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageFactory{

	@FindBy(name = "user")
	WebElement txtUsuario;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(id = "errorMessage")
	WebElement lblMensajeError;
	
	public void iniciarSesion(String usuario, String password) {
		txtUsuario.sendKeys(usuario);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean validarInicioSesion() {
		boolean salida = false;
		try {
			salida = lblMensajeError.isDisplayed();
		} catch(NoSuchElementException ex) {
			//CUALQUIER COSA
		}
		return salida;
	}
	
}

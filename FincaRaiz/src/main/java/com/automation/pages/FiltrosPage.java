package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltrosPage extends PageFactory {

	@FindBy(xpath = "//*[@id='divContainerCategories']/div/span")
	WebElement btnVivienda;
	
	@FindBy(xpath = "//*[@id='ddlCategoriesVivienda']/li[not(contains(@style,'font-weight: bold'))]/label")
	List<WebElement> listaVivienda;
	
	@FindBy(xpath = "//*[@id='ddlCategoriesVivienda']//input[@type='checkbox']")
	List<WebElement> listaCheckBoxVivienda;
	
	@FindBy(xpath = "//*[@id='divContainerTransaction']/div/span")
	WebElement btnTipo;
	
	@FindBy(xpath = "//*[@id='ddlTransactionType']/li")
	List<WebElement> listaTipos;
	
	@FindBy(id = "txtWord")
	WebElement txtCiudad;
	
	@FindBy(xpath = "//*[@id='divResultsLocationCity']/div[2]")
	WebElement divPrimerResultadoCiudad;
	
	@FindBy(id = "btnSearchAdvert")
	WebElement btnBuscar;
	
	public void busquedaInmueble(String vivienda, String ventaArriendo, String donde) throws InterruptedException {
		btnVivienda.click();
		for (int i = 0; i < listaVivienda.size(); i++) {
			if(listaVivienda.get(i).getText().equals(vivienda)) {
				listaCheckBoxVivienda.get(i).click();
			}
		}
		Thread.sleep(5000);
		btnTipo.click();
		Thread.sleep(2000);
		btnTipo.click();
		for (WebElement unTipo : listaTipos) {
			if(unTipo.getText().equals(ventaArriendo)) {
				unTipo.click();
			}
		}
		txtCiudad.sendKeys(donde);
		divPrimerResultadoCiudad.click();
		btnBuscar.click();
	}
	
}

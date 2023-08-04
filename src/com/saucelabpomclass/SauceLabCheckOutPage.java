package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabCheckOutPage extends SauceLabCartPage{
	
	public SauceLabCheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//input[@id='first-name']")
	private WebElement firstname;
		
	@FindBy(xpath = ".//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath = ".//input[@id='postal-code']")
	private WebElement zipcode;
	
	@FindBy(xpath = ".//input[@class='btn_primary cart_button']")
	private WebElement cont;
	
	
	public void enterFirstName(String First) {
		firstname.sendKeys(First);
	}
	
	public void enterLastName(String Last) {
		lastname.sendKeys(Last);
	}
	
	public void enterZipCode(String code) {
		zipcode.sendKeys(code);
	}
	
	public void cLickOnContinue() {
		cont.click();
	}

}

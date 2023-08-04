package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SauceLabCompletePage extends SauceLabCheckOutPage2 {
	
	public SauceLabCompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//button[contains(.,'Open Menu')]")
	private WebElement option;
	
	@FindBy(xpath = ".//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	
	WebDriver driver;
	public void clickOnMenu() {
	//	Actions a=new Actions(driver);
		//a.moveToElement(option).click().build().perform();
		option.click();
	}
	
	public void clickOnLogout() {
	//	Actions a=new Actions(driver);
	//	a.moveToElement(logout).click().build().perform();
		logout.click();
	}

}

package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabCartPage extends SauceLabProductAddCart {
	
	public SauceLabCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = ".//a[@class='btn_action checkout_button']")
	private WebElement check;
	
	
	public void clickOnCheckOut() {
		check.click();
	}

}

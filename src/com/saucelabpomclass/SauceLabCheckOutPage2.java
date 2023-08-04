package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabCheckOutPage2 extends SauceLabCheckOutPage{
	
	public SauceLabCheckOutPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//a[@class='btn_action cart_button']")
	private WebElement finish;
	
	public void clickOnFinish() {
		finish.click();
	}

}

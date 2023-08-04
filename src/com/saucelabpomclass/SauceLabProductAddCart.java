package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SauceLabProductAddCart extends SaucelabProductPage {
	
	public SauceLabProductAddCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//button[@class='btn_primary btn_inventory']")
	private WebElement addtocart;
	@FindBy(xpath = ".//div[@id='shopping_cart_container']")
	private WebElement shop;
	
	
	public void clickOnAddToCart() {
		addtocart.click();
	}
	
	WebDriver driver;
	public void ClickOnShopLogo() {
		//Actions a=new Actions(driver) ;
		//a.moveToElement(shop).click().build().perform();
		shop.click();
		

}
}

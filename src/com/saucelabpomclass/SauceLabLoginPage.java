package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabLoginPage {
	
	@FindBy(xpath = ".//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = ".//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = ".//input[@class='btn_action']")
	private WebElement login;
	
	public SauceLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		login.click();
	}

}

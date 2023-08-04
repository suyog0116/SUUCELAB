package com.saucelabtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucelabpomclass.SauceLabCompletePage;

public class SauceLabTestScript {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void allMethods() throws InterruptedException {
		SauceLabCompletePage s = new SauceLabCompletePage(driver);
		s.enterUserName("standard_user");
		s.enterPassword("secret_sauce");
		s.clickOnLoginButton();
		Thread.sleep(3000);
		s.sortProduct();
		Thread.sleep(3000);
		s.clickOnProduct();
		s.clickOnAddToCart();
		Thread.sleep(3000);
		s.ClickOnShopLogo();
		s.clickOnCheckOut();
		Thread.sleep(3000);
		s.enterFirstName("shiv");
		s.enterLastName("kumar");
		s.enterZipCode("411028");
		s.cLickOnContinue();
		Thread.sleep(3000);
		s.clickOnFinish();
		s.clickOnMenu();
		Thread.sleep(3000);
		s.clickOnLogout();

	}

}

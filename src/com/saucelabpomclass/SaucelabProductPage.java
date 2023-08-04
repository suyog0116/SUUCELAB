package com.saucelabpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SaucelabProductPage extends SauceLabLoginPage {
	
	public SaucelabProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(.//div[@class='inventory_item_name'])[1]")
	private WebElement product;
	
	@FindBy(xpath = ".//select[@class='product_sort_container']")
	private WebElement sort;
	
	public void clickOnProduct() {
		product.click();
	}
	
	public void sortProduct() {
		sort.click();
		Select s=new Select(sort);
		s.selectByIndex(1);
	}

}

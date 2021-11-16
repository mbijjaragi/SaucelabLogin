package com.saucelablogin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelablogin.testbase.BaseClass;

public class ProductsPage {
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")//"div[@class='app_logo']")
	public WebElement appLogo;
	
	public ProductsPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}

package com.saucelablogin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelablogin.testbase.BaseClass;

public class LoginPage {

	@FindBy(id = "login_button_container")
	public WebElement loginContainer;

	@FindBy(id = "user-name")
	public WebElement userNameTxt;

	@FindBy(id = "password")
	public WebElement passwordTxt;

	@FindBy(id = "login-button")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//h3 [@data-test='error']")
	public WebElement errorMsg;
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}


}

package com.saucelablogin.steps;

import org.junit.Assert;

import com.saucelablogin.utils.CommonMethods;
import com.saucelablogin.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	
	@Given("I am on the Sauce Demo Login Page")
	public void i_am_on_the_sauce_demo_login_page() {
		Assert.assertTrue(loginPage.loginContainer.isDisplayed());	    
	}

	@When("I fill the account information for account {string} into the Username field and {string} into the Password field")
	public void i_fill_the_account_information_for_account_into_the_username_field_and_into_the_password_field(String string, String string2) {
	    sendText(loginPage.userNameTxt, string);
	    sendText(loginPage.passwordTxt, string2);
	}

	@When("I click the Login Button")
	public void i_click_the_login_button() {
	    click(loginPage.loginBtn);
	}

	@Then("I am redirected to the Sauce Demo Main Page")
	public void i_am_redirected_to_the_sauce_demo_main_page() {
		 wait(2);
	}

	@Then("I verify the App Logo exists")
	public void i_verify_the_app_logo_exists() {
		Assert.assertTrue(productsPage.appLogo.isDisplayed());
	}

	@Then("I verify the Error Message contains the text {string}")
	public void i_verify_the_error_message_contains_the_text(String expectedMessage) {
	   String actualMsg = loginPage.errorMsg.getText();
	   Assert.assertEquals("Login Failed Message is different", expectedMessage, actualMsg);
	}

}

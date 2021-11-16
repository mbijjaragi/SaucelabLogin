package com.saucelablogin.testbase;

import com.saucelablogin.pages.LoginPage;
import com.saucelablogin.pages.ProductsPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage loginPage;
	public static ProductsPage productsPage;

	public static void initialize() {
		loginPage = new LoginPage();
		productsPage = new ProductsPage();
	}
}

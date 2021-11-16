package com.saucelablogin.testbase;

import com.saucelablogin.utils.ConfigsReader;
import com.saucelablogin.utils.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;

		default:
			throw new RuntimeException("Browser is not supported");
		}
		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
		
		PageInitializer.initialize();
		
		return driver;
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}

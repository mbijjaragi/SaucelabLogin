package com.saucelablogin.steps;

import com.saucelablogin.testbase.BaseClass;
import com.saucelablogin.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void end(Scenario scenario) {
		byte[] picture;
		if(scenario.isFailed()) {
			picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		}
		else
		{
			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		
		scenario.attach(picture, "image/png", scenario.getName());
		
		BaseClass.tearDown();
		
	}

}

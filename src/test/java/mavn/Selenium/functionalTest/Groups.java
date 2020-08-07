package mavn.Selenium.functionalTest;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"Functional","Regression"})
	public void login() {
		System.out.println("functional");
	}

	@Test(groups = {"Regression"})
	public void endtoEnd() {
		System.out.println("regression");
	}
}

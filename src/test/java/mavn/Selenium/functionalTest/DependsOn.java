package mavn.Selenium.functionalTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsOn {
	@Test
	public void login() {
		System.out.println("test1");
	Assert.fail();
	}
	
	@Test(alwaysRun = true,dependsOnMethods = "login")
	private void placeorder() {
		System.out.println("test2");
	}

}

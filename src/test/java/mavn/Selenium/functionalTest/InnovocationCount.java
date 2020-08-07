package mavn.Selenium.functionalTest;

import org.testng.annotations.Test;

public class InnovocationCount {
	
	@Test(invocationCount = 10)
	public void test() {
		System.out.println("innovacation count");
	}

}

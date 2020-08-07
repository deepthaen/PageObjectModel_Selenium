package mavn.Selenium.driverUtilies.controlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface WebControler {
	
	public WebDriver browserLaunch();
	public void max();
	public void Url();
	public void waits();
	void quite();
	void waitForElementClickable(WebElement W);
	
	
	

}

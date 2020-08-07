package mavn.Selenium.driverUtilies.implemention;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mavn.Selenium.driverUtilies.BrowserUtil;
import mavn.Selenium.driverUtilies.controlers.WebControler;
import mavn.Selenium.utilies.PropertyUtil;

public class WebImplemention implements WebControler{

	public WebDriver driver;
	public WebDriver browserLaunch() {
    this.driver = BrowserUtil.getInstance();
    System.out.println("Launching Browser");
    return driver;
    }

	public void max() {
		driver.manage().window().maximize();
		System.out.println("Maximizing Browser");
	}

	public void Url() {
	String url = PropertyUtil.getProperty("Url");
	System.out.println("Feteching URL"+ url);
	driver.get(url);	
	}

	public void waits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Waiting");
	}

	public void quite() {
		driver.quit();
		System.out.println("quiting ");
		
	}

	public void waitForElementClickable(WebElement W) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(W));
		
	}
	
	

}

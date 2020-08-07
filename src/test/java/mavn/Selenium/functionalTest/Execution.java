package mavn.Selenium.functionalTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import mavn.Selenium.driverUtilies.BrowserUtil;
import mavn.Selenium.driverUtilies.controlers.WebControler;
import mavn.Selenium.driverUtilies.implemention.LoginClass;
import mavn.Selenium.driverUtilies.implemention.WebImplemention;

public class Execution {
	
	public WebDriver driver = null;
	
	public WebControler b;
	public LoginClass L;
	public static Logger log = Logger.getLogger(Execution.class);
	public Execution() {
		 b = new WebImplemention();
		 this.driver = b.browserLaunch();
	}
	
	@BeforeMethod
	public void browserLaunch() {
		log.info("Before method");
		b.Url();
		b.max();
		b.waits();
	}
	@Test
	public void Login() {
		 L = new LoginClass(driver);
		 L.Login();
		
	}
	
	@AfterMethod
	public void closeWindow() {
		b.quite();
	}
	

}

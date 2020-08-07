package mavn.Selenium.functionalTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mavn.Selenium.driverUtilies.controlers.WebControler;
import mavn.Selenium.driverUtilies.implemention.LoginClass;
import mavn.Selenium.driverUtilies.implemention.WebImplemention;

public class DataProviders {
public WebDriver driver = null;;
	
	public WebControler b;
	public LoginClass L;
	
	
	@Test(dataProvider = "dprovider")
	public void data(String name ) {
		 b = new WebImplemention();
		 this.driver = b.browserLaunch();
		 L = new LoginClass(driver);
		 b.Url();
			b.max();
			b.waits();
			
			 L.Login();
	}
	
	@DataProvider(parallel = true)
	public Object[][] dprovider() {
		Object[][] ob = {{"hari"},{"deeptha"},{"hari"},{"deeptha"}};
		return ob;
	}
}

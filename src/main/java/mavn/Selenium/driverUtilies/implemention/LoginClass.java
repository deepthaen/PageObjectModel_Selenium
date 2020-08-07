package mavn.Selenium.driverUtilies.implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavn.Selenium.utilies.PropertyUtil;

public class LoginClass {
	
	public  WebDriver driver;
	
	public LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	public WebElement LoginButton;
	
	@FindBy(xpath="//input[@placeholder='Email / Phone Number']")
	public WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Submit;
	
	 public void Login() {
		 LoginButton.click();
		 String UN = PropertyUtil.getProperty("UserName");
			System.out.println("Username"+ UN);
			UserName.sendKeys(UN);
			String PW = PropertyUtil.getProperty("Password");
			Password.sendKeys(PW);
			Submit.click();
		
		 
	 }

}

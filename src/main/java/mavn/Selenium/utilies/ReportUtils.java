package mavn.Selenium.utilies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.IExecutionListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.IResultListener;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtils implements ITestListener,ISuiteListener,IResultListener,IReporter,IExecutionListener,WebDriverEventListener{

	//WebdriverEventListner -- handling action level log
	public ExtentReports extent;
	public ExtentTest test;
	public ReportUtils() {
		extent = new ExtentReports("./Reports/ExtentReports.html",true);
	}
	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generatedj method stub
		
	}
	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		
	}
	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		
	}
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		
	}
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		
	}
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ISuite suite) {
		test = new ExtentTest(getClass().getName(), "");
		test.log(LogStatus.INFO, "On start test Suite is Executing");
		
	}
	public void onFinish(ISuite suite) {
		extent.flush();
		extent.close();
		
	}
	public void onTestStart(ITestResult result) {
		test = extent.startTest(getClass().getName());
		test.log(LogStatus.INFO, "Am strting my actual Test");
	}
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "My test Execution is successfully Executed");
		
	}
	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "My test Execution is FAILED");
		
	}
	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP , "My test Execution is SKIPPED");
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}
	
}

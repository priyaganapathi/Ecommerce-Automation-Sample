package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utilities.ExtentReportManager;

public class BaseTest {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	public WebDriver getDriver() {
		return driver;
	}

	// browser setup
	@BeforeClass

	public void setup() {

		extent = ExtentReportManager.getReportInstance();
        driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://sauce-demo.myshopify.com/");

	}

	/*
	 * @AfterClass public void teardown() { if (driver != null) { driver.quit();
	 * System.out.println("Browser closed"); } }
	 */

}



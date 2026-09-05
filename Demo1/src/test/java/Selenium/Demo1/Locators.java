package Selenium.Demo1;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Locators

{
	@Test

	public void automationTest( )throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * WebDriver driver = new ChromeDriver();
		 * System.setProperty("WebDriver.chrome.driver",
		 * "C:/Users/priya/Downloads/chromedriver_win32.exe");
		 * driver.get("https://rahulshettyacademy.com/all-access-subscription");
		 * //driver.manage().window().maximize();
		 * 
		 * try { Thread.sleep(10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * driver.manage().window().maximize();
		 */
		// driver.findElement(By.id("inputUsername")).sendKeys("Priya");
		// driver.findElement(By.name("inputPassword")).sendKeys("1234");

		// driver.findElement(By.className("submit signInBtn")).click();
		// https://2captcha.com/demo

		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "C:/Users/priya/Downloads/chromedriver_win32.exe");
		// driver.get("https://2captcha.com/demo");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath(
		 * "//a[@class='flex decoration-1 _link_wsrdh_1 _linkWithExplicitUnderline_wsrdh_15'][normalize-space()='reCAPTCHA V2']"
		 * )) .click();
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@class='_captchaWidgetContainer_151cx_22']")).click();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * WebElement element = wait
		 * .until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * "._captchaWidgetContainer_151cx_22"))); element.click();
		 */

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Priyanka");
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priyaganpat13@gmail.com");
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9159534769");
		Thread.sleep(10);
		driver.findElement(By.id("textarea")).sendKeys("No 5 Mettu street Thrithuraipoondi Thiruvarur Dt");
		Thread.sleep(10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(500, document.body.scrollHeight)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"))
				.click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		Thread.sleep(10);

		WebElement targetOption = driver.findElement(By.id("country"));

		// Scroll to the element so it's in the viewport
		new Actions(driver).scrollToElement(targetOption).perform();
		targetOption.click();

		targetOption = driver.findElement(By.xpath("//select[@id='colors']//option[3]"));

		targetOption.click();
		Thread.sleep(10);

		/*
		 * WebElement dropElement =
		 * driver.findElement(By.xpath("//option[@value='zebra']")); Select select = new
		 * Select(dropElement); Thread.sleep(10);
		 */

		WebElement dropdown = driver.findElement(By.id("animals"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("Giraffe");

		/*
		 * WebElement dateField = driver.findElement(By.id("dateInput"));
		 * dateField.sendKeys("2025-10-28");
		 */
		Thread.sleep(15);
		WebElement date = driver.findElement(By.id("datepicker"));

		date.clear();
		date.sendKeys("05/30/2026");

		Thread.sleep(15);

		/*
		 * WebElement date1 = driver.findElement(By.xpath("//input[@id='txtDate']"));
		 * date1.clear(); date1.sendKeys("30/05/2026");
		 */

		/*
		 * JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * js2.executeScript("window.scrollTo(500, document.body.scrollHeight)");
		 * driver.findElement(By.xpath("//a[@class='home-link']")).click();
		 * Thread.sleep(15);
		 */

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("window.scrollBy(0,-800)");

		/*
		 * WebElement searchBox =
		 * driver.findElement(By.xpath("//input[@type='submit']"));
		 * 
		 * searchBox.sendKeys("Selenium");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * 
		 * WebElement suggestion = wait.until(
		 * ExpectedConditions.elementToBeClickable(By.
		 * xpath("//li[contains(text(),'Selenium WebDriver')]")));
		 * 
		 * suggestion.click();
		 */

		// Wikipedia1_wikipedia-search-input

		// WebElement searchBox =
		// driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		// searchBox.sendKeys("Laptop");
		// WebElement searchIcon =
		// driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/aside[1]/div[1]/div[1]/div[1]/form[1]/div[1]/span[2]/span[2]/input[1]"));
		// searchIcon.click();

		/*
		 * driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(
		 * "Laptop");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * 
		 * List<WebElement> suggestions = wait
		 * .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li")))
		 * ;
		 * 
		 * suggestions.get(1).click();
		 */

		driver.findElement(By.xpath("//button[normalize-space()='START']")).click();

		JavascriptExecutor js4 = (JavascriptExecutor) driver;

		js3.executeScript("window.scrollBy(0, 500)");

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();

		Thread.sleep(30);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();

		Thread.sleep(30);

		driver.switchTo().alert().dismiss();

		Thread.sleep(30);

		driver.findElement(By.id("promptBtn")).click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Priya");
		alert.accept();

		driver.findElement(By.xpath("//button[@id='PopUp']")).click();

		

	}

}

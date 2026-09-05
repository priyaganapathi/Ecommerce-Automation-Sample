/**
 * 
 */
/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Locators
	//Store locators as variables
	
	By loginfield = By.id("customer_login_link");
	By usernamefield = By.id("customer_email");
	By passwordfield = By.id("customer_password");
	By signinfield = By.xpath("//input[@value='Sign In']");
	By errorMessage = By.cssSelector(".error-message-container");
	
	public void login(String username, String password) {
		driver.findElement(loginfield).click();
		driver.findElement(usernamefield).clear();
		driver.findElement(usernamefield).sendKeys(username);
		driver.findElement(passwordfield).clear();
		driver.findElement(passwordfield).sendKeys(password);
		driver.findElement(signinfield).click();
	}
	
	
	
	public String getErrorMessage() {
		WebElement error = driver.findElement(errorMessage);
		return error.getText(); // return the text as string
	}
	
	
	
	
	
	
}
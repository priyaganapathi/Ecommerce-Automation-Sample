package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;

	

	public CartPage(WebDriver driver) {
		
		this.driver = driver;
	}

	// cart page locators
	By addToCartButton = By.id("add");
	By checkfinaldone = By.cssSelector(".checkout");
	By fieldupdate = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/section[1]/form[1]/div[1]/div[2]/div[3]/input[1]");
    By comments = By.id("note");
	By finalcheckoutcall = By.cssSelector("#checkout");

	// click add to cart button

	public void addToCart() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));

		addButton.click();

		// wait for cart drawer/update
		wait.until(ExpectedConditions.urlContains("products"));

		System.out.println("Added product to cart");
	}

	public void checkfinal() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement checking = wait.until(ExpectedConditions.elementToBeClickable(checkfinaldone));
		checking.click();

		System.out.println("Checkoutfinal page is opened");
	}

	public void updatecheckout() {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement field = driver.findElement(fieldupdate);

		field.clear(); // Remove existing text
		field.sendKeys("3");
	}

	public void message() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement msg = driver.findElement(comments);
		msg.sendKeys("Nice one...");

	}

	public void finalcheckout() {
		WebElement finalcall = driver.findElement(finalcheckoutcall);

		finalcall.click();
	}
	

}
  



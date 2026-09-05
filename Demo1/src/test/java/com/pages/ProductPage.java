package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {

		this.driver = driver;

	}

//	Locators

	By catalog = By.xpath("//a[normalize-space()='Catalog']");
	By productCards = By.cssSelector(".product-grid.twelve.columns.alpha.omega");
	By productNames = By.cssSelector("section.product-grid h3 a");
	By productPrices = By.cssSelector("section.product-grid h4");
	By sortproductoption = By.className("single-option-selector");
	
	By cartBadge = By.cssSelector(".toggle-drawer.cart.desktop");

	

	
	
	public void addFirstProductToCart() {

	    List<WebElement> products = driver.findElements(By.cssSelector("h3 a"));

	    if (products.size() > 0) {
	        products.get(0).click();
	        System.out.println("First product opened");
	    } else {
	        System.out.println("No products found on page");
	    }
	}

	public int getProductCount() {
		List<WebElement> products = driver.findElements(productNames);
		System.out.println("Total products found: " + products.size());
		return products.size();
	}

// 2.get first product name
	public String getFirstProductName() {
		List<WebElement> products = driver.findElements(productNames);
		String name = products.get(0).getText();
		System.out.println("First product name: " + name);
		return name;
	}

//	3.get cart count from badge
	public int getCartCount() {
		try {
			WebElement badge = driver.findElement(cartBadge);
			int count = Integer.parseInt(badge.getText());
			System.out.println("Cart count: " + count);
			return count;
		} catch (Exception e) {
			// if badge not visible cart is empty
			System.out.println("cart is empty");
			return 0;
		}
	}

}

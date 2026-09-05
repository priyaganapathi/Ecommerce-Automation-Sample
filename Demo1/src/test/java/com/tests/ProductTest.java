package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class ProductTest extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;

    @BeforeClass
    public void initializePages() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3 a")));

        driver.navigate().to("https://sauce-demo.myshopify.com/collections/all");
    }

    @Test(priority = 1)
    public void verifyAddToCart() {

        extentTest = extent.createTest("Verify add to cart");
        extentTest.info("Adding first product to cart");

        String productName = productPage.getFirstProductName();
        extentTest.info("Adding product: " + productName);

        productPage.addFirstProductToCart();
        extentTest.info("Clicked add to cart button");
    }
}
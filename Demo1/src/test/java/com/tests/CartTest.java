package com.tests;


import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.CartPage;
import com.pages.ProductPage;



	
	public class CartTest extends BaseTest {
		
	    ProductPage productPage;
	    CartPage cartPage;

	    @Test
	    public void testCartCheckout() {

	        productPage = new ProductPage(driver);
	        CartPage cartPage = new CartPage(driver);
	        driver.get("https://sauce-demo.myshopify.com/products/flower-print-jeans");

	        cartPage.addToCart();
	        
	        System.out.println(driver.getCurrentUrl());
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        //cartPage.Checkout();
	        System.out.println(driver.getCurrentUrl());
	        cartPage.checkfinal();
	        cartPage.updatecheckout();
	        cartPage.message();
	        cartPage.finalcheckout();
	        
	        
	        
	        
	      
	    }
	}
	
	


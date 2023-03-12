package com.town.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.town.base.Base;
import com.town.screens.AddToCartScreen;
import com.town.screens.SignUpScreen;

public class AddToCartTests extends Base{
	
	SignUpScreen sgn_scr;
	AddToCartScreen add_to_cart_screen;
	
	@Test (priority=16)
	public void add_item_to_cart() throws InterruptedException {

		sgn_scr= new SignUpScreen();
		add_to_cart_screen=new AddToCartScreen();
		
		Thread.sleep(1000);

		 sgn_scr.MenuButton.click();
		 add_to_cart_screen.ShoesButton.click();
		 add_to_cart_screen.shoes.click();
		 add_to_cart_screen.scroll("Size");
		 add_to_cart_screen.size.click();
		 add_to_cart_screen.AddToCartButton.click();
		 add_to_cart_screen.cartIcon.click();
		 wait.until(ExpectedConditions.visibilityOf(add_to_cart_screen.shoes));
		 //Thread.sleep(1000);
		 //add_to_cart_screen.shoes.isDisplayed();
		 
	}
	
	@Test (priority=17)
	public void delete_item_from_cart() throws InterruptedException {
		
   		 sgn_scr= new SignUpScreen();
		 add_to_cart_screen=new AddToCartScreen();
		 
		 Thread.sleep(1000);
		 sgn_scr.MenuButton.click();
		 add_to_cart_screen.ShoesButton.click();
		 add_to_cart_screen.shoes.click();
		 add_to_cart_screen.scroll("Size");
		 add_to_cart_screen.size.click();
		 add_to_cart_screen.AddToCartButton.click();
		 add_to_cart_screen.cartIcon.click();
		 add_to_cart_screen.DeleteIcon.click();
		 wait.until(ExpectedConditions.visibilityOf(add_to_cart_screen.cart_empty));

	//	 add_to_cart_screen.cart_empty.isDisplayed();
		 
	}
	
	@Test (priority=18)
	public void add_out_of_stock_item_to_cart() throws InterruptedException {
		
   		 sgn_scr= new SignUpScreen();
		 add_to_cart_screen=new AddToCartScreen();
		 
		 Thread.sleep(1000);
		 sgn_scr.MenuButton.click();
		 add_to_cart_screen.ShoesButton.click();
		 add_to_cart_screen.shoes.click();
		 add_to_cart_screen.scroll("Size");
		 add_to_cart_screen.out_size.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(add_to_cart_screen.out_of_stock));

		 //add_to_cart_screen.out_of_stock.isDisplayed();
	}

}

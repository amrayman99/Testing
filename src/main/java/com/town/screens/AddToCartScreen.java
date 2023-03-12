package com.town.screens;

import org.openqa.selenium.support.PageFactory;

import com.town.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddToCartScreen extends Base {
	
	public AddToCartScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='SHOES']")
	public MobileElement ShoesButton;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='SHO23GPUL25352TM1']")
	public MobileElement shoes;
	
	@AndroidFindBy (id="co.shopney.townteam:id/addtoCart")
	public MobileElement AddToCartButton;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='44']")
	public MobileElement size;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='45']")
	public MobileElement out_size;
	
	@AndroidFindBy (id="co.shopney.townteam:id/cart_icon")
	public MobileElement cartIcon;
	
	@AndroidFindBy (id="co.shopney.townteam:id/delete")
	public MobileElement DeleteIcon;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='YOUR CART IS EMPTY!']")
	public MobileElement cart_empty;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='OUT OF STOCK']")
	public MobileElement out_of_stock;
	

	
	public void scroll(String visibleText) {
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
	        }
	
	
	    }
	



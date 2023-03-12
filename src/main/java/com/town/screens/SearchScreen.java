package com.town.screens;


import org.openqa.selenium.support.PageFactory;

import com.town.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchScreen extends Base {
	
	SignUpScreen sgnUpScr;
	
	
	
	public SearchScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	@AndroidFindBy (id="co.shopney.townteam:id/searchView")
	public MobileElement SrchViewField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/search_src_text")
	public MobileElement SrchField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/itemTitleTv")
	public MobileElement ResultItem;
	
	@AndroidFindBy (id="co.shopney.townteam:id/currencyTv")
	public MobileElement language_button;
	
	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
	public MobileElement arabic_language;
	
	@AndroidFindBy (id="co.shopney.townteam:id/applyBtn")
	public MobileElement apply_button;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='بحث']")
	public MobileElement search;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='NO RESULT FOUND!']")
	public MobileElement noReaultFound;
	
	
	
public void searching(String search_text) {
		
		
		SrchViewField.click();
		SrchField.sendKeys(search_text);
		
		
	}

public void change_language_to_arabic() throws InterruptedException {
	
		sgnUpScr= new SignUpScreen();
		
		 Thread.sleep(1000);
		 sgnUpScr.MenuButton.click();
		 language_button.click();
		 arabic_language.click();
		 apply_button.click();
		 Thread.sleep(3000);
	
}

public void unRealted_searching(String search_text)  {
	
	 
	SrchViewField.click();
	SrchField.click();
	SrchField.sendKeys(search_text);

	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	noReaultFound.isDisplayed();
	
}



}

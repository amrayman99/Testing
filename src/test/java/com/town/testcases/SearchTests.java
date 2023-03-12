package com.town.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.town.base.Base;
import com.town.screens.SearchScreen;


public class SearchTests extends Base{

	
	SearchScreen search_screen;
	
	@Test (priority=12)
	public void english_searching() {
		search_screen = new SearchScreen();
		search_screen.searching("jacket");
		 wait.until(ExpectedConditions.visibilityOf(search_screen.ResultItem));

		//search_screen.ResultItem.isDisplayed();
		
	}
	
	@Test (priority=14)
	public void arabic_searching() throws InterruptedException {
		
		search_screen = new SearchScreen();
		search_screen.change_language_to_arabic();
		search_screen.searching("جاكت");
		Thread.sleep(3000);
		search_screen.ResultItem.isDisplayed();
		
	}
	
	@Test (priority=13)
	public void validate_arabic_language() throws InterruptedException {
		
		search_screen = new SearchScreen();
		search_screen.change_language_to_arabic();
		search_screen.search.isDisplayed();
	}
	
	@Test (priority=15)
	public void unRelate_search() throws InterruptedException {
		
		search_screen = new SearchScreen();
		search_screen.unRealted_searching("GYM");


	}
}

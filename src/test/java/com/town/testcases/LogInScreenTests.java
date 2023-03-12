package com.town.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.town.base.Base;
import com.town.screens.LogInScreen;
import com.town.screens.SignUpScreen;

public class LogInScreenTests extends Base{
	
	LogInScreen log_in_screen;
	SignUpScreen sgn_up_screen;
	
	
	@Test (priority=7)
	public void sign_in_valid_data() throws InterruptedException {
		

		log_in_screen= new LogInScreen();
		sgn_up_screen= new SignUpScreen();
				
		log_in_screen.open_log_in_screen();
		log_in_screen.fill_log_in_data("amrrrrrr@gmail.com", "123456789");
		log_in_screen.logInButton.click();
		sgn_up_screen.SignOutButton.isDisplayed();
		log_in_screen.log_out();
	}
	

	@Test (priority=8)
	public void sign_in_valid_email_invalid_pass() throws InterruptedException {
		
		
		try {
			log_in_screen= new LogInScreen();
					
			log_in_screen.open_log_in_screen();
			log_in_screen.fill_log_in_data("amrrrrrr@gmail.com", "123456");
			log_in_screen.logInButton.click();
			log_in_screen.chkLogInfo.isDisplayed();
		} catch (InterruptedException e) {

		}
		
	}

	
	@Test (priority=9)
	public void sign_in_invalid_email_valid_pass() throws InterruptedException, NoSuchElementException {
		
		
		log_in_screen= new LogInScreen();

		log_in_screen.open_log_in_screen();
		log_in_screen.fill_log_in_data("zzz@gmail.com", "123456");
		try {
			log_in_screen.logInButton.click();
		} catch (Exception e) {

		}
		log_in_screen.chkLogInfo.isDisplayed();
		

	}
	
	@Test (priority=10)
	public void empty_email_valid_pass() throws InterruptedException, NoSuchElementException {
		
		
		log_in_screen= new LogInScreen();
				
		log_in_screen.open_log_in_screen();
		log_in_screen.fill_log_in_data("", "123456789");
		try {
			log_in_screen.logInButton.click();
		} catch (Exception e) {

		}

		log_in_screen.chkEmailEmpty.isDisplayed();
		
	}
	
	@Test (priority=11)
	public void empty_pass_valid_email() throws InterruptedException, NoSuchElementException {
		
		
		log_in_screen= new LogInScreen();
				
		log_in_screen.open_log_in_screen();
		log_in_screen.fill_log_in_data("amrrrrrr@gmail.com", "");
		try {
			log_in_screen.logInButton.click();
		} catch (Exception e) {

		}
		log_in_screen.chkPassEmpty.isDisplayed();
		
	}

}

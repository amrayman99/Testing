package com.town.screens;

import org.openqa.selenium.support.PageFactory;

import com.town.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogInScreen extends Base {
	
	public LogInScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	SignUpScreen sgn_up_screen;
	
	
	@AndroidFindBy (id="co.shopney.townteam:id/userName")
	public MobileElement emailField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/password")
	public MobileElement passField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/login_btn")
	public MobileElement logInButton;
	
	@AndroidFindBy (id="co.shopney.townteam:id/posButton")
	public MobileElement PoplogInButton;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Please check your login information and try again.']")
	public MobileElement chkLogInfo;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Email field cannot be empty.']")
	public MobileElement chkEmailEmpty;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Password field can not be empty.']")
	public MobileElement chkPassEmpty;
	
	
	
	public void open_log_in_screen() throws InterruptedException {
		
		SignUpScreen sgn_up_scr = new SignUpScreen();
		
	Thread.sleep(6000);	
	sgn_up_scr.MenuButton.click();
	sgn_up_scr.MyAccountButton.click();
	
	}
	
	
	public void fill_log_in_data(String Email, String Pass) {
		
		emailField.sendKeys(Email);
		passField.sendKeys(Pass);
		logInButton.click();
		
	}
	
	
	public void log_out() {
		
		sgn_up_screen = new SignUpScreen();
		
		sgn_up_screen.SignOutButton.click();
		sgn_up_screen.ConSignOutButton.click();
	}

}

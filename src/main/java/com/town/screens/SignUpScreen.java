package com.town.screens;

import org.openqa.selenium.support.PageFactory;

import com.town.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpScreen extends Base {
	
	public SignUpScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	@AndroidFindBy (className="android.widget.ImageView")
	public MobileElement MenuButton;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='MY ACCOUNT']")
	public MobileElement MyAccountButton;
	
	@AndroidFindBy (id="co.shopney.townteam:id/sign_up_tv")
	public MobileElement SignUpPageButton;
	
	@AndroidFindBy (id="co.shopney.townteam:id/name")
	public MobileElement fNameField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/surname")
	public MobileElement lNameField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/email")
	public MobileElement EmailField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/password")
	public MobileElement passField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/passwordAgain")
	public MobileElement passConField;
	
	@AndroidFindBy (id="co.shopney.townteam:id/signUp")
	public MobileElement SignUpButton;
	
	@AndroidFindBy (id="co.shopney.townteam:id/signOutBtn")
	public MobileElement SignOutButton;
	
	@AndroidFindBy (id="co.shopney.townteam:id/posButton")
	public MobileElement ConSignOutButton;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Password is too short (minimum is 5 characters)']")
	public MobileElement PassWarning;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='The passwords you entered do not match.']")
	public MobileElement PassMissMatching;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='The name you entered must contain chars.']")
	public MobileElement NameMissMatching;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Please complete all fields to continue.']")
	public MobileElement FillAllFields;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Email has already been taken']")
	public MobileElement TakenEmail;

	
	public void open_sign_up_screen() throws InterruptedException {
	
	Thread.sleep(6000);	
	MenuButton.click();
	MyAccountButton.click();
	SignUpPageButton.click();
	
	}
	
	
	public void fill_sign_up_data(String fName, String lName, String email, String password, String conPass) {
		
		fNameField.sendKeys(fName);
		lNameField.sendKeys(lName);
		EmailField.sendKeys(email);
		passField.sendKeys(password);
		passConField.sendKeys(conPass);
		SignUpButton.click();
		
	}
	

}

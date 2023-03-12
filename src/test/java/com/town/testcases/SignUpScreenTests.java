package com.town.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import com.town.base.Base;
import com.town.screens.SignUpScreen;

public class SignUpScreenTests extends Base {
	
	SignUpScreen sign_up_screen;

	@Test (priority=1)
	public void valid_data() throws InterruptedException {
		
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("Moo", "Salah", "amraymanr22@gmail.com", "123456789", "123456789");
		//Thread.sleep(8000);
		 wait.until(ExpectedConditions.visibilityOf(sign_up_screen.SignOutButton));

		//sign_up_screen.SignOutButton.isDisplayed();
		
	}
	
	@Test (priority=6)
	public void valid_data_invalid_password() throws InterruptedException {
		
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("Moo", "Salah", "arrr@gmail.com", "123", "123");
		sign_up_screen.PassWarning.isDisplayed();
		}
	
	@Test (priority=2)
	public void valid_data_invalid_Conpassword() throws InterruptedException {
		
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("Moo", "Salah", "arrr@gmail.com", "12345678", "1234987");
		 wait.until(ExpectedConditions.visibilityOf(sign_up_screen.PassMissMatching));

		//sign_up_screen.PassMissMatching.isDisplayed();
		}
	
	@Test (priority=3)
	public void valid_data_invalid_full_name() throws InterruptedException {
		
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("%", "Salah", "arrr@gmail.com", "12345678", "12349878");
		sign_up_screen.NameMissMatching.isDisplayed();
		}
	
	@Test (priority=4)
	public void valid_data_empty_fname() throws InterruptedException {
		
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("", "Salah", "arrr@gmail.com", "12345678", "12349878");
		sign_up_screen.FillAllFields.isDisplayed();
		}
	
	@Test (priority=5)
	public void valid_data_signed_up_email() throws InterruptedException {
		
		sign_up_screen= new SignUpScreen();
		sign_up_screen.open_sign_up_screen();
		sign_up_screen.fill_sign_up_data("Moo", "Salah", "amrrrrrr@gmail.com", "123456789", "123456789");
		//Thread.sleep(8000);
		//sign_up_screen.TakenEmail.isDisplayed();
		 wait.until(ExpectedConditions.visibilityOf(sign_up_screen.TakenEmail));

	}
	

}

package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//*[@id=\"UserNameOrEmail\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"passwordInput\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"kt_sign_in_submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;


	@FindBy(xpath="//*[@id=\"kt_account_profile_details_form\"]/div[5]/i")
	WebElement eye;

	@FindBy(xpath="//*[@id=\"flexRadioLg\"]")
	WebElement checkbox;

	@FindBy(xpath="//*[@id=\"kt_account_profile_details_form\"]/div[7]/a")

	WebElement frgtbtn;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();
	}


	public HomePage maskingandcheckbox(String un, String pwd){
//		username.sendKeys(un);
//		password.sendKeys(pwd);
		eye.click();
		checkbox.click();
		//loginBtn.click();

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();
	}

	public HomePage forgotbutton() {
		frgtbtn.click();
		return new HomePage();
	}


	public String getErrorMessage() {
        return "";
    }
}

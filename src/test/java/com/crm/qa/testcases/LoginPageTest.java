package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void VERIFY_TITLE_ASSERTION(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Techsacare");
	}
	
	@Test(priority=2)
	public void VERIFY_USER_SUCCESSFUL_LOGIN(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 3)
	public void VERIFY_USER_WITH_InvalidCredentials() {
		// Attempt to log in with invalid credentials
		homePage = loginPage.login(prop.getProperty("incorrectusername"), prop.getProperty("passwordinc"));

		// Wait explicitly for the error message element to be visible using your XPath
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='kt_account_profile_details_form']/div[3]/ul/li")
		));

		// Retrieve the error message text
		String actualError = errorElement.getText().trim();
		System.out.println("Retrieved error message: " + actualError);

		// Verify that the error message matches the expected text
		Assert.assertEquals(actualError,
				"No User Exists with these Credentials. Please Enter Some Valid Credentials!",
				"Error message does not match for invalid credentials.");
	}
	@Test(priority = 4)
	public void VERIFY_Remember_me_And_passwordmasking() {
		homePage = loginPage.maskingandcheckbox(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 5)
	public void ForgotPassword_IS_CLICKABLE() {
		homePage = loginPage.forgotbutton();


	}



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	

}

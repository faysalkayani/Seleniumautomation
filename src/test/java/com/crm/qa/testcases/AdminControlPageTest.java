package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminControlPage;
import com.crm.qa.pages.AppointmentPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.crm.qa.base.TestBase.initialization;
import static com.crm.qa.base.TestBase.prop;

public class AdminControlPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    AppointmentPage appointmentPage;
    AdminControlPage adminControlPage;
    TestUtil testUtil;

    public AdminControlPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        appointmentPage = new AppointmentPage();
        adminControlPage= new AdminControlPage();
    }

    @Test(priority=1)
    public void ADMIN_CONTROL() throws InterruptedException {
        adminControlPage.verifyadmincontrol();


    }
    @Test(priority=2)
    public void VerifyAdmincontroloptions() throws InterruptedException {
        adminControlPage.verifyuserdetails();

    }
    @AfterMethod
    public void setUp1() throws InterruptedException {
        driver.quit();
    }
    }



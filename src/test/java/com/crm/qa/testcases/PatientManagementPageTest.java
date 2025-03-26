package com.crm.qa.testcases;

import com.crm.qa.pages.PatientManagementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AppointmentPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import java.time.Duration;
import java.util.List;

public class PatientManagementPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    AppointmentPage appointmentPage;
    PatientManagementPage patientManagementPage;
    TestUtil testUtil;

    public PatientManagementPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        patientManagementPage = new PatientManagementPage();

    }

    @Test(priority=1)
    public void verifypatientpage() throws InterruptedException {
 patientManagementPage.clickonPtMngt();
        Thread.sleep(15000);

    }

    @Test(priority=2)
    public void verifypatientregistration() throws InterruptedException {


        Thread.sleep(15000);

    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

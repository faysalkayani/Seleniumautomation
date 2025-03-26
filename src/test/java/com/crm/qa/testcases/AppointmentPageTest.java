package com.crm.qa.testcases;

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

public class AppointmentPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    AppointmentPage appointmentPage;
    TestUtil testUtil;

    public AppointmentPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("recep"), prop.getProperty("passrec"));
        appointmentPage = new AppointmentPage();
    }

    @Test(priority=1)
    public void verifyWalkinAppt() throws InterruptedException {
        appointmentPage.clickAppointmentsMenu();
        Thread.sleep(5000);


    }

    @Test(priority=2)
    public void verifyScheduleAppt() throws InterruptedException {
        appointmentPage.ScheduleAppts();
    }

    @Test(priority = 3)
    public void VerifyAllAppointments() throws InterruptedException {
        appointmentPage.Allappointments();
        Thread.sleep(6000);
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

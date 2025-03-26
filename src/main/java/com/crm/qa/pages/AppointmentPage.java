package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AppointmentPage extends TestBase {


    @FindBy(xpath = "//span[@class='menu-title' and normalize-space(text())='Appointments Management']\n")
    WebElement apptsmbutton;

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/span/span[2]")
    WebElement Appointmentsidebarbtn;

    @FindBy(xpath = "//input[contains(@class, 'select2-search__field') or @role='searchbox']")
    WebElement searchpatientfield;

    @FindBy(xpath = "//span[@class='menu-title' and text()='All Appointments']")
    WebElement allappbtn;

    @FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div/div[1]/div[1]/div[2]/a[1]")
    WebElement walkinbtn;

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/div[1]/span[2]")
    WebElement appntmngt;

    @FindBy(xpath = "//*[@id=\"searchCon\"]/div/div/span/span[1]/span")
    WebElement selectpatient;

    @FindBy(xpath = "//span[@class='select2-selection__placeholder' and text()='Select a Branch']\n")
    WebElement selectbranch;


    @FindBy(xpath = "//*[@id=\"kt_confirm_appointment\"]/div/div/div[2]/div[1]/div[1]/div[5]/span/span[1]/span")
    WebElement providerdropdown;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and contains(text(), 'Salem A Bajwa')]")
    WebElement providerselected;


    @FindBy(xpath = "//*[@id=\"kt_confirm_appointment\"]/div/div/div[2]/div[1]/div[4]/div[2]/span/span[1]/span")
    WebElement apptreason;

    @FindBy(xpath = "//*[@id=\"select2-ddRreason-result-ut50-f1a6685e-a3ec-4f1f-84ba-04e389d050c8\"]")
    WebElement selectapptreason;

    @FindBy(xpath = "//*[@id=\"kt_confirm_appointment\"]/div/div/div[2]/div[1]/div[4]/div[3]/span/span[1]/span")
    WebElement apptype;

    @FindBy(xpath = "//*[@id=\"select2-ddRreason-result-ut50-f1a6685e-a3ec-4f1f-84ba-04e389d050c8\"]")
    WebElement selectapptype;

    @FindBy(xpath = "//*[@id=\"ddservicesdiv\"]/span/span[1]/span")
    WebElement services;

    @FindBy(xpath = "//*[@id=\"select2-ddServices-result-9jd1-639\"]")
    WebElement selectservices;

    @FindBy(xpath = "//*[@id=\"btnConfirm\"]")
    WebElement walkinsavebtn;

    @FindBy(xpath = "//span[@class='menu-title' and text()='Schedule an Appointment']")
    WebElement schbutton;

    @FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div/div[2]/div[3]/span/span[1]/span")
    WebElement selectaprovidertype;

    @FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div/div[2]/div[4]/span/span[1]/span")
    WebElement selectaprovider;

    @FindBy(xpath = "//*[@id=\"kt_docs_fullcalendar_selectable\"]/div[2]/div/table/tbody/tr/td/div/div/div/div[1]/table/tbody/tr[23]/td[2]")
    WebElement selectslot;

    @FindBy(xpath = "//*[@id=\"select2-ProviderId-result-mlg3-086e4f54-9452-4f82-86ff-645336d24cb6\"]")
    WebElement selectatest;

    @FindBy(xpath = "//*[@id=\"kt_docs_fullcalendar_selectable\"]/div[1]/div[3]/div/button[3]")
    WebElement selectday;

    @FindBy(xpath = "//span[@class='menu-title' and text()='Appointments']")
    WebElement menuapptbtn;

    @FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div/div[2]/div[2]/span/span[1]/span")
    WebElement selectabranchpatient;

    @FindBy(xpath = "//*[@id=\"kt_docs_fullcalendar_selectable\"]/div[2]/div/table/tbody/tr/td/div/div/div/div[2]/table/tbody/tr/td[2]/div/div[3]/div")
    WebElement selectaslot;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option')][1]\n")
    WebElement firstoption;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option'][2]\n")
    WebElement appreasonselect;

    @FindBy(xpath = "//*[@id=\"swal2-title\"]")
    WebElement walkinappconfirmtext;

    @FindBy(xpath = "//div[@id='kt_docs_fullcalendar_selectable']//tr[td[@data-time='17:00:00']]/td[2]")
    WebElement schtimeslot;

    //softreg
    @FindBy(xpath = "//*[@id=\"SoftPatientFirstName\"]")
    WebElement Pfirstname;

    @FindBy(xpath = "//*[@id=\"SoftPatientLastName\"]")
    WebElement Plastname;

    @FindBy(xpath = "//*[@id=\"Mobileno\"]")
    WebElement mobno;

    @FindBy(xpath = "//button[@id='btnConfirm']\n")
    WebElement confrimappointment;

    @FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[5]/div/div[6]/button[1]")
    WebElement yesbutton;

    @FindBy(xpath = "//div[contains(@class,'fc-event-main')]//b[contains(text(),'Chest Pain or Discomfort') and contains(text(),'naval reception') and contains(text(),'Ahamd Bilal')]\n")
    WebElement event;


    public AppointmentPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAppointmentsMenu() throws InterruptedException {

        menuapptbtn.click();
        allappbtn.click();
        walkinbtn.click();
        selectpatient.click();
        searchpatientfield.sendKeys("Sher Khan" + Keys.ENTER);
        Thread.sleep(2000);
        selectbranch.click();
        firstoption.click();


        providerdropdown.click();
        providerdropdown.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        apptreason.click();
        Thread.sleep(4000);
        appreasonselect.click();
        Thread.sleep(4000);
        apptype.click();
        Thread.sleep(4000);
        apptype.sendKeys((Keys.ENTER));
        Thread.sleep(4000);
        services.click();
        Thread.sleep(4000);
        services.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        walkinsavebtn.click();
        Thread.sleep(2000);
//        Assert.assertEquals(walkinappconfirmtext.getText(), "Confirm Appointment");

    }


    public void ScheduleAppts() throws InterruptedException {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(menuapptbtn)).click();

        Thread.sleep(4000);

        // Click on the schedule button
        wait.until(ExpectedConditions.elementToBeClickable(schbutton)).click();
        Thread.sleep(4000);

        // Select a branch and press ENTER
        wait.until(ExpectedConditions.elementToBeClickable(selectabranchpatient)).click();
        wait.until(ExpectedConditions.visibilityOf(selectabranchpatient)).sendKeys(Keys.ENTER);

        // Select provider type: click, arrow down, then ENTER
        wait.until(ExpectedConditions.elementToBeClickable(selectaprovidertype)).click();
        wait.until(ExpectedConditions.visibilityOf(selectaprovidertype)).sendKeys(Keys.ARROW_DOWN);
        wait.until(ExpectedConditions.visibilityOf(selectaprovidertype)).sendKeys(Keys.ENTER);

        // Select provider and press ENTER
        wait.until(ExpectedConditions.elementToBeClickable(selectaprovider)).click();
        wait.until(ExpectedConditions.visibilityOf(selectaprovider)).sendKeys(Keys.ENTER);

        // Select the day and then the time slot
        wait.until(ExpectedConditions.elementToBeClickable(selectday)).click();
        wait.until(ExpectedConditions.elementToBeClickable(schtimeslot)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(selectpatient)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchpatientfield)).sendKeys("Sher Khan" + Keys.ENTER);
        Thread.sleep(2000);

        // Click on the appointment reason and select the reason
        wait.until(ExpectedConditions.elementToBeClickable(apptreason)).click();
        wait.until(ExpectedConditions.elementToBeClickable(appreasonselect)).click();

        // Choose appointment type by clicking then sending ENTER
        wait.until(ExpectedConditions.elementToBeClickable(apptype)).click();
        wait.until(ExpectedConditions.elementToBeClickable(apptype)).sendKeys(Keys.ENTER);

        // Select services by clicking then pressing ENTER
        wait.until(ExpectedConditions.elementToBeClickable(services)).click();
        wait.until(ExpectedConditions.elementToBeClickable(services)).sendKeys(Keys.ENTER);

        // Finally, click the confirm appointment button
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(confrimappointment)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(yesbutton)).click();
        Thread.sleep(5000);
//        wait.until(ExpectedConditions.elementToBeClickable(event)).click();
//        Thread.sleep(5000);
    }

    public void Allappointments() throws InterruptedException {
        apptsmbutton.click();
        allappbtn.click();

    }


}
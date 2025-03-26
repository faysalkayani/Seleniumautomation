//package com.crm.qa.pages;
//
//import com.crm.qa.base.TestBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class PatientManagementPage extends TestBase {
//
//    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[5]/span/span[2]")
//    WebElement PatientMngt;
//
//    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[5]/div/div[1]/a/span[2]")
//    WebElement newPatientRegistration;
//
//    @FindBy(xpath = "//*[@id=\"CreatePatient\"]/div[1]/div/div[2]/div[1]/div/div/div/div/span/span[1]/span")
//    WebElement Title;
//
//    @FindBy(xpath = "//*[@id=\"FirstName\"]")
//    WebElement FirstName;
//
//    @FindBy(xpath = "//*[@id=\"MiddleName\"]")
//    WebElement MiddleName;
//
//    @FindBy(xpath = "//*[@id=\"LastName\"]")
//    WebElement LastName;
//
//    @FindBy(xpath = "//span[contains(@class, 'select2-selection--single') and contains(@aria-labelledby, 'MaritalStatus')]")
//    WebElement martialstatus;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Single'] ")
//    WebElement martialstatusclickable;
//
//    @FindBy(xpath = "//span[@id='select2-Gender-container']")
//    WebElement Gender;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Male']")
//    WebElement Genderselect;
//
//    @FindBy(xpath = "//span[@id='select2-BloodGroup-container']")
//    WebElement Bgroup;
//
//    @FindBy(xpath = "//span[@id='select2-IdentityType-container']")
//    WebElement idtype;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='CNIC']")
//    WebElement idtypeselect;
//
//    @FindBy(xpath = "//*[@id=\"CNIC\"]")
//    WebElement idno;
//
//    @FindBy(xpath = "//span[@id='select2-IdentityOwner-container']")
//    WebElement idowner;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Self']")
//    WebElement idownerselect;
//
//    @FindBy(xpath = "//*[@id=\"dob\"]")
//    WebElement dob;
//
//    @FindBy(xpath = "//*[@id=\"Mobileno\"]")
//    WebElement Mobno;
//
//    @FindBy(xpath = "//span[@id='select2-BranchId-container']")
//    WebElement selectcompany;
//
//    @FindBy(xpath = "//*[@id=\"createbtn\"]")
//    WebElement createpatient;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and text()='Aman Company']")
//    WebElement companyselection;
//
//    @FindBy(xpath = "//span[@id='select2-BranchId-container']")
//    WebElement branchtoselect;
//
//    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and text()='Kabirwala']")
//    WebElement branchselection;
//
//    @FindBy(xpath = "//input[@type='search' and @aria-controls='ActivePatient']")
//    WebElement searchInput;
//
//    public PatientManagementPage() {
//        PageFactory.initElements(driver, this);
//    }
//
//    public String generateRandomCNIC() {
//        StringBuilder cnic = new StringBuilder();
//        for (int i = 0; i < 13; i++) {
//            int digit = (int) (Math.random() * 10);
//            cnic.append(digit);
//        }
//        return cnic.toString();
//    }
//
//    public void clickonPtMngt() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        wait.until(ExpectedConditions.elementToBeClickable(PatientMngt)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(newPatientRegistration)).click();
//        wait.until(ExpectedConditions.visibilityOf(Title)).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOf(FirstName)).sendKeys("Rashid");
//        wait.until(ExpectedConditions.visibilityOf(LastName)).sendKeys("Khan");
//
//        wait.until(ExpectedConditions.elementToBeClickable(martialstatus)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(martialstatusclickable)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(Gender)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(Genderselect)).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(idtype)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(idtypeselect)).click();
//
//        String randomCNIC = generateRandomCNIC();
//        wait.until(ExpectedConditions.visibilityOf(idno)).sendKeys(randomCNIC);
//        System.out.println("Generated CNIC: " + randomCNIC);
//
//        wait.until(ExpectedConditions.elementToBeClickable(idowner)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(idownerselect)).click();
//
//        wait.until(ExpectedConditions.visibilityOf(dob)).sendKeys("11/02/1992");
//        wait.until(ExpectedConditions.visibilityOf(Mobno)).sendKeys("03465022902");
//
//        wait.until(ExpectedConditions.elementToBeClickable(branchtoselect)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(branchselection)).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(createpatient)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(searchInput)).sendKeys("Rashid Khan");
//    }
//
//    public void ScheduleAppts() throws InterruptedException {
//        Thread.sleep(20000);

//    }
//}


package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PatientManagementPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[5]/span/span[2]")
    WebElement PatientMngt;

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[5]/div/div[1]/a/span[2]")
    WebElement newPatientRegistration;

    @FindBy(xpath = "//*[@id=\"CreatePatient\"]/div[1]/div/div[2]/div[1]/div/div/div/div/span/span[1]/span")
    WebElement Title;

    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"MiddleName\"]")
    WebElement MiddleName;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    WebElement LastName;

    @FindBy(xpath = "//span[contains(@class, 'select2-selection--single') and contains(@aria-labelledby, 'MaritalStatus')]")
    WebElement martialstatus;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Single']")
    WebElement martialstatusclickable;

    @FindBy(xpath = "//span[@id='select2-Gender-container']")
    WebElement Gender;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Male']")
    WebElement Genderselect;

    @FindBy(xpath = "//span[@id='select2-BloodGroup-container']")
    WebElement Bgroup;

    @FindBy(xpath = "//span[@id='select2-IdentityType-container']")
    WebElement idtype;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='CNIC']")
    WebElement idtypeselect;

    @FindBy(xpath = "//*[@id=\"CNIC\"]")
    WebElement idno;

    @FindBy(xpath = "//span[@id='select2-IdentityOwner-container']")
    WebElement idowner;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and @role='option' and normalize-space(text())='Self']")
    WebElement idownerselect;

    @FindBy(xpath = "//*[@id=\"dob\"]")
    WebElement dob;

    @FindBy(xpath = "//*[@id=\"Mobileno\"]")
    WebElement Mobno;

    @FindBy(xpath = "//span[@id='select2-BranchId-container']")
    WebElement selectcompany;

    @FindBy(xpath = "//*[@id=\"createbtn\"]")
    WebElement createpatient;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and text()='Aman Company']")
    WebElement companyselection;

    @FindBy(xpath = "//span[@id='select2-BranchId-container']")
    WebElement branchtoselect;

    @FindBy(xpath = "//li[contains(@class, 'select2-results__option') and text()='Kabirwala']")
    WebElement branchselection;

    @FindBy(xpath = "//input[@type='search' and @aria-controls='ActivePatient']")
    WebElement searchInput;

    public PatientManagementPage() {
        PageFactory.initElements(driver, this);
    }

    // Generate Random CNIC
    public String generateRandomCNIC() {
        StringBuilder cnic = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            int digit = (int) (Math.random() * 10);
            cnic.append(digit);
        }
        return cnic.toString();
    }

    // Perform Actions and Assertion
    public void clickonPtMngt() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, (10));

        wait.until(ExpectedConditions.elementToBeClickable(PatientMngt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(newPatientRegistration)).click();
        wait.until(ExpectedConditions.visibilityOf(Title)).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(FirstName)).sendKeys("Rashid");
        wait.until(ExpectedConditions.visibilityOf(LastName)).sendKeys("Khan");

        wait.until(ExpectedConditions.elementToBeClickable(martialstatus)).click();
        wait.until(ExpectedConditions.elementToBeClickable(martialstatusclickable)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Gender)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Genderselect)).click();

        wait.until(ExpectedConditions.elementToBeClickable(idtype)).click();
        wait.until(ExpectedConditions.elementToBeClickable(idtypeselect)).click();

        String randomCNIC = generateRandomCNIC();
        wait.until(ExpectedConditions.visibilityOf(idno)).sendKeys(randomCNIC);
        System.out.println("Generated CNIC: " + randomCNIC);

        wait.until(ExpectedConditions.elementToBeClickable(idowner)).click();
        wait.until(ExpectedConditions.elementToBeClickable(idownerselect)).click();

        wait.until(ExpectedConditions.visibilityOf(dob)).sendKeys("11/02/1992");
        wait.until(ExpectedConditions.visibilityOf(Mobno)).sendKeys("03465022902");

        wait.until(ExpectedConditions.elementToBeClickable(branchtoselect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(branchselection)).click();

        wait.until(ExpectedConditions.elementToBeClickable(createpatient)).click();

        // Search for Rashid Khan
        wait.until(ExpectedConditions.visibilityOf(searchInput)).sendKeys("Rashid Khan", Keys.ENTER);

        // Verify Rashid Khan in the search results
        WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ActivePatient\"]/tbody/tr[1]/td[2]")));
        Assert.assertTrue(searchResult.isDisplayed(), "Rashid Khan not found in the search results.");
        System.out.println("Assertion Passed: Rashid Khan is displayed in the search results.");
    }

    public void ScheduleAppts() throws InterruptedException {
        Thread.sleep(20000);
    }
}

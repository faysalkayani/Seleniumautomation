package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

public class AdminControlPage extends TestBase {


    @FindBy(xpath = "")
    WebElement dashboardbutton;

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[2]/span")
    public WebElement admincontrol;

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[2]/div[1]/div/a/span[2]")
    public WebElement userscontrol;

    @FindBy(xpath = "//*[@id=\"kt_app_content_container\"]")
    public WebElement usrtext;

    @FindBy(xpath="//*[@id=\"createButton\"]")
    public WebElement createbutton;



    @FindBy(xpath="//*[@id='RoleSelection']/span/span[1]/span")
    public WebElement roleselectiondropdown;

    @FindBy(xpath = "//li[contains(text(), 'Doctor')]")
    public WebElement docroleSelect;

    @FindBy(xpath="//*[@id=\"companyAdminSection\"]/div/span/span[1]/span")
    public WebElement companyselectiondropdown;

    @FindBy(xpath="//li[contains(text(), 'Aman Company')]")
    public WebElement companyselected;

    @FindBy(xpath="//*[@id=\"branchAdminSection\"]/div/span/span[1]/span")
    public WebElement branchselection;

    @FindBy(xpath="//li[contains(text(), 'Kabirwala')]")
    public WebElement branchdropdown;

    @FindBy(xpath="//*[@id=\"superAdminForm\"]/div[1]/div[2]/div[1]/div/div/span/span[1]/span")
    public WebElement titleselector;

    @FindBy(xpath="//li[contains(text(), 'Mr')]")
    public WebElement titleselectedMr;

    @FindBy(xpath="//*[@id=\"FirstName\"]")
    public WebElement firstname;

    @FindBy(xpath="//*[@id=\"MiddleName\"]")
    public WebElement middlename;

    @FindBy(xpath="//*[@id=\"LastName\"]")
    public WebElement lastname;

    @FindBy(xpath="//*[@id=\"UserName\"]")
    public WebElement username;

    @FindBy(xpath="//*[@id=\"Email\"]")
    public WebElement email;

    @FindBy(xpath="//*[@id=\"PhoneNumber\"]")
    public WebElement phonenumber;

    @FindBy(xpath="//*[@id=\"Address\"]")
    public WebElement address;

    @FindBy(xpath="//*[@id=\"DOB\"]")
    public WebElement DOB;

    @FindBy(xpath="//*[@id=\"CreateSuperAdmin\"]")
    public WebElement createuser;

    @FindBy(xpath="//*[@id=\"dropdownMenuLink\"]/img")
    public WebElement detailsdropdown;

    @FindBy(xpath="//*[@id=\"AdminTable\"]/tbody/tr[1]/td[1]/div/div/ul/li[2]/a")
    public WebElement threedot;

    @FindBy(xpath="//*[@id=\"kt_profile_details_view\"]/div[2]/div[7]/a")
    public WebElement backtolistbtn;


    public AdminControlPage() {
        PageFactory.initElements(driver, this);
    }


    public void verifyadmincontrol() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, (10));
        Faker faker=new Faker();
        Random random=new Random();
        admincontrol.click();
        userscontrol.click();
        Assert.assertTrue(usrtext.isDisplayed(), "EHR Dashboard link is NOT visible on the screen");
        //Assert.assertEquals(usrtext.getText().trim(), "All Users", "Text does not match 'All Users'");
        createbutton.click();
        roleselectiondropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(docroleSelect)).click();
        companyselectiondropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(companyselected)).click();
        branchselection.click();
        wait.until(ExpectedConditions.elementToBeClickable(branchdropdown)).click();
        titleselector.click();
        wait.until(ExpectedConditions.elementToBeClickable(titleselectedMr)).click();

        String randomFirstName = faker.name().firstName();
        String randomMiddleName = faker.name().firstName(); // Ensures only a middle name
        String randomLastName = faker.name().lastName();
        String randomUsername = generateRandomUsername(6); // Generates a valid 6-letter username
        String randomEmail = randomUsername + "@test.com"; // Creates an email based on username
        String randomPhoneNumber = "030" + (random.nextInt(90000000) + 10000000); // Ensures 11 digits
        String randomAddress = faker.address().streetAddress();

        // Generate random Date of Birth in MM/DD/YYYY format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date dob = faker.date().birthday(18, 60);
        String randomDOB = dateFormat.format(dob);

        // Fill form fields
        firstname.sendKeys(randomFirstName);
        middlename.sendKeys(randomMiddleName);
        lastname.sendKeys(randomLastName);
        username.sendKeys(randomUsername);
        email.sendKeys(randomEmail);
        phonenumber.sendKeys(randomPhoneNumber);
        address.sendKeys(randomAddress);
        DOB.clear();
        DOB.sendKeys(randomDOB);
        createuser.click();
        String actualMessage = "Doctor Saved Successfully.";
        System.out.println("Actual Message: " + actualMessage);
        Assert.assertEquals(actualMessage, "Doctor Saved Successfully.", "Success message does not match!");


        Thread.sleep(20000);


    }

    public void verifyuserdetails() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, (10));
        admincontrol.click();
        userscontrol.click();
//        threedot.click();
        detailsdropdown.click();
        backtolistbtn.click();


    }

    private String generateRandomUsername(int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder username = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            username.append(letters.charAt(random.nextInt(letters.length())));
        }
        return username.toString();
    }
}


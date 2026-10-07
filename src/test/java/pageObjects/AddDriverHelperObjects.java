package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDriverHelperObjects {

    WebDriver driver;

    // ==============================
    // CONSTRUCTOR
    // ==============================

    public AddDriverHelperObjects(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    // ==============================
    // LOCATORS
    // ==============================

    // Select Type

    @FindBy(xpath = "//button[normalize-space()='Driver']")
    WebElement btn_driver;

    @FindBy(xpath = "//button[normalize-space()='Helper']")
    WebElement btn_helper;


    // Is Temporary

    @FindBy(id = "isTemporary")
    WebElement checkbox_isTemporary;


    // Branch

    @FindBy(name = "branch")
    WebElement dropdown_branch;


    // Name

    @FindBy(name = "name")
    WebElement input_name;


    // Date of Birth

    @FindBy(id = "dob")
    WebElement input_dob;


    // Blood Group

    @FindBy(name = "bloodGroup")
    WebElement dropdown_bloodGroup;


    // Joining Date

    @FindBy(id = "joiningDate")
    WebElement input_joiningDate;


    // Aadhar Number

    @FindBy(name = "aadharNumber")
    WebElement input_aadharNumber;


    // PAN Number

    @FindBy(name = "panNumber")
    WebElement input_panNumber;


    // License Type

    @FindBy(name = "licenseType")
    WebElement dropdown_licenseType;


    // License Number

    @FindBy(name = "licenseNumber")
    WebElement input_licenseNumber;


    // License Expiry

    @FindBy(id = "licenseExpiry")
    WebElement input_licenseExpiry;


    // Experience

    @FindBy(name = "experience")
    WebElement input_experience;


    // Badge Number

    @FindBy(name = "badgeNumber")
    WebElement input_badgeNumber;


    // Badge Expiry

    @FindBy(id = "badgeExpiry")
    WebElement input_badgeExpiry;



    // ==============================
    // ACTION METHODS
    // ==============================


    // Select Driver

    public void selectDriver() {

        btn_driver.click();
    }


    // Select Helper

    public void selectHelper() {

        btn_helper.click();
    }


    // Select Temporary

    public void selectTemporary() {

        if (!checkbox_isTemporary.isSelected()) {

            checkbox_isTemporary.click();
        }
    }


    // Select Branch

    public void clickBranch() {

        dropdown_branch.click();
    }


    // Enter Name

    public void enterName(String name) {

        input_name.clear();

        input_name.sendKeys(name);
    }


    // Select Date of Birth

    public void clickDateOfBirth() {

        input_dob.click();
    }


    // Select Blood Group

    public void clickBloodGroup() {

        dropdown_bloodGroup.click();
    }


    // Select Joining Date

    public void clickJoiningDate() {

        input_joiningDate.click();
    }


    // Enter Aadhar Number

    public void enterAadharNumber(String aadharNumber) {

        input_aadharNumber.clear();

        input_aadharNumber.sendKeys(aadharNumber);
    }


    // Enter PAN Number

    public void enterPanNumber(String panNumber) {

        input_panNumber.clear();

        input_panNumber.sendKeys(panNumber);
    }


    // Select License Type

    public void clickLicenseType() {

        dropdown_licenseType.click();
    }


    // Enter License Number

    public void enterLicenseNumber(String licenseNumber) {

        input_licenseNumber.clear();

        input_licenseNumber.sendKeys(licenseNumber);
    }


    // Select License Expiry

    public void clickLicenseExpiry() {

        input_licenseExpiry.click();
    }


    // Enter Experience

    public void enterExperience(String experience) {

        input_experience.clear();

        input_experience.sendKeys(experience);
    }


    // Enter Badge Number

    public void enterBadgeNumber(String badgeNumber) {

        input_badgeNumber.clear();

        input_badgeNumber.sendKeys(badgeNumber);
    }


    // Select Badge Expiry

    public void clickBadgeExpiry() {

        input_badgeExpiry.click();
    }

}
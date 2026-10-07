package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailyLogObjects {

    WebDriver driver;

    public DailyLogObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // =========================
    // LOCATORS
    // =========================

    // Branch
    @FindBy(xpath = "//label[normalize-space()='Branch']/following-sibling::button")
    WebElement dropdown_branch;

    // Vehicle No
    @FindBy(xpath = "//label[normalize-space()='Vehicle No']/following-sibling::button")
    WebElement dropdown_vehicleNo;

    // Fixed KMS - Read Only
    @FindBy(name = "fixedKms")
    WebElement input_fixedKms;

    // Expected Mileage - Read Only
    @FindBy(name = "expectedMileage")
    WebElement input_expectedMileage;

    // Meter - Read Only
    @FindBy(name = "meter")
    WebElement input_meter;

    // Date
    @FindBy(id = "date")
    WebElement input_date;

    // Opening KMS - Read Only
    @FindBy(name = "openingKms")
    WebElement input_openingKms;

    // Closing KMS
    @FindBy(name = "closingKms")
    WebElement input_closingKms;

    // Total KMS - Read Only
    @FindBy(name = "totalKms")
    WebElement input_totalKms;

    // Remarks
    @FindBy(name = "remarks")
    WebElement input_remarks;


    // =========================
    // ACTION METHODS
    // =========================

    // Click Branch dropdown
    public void clickBranch() {
        dropdown_branch.click();
    }

    // Click Vehicle No dropdown
    public void clickVehicleNo() {
        dropdown_vehicleNo.click();
    }

    // Get Fixed KMS
    public String getFixedKms() {
        return input_fixedKms.getAttribute("value");
    }

    // Get Expected Mileage
    public String getExpectedMileage() {
        return input_expectedMileage.getAttribute("value");
    }

    // Get Meter
    public String getMeter() {
        return input_meter.getAttribute("value");
    }

    // Click Date
    public void clickDate() {
        input_date.click();
    }

    // Get Opening KMS
    public String getOpeningKms() {
        return input_openingKms.getAttribute("value");
    }

    // Enter Closing KMS
    public void enterClosingKms(String closingKms) {
        input_closingKms.clear();
        input_closingKms.sendKeys(closingKms);
    }

    // Get Total KMS
    public String getTotalKms() {
        return input_totalKms.getAttribute("value");
    }

    // Enter Remarks
    public void enterRemarks(String remarks) {
        input_remarks.clear();
        input_remarks.sendKeys(remarks);
    }
}
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LubricantVehicleLogObjects {

    WebDriver driver;

    public LubricantVehicleLogObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // =========================
    // LOCATORS
    // =========================

    @FindBy(name = "branch")
    WebElement dropdown_branch;

    @FindBy(name = "vehicleNo")
    WebElement dropdown_vehicleNo;

    @FindBy(name = "date")
    WebElement input_date;

    @FindBy(name = "lubricantType")
    WebElement dropdown_lubricantType;

    @FindBy(name = "lubricantAppliedPart")
    WebElement dropdown_lubricantAppliedPart;

    @FindBy(name = "lubricantAddType")
    WebElement dropdown_lubricantAddType;

    @FindBy(name = "lastChangedDate")
    WebElement input_lastChangedDate;

    @FindBy(name = "uom")
    WebElement dropdown_uom;

    @FindBy(name = "usageQuantity")
    WebElement input_usageQuantity;

    @FindBy(name = "previousMeter")
    WebElement input_previousMeter;

    @FindBy(name = "presentMeter")
    WebElement input_presentMeter;

    @FindBy(name = "remarks")
    WebElement input_remarks;


    // =========================
    // ACTION METHODS
    // =========================

    // Branch
    public void clickBranch() {
        dropdown_branch.click();
    }

    // Vehicle No
    public void clickVehicleNo() {
        dropdown_vehicleNo.click();
    }

    // Date
    public void clickDate() {
        input_date.click();
    }

    // Lubricant Type
    public void clickLubricantType() {
        dropdown_lubricantType.click();
    }

    // Lubricant Applied Parts
    public void clickLubricantAppliedPart() {
        dropdown_lubricantAppliedPart.click();
    }

    // Lubricant Add Type
    public void clickLubricantAddType() {
        dropdown_lubricantAddType.click();
    }

    // Get Last Changed Date
    public String getLastChangedDate() {
        return input_lastChangedDate.getAttribute("value");
    }

    // UOM
    public void clickUOM() {
        dropdown_uom.click();
    }

    // Usage Quantity
    public void enterUsageQuantity(String quantity) {
        input_usageQuantity.clear();
        input_usageQuantity.sendKeys(quantity);
    }

    // Get Previous Meter
    public String getPreviousMeter() {
        return input_previousMeter.getAttribute("value");
    }

    // Present Meter
    public void enterPresentMeter(String presentMeter) {
        input_presentMeter.clear();
        input_presentMeter.sendKeys(presentMeter);
    }

    // Remarks
    public void enterRemarks(String remarks) {
        input_remarks.clear();
        input_remarks.sendKeys(remarks);
    }
}
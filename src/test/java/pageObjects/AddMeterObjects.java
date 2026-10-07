package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMeterObjects {

    public WebDriver driver;

    public AddMeterObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ==========================================
    // LOCATORS
    // ==========================================

    // Replacing Meter of Existing Vehicle
    @FindBy(id = "replacingMeter")
    WebElement checkbox_replacingMeter;


    // Branch
    @FindBy(name = "branch")
    WebElement dropdown_branch;


    // Manufacturer Company Name
    @FindBy(name = "meterName")
    WebElement dropdown_manufacturerCompany;


    // Meter Name
    @FindBy(name = "meter")
    WebElement input_meterName;


    // Meter No
    @FindBy(name = "meterNo")
    WebElement input_meterNo;


    // Date
    @FindBy(id = "date")
    WebElement input_date;


    // Meter Purchased Cost
    @FindBy(name = "meterPurchaseCost")
    WebElement input_meterPurchaseCost;


    // Model Year
    @FindBy(name = "modelYear")
    WebElement dropdown_modelYear;


    // Initial Reading
    @FindBy(name = "initialReading")
    WebElement input_initialReading;


    // Purchase Order No
    @FindBy(name = "purchaseOrderNo")
    WebElement input_purchaseOrderNo;


    // Purchased By
    @FindBy(name = "purchasedBy")
    WebElement dropdown_purchasedBy;


    // Maintained By
    @FindBy(name = "maintainedBy")
    WebElement dropdown_maintainedBy;


    // Remarks
    @FindBy(name = "remarks")
    WebElement input_remarks;


    // Meter Purchase Invoice Upload Button
    @FindBy(xpath = "//label[contains(normalize-space(),'Meter Purchasse Invoice')]/following-sibling::input[@type='file']")
    WebElement input_meterPurchaseInvoice;


    // ==========================================
    // ACTION METHODS
    // ==========================================


    // Replacing Meter
    public void selectReplacingMeter() {

        if (!checkbox_replacingMeter.isSelected()) {
            checkbox_replacingMeter.click();
        }
    }


    // Branch
    public void clickBranch() {

        dropdown_branch.click();
    }


    // Manufacturer Company Name
    public void clickManufacturerCompany() {

        dropdown_manufacturerCompany.click();
    }


    // Meter Name
    public void enterMeterName(String meterName) {

        input_meterName.clear();
        input_meterName.sendKeys(meterName);
    }


    // Meter Number
    public void enterMeterNo(String meterNo) {

        input_meterNo.clear();
        input_meterNo.sendKeys(meterNo);
    }


    // Date
    public void clickDate() {

        input_date.click();
    }


    // Meter Purchased Cost
    public void enterMeterPurchaseCost(String cost) {

        input_meterPurchaseCost.clear();
        input_meterPurchaseCost.sendKeys(cost);
    }


    // Model Year
    public void clickModelYear() {

        dropdown_modelYear.click();
    }


    // Initial Reading
    public void enterInitialReading(String initialReading) {

        input_initialReading.clear();
        input_initialReading.sendKeys(initialReading);
    }


    // Purchase Order Number
    public void enterPurchaseOrderNo(String purchaseOrderNo) {

        input_purchaseOrderNo.clear();
        input_purchaseOrderNo.sendKeys(purchaseOrderNo);
    }


    // Purchased By
    public void clickPurchasedBy() {

        dropdown_purchasedBy.click();
    }


    // Maintained By
    public void clickMaintainedBy() {

        dropdown_maintainedBy.click();
    }


    // Remarks
    public void enterRemarks(String remarks) {

        input_remarks.clear();
        input_remarks.sendKeys(remarks);
    }


    // Upload Meter Purchase Invoice
    public void uploadMeterPurchaseInvoice(String filePath) {

        input_meterPurchaseInvoice.sendKeys(filePath);
    }
}
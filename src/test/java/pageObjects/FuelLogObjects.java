package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuelLogObjects {

    WebDriver driver;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public FuelLogObjects(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    // ==========================================
    // LOCATORS
    // ==========================================

    // Branch
    @FindBy(name = "branch")
    WebElement dropdown_branch;


    // Vehicle
    @FindBy(name = "vehicle")
    WebElement dropdown_vehicle;


    // Date
    @FindBy(id = "date")
    WebElement input_date;


    // Driver
    @FindBy(name = "driver")
    WebElement input_driver;


    // Standard Mileage
    @FindBy(name = "standardMillage")
    WebElement input_standardMileage;


    // Transport Range
    @FindBy(name = "assignedRoute")
    WebElement input_transportRange;


    // Opening KMS
    @FindBy(name = "openingKms")
    WebElement input_openingKms;


    // Closing KMS
    @FindBy(name = "closingKms")
    WebElement input_closingKms;


    // Fuel
    @FindBy(name = "fuelLts")
    WebElement input_fuelLts;


    // Fixed Mileage
    @FindBy(name = "mileage")
    WebElement input_fixedMileage;


    // Cost Per Litre
    @FindBy(name = "costPerLtr")
    WebElement input_costPerLtr;


    // Total Amount
    @FindBy(name = "totalAmount")
    WebElement input_totalAmount;


    // Payment Mode
    @FindBy(name = "paymentType")
    WebElement dropdown_paymentMode;


    // Bill Number
    @FindBy(name = "billNo")
    WebElement input_billNo;


    // Incharge
    @FindBy(name = "incharge")
    WebElement dropdown_incharge;


    // Upload Receipt
    @FindBy(xpath = "//button[.//span[normalize-space()='Upload']]")
    WebElement btn_uploadReceipt;


    // Upload Bulk Fuel Log
    @FindBy(xpath = "//button[normalize-space()='Upload Bulk Fuel Log']")
    WebElement btn_uploadBulkFuelLog;


    // Remarks
    @FindBy(name = "remarks")
    WebElement input_remarks;



    // ==========================================
    // ACTION METHODS
    // ==========================================


    // Branch
    public void clickBranch() {

        dropdown_branch.click();
    }


    // Vehicle
    public void clickVehicle() {

        dropdown_vehicle.click();
    }


    // Date
    public void clickDate() {

        input_date.click();
    }


    // Driver
    public void enterDriver(String driverName) {

        input_driver.clear();

        input_driver.sendKeys(driverName);
    }


    // Standard Mileage
    public void enterStandardMileage(String mileage) {

        input_standardMileage.clear();

        input_standardMileage.sendKeys(mileage);
    }


    // Transport Range
    public void enterTransportRange(String transportRange) {

        input_transportRange.clear();

        input_transportRange.sendKeys(transportRange);
    }


    // Opening KMS
    public void enterOpeningKms(String openingKms) {

        input_openingKms.clear();

        input_openingKms.sendKeys(openingKms);
    }


    // Closing KMS
    public void enterClosingKms(String closingKms) {

        input_closingKms.clear();

        input_closingKms.sendKeys(closingKms);
    }


    // Fuel
    public void enterFuel(String fuel) {

        input_fuelLts.clear();

        input_fuelLts.sendKeys(fuel);
    }


    // Fixed Mileage
    public void enterFixedMileage(String mileage) {

        input_fixedMileage.clear();

        input_fixedMileage.sendKeys(mileage);
    }


    // Cost Per Litre
    public void enterCostPerLitre(String cost) {

        input_costPerLtr.clear();

        input_costPerLtr.sendKeys(cost);
    }


    // Total Amount
    public void enterTotalAmount(String amount) {

        input_totalAmount.clear();

        input_totalAmount.sendKeys(amount);
    }


    // Payment Mode
    public void clickPaymentMode() {

        dropdown_paymentMode.click();
    }


    // Bill Number
    public void enterBillNumber(String billNumber) {

        input_billNo.clear();

        input_billNo.sendKeys(billNumber);
    }


    // Incharge
    public void clickIncharge() {

        dropdown_incharge.click();
    }


    // Upload Receipt
    public void clickUploadReceipt() {

        btn_uploadReceipt.click();
    }


    // Upload Bulk Fuel Log
    public void clickUploadBulkFuelLog() {

        btn_uploadBulkFuelLog.click();
    }


    // Remarks
    public void enterRemarks(String remarks) {

        input_remarks.clear();

        input_remarks.sendKeys(remarks);
    }

}
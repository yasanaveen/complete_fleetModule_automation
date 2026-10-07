package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddIncidentObjects {

    WebDriver driver;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public AddIncidentObjects(WebDriver driver) {

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


    // Driver
    @FindBy(name = "driver")
    WebElement dropdown_driver;


    // Route Assignment
    @FindBy(name = "routeStatus")
    WebElement dropdown_routeAssignment;


    // Incident Type
    @FindBy(name = "incidentType")
    WebElement dropdown_incidentType;


    // Incident Date
    @FindBy(id = "incidentDate")
    WebElement input_incidentDate;


    // Incident Time
    @FindBy(name = "incidentTime")
    WebElement input_incidentTime;


    // Incident Severity
    @FindBy(name = "incidentSeverity")
    WebElement dropdown_incidentSeverity;


    // Incident Location
    @FindBy(name = "incidentLocation")
    WebElement input_incidentLocation;


    // Settlement Amount
    @FindBy(name = "settlementAmount")
    WebElement input_settlementAmount;


    // Upload Photos
    @FindBy(id = "receiptUpload")
    WebElement input_uploadPhotos;


    // Upload Photos Button
    @FindBy(xpath = "//button[.//span[normalize-space()='Click Here To Upload']]")
    WebElement btn_uploadPhotos;


    // Description
    @FindBy(name = "description")
    WebElement input_description;


    // Back Button
    @FindBy(xpath = "//button[normalize-space()='Back']")
    WebElement btn_back;


    // Proceed to Claim Details
    @FindBy(xpath = "//button[normalize-space()='Proceed to Claim Details']")
    WebElement btn_proceedToClaimDetails;


    // Skip Claim & Forward to Approval
    @FindBy(xpath = "//button[normalize-space()='Skip Claim & Forward to Approval']")
    WebElement btn_skipClaimForwardApproval;



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


    // Driver
    public void clickDriver() {

        dropdown_driver.click();
    }


    // Route Assignment
    public void clickRouteAssignment() {

        dropdown_routeAssignment.click();
    }


    // Incident Type
    public void clickIncidentType() {

        dropdown_incidentType.click();
    }


    // Incident Date
    public void clickIncidentDate() {

        input_incidentDate.click();
    }


    // Incident Time
    public void enterIncidentTime(String time) {

        input_incidentTime.clear();

        input_incidentTime.sendKeys(time);
    }


    // Incident Severity
    public void clickIncidentSeverity() {

        dropdown_incidentSeverity.click();
    }


    // Incident Location
    public void enterIncidentLocation(String location) {

        input_incidentLocation.clear();

        input_incidentLocation.sendKeys(location);
    }


    // Settlement Amount
    public void enterSettlementAmount(String amount) {

        input_settlementAmount.clear();

        input_settlementAmount.sendKeys(amount);
    }


    // Upload Photos
    public void uploadPhotos(String filePath) {

        input_uploadPhotos.sendKeys(filePath);
    }


    // Description
    public void enterDescription(String description) {

        input_description.clear();

        input_description.sendKeys(description);
    }


    // Back
    public void clickBack() {

        btn_back.click();
    }


    // Proceed to Claim Details
    public void clickProceedToClaimDetails() {

        btn_proceedToClaimDetails.click();
    }


    // Skip Claim & Forward to Approval
    public void clickSkipClaimForwardApproval() {

        btn_skipClaimForwardApproval.click();
    }

}
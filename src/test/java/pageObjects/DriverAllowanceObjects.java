package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriverAllowanceObjects {

	WebDriver driver;

	public DriverAllowanceObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// =========================
	// LOCATORS
	// =========================

	// Branch
	@FindBy(name = "branch")
	WebElement dropdown_branch;

	// Driver
	@FindBy(name = "driver")
	WebElement dropdown_driver;

	// Mobile Number - Read Only
	@FindBy(id = "mobileNumber")
	WebElement input_mobileNumber;

	// From Date
	@FindBy(id = "fromDate")
	WebElement input_fromDate;

	// To Date
	@FindBy(id = "toDate")
	WebElement input_toDate;

	// No. of Hours
	@FindBy(name = "noOfHours")
	WebElement input_noOfHours;

	// Allowance Amount
	@FindBy(name = "allowanceAmount")
	WebElement input_allowanceAmount;

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

	// Click Driver dropdown
	public void clickDriver() {
		dropdown_driver.click();
	}

	// Get Mobile Number
	public String getMobileNumber() {
		return input_mobileNumber.getAttribute("value");
	}

	// Click From Date
	public void clickFromDate() {
		input_fromDate.click();
	}

	// Click To Date
	public void clickToDate() {
		input_toDate.click();
	}

	// Enter No. of Hours
	public void enterNoOfHours(String hours) {
		input_noOfHours.clear();
		input_noOfHours.sendKeys(hours);
	}

	// Enter Allowance Amount
	public void enterAllowanceAmount(String amount) {
		input_allowanceAmount.clear();
		input_allowanceAmount.sendKeys(amount);
	}

	// Enter Remarks
	public void enterRemarks(String remarks) {
		input_remarks.clear();
		input_remarks.sendKeys(remarks);
	}
}
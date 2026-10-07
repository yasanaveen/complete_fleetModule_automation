package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteAssignObjects {

	WebDriver driver;

	public RouteAssignObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'__0A9Yu')]")
	WebElement assignRouteCard;

	// Academic Year
	@FindBy(name = "academicYear")
	WebElement academicYear;

	// Branch
	@FindBy(name = "branch")
	WebElement branch;

	// Vehicle
	@FindBy(name = "vehicle")
	WebElement vehicle;

	// Route Number
	@FindBy(name = "routeNumber")
	WebElement routeNumber;

	// From Time
	@FindBy(name = "fromTime")
	WebElement fromTime;

	// To Time
	@FindBy(name = "toTime")
	WebElement toTime;

	// Fixed KMS
	@FindBy(name = "fixedKms")
	WebElement fixedKms;

	// Expected Mileage
	@FindBy(name = "expectedMileage")
	WebElement expectedMileage;

	// Remarks
	@FindBy(name = "remarks")
	WebElement remarks;

	// Back button in footer
	@FindBy(css = "button.Buttons_backButton__g3vHR")
	WebElement backButton;

	// Forward to Approval button
	@FindBy(css = "button[type='submit']")
	WebElement forwardToApprovalButton;

	// Top Back Arrow
	@FindBy(css = "img[alt='Back']")
	WebElement topBackButton;

	public void clkassignRoute() {
		assignRouteCard.click();
	}

	// Academic Year
	public void clickAcademicYear() {
		academicYear.click();
	}

	// Branch
	public void clickBranch() {
		branch.click();
	}

	// Vehicle
	public void clickVehicle() {
		vehicle.click();
	}

	// Route Number
	public void clickRouteNumber() {
		routeNumber.click();
	}

	// From Time
	public void enterFromTime(String time) {

		fromTime.clear();
		fromTime.sendKeys(time);
	}

	// To Time
	public void enterToTime(String time) {

		toTime.clear();
		toTime.sendKeys(time);
	}

	// Fixed KMS - readonly field
	public String getFixedKms() {

		return fixedKms.getAttribute("value");
	}

	// Expected Mileage
	public void enterExpectedMileage(String mileage) {

		expectedMileage.clear();
		expectedMileage.sendKeys(mileage);
	}

	// Remarks
	public void enterRemarks(String remark) {

		remarks.clear();
		remarks.sendKeys(remark);
	}

	// Footer Back button
	public void clickBackButton() {
		backButton.click();
	}

	// Top Back Arrow
	public void clickTopBackButton() {
		forwardToApprovalButton.click();
	}

	// Forward to Approval
	public void clickForwardToApproval() {
		topBackButton.click();
	}

}

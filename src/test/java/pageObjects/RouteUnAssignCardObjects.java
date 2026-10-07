package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteUnAssignCardObjects {

	WebDriver driver;

	public RouteUnAssignCardObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'__EqliZ')]")
	WebElement routeunAssignCard;

	@FindBy(name = "academicYear")
	WebElement academicYear;

	@FindBy(name = "branch")
	WebElement branch;

	@FindBy(name = "vehicle")
	WebElement vehicle;

	@FindBy(name = "routeNumber")
	WebElement routeNumber;

	@FindBy(name = "fromTime")
	WebElement fromTime;

	@FindBy(name = "toTime")
	WebElement toTime;

	@FindBy(name = "fixedKms")
	WebElement fixedKms;

	@FindBy(name = "expectedMileage")
	WebElement expectedMileage;

	@FindBy(name = "remarks")
	WebElement remarks;

	public void clkrouteunassignCard() {
		routeunAssignCard.click();
	}

	public void clickAcademicYear() {
		academicYear.click();
	}

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
	public String getFromTime() {
		return fromTime.getAttribute("value");
	}

	// To Time
	public String getToTime() {
		return toTime.getAttribute("value");
	}

	// Fixed KMS
	public String getFixedKms() {
		return fixedKms.getAttribute("value");
	}

	// Expected Mileage
	public String getExpectedMileage() {
		return expectedMileage.getAttribute("value");
	}

	// Remarks
	public void enterRemarks(String remark) {
		remarks.clear();
		remarks.sendKeys(remark);
	}

}

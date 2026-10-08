package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetMgmtAssignDriverObjects {

	public WebDriver driver;

	public FleetMgmtAssignDriverObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'Pink__hiNHg  ')]")
	WebElement clkfleetmgmt;

	@FindBy(xpath = "//*[contains(@class,'optionDelay1__cab5I')]")
	WebElement clk_assignDriver;

	// Branch dropdown
	@FindBy(name = "branch")
	WebElement branch;

	// Vehicle No dropdown
	@FindBy(name = "vehicleNo")
	WebElement vehicleNo;

	// Driver dropdown
	@FindBy(name = "selectedPerson")
	WebElement selectdriver;

	// Route input
	@FindBy(name = "route")
	WebElement route;

	// Remarks textarea
	@FindBy(name = "remarks")
	WebElement remarks;

	public void clkfleetMgmtCard() {
		clkfleetmgmt.click();
	}

	public void clkAssignDriver() {
		clkfleetmgmt.click();
	}

	public void clickBranch() {
		branch.click();
	}

	public void clickVehicleNo() {
		vehicleNo.click();
	}

	public void clickDriver() {
		selectdriver.click();
	}

	public String getRoute() {
		return route.getAttribute("value");
	}

	public void enterRemarks(String remark) {
		remarks.sendKeys(remark);
	}

}

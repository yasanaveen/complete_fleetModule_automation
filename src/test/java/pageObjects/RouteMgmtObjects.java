package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteMgmtObjects {

	WebDriver driver;

	public RouteMgmtObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'__hHYf9  ')]")
	WebElement routeMgmtCard;

	@FindBy(xpath = "//*[contains(@class,'__d8Gaq')]")
	WebElement routeSetupCard;

	// Academic Year dropdown
	@FindBy(name = "academicYear")
	private WebElement academicYearDropdown;

	// Branch dropdown
	@FindBy(name = "branch")
	private WebElement branchDropdown;

	// Route Number
	@FindBy(name = "routeNumber")
	private WebElement routeNumber;

	// From Point
	@FindBy(name = "fromPoint")
	private WebElement fromPoint;

	// Via
	@FindBy(name = "via")
	private WebElement via;

	// To Point
	@FindBy(name = "toPoint")
	private WebElement toPoint;

	// Transport Range dropdown
	@FindBy(name = "transRange")
	private WebElement transportRangeDropdown;

	// Distance
	@FindBy(name = "distance")
	private WebElement distance;

	public void clkRouteMgmtCard() {
		routeMgmtCard.click();
	}

	public void clkRouteSetupCard() {
		routeSetupCard.click();
	}

	public void selectAcademicYear() {
		academicYearDropdown.click();
	}

	public void selectBranch() {
		branchDropdown.click();
	}

	public void enterRouteNumber(String routeNo) {
		routeNumber.sendKeys(routeNo);
	}

	public void enterFromPoint(String from) {
		fromPoint.sendKeys(from);
	}

	public void enterVia(String viaPoint) {
		via.sendKeys(viaPoint);
	}

	public void enterToPoint(String to) {
		toPoint.sendKeys(to);
	}

	public void selectTransportRange() {
		transportRangeDropdown.click();
	}

	public void enterDistance(String kms) {
		distance.sendKeys(kms);
	}

}

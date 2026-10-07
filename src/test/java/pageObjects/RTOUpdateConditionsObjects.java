package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTOUpdateConditionsObjects {

	WebDriver driver;

	public RTOUpdateConditionsObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'ue__uQviJ ')]")
	WebElement updateConditionsButton;

	@FindBy(xpath = "//*[contains(@class,'card__O5zle ')]")
	WebElement selectvehicleFromRecentSearch;

	@FindBy(xpath = "(//*[contains(@class,'chip__gVAFS ')])[1]")
	WebElement clk_rtodetailsButton;

	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;

	// RTO update form
	@FindBy(name = "rtoType")
	WebElement dropdown_rtoType;

	// RTO Office Name
	@FindBy(name = "rtoOfficeName")
	WebElement dropdown_rtoOfficeName;

	// Issued From Date
	@FindBy(id = "issuedFromDate")
	WebElement input_issuedFromDate;

	// Expiry Date
	@FindBy(id = "expiryDate")
	WebElement input_expiryDate;

	// Amount
	@FindBy(name = "amount")
	WebElement input_amount;

	// Upload Receipt
	@FindBy(xpath = "//label[contains(normalize-space(),'Upload Receipt')]/following-sibling::input[@type='file']")
	WebElement input_uploadReceipt;

	// Document
	@FindBy(xpath = "//label[normalize-space()='Document']/following-sibling::input[@type='file']")
	WebElement input_document;

	// Remarks
	@FindBy(name = "remarks")
	WebElement input_remarks;

	public void clkUpdateCard() {
		updateConditionsButton.click();
	}

	public void getSelectVehicleFromRecentSearch() {
		selectvehicleFromRecentSearch.click();
	}

	public void getClkRtoDetailsButton() {
		clk_rtodetailsButton.click();
	}

	public void getClkProceedButton() {
		clk_proceedButton.click();
	}

	public void clickRtoType() {
		dropdown_rtoType.click();
	}

	// RTO Office Name
	public void clickRtoOfficeName() {
		dropdown_rtoOfficeName.click();
	}

	// Issued From Date
	public void clickIssuedFromDate() {
		input_issuedFromDate.click();
	}

	// Expiry Date
	public void clickExpiryDate() {
		input_expiryDate.click();
	}

	// Amount
	public void enterAmount(String amount) {
		input_amount.clear();
		input_amount.sendKeys(amount);
	}

	// Upload Receipt
	public void uploadReceipt(String filePath) {
		input_uploadReceipt.sendKeys(filePath);
	}

	// Upload Document
	public void uploadDocument(String filePath) {
		input_document.sendKeys(filePath);
	}

	// Remarks
	public void enterRemarks(String remarks) {
		input_remarks.clear();
		input_remarks.sendKeys(remarks);
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LubricantLogObjects {

	WebDriver driver;

	public LubricantLogObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ==========================================
	// LOCATORS
	// ==========================================

	// Branch
	@FindBy(name = "branch")
	WebElement dropdown_branch;

	// Lubricant Type
	@FindBy(name = "lubricantType")
	WebElement dropdown_lubricantType;

	// UOM
	@FindBy(name = "uom")
	WebElement dropdown_uom;

	// Purchase Date
	@FindBy(id = "date")
	WebElement input_purchaseDate;

	// Total Litres
	@FindBy(name = "totalLitres")
	WebElement input_totalLitres;

	// Amount Per KG/Ltr
	@FindBy(name = "amountPerKgLtr")
	WebElement input_amountPerKgLtr;

	// Total Amount
	@FindBy(name = "totalAmount")
	WebElement input_totalAmount;

	// Receipt No
	@FindBy(name = "receiptNo")
	WebElement input_receiptNo;

	// Upload Receipt - actual file input
	@FindBy(xpath = "//label[contains(normalize-space(),'Upload Receipt')]/following-sibling::input[@type='file']")
	WebElement input_uploadReceipt;

	// Upload button
	@FindBy(xpath = "//button[.//span[normalize-space()='Upload']]")
	WebElement btn_uploadReceipt;

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

	// Lubricant Type
	public void clickLubricantType() {

		dropdown_lubricantType.click();
	}

	// UOM
	public void clickUOM() {

		dropdown_uom.click();
	}

	// Purchase Date
	public void clickPurchaseDate() {

		input_purchaseDate.click();
	}

	// Total Litres
	public void enterTotalLitres(String totalLitres) {

		input_totalLitres.clear();
		input_totalLitres.sendKeys(totalLitres);
	}

	// Amount Per KG/Ltr
	public void enterAmountPerKgLtr(String amount) {

		input_amountPerKgLtr.clear();
		input_amountPerKgLtr.sendKeys(amount);
	}

	// Total Amount
	public void getTotalAmount() {

		String totalAmount = input_totalAmount.getAttribute("value");

		System.out.println("Total Amount: " + totalAmount);
	}

	// Receipt Number
	public void enterReceiptNo(String receiptNo) {

		input_receiptNo.clear();
		input_receiptNo.sendKeys(receiptNo);
	}

	// Upload Receipt
	public void uploadReceipt(String filePath) {

		input_uploadReceipt.sendKeys(filePath);
	}

	// Click Upload Button
	public void clickUploadReceipt() {

		btn_uploadReceipt.click();
	}

	// Remarks
	public void enterRemarks(String remarks) {

		input_remarks.clear();
		input_remarks.sendKeys(remarks);
	}
}
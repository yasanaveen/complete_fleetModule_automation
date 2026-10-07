package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBatteryObjects {

	public WebDriver driver;

	public AddBatteryObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Add Battery']")
	WebElement addBatteryButton;

	@FindBy(xpath = "//*[@name='manufacturerName']")
	WebElement dropdown_manufacturerName;
	@FindBy(xpath = "//*[text()='AMARARAJA']")
	WebElement option_amararaja;

	@FindBy(xpath = "//*[@name='model']")
	WebElement input_batterymodel;

	@FindBy(name = "modelYear")
	WebElement dropdown_modelYear;
	@FindBy(xpath = "//*[text()='2010']")
	WebElement option_modelYear2010;

	@FindBy(xpath = "//*[@name='batteryNo']")
	WebElement input_batteryNo;
	@FindBy(xpath = "//*[@name='batteryCapacity']")
	WebElement input_batteryCapacity;

	@FindBy(xpath = "//*[@name='batteryCondition']")
	WebElement dropdown_batteryCondition;
	@FindBy(xpath = "(//*[contains(@class,'__CIxDb ')])[1]")
	WebElement option_batteryConditionNew;

	@FindBy(xpath = "//*[@name='warrantyInMonths']")
	WebElement input_warrantyInMonths;

	@FindBy(xpath = "//*[@name='purchasedBy']")
	WebElement dropdown_purchasedBy;
	@FindBy(xpath = "(//*[contains(@class,'option__CIxDb ')])[1]")
	WebElement option_purchasedByCompany;

	@FindBy(xpath = "//*[@name='poNo']")
	WebElement input_poNo;

	@FindBy(xpath = "//*[@name='purchasedCost']")
	WebElement input_purchasedCost;

	public void getAddBatteryButton() {
		addBatteryButton.click();
	}

	public void getDropdown_manufacturerName() {
		dropdown_manufacturerName.click();
		option_amararaja.click();
	}

	public void input_batterymodel(String model) {
		input_batterymodel.sendKeys(model);
	}

	public void getDropdown_modelYear() {
		dropdown_modelYear.click();
		option_modelYear2010.click();
	}

	public void input_batteryNo(String batteryNo) {
		input_batteryNo.sendKeys(batteryNo);
	}

	public void input_batteryCapacity(String batteryCapacity) {
		input_batteryCapacity.sendKeys(batteryCapacity);
	}

	public void getDropdown_batteryCondition() {
		dropdown_batteryCondition.click();
		option_batteryConditionNew.click();
	}

	public void input_warrantyInMonths(String warrantyInMonths) {
		input_warrantyInMonths.sendKeys(warrantyInMonths);
	}

	public void getDropdown_purchasedBy() {
		dropdown_purchasedBy.click();
		option_purchasedByCompany.click();
	}

	public void input_poNo(String poNo) {
		input_poNo.sendKeys(poNo);
	}

	public void input_purchasedCost(String purchasedCost) {
		input_purchasedCost.sendKeys(purchasedCost);
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utills.ScrollUtills;

public class AddTyreObjects {

	public WebDriver driver;
	public ScrollUtills scrollUtil;

	public AddTyreObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		scrollUtil = new ScrollUtills(driver);
	}

	@FindBy(xpath = "(//*[@class='SideBar_item__6WqGH'])[4]")
	WebElement fleetModule;

	@FindBy(xpath = "//*[contains(@class,'__htvaa ')]")
	WebElement btn_addneww;

	@FindBy(xpath = "(//*[contains(@class,'__GnStv')])[1]")
	WebElement btn_addtyre;

	@FindBy(xpath = "//*[@name='manufacturerName']")
	WebElement dropdown_manufacturerName;
	@FindBy(xpath = "//*[text()='MRF TYRES']")
	WebElement option_mrfTyres;

	@FindBy(xpath = "//*[@name='model']")
	WebElement input_tyremodel;

	@FindBy(xpath = "//*[@name='modelYear']")
	WebElement dropdown_modelyear;
	@FindBy(xpath = "//*[text()='2010']")
	WebElement option_modelyear2010;

	@FindBy(xpath = "//*[@name='tyreNo']")
	WebElement input_tyreNo;

	@FindBy(xpath = "//*[@name='tyreSize']")
	WebElement drpdown_tyresize;
	@FindBy(xpath = "(//*[contains(@class,'option__CIxDb ')])[1]")
	WebElement option_tyresize;
	
	@FindBy(xpath = "(//*[contains(@class,'__7dBI+ ')])[5]")
	WebElement dpdwn_tyretype;	
	@FindBy(xpath = "(//*[contains(@class,'option__CIxDb ')])[1]")
	WebElement option_tyretype;
	
	@FindBy(xpath = "(//*[contains(@class,'__oN9x-')])[3]")
	WebElement inputWaranty_months;	
	
	@FindBy(xpath = "(//*[contains(@class,'__oN9x-')])[4]")
	WebElement inputWaranty_kms;
	
	@FindBy(xpath = "//*[@name='purchasedBy']")
	WebElement dropdown_purchasedBy;
	@FindBy(xpath = "(//*[contains(@class,'option__CIxDb ')])[1]")
	WebElement option_purchasedBy;
	
	@FindBy(xpath = "//*[@name='poNo']")
	WebElement input_poNo;
	
	@FindBy(xpath = "//*[@name='purchasedCost']")
	WebElement input_purchasedCost;
	
	@FindBy(xpath = "//*[@name='vendorName']")
	WebElement dpdownvendorName;
	@FindBy(xpath = "(//*[contains(@class,'__CIxDb ')])[1]")
	WebElement option_vendorName;
	
	@FindBy(xpath = "//*[@name='specifications']")
	WebElement input_remarks;

	public void clickOnFleetModule() {
		fleetModule.click();

		//btn_addneww.click();
	} 

	public void clickOnAddTyre() {
		btn_addtyre.click();
	}

	public void selectManufacturerName(String manufacturerName) {
		dropdown_manufacturerName.sendKeys(manufacturerName);
		option_mrfTyres.click();
	}

	public void enterTyreModel(String tyreModel) {
		input_tyremodel.sendKeys(tyreModel);
	}

	public void selectModelYear() {
		dropdown_modelyear.click();
		option_modelyear2010.click();
	}

	public void enterTyreNo(String tyreNo) {
		input_tyreNo.sendKeys(tyreNo);
	}

	public void selectTyreSize() {
		drpdown_tyresize.click();
		option_tyresize.click();
	}
	
	public void selectTyreType() {
		dpdwn_tyretype.click();
		option_tyretype.click();
	}
	
	public void enterWarrantyMonths(String warrantyMonths) {
		inputWaranty_months.sendKeys(warrantyMonths);
	}
	
	public void enterWarrantyKms(String warrantyKms) {
		inputWaranty_kms.sendKeys(warrantyKms);
	}
	
	public void selectPurchasedBy() {
		dropdown_purchasedBy.click();
		option_purchasedBy.click();
	}
	
	public void enterPoNo(String poNo) {
		input_poNo.sendKeys(poNo);
	}
	public void enterPurchasedCost(String purchasedCost) {
		input_purchasedCost.sendKeys(purchasedCost);
	}
	
	
	public void selectVendorName() {
		dpdownvendorName.click();
		option_vendorName.click();
				
	}
	
	
	
	
	
	
	
	
	

}

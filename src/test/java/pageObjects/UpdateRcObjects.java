package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utills.WaitUtill;

public class UpdateRcObjects {
	
	WebDriver driver;
	WaitUtill waitUtils;
	
	public UpdateRcObjects(WebDriver driver) {
		this.driver = driver;
		this.waitUtils = waitUtils;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[contains(@class,'__gVAFS ')])[5]")
	WebElement ClkupdateRcButton;
	
	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;
	
	public void clkUpdateRcButton() {
		
		//waitUtils.waitForClickable(ClkupdateRcButton).click();;
		ClkupdateRcButton.click();
	}
	public void getClkProceedButton() {
		clk_proceedButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

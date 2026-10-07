package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateInsuranceDetailsObjects {
	
	WebDriver driver;
	
	public UpdateInsuranceDetailsObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "(//*[contains(@class,'chip__gVAFS ')])[2]")
	WebElement clk_insuranceDetailsButton;
	
	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;
	
	
	
	public void getClkInsuranceDetailsButton() {
		clk_insuranceDetailsButton.click();
	}
	
	public void getClkProceedButton() {
		clk_proceedButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

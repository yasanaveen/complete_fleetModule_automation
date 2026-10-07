package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateEMIObjects {
	
	WebDriver driver;
	
	public UpdateEMIObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[contains(@class,'chip__gVAFS ')])[3]")
	WebElement clk_emiDetailsButton;
	
	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;
	
	
	public void ClkEMIDetailsUpdateButton() {
		clk_emiDetailsButton.click();
	}
	
	public void ClkProceedButton() {
		clk_proceedButton.click();
	}
	
	
	
	
	
	
	
	
	
	

}

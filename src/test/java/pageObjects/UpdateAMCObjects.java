package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateAMCObjects {

	public WebDriver driver;

	public UpdateAMCObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[contains(@class,'__gVAFS ')])[6]")
	WebElement updateAMCButton;
	
	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;
	
	
	
	
	public void clkUpdateAMCButton() {
		updateAMCButton.click();
	}
	
	public void ClkProceedButton() {
		clk_proceedButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

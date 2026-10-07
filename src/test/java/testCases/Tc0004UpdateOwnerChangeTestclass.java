package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;
import pageObjects.UpdateOwnerChangeObjects;

public class Tc0004UpdateOwnerChangeTestclass extends BaseClass {

	@Test
	public void testOwnerChange() {

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();

		UpdateOwnerChangeObjects updateOwnerChangeObjects = new UpdateOwnerChangeObjects(driver);
		scrollDown(500);
		updateOwnerChangeObjects.getUpdateOwnerChangeButton();
		updateOwnerChangeObjects.getClkProceedButton();
		
		
			
		
		

	}

}

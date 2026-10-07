package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;
import pageObjects.UpdateInsuranceDetailsObjects;

public class Tc_002UpdateInsuranceDetails extends BaseClass {

	@Test
	public void updateInsuranceDetails() {

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();

		UpdateInsuranceDetailsObjects updateInsuranceDetailsObjects = new UpdateInsuranceDetailsObjects(driver);
		scrollDown(500);
		updateInsuranceDetailsObjects.getClkInsuranceDetailsButton();
		updateInsuranceDetailsObjects.getClkProceedButton();
		
		
		
		
		
		
		

	}

}

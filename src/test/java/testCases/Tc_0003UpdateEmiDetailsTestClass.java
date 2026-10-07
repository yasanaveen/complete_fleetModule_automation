package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;
import pageObjects.UpdateEMIObjects;


public class Tc_0003UpdateEmiDetailsTestClass extends BaseClass {
	
	@Test
	public void updateEmiDetails() {
		
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");
		
		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();
		
		UpdateEMIObjects updateEMIObjects = new UpdateEMIObjects(driver);
		scrollDown(500);
		updateEMIObjects.ClkEMIDetailsUpdateButton();
		updateEMIObjects.ClkProceedButton(); 
		
		
		
		
		
	}

}

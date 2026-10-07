package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.FleetMgmtAssignDriverObjects;
import pageObjects.RouteMgmtObjects;

public class FleetMgmtAssignDriverTestClass extends BaseClass {

	@Test
	public void assignDriverTestclass() {

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RouteMgmtObjects route = new RouteMgmtObjects(driver);
		route.clkRouteMgmtCard();

		FleetMgmtAssignDriverObjects assign = new FleetMgmtAssignDriverObjects(driver);
		assign.clkfleetMgmtCard();
		assign.clkAssignDriver();
		assign.clickBranch();
		assign.clickVehicleNo();
		assign.clickDriver();
		assign.getRoute();
		assign.enterRemarks("");

	}

}

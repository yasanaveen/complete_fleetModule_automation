package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RouteMgmtObjects;
import pageObjects.RouteUnAssignCardObjects;

public class RouteUnAssignTestClass extends BaseClass {

	@Test
	public void routeUnAssignTest() {
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RouteMgmtObjects route = new RouteMgmtObjects(driver);
		route.clkRouteMgmtCard();

		RouteUnAssignCardObjects unassign = new RouteUnAssignCardObjects(driver);
		unassign.clkrouteunassignCard();
		unassign.clickAcademicYear();
		unassign.clickBranch();
		unassign.clickVehicle();
		unassign.clickRouteNumber();
		unassign.getFromTime();
		unassign.getToTime();
		unassign.getFixedKms();
		unassign.getExpectedMileage();
		unassign.enterRemarks("");

	}

}

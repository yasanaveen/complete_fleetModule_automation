package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RouteAssignObjects;
import pageObjects.RouteMgmtObjects;

public class RouteAssignCardTest extends BaseClass {

	@Test
	public void routeAssignTest() {
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RouteMgmtObjects route = new RouteMgmtObjects(driver);
		route.clkRouteMgmtCard();

		RouteAssignObjects routeAssign = new RouteAssignObjects(driver);
		routeAssign.clkassignRoute();
		routeAssign.clickAcademicYear();
		routeAssign.clickBranch();
		routeAssign.clickVehicle();
		routeAssign.clickRouteNumber();
		routeAssign.enterFromTime("");
		routeAssign.enterToTime("");
		routeAssign.getFixedKms();
		routeAssign.enterExpectedMileage("");
		routeAssign.enterRemarks(null);
		routeAssign.clickBackButton();
		routeAssign.clickTopBackButton();
		routeAssign.clickForwardToApproval();
		
		
		
		
		
		
		
		
		
		

	}

}

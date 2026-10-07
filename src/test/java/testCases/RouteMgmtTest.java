package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RouteMgmtObjects;

public class RouteMgmtTest extends BaseClass {

	@Test
	public void routemgmttest() {
		
		
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");
		
		RouteMgmtObjects route=new RouteMgmtObjects(driver);
		route.clkRouteMgmtCard();
		route.clkRouteSetupCard();
		
		

	}

}

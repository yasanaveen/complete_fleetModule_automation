package testCases;

import org.testng.annotations.Test;

import pageObjects.AddIncidentObjects;

public class Tc0006AddIncidentTestClass extends BaseClass {

    @Test
    public void addIncidentTest() {

        // Create Page Object
        AddIncidentObjects incident =
                new AddIncidentObjects(driver);


        // ==========================================
        // SELECT BRANCH
        // ==========================================

        incident.clickBranch();

        // TODO: Select Branch from dropdown


        // ==========================================
        // SELECT VEHICLE
        // ==========================================

        incident.clickVehicle();

        // TODO: Select Vehicle from dropdown


        // ==========================================
        // SELECT DRIVER
        // ==========================================

        incident.clickDriver();

        // TODO: Select Driver from dropdown


        // ==========================================
        // SELECT ROUTE ASSIGNMENT
        // ==========================================

        incident.clickRouteAssignment();

        // TODO: Select Route Assignment from dropdown


        // ==========================================
        // SELECT INCIDENT TYPE
        // ==========================================

        incident.clickIncidentType();

        // TODO: Select Incident Type from dropdown


        // ==========================================
        // SELECT INCIDENT DATE
        // ==========================================

        incident.clickIncidentDate();

        // TODO: Select Incident Date from date picker


        // ==========================================
        // INCIDENT TIME
        // ==========================================

        incident.enterIncidentTime("10:30");


        // ==========================================
        // INCIDENT SEVERITY
        // ==========================================

        incident.clickIncidentSeverity();

        // TODO: Select Incident Severity from dropdown


        // ==========================================
        // INCIDENT LOCATION
        // ==========================================

        incident.enterIncidentLocation("Hyderabad");


        // ==========================================
        // SETTLEMENT AMOUNT
        // ==========================================

        incident.enterSettlementAmount("5000");


        // ==========================================
        // UPLOAD PHOTOS
        // ==========================================

        incident.uploadPhotos(
                "C:\\TestData\\incident-photo.jpg"
        );


        // ==========================================
        // DESCRIPTION
        // ==========================================

        incident.enterDescription(
                "Vehicle met with an incident during transportation."
        );


        // ==========================================
        // PROCEED TO CLAIM DETAILS
        // ==========================================

        incident.clickProceedToClaimDetails();


        // ==========================================
        // OR
        // ==========================================
        // If you want to skip claim details and
        // directly forward for approval, use:
        //
        // incident.clickSkipClaimForwardApproval();
    }
}
package testCases;

import org.testng.annotations.Test;

import pageObjects.MaintenanceLogObjects;

public class Tc0009MaintenanceLogTestClass extends BaseClass {

    @Test
    public void maintenanceLogTest() {

        MaintenanceLogObjects maintenance = new MaintenanceLogObjects(driver);

        // ==========================================
        // Nature of Work
        // ==========================================

        maintenance.clickService();
        // Or: maintenance.clickRepair();


        // ==========================================
        // Branch
        // ==========================================

        maintenance.clickBranch();
        // TODO: Select Branch


        // ==========================================
        // Vehicle No
        // ==========================================

        maintenance.clickVehicleNo();
        // TODO: Select Vehicle No


        // ==========================================
        // Manufacturer Company
        // ==========================================

        maintenance.getManufacturerCompany();


        // ==========================================
        // Service Mode
        // ==========================================

        maintenance.clickServiceMode();
        // TODO: Select Service Mode


        // ==========================================
        // Service Pickup Type
        // ==========================================

        maintenance.clickServicePickupType();
        // TODO: Select Service Pickup Type


        // ==========================================
        // Date
        // ==========================================

        maintenance.clickDate();
        // TODO: Select Date


        // ==========================================
        // Service Center
        // ==========================================

        maintenance.clickServiceCenter();
        // TODO: Select Service Center


        // ==========================================
        // Invoice No
        // ==========================================

        maintenance.enterInvoiceNo("INV-10001");


        // ==========================================
        // Responsible Person
        // ==========================================

        maintenance.clickResponsiblePerson();
        // TODO: Select Responsible Person


        // ==========================================
        // Incharge Name
        // ==========================================

        maintenance.clickInchargeName();
        // TODO: Select Incharge Name


        // ==========================================
        // Job Card No
        // ==========================================

        maintenance.enterJobCardNo("JC-10001");


        // ==========================================
        // Current Meter Reading
        // ==========================================

        maintenance.enterCurrentMeterReading("25000");


        // ==========================================
        // Vehicle Damaged Parts
        // ==========================================

        maintenance.clickVehicleDamagedParts();
        // TODO: Select Vehicle Damaged Parts


        // ==========================================
        // AMC Coverage Amount
        // ==========================================

        maintenance.getAmcCoverageAmount();


        // ==========================================
        // Paid Amount
        // ==========================================

        maintenance.getPaidAmount();


        // ==========================================
        // Insurance Claimed
        // ==========================================

        maintenance.selectInsuranceClaimed();


        // ==========================================
        // Total Amount
        // ==========================================

        maintenance.getTotalAmount();


        // ==========================================
        // Amount Paid By Employee
        // ==========================================

        maintenance.enterPaidBy("Ravi Kumar");


        // ==========================================
        // Paid Date
        // ==========================================

        maintenance.clickPaidDate();
        // TODO: Select Paid Date


        // ==========================================
        // Next Service KMs
        // ==========================================

        maintenance.enterNextServiceKms("30000");


        // ==========================================
        // Next Service Months
        // ==========================================

        maintenance.enterNextServiceMonths("6");


        // ==========================================
        // Claim Document
        // ==========================================

        maintenance.uploadClaimDocument(
                "C:\\TestData\\claim-document.pdf"
        );


        // ==========================================
        // Service Invoice
        // ==========================================

        maintenance.uploadServiceInvoice(
                "C:\\TestData\\service-invoice.pdf"
        );


        // ==========================================
        // Remarks
        // ==========================================

        maintenance.enterRemarks(
                "Vehicle maintenance completed successfully."
        );
    }
}
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenanceLogObjects {

    WebDriver driver;

    public MaintenanceLogObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // =====================================================
    // LOCATORS
    // =====================================================

    // Nature of Work
    @FindBy(xpath = "//button[normalize-space()='Service']")
    WebElement btn_service;

    @FindBy(xpath = "//button[normalize-space()='Repair']")
    WebElement btn_repair;


    // Branch
    @FindBy(name = "branch")
    WebElement dropdown_branch;


    // Vehicle No
    @FindBy(name = "vehicleNo")
    WebElement dropdown_vehicleNo;


    // Manufacturer Company Name
    @FindBy(name = "manufacturerCompany")
    WebElement input_manufacturerCompany;


    // Service Mode
    @FindBy(name = "serviceMode")
    WebElement dropdown_serviceMode;


    // Service Pickup Type
    @FindBy(name = "servicePickupType")
    WebElement dropdown_servicePickupType;


    // Date
    @FindBy(id = "date")
    WebElement input_date;


    // Service Center
    @FindBy(name = "serviceCenter")
    WebElement dropdown_serviceCenter;


    // Invoice No
    @FindBy(name = "invoiceNo")
    WebElement input_invoiceNo;


    // Responsible Person
    @FindBy(name = "responsiblePerson")
    WebElement dropdown_responsiblePerson;


    // Incharge Name
    @FindBy(name = "inchargeName")
    WebElement dropdown_inchargeName;


    // Job Card No
    @FindBy(name = "jobCardNo")
    WebElement input_jobCardNo;


    // Current Meter Reading
    @FindBy(name = "currentMeterReading")
    WebElement input_currentMeterReading;


    // Vehicle Damaged Parts
    @FindBy(xpath = "//span[normalize-space()='Select Vehicle Damaged Parts']")
    WebElement dropdown_vehicleDamagedParts;


    // AMC Coverage Amount
    @FindBy(name = "amcCoverage")
    WebElement input_amcCoverage;


    // Paid Amount
    @FindBy(name = "totalAmount")
    WebElement input_paidAmount;


    // Insurance Claimed
    @FindBy(id = "isInsuranceClaimed")
    WebElement checkbox_isInsuranceClaimed;


    // Total Amount
    @FindBy(name = "sumOfAmount")
    WebElement input_sumOfAmount;


    // Amount Paid By Employee Name
    @FindBy(name = "paidBy")
    WebElement input_paidBy;


    // Paid Date
    @FindBy(id = "paidDate")
    WebElement input_paidDate;


    // Next Service KMs
    @FindBy(name = "nextServiceKms")
    WebElement input_nextServiceKms;


    // Next Service Months
    @FindBy(name = "nextServiceMonths")
    WebElement input_nextServiceMonths;


    // Claim Document
    @FindBy(xpath = "//label[normalize-space()='Claim Document']/following-sibling::input[@type='file']")
    WebElement input_claimDocument;


    // Service Invoice
    @FindBy(xpath = "//label[contains(normalize-space(),'Service Invoice')]/following-sibling::input[@type='file']")
    WebElement input_serviceInvoice;


    // Remarks
    @FindBy(name = "remarks")
    WebElement input_remarks;


    // =====================================================
    // ACTION METHODS
    // =====================================================


    // Service
    public void clickService() {
        btn_service.click();
    }


    // Repair
    public void clickRepair() {
        btn_repair.click();
    }


    // Branch
    public void clickBranch() {
        dropdown_branch.click();
    }


    // Vehicle Number
    public void clickVehicleNo() {
        dropdown_vehicleNo.click();
    }


    // Manufacturer Company
    public void getManufacturerCompany() {

        String manufacturer =
                input_manufacturerCompany.getAttribute("value");

        System.out.println("Manufacturer Company: " + manufacturer);
    }


    // Service Mode
    public void clickServiceMode() {
        dropdown_serviceMode.click();
    }


    // Service Pickup Type
    public void clickServicePickupType() {
        dropdown_servicePickupType.click();
    }


    // Date
    public void clickDate() {
        input_date.click();
    }


    // Service Center
    public void clickServiceCenter() {
        dropdown_serviceCenter.click();
    }


    // Invoice Number
    public void enterInvoiceNo(String invoiceNo) {

        input_invoiceNo.clear();
        input_invoiceNo.sendKeys(invoiceNo);
    }


    // Responsible Person
    public void clickResponsiblePerson() {
        dropdown_responsiblePerson.click();
    }


    // Incharge Name
    public void clickInchargeName() {
        dropdown_inchargeName.click();
    }


    // Job Card Number
    public void enterJobCardNo(String jobCardNo) {

        input_jobCardNo.clear();
        input_jobCardNo.sendKeys(jobCardNo);
    }


    // Current Meter Reading
    public void enterCurrentMeterReading(String reading) {

        input_currentMeterReading.clear();
        input_currentMeterReading.sendKeys(reading);
    }


    // Vehicle Damaged Parts
    public void clickVehicleDamagedParts() {
        dropdown_vehicleDamagedParts.click();
    }


    // AMC Coverage Amount
    public void getAmcCoverageAmount() {

        String amount =
                input_amcCoverage.getAttribute("value");

        System.out.println("AMC Coverage Amount: " + amount);
    }


    // Paid Amount
    public void getPaidAmount() {

        String amount =
                input_paidAmount.getAttribute("value");

        System.out.println("Paid Amount: " + amount);
    }


    // Insurance Claimed
    public void selectInsuranceClaimed() {

        if (!checkbox_isInsuranceClaimed.isSelected()) {
            checkbox_isInsuranceClaimed.click();
        }
    }


    // Total Amount
    public void getTotalAmount() {

        String amount =
                input_sumOfAmount.getAttribute("value");

        System.out.println("Total Amount: " + amount);
    }


    // Employee Name
    public void enterPaidBy(String employeeName) {

        input_paidBy.clear();
        input_paidBy.sendKeys(employeeName);
    }


    // Paid Date
    public void clickPaidDate() {
        input_paidDate.click();
    }


    // Next Service KMs
    public void enterNextServiceKms(String kms) {

        input_nextServiceKms.clear();
        input_nextServiceKms.sendKeys(kms);
    }


    // Next Service Months
    public void enterNextServiceMonths(String months) {

        input_nextServiceMonths.clear();
        input_nextServiceMonths.sendKeys(months);
    }


    // Claim Document Upload
    public void uploadClaimDocument(String filePath) {

        input_claimDocument.sendKeys(filePath);
    }


    // Service Invoice Upload
    public void uploadServiceInvoice(String filePath) {

        input_serviceInvoice.sendKeys(filePath);
    }


    // Remarks
    public void enterRemarks(String remarks) {

        input_remarks.clear();
        input_remarks.sendKeys(remarks);
    }
}
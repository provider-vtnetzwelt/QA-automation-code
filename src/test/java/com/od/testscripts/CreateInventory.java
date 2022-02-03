package com.od.testscripts;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.od.baseutil.BaseTest;
import com.od.baseutil.InitializePages;
import com.od.dataproviders.DataProviderFactory;
import com.od.dataproviders.DataProviderFile;
import com.od.extentreport.ExtentODManager;
import com.od.extentreport.ExtentODTest;
import com.od.util.WebActionUtil;

public class CreateInventory {
	InitializePages pages;
	
	@DataProviderFile(file = "./src/main/resources/data/Data.xlsx", sheet = "Data")
	@Test(dataProvider = "data", dataProviderClass = DataProviderFactory.class, description = "Description: Script to Create Inventory")
	public void Create_Inventory(String gSTIN, String organisationClientType, String email, String contactNumber,
			String industryType, String businessNameAlias, String pan, String city, String address, String proceedWith,
			String tan, String contactName, String country, String pinCode, String state, String itemCode1,
			String nameOfProduct1, String unitOfMeasurement1, String inventoryMethod1, String itemCode2,
			String nameOfProduct2, String unitOfMeasurement2, String hSNSACCode, String inventoryMethod2,
			String purchasePrice, String purchasegGstRate, String purchaseCessAmount, String purchaseDiscount,
			String purchaseExpiryDate, String purchaseMrp, String salesPrice, String salesGstRate,
			String salesCessAmount, String salesDiscount, String salesExpiryDate, String salesMrp, String quantity,
			String costAmount, String ordernumber, String duedate, String customername, String contactid,
			String placeofsupply, String item, String qty, String unitprice, String account, String gstrate,
			String sentstatus, String salesorderoption, String salesorderoption1, String invoicenumber,
			String invoicetype, String awaitingreceiptstatus, String itemname, String invoiceNumber,
			String CustomerName, String placeOfSupply, String address1, String pincode, String itemName1,
			String itemName2, String quantityValue, String priceValue,String freightValue, String GSTValue, String date, String descreption,
			String directExpenses, String expectedStatus, String beforePaymentStatus, String received,
			String defaultQuantity,String branch,String category,String itemCode3, String nameOfProduct3)
	{
		this.pages = BaseTest.pages;

		/*Click Inventory link*/
		pages.hbAccountsPage.clkInventoryLnk();
		
		/* Validate Inventory page */
		pages.inventoryPage.validateInventoryPage();

		/* Click on Add Inventory Button */
		pages.inventoryPage.clkAddInventoryBtn();

		/* Validate Product Service Information Popup */
		pages.inventoryPage.validateProductServiceInformationPopup();

		/* Click on Inventory Check Box */
		pages.inventoryPage.clkInventoryCb();

		/* Enter Item Code*/
		pages.inventoryPage.setItemCode(itemCode1);

		/* Enter Name of Product */
		pages.inventoryPage.setNameOfProduct(nameOfProduct1);

		/* Enter Unit of Measurement*/
		pages.inventoryPage.setUnitOfMeasurment(unitOfMeasurement1);

		/* Enter Inventory Method from drop down*/
		pages.inventoryPage.setInventoryMethod(inventoryMethod1);

		/* Click on Save Button */
		pages.inventoryPage.clkSave();

		/* Validate Inventory Added Success Message */
		pages.inventoryPage.validateInventoryAddedSuccessMessage();

		/* Click on OK Button */
		pages.inventoryPage.clkOk();

		/* Validate Inventory page */
		pages.inventoryPage.validateInventoryPage();

		/* validate data present in Inventory Item table */
		pages.inventoryPage.validateInventoryItem(itemCode1, nameOfProduct1, "0", "0", "0", "0");

		/* Click on Add Inventory Button */
		pages.inventoryPage.clkAddInventoryBtn();

		/* Validate Product Service Information Popup */
		pages.inventoryPage.validateProductServiceInformationPopup();

		/* Click on Inventory Check Box */
		pages.inventoryPage.clkInventoryCb();

		/* Enter Item Code*/
		pages.inventoryPage.setItemCode(itemCode2);

		/* Enter Name of Product */
		pages.inventoryPage.setNameOfProduct(nameOfProduct2);

		/* Enter Unit of Measurement*/
		pages.inventoryPage.setUnitOfMeasurment(unitOfMeasurement2);

		/* Enter HSN/SAC Code */
		pages.inventoryPage.setHSNSACCode(hSNSACCode);

		/* Enter Inventory Method from drop down */
		pages.inventoryPage.setInventoryMethod(inventoryMethod2);

		/* Enter Purchase Price/Rate */
		pages.inventoryPage.setPurchasePrice(purchasePrice);

		/* Enter Purchase GST Rate from drop down */
		pages.inventoryPage.setPurchaseGSTRate(purchasegGstRate);

		/* Enter Purchase Cess Amoun*/
		pages.inventoryPage.setPurchaseCessAmount(purchaseCessAmount);

		/* Enter Purchase Discount (%)  */
		pages.inventoryPage.setPurchaseDiscount(purchaseDiscount);

		/* Enter Purchase Purchase Expiry Date */
		pages.inventoryPage.setPurchaseExpiryDate(purchaseExpiryDate);

		/* Enter Purchase MRP */
		pages.inventoryPage.setPurchaseMRP(purchaseMrp);

		/* Enter Sales Price/Rate */
		pages.inventoryPage.setSalesPrice(salesPrice);

		/* Enter Sales GST Rate from drop down */
		pages.inventoryPage.setSellGSTRate(salesGstRate);

		/* Enter Sales Cess Amoun*/
		pages.inventoryPage.setSellCessAmount(salesCessAmount);

		/* Enter Sales Discount (%)  */
		pages.inventoryPage.setSellDiscount(salesDiscount);

		/* Enter Sales Purchase Expiry Date */
		pages.inventoryPage.settbSellExpiryDateExpiryDate(salesExpiryDate);

		/* Enter Sales MRP */
		pages.inventoryPage.setSellMRP(salesMrp);

		/* Click on Opening Stock Check box */
		pages.inventoryPage.clkOpeningStockCb();

		/* Enter Quantity In Hand */
		pages.inventoryPage.setQuantityInHand(quantity);

		/* Enter Cost Amount */
		pages.inventoryPage.setCostAmount(costAmount);

		/* Click on Save Button */
		pages.inventoryPage.clkSave();

		/* Validate Inventory page */
		pages.inventoryPage.validateInventoryAddedSuccessMessage();

		/* Click on OK Button */
		pages.inventoryPage.clkOk();

		/* Validate Inventory page */
		pages.inventoryPage.validateInventoryPage();

		/* validate data present in Inventory Item table */
		pages.inventoryPage.validateInventoryItem(itemCode2, nameOfProduct2, purchasePrice, salesPrice, quantity, costAmount);
	}

	/**
	 * Description: launches browser and creates node for extent report.
	 * 
	 * @author:Abhilash
	 * @param: methodName
	 */
	@BeforeMethod
	public void launchBrowser(Method methodName) {
		try {
			ExtentTest parentExtentTest = ExtentODTest.createTest(getClass().getSimpleName());
			ExtentODManager.setParentReport(parentExtentTest);
			String description = methodName.getAnnotation(Test.class).description();
			ExtentTest testReport = ExtentODManager.getParentReport().createNode(methodName.getName(), description);
			ExtentODManager.setTestReport(testReport);

		} catch (Throwable e) {
			WebActionUtil.fail("Unable to create node");
			WebActionUtil.error("Unable to create node");
		}

	}

}
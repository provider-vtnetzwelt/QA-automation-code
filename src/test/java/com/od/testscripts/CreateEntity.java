package com.od.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.od.baseutil.BaseTest;
import com.od.dataproviders.DataProviderFactory;
import com.od.dataproviders.DataProviderFile;

/**
 * Description:Script to create a Entity(Business)
 * 
 * @author Sajal
 */
public class CreateEntity extends BaseTest {
	
	@DataProviderFile(file = "./src/main/resources/data/Data.xlsx", sheet = "Data")
	@Test(dataProvider = "data", dataProviderClass = DataProviderFactory.class, description = "Description: Script to Create Entity")
	public void Create_Entity(String gSTIN, String organisationClientType, String email, String contactNumber,
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
			String defaultQuantity,String branch,String category,String itemCode3, String nameOfProduct3) {

		/* click Add Entity icon */
		pages.dashBoardPage.clkAddEntityIcon();

		/* set GSTIN text box */
		pages.dashBoardPage.setGSTIN(gSTIN);
		
		/* set Email text box */
		pages.dashBoardPage.setEmail(email);

		/* set Contact number text box */
		pages.dashBoardPage.setContactNumber(contactNumber);

		/* select Organization client type drop down */
		pages.dashBoardPage.selectOrganisationClientTypeDD(organisationClientType);
		
		/* select Industry type drop down */
		pages.dashBoardPage.selectIndustryTypeDD(industryType);

		 /* set Business name alias text box */
		pages.dashBoardPage.setBusinessNameAlias(businessNameAlias);

		/*Fetch Name Of Client/Business, PAN, GSTIN*/
		List<String> expectedBusinessData = pages.dashBoardPage.fetchEntityFields();
		
		/* click Create business button */
		pages.dashBoardPage.clkCreateBusinessBtn();

		/* click proceed with check box */
		pages.dashBoardPage.clkProceedWithCb(proceedWith);

		/* click Continue button */
		pages.dashBoardPage.clkContinueBtn();

		/* click Save button */
		pages.dashBoardPage.clkSaveBtn();

		/* Validate Successfully saved Accounting details Text */
		pages.dashBoardPage.validateSuccessMessage("Sucessfully saved Accounting details");

		/* click Go To DashBoard button */
		pages.dashBoardPage.clkGoToDashBoardBtn();

		/*Validate DashBoard Page*/
		pages.dashBoardPage.validateDashBoardPage("https://in.hostbooks.com/user/dashboard");
		
		/*Validate Business Data*/
		pages.dashBoardPage.validateBusinessData(expectedBusinessData);
		
		/* click account tab */
		pages.dashBoardPage.clkAccountTab();

		/* click start button */
		pages.dashBoardPage.clkStartBtn();
		
		/*Validate HB Accounts Page*/
		pages.dashBoardPage.validateHBAccountsPage("https://inaccounts.hostbooks.com/dashboard");

	}
}

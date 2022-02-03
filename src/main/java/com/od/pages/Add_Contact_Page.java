package com.od.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.od.util.WebActionUtil;
/**
 * Description: This class implements the methods for Add Contact Page
 * 
 * @author Sajal jain
 */
public class Add_Contact_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 30;

	public Add_Contact_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}

	/* Contact Type Customer check box */
	@FindBy(xpath = "//body[@id='body']/app-root/section[@class='body-container']/div[@class='container-fluid']/div[@class='row']//app-new-edit-contact[@class='ng-star-inserted']//div[@class='dataMainTabs']/mat-tab-group/div/mat-tab-body[1]//app-general-info-tab[@class='ng-star-inserted']//div[@class='col pl-0']/mat-checkbox//div[@class='mat-checkbox-inner-container']")
	private WebElement cbContactTypeCustomer;

	/* Contact name text box */
	@FindBy(xpath = "//input[@placeholder='Contact Name']")
	private WebElement tbContactName;

	/* Address text box */
	@FindBy(xpath = "//textarea[@placeholder='Address']")
	private WebElement tbAddress;

	/* Pin code text box */
	@FindBy(xpath = "//input[@placeholder='Pin Code']")
	private WebElement tbPincode;

	/* City text box */
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement tbCity;

	/* State text box */
	@FindBy(xpath = "//input[@placeholder='State']")
	private WebElement tbState;

	/* Country text box */
	@FindBy(xpath = "//input[@placeholder='Country']")
	private WebElement tbCountry;

	/* GSTIN Address tab */
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]/parent::div")
	private WebElement tabGstinAddress;

	/* General Information tab */
	@FindBy(xpath = "//div[text()='General Information']/parent::div")
	private WebElement tabGeneralInformation;

	/* GSTIN Pin code text box */
	@FindBy(id = "mat-input-181")
	private WebElement tbGstinPincode;

	/* GSTIN state text box */
	@FindBy(id = "mat-input-183")
	private WebElement tbGstinState;

	/* GSTIN city text box */
	@FindBy(id = "mat-input-182")
	private WebElement tbGstinCity;

	/* GSTIN Country text box */
	@FindBy(id = "mat-input-184")
	private WebElement tbGstinCountry;

	/* Same As Postal Address check box */
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement cbSameAsPostalAddress;

	/* Same As Bill Address check box */
	@FindBy(id = "mat-checkbox-127-input")
	private WebElement cbSameAsBillAddress;

	/* Save button */
	@FindBy(xpath = "//span[contains(text(),'Save')]/parent::button")
	private WebElement btnSave;

	/* Added Successfully text */
	@FindBy(id = "swal2-content")
	private WebElement txtAddedSuccessfully;

	/* Enter your GSTIN text box */
	@FindBy(css = "input[placeholder='Enter your GSTIN']")
	private WebElement tbEnterYourGSTIN;

	/* Verify button */
	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement btnVerify;

	/* OK button */
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement btnOK;

	/* Accept button */
	@FindBy(xpath = "//span[text()='Accept']/parent::button")
	private WebElement btnAccept;

	/* Method to return the pin code */
	private WebElement selectPincode(String pinCode) {
		return driver.findElement(By.xpath("//span[contains(text(),'" + pinCode + "')]"));
	}

	/* Add Contact Text */
	@FindBy(xpath = "//app-new-edit-contact[@class='ng-star-inserted']/descendant::h3")
	private WebElement txtAddContact;

	/* All Contact Text */
	@FindBy(xpath = "//app-contacts[@class='ng-star-inserted']/descendant::h3")
	private WebElement txtAllContacts;

	/* GSTIN verified successfully Text */
	@FindBy(xpath = "//strong[.='GSTIN verified successfully ']")
	private WebElement txtGstinVerifiedSuccessfully;

	/* Method to select Contacts form table */
	public List<WebElement> tableContact(String contactName) {
		List<WebElement> contactDetails = driver.findElements(By.xpath("(//a[contains(text(),'" + contactName
				+ "')])[1]/ancestor::mat-cell/following-sibling::mat-cell/descendant::span"));
		return contactDetails;
	}

	/* Billing Address Text */
	@FindBy(xpath = "//div[contains(text(),'Billing Address')]/ancestor::div[2]/following-sibling::span/descendant::span")
	private WebElement txtBillingAddress;

	/* Shipping Address Text */
	@FindBy(xpath = "//div[contains(text(),'Shipping Address')]/ancestor::div[2]/following-sibling::span/descendant::span")
	private WebElement txtShippingAddress;

	/* First name text box */
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement tbFirstName;

	/* Last name text box */
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement tbLastName;

	/* Pan number text box */
	@FindBy(xpath = "//input[@placeholder='PAN Number']")
	private WebElement tbPANNumber;
	
	/**
	 * Description: Method to validate Contact details in Table
	 * 
	 * @author Sajal
	 * @param contactName
	 * @param expectedDetails
	 */
	public synchronized void validateContactDetailsInTable(String contactName, String[] expectedDetails) {
		try {
			List<WebElement> contactTableData = tableContact(contactName);
			List<String> actualData = new ArrayList<String>();
			List<String> expectedData = new ArrayList<String>();
			for (String details : expectedDetails) {
				expectedData.add(details);
			}
			expectedData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");
			expectedData.add(1, "<font size=\"2\">" + contactName + "</font>");

			String[] expectedArray = new String[expectedData.size()];
			expectedArray = expectedData.toArray(expectedArray);

			for (WebElement data : contactTableData) {
				if (data.getText().trim().equals("") || data.getText().trim().equals("[^a-zA-Z0-9]")) {
				} else {
					actualData.add(data.getText().trim());
				}
			}

			actualData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");
			actualData.add(1, "<font size=\"2\">" + contactName + "</font>");

			String[] actualArray = new String[actualData.size()];
			actualArray = actualData.toArray(actualArray);

			String[][] twoDArray = null;
			if (contactTableData.size() <= 6) {
				twoDArray = new String[][] {
						{ "", "<font size=\"2\"class=\"label white-text orange\">Contact</font>",
								"<font size=\"2\"class=\"label white-text orange\">Primary Type</font>",
								"<font size=\"2\"class=\"label white-text orange\">Balance</font>" },
						expectedArray, actualArray };
			} else {
				twoDArray = new String[][] {
						{ "", "<font size=\"2\"class=\"label white-text orange\">Contact</font>",
								"<font size=\"2\"class=\"label white-text orange\">Primary Type</font>",
								"<font size=\"2\"class=\"label white-text orange\">GSTIN</font>",
								"<font size=\"2\"class=\"label white-text orange\">PAN</font>",
								"<font size=\"2\"class=\"label white-text orange\">Contact Person</font>",
								"<font size=\"2\"class=\"label white-text orange\">Balance</font>" },
						expectedArray, actualArray };
			}
			actionUtil.createTable(twoDArray);
			if (actualData.containsAll(expectedData)) {
				actionUtil.validationinfo(
						"Contact is created and displayed with given fields in All Contacts listing table", "green");
				actionUtil.info("Contact is created and displayed with given fields in All Contacts listing table");
			} else {
				actionUtil.error("Contact data didn't matched in All Contacts listing table");
				actionUtil.fail("Contact data didn't matched in All Contacts listing table");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate contact details in All Contacts listing table");
			Assert.fail("Unable to validate contact details in All Contacts listing table");
		}

	}

	/**
	 * Description: Method to Click on Accept Button
	 * 
	 * @author Sajal
	 */
	public synchronized void clkAccept() {
		actionUtil.waitForElement(btnAccept, "Accept Button");
		actionUtil.clickOnElement(btnAccept, "Accept Button");
	}

	/**
	 * Description: Method to Click on Save Button, validate Contact Added
	 * successfully text and click on OK Button
	 * 
	 * @author Sajal
	 */
	public synchronized void clkSave() {
		actionUtil.waitForElement(btnSave, "Save Button");
		actionUtil.scrollUp();
		actionUtil.clickOnElement(btnSave, "Save Button");
		actionUtil.waitForElement(txtAddedSuccessfully, "Added Successfully");
		actionUtil.validateisElementDisplayed(txtAddedSuccessfully, "Added Successfully",
				"Contact Added successfully is displayed", "Contact Added successfully is not displayed", "green");
		actionUtil.clickOnElement(btnOK, "OK Button");

		actionUtil.validateisElementDisplayed(txtAllContacts, "All Contact Text", "All Contact Page is displayed",
				"All Contact Page is not displayed", "blue");

	}

	/**
	 * Description Method to enter data in Enter your GSTIN Text Box
	 * 
	 * @author Sajal
	 * @param gSTIN
	 */
	public synchronized void setEnterYourGstin(String gSTIN) {
		try {
			actionUtil.waitForElement(tbEnterYourGSTIN, "Enter your GSTIN Text Box");
			actionUtil.typeText(tbEnterYourGSTIN, gSTIN, "Enter your GSTIN Text Box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Enter your GSTIN Text Box");
			Assert.fail("Unable to enter value in Enter your GSTIN Text Box");
		}
	}

	/**
	 * Description: Method to Click on Verify Button and validate GSTIN verified
	 * successfully Text
	 * 
	 * @author Sajal
	 */
	public synchronized void clkVerifyBtn() {
		actionUtil.waitForElement(btnVerify, "Verify Button");
		actionUtil.clickOnElement(btnVerify, "Verify Button");
		actionUtil.validateisElementDisplayed(txtGstinVerifiedSuccessfully, "GSTIN verified successfully Text",
				"GSTIN verified successfully pop up is displayed",
				"GSTIN verified successfully pop up is not displayed", "blue");
	}

	/**
	 * Description: Method to Click on Contact type customer Check box
	 * 
	 * @author Sajal
	 */
	public synchronized void clkContactTypeCustomer() {

		actionUtil.validateisElementDisplayed(txtAddContact, "Add Contact Text", "Add Contact form is displayed",
				"Add Contact form is not displayed", "blue");
		actionUtil.waitForAngularPageToLoad();
		actionUtil.waitForElement(cbContactTypeCustomer, "Contact type customer Check box");
		actionUtil.clickOnElementUsingJS(cbContactTypeCustomer, "Contact type customer Check box");
	}

	/**
	 * Description Method to enter data in General Information tab (contact
	 * name,address,pin code)
	 * 
	 * @author Sajal
	 * @param contactName
	 * @param address
	 * @param pincode
	 */
	public synchronized void enterGeneralInformation(String contactName, String address, String pinCode)
	{
		actionUtil.typeText(tbContactName, contactName, "First Name");
		actionUtil.validateEnteredValue(contactName, actionUtil.getTextUsingJS(tbContactName, ""), "First Name",
				contactName + " is entered in Contact Name", "Unable to enter Contact Name", "Blue");

		actionUtil.typeText(tbAddress, address, "Address");
		actionUtil.validateEnteredValue(address, actionUtil.getTextUsingJS(tbAddress, ""), "Address",
				address + " is entered in Address", "Unable to enter Address", "Blue");
		actionUtil.typeText(tbPincode, pinCode, "Pincode");
		actionUtil.waitForAngularPageToLoad();
		actionUtil.clickOnElement(selectPincode(pinCode), "Pincode Text box");
		actionUtil.validateEnteredValue(pinCode, actionUtil.getTextUsingJS(tbPincode, ""), "Pincode",
				pinCode + " is entered in Pincode", "Unable to enter Pincode", "Blue");
		actionUtil.waitForAngularPageToLoad();
		// actionUtil.typeText(tbCity, city, "City");
		// actionUtil.validateEnteredValue(city, actionUtil.getTextUsingJS(tbCity,""),
		// "City", city+" is entered in City", "Unable to enter City", "Blue");
		//
		// actionUtil.clearText(tbState, "State");
		// actionUtil.typeText(tbState, state, "State");
		// actionUtil.validateEnteredValue(state, actionUtil.getTextUsingJS(tbState,""),
		// "State", state+" is entered in State", "Unable to enter State", "Blue");
		//
		// actionUtil.typeText(tbCountry, country, "Country");
		// actionUtil.validateEnteredValue(country,
		// actionUtil.getTextUsingJS(tbCountry,""), "Country", country+" is entered in
		// Country", "Unable to enter Country", "Blue");
		//

	}

	/**
	 * Description: Method to Click on General Information Tab
	 * 
	 * @author Sajal
	 */
	public synchronized void clkGeneralInformationTab() {
		// actionUtil.scrollToElement(lnkGeneralInformation, "General Information Tab");
		actionUtil.scrollUp();
		actionUtil.waitForElement(tabGeneralInformation, "General Information Tab");
		actionUtil.clickOnElement(tabGeneralInformation, "General Information Tab");
	}

	/**
	 * Description: Method to Click on GSTIN & Addresses Tab
	 * 
	 * @author Sajal
	 */
	public synchronized void clkGSTINAddressesTab() {
		// actionUtil.scrollToElement(lnkGstinAddress, "GSTIN & Addresses Tab");
		actionUtil.scrollUp();
		actionUtil.waitForElement(tabGstinAddress, "GSTIN & Addresses Tab");
		actionUtil.clickOnElement(tabGstinAddress, "GSTIN & Addresses Tab");
	}



	/**
	 * Description: Method to fetch Contact Name
	 * 
	 * @author Sajal
	 */
	public synchronized String fetchContactName() {
		String contactName = null;
		try {
			contactName = actionUtil.getTextUsingJS(tbContactName, "Contact Name Text Box");
			actionUtil.info("Contact Name : " + contactName);
		} catch (Exception e) {
			actionUtil.error("Unable to fetch Contact name");
			actionUtil.fail("Unable to fetch Contact name");
			Assert.fail("Unable to fetch Contact name");

		}
		return contactName;
	}

	/**
	 * Description: Method to fetch First Name + Last Name
	 * 
	 * @author Sajal
	 */
	public synchronized String fetchFirstName() {
		String firstName = null;
		String lastName = null;
		try {
			firstName = actionUtil.getTextUsingJS(tbFirstName, "First Name Text Box");
			lastName = actionUtil.getTextUsingJS(tbLastName, "Last Name Text Box");
			actionUtil.info("First Name : " + firstName + " " + lastName);
		} catch (Exception e) {
			actionUtil.error("Unable to fetch First name and Last name");
			actionUtil.fail("Unable to fetch First name and Last name");
			Assert.fail("Unable to fetch First name and Last name");

		}
		return firstName + " " + lastName;
	}

	/**
	 * Description: Method to validate the shipping address and billing address
	 * after GSTIN verification
	 * 
	 * @author Sajal
	 */
	public synchronized void validateAddress() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(txtBillingAddress, "Billing Address Text");
			ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
			String billingAddress = txtBillingAddress.getText();
			String shippingAddress = txtShippingAddress.getText();
			arrayList.add(!billingAddress.equals(""));
			arrayList.add(!shippingAddress.equals(""));
			if (!arrayList.contains(false)) {
				actionUtil
						.info("Shipping address and Billing address data automatically came after GSTIN verification");
				actionUtil.validationinfo(
						"Shipping address and Billing address data automatically came after GSTIN verification",
						"blue");
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			actionUtil.error("Shipping address and Billing address data didn't came after GSTIN verification");
			actionUtil.fail("Shipping address and Billing address data didn't came after GSTIN verification");
			Assert.fail("Shipping address and Billing address data didn't came after GSTIN verification");

		}
	}

	/**
	 * Description: Method to validate the following field(Contact Name, first name,
	 * Last Name, PAN, Address, PIN Code) after GSTIN verification
	 * 
	 * @author Sajal
	 */
	public synchronized void validateFieldsAfterGSTINVerification() {
		try {
			ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
			String contactName = actionUtil.getTextUsingJS(tbContactName, "Contact Name Text Box");
			String firstName = actionUtil.getTextUsingJS(tbFirstName, "First Name Text Box");
			String lastName = actionUtil.getTextUsingJS(tbLastName, "Last Name Text Box");
			String panNumber = actionUtil.getTextUsingJS(tbPANNumber, "PAN Number Text Box");
			String address = actionUtil.getTextUsingJS(tbAddress, "Address Text Box");
			String pinCode = actionUtil.getTextUsingJS(tbPincode, "Pin code Text Box");
			arrayList.add(!contactName.equals(""));
			arrayList.add(!firstName.equals(""));
			arrayList.add(!lastName.equals(""));
			arrayList.add(!panNumber.equals(""));
			arrayList.add(!address.equals(""));
			arrayList.add(!pinCode.equals(""));

			if (!arrayList.contains(false)) {
				actionUtil.info(
						"Contact Name, First Name, Last Name, PAN, Address, PIN Code data automatically came after GSTIN verification");
				actionUtil.validationinfo(
						"Contact Name, First Name, Last Name, PAN, Address, PIN Code data automatically came after GSTIN verification",
						"blue");
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			actionUtil.error(
					"Contact Name, First Name, Last Name, PAN, Address, PIN Code data didn't came after GSTIN verification");
			actionUtil.fail(
					"Contact Name, First Name, Last Name, PAN, Address, PIN Code data didn't came after GSTIN verification");
			Assert.fail(
					"Contact Name, First Name, Last Name, PAN, Address, PIN Code data didn't came after GSTIN verification");

		}
	}

	/**
	 * Description: Method to validate the following field(city, state, country)
	 * after Pincode entered
	 * 
	 * @author Sajal
	 */
	public synchronized void validatePincodeFields() {
		try {
			actionUtil.waitForAngularPageToLoad();
			ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
			String city = actionUtil.getTextUsingJS(tbCity, "City Text Box");
			String state = actionUtil.getTextUsingJS(tbState, "State Text Box");
			String country = actionUtil.getTextUsingJS(tbCountry, "Country Text Box");
			arrayList.add(!city.equals(""));
			arrayList.add(!state.equals(""));
			arrayList.add(!country.equals(""));
			if (!arrayList.contains(false)) {
				actionUtil.info("City, State, Country data automatically came after Pin code is entered");
				actionUtil.validationinfo("City, State, Country data automatically came after Pin code is entered",
						"blue");
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			actionUtil.error("City, State, Country data didn't came after Pin code is entered");
			actionUtil.fail("City, State, Country data didn't came after Pin code is entered");
			Assert.fail("City, State, Country data didn't came after Pin code is entered");

		}
	}

}

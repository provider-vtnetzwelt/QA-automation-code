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
 * Description: This class implements the methods for Quote Or Sales Order Page
 * 
 * @author Manish Kumar C D
 */
public class QuoteOrSalesOrder_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;

	public QuoteOrSalesOrder_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}

	/* Books Option */
	@FindBy(xpath = "//span[text()='Books']")
	private WebElement otnBooks;

	/* Quotes Sales Order Option */
	@FindBy(xpath = "//span[text()='Books']/parent::a/following::ul/li//a/div[contains(text(),'uote / Sales Order')]")
	private WebElement otnQuotesSalesOrder;

	/* Quote Sales Order Button */
	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']/span[contains(.,'Quote / Sales Order')]")
	private WebElement btnQuoteSalesOrder;

	/* Company GSTN Button */
	@FindBy(xpath = "//label[text()='Company GSTIN']/parent::span/parent::div//div/span/span")
	private WebElement txtCompanyGstn;

	/* Branch Button */
	@FindBy(xpath = "//label[text()='Branch']/parent::span/parent::div//div/span/span")
	private WebElement txtBranch;

	/* Category Button */
	@FindBy(xpath = "//label[text()='Category']/parent::span/parent::div//div/span/span")
	private WebElement txtCategory;

	/* Quote Sales Order Number Textfield */
	@FindBy(xpath = "//input[@placeholder='Quote / Sales Order Number']")
	private WebElement txtfieldQuoteSalesOrderNumber;

	/* Place of Supply Option */
	public WebElement otnPlaceofSupply(String placeofsupply) {
		String xpath = "//mat-option/span[contains(text(),'" + placeofsupply + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Place of Supply text */
	@FindBy(xpath = "//mat-select[@aria-label='Place of Supply']")
	private WebElement txtPlaceofSupply;

	/* Item Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[3]")
	private WebElement txtItem;

	/* Item Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[3]/div//input")
	private WebElement txtfieldItem;

	/* Item Option */
	public WebElement otnItem(String itemname) {
		String xpath = "//div[@role='listbox']/mat-option/span[contains(text(),'" + itemname + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Item Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[3]")
	private WebElement txtItem1;

	/* Item Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[3]/div//input")
	private WebElement txtfieldItem1;

	/* Item Option */
	public WebElement otnItem1(String itemname) {
		String xpath = "//div[@role='listbox']/mat-option/span[contains(text(),'" + itemname + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Quantity Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[10]")
	private WebElement txtQty;

	/* Quantity Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[10]/div//input")
	private WebElement txtfieldQty;

	/* Unit Price Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[15]")
	private WebElement txtUnitPrice;

	/* Quantity Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[10]")
	private WebElement txtQty1;

	/* Quantity Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[10]/div//input")
	private WebElement txtfieldQty1;

	/* Unit Price Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[15]")
	private WebElement txtUnitPrice1;

	/* Table data Values */
	public WebElement tableRowData(String item) {
		String xpath = "//span[contains(.,'" + item + "')]/ancestor::tr/td/span";
		return driver.findElement(By.xpath(xpath));
	}

	/* Table data Values */
	public WebElement tableRowData1(String item) {
		String xpath = "//span[contains(.,'" + item + "')]/ancestor::tr[2]/td/span";
		return driver.findElement(By.xpath(xpath));
	}

	/* Unit Price Text Field */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[15]/div//input")
	private WebElement txtfieldUnitPrice;

	/* Account Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[23]")
	private WebElement txtAccount;

	/* Unit Price Text Field */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[15]/div//input")
	private WebElement txtfieldUnitPrice1;

	/* Account Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[23]")
	private WebElement txtAccount1;

	/* Account Option */
	public WebElement otnAccount(String account) {
		String xpath = "//label[text()='Revenue Account']/parent::mat-optgroup/mat-option/span[contains(text(),'"
				+ account + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Account Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[23]//div/input")
	private WebElement txtfieldAccount;

	/* Account Option */
	public WebElement otnAccount1(String account) {
		String xpath = "//label[text()='Revenue Account']/parent::mat-optgroup/mat-option/span[contains(text(),'"
				+ account + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Account Textfield */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[23]//div/input")
	private WebElement txtfieldAccount1;

	/* Customer Option */
	public WebElement otnCustomer(String customername) {
		String xpath = "//mat-option/span[contains(text(),' " + customername + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Customer Textfield */
	@FindBy(xpath = "//label[text()='Customer *']/parent::span/parent::div/input")
	private WebElement txtCustomer;

	/* GST Rate Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[28]")
	private WebElement txtGstRate;

	/* GST Rate Textfield */
	@FindBy(xpath = "(//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all'])[4]")
	private WebElement txtfieldGstRate;

	/* Gst Rate Option */
	public WebElement otnGstRate(String gstrate) {
		String xpath = "(//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all'])[4]/parent::div/following::div/ul/li/span[text()='"
				+ gstrate + "']";
		return driver.findElement(By.xpath(xpath));
	}

	/* GST Rate Text */
	@FindBy(xpath = "//tbody[@class='ui-datatable-data ui-widget-content']/tr[2]/td[28]")
	private WebElement txtGstRate1;

	/* GST Rate Textfield */
	@FindBy(xpath = "(//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all'])[10]")
	private WebElement txtfieldGstRate1;

	/* Gst Rate Option */
	public WebElement otnGstRate2(String gstrate) {
		String xpath = "(//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all'])[4]/parent::div/following::div/ul/li/span[text()='"
				+ gstrate + "']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Quote Sales Order Confirmation Text */
	@FindBy(xpath = "//h2[text()='Quote/Sales Order']")
	private WebElement txtQuoteSalesOrder;

	/* Created Successfully Confirmation Text */
	@FindBy(xpath = "//div[text()='Created successfully']")
	private WebElement txtCreatedSuccessfully;

	/* Quote Sales Order Ok Button */
	@FindBy(xpath = "//div[text()='Created successfully']/parent::div/following::div/button[text()='OK']")
	private WebElement btnOkCreatedSuccessfully;

	/* Customer Name Link */
	public WebElement lnkCustomerName(String quotesalesordernumber) {
		String xpath = "//mat-row/mat-cell[contains(text(),'" + quotesalesordernumber
				+ "')]/parent::mat-row/mat-cell/a";
		return driver.findElement(By.xpath(xpath));
	}

	/* Sent Status Text */
	public WebElement txtStatusSent(String quotesalesordernumber) {
		String xpath = "//mat-row/mat-cell[contains(text(),'" + quotesalesordernumber
				+ "')]/parent::mat-row/mat-cell[contains(text(),'Sent')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Invoiced Status Text */
	public WebElement txtStatusInvoiced(String quotesalesordernumber) {
		String xpath = "//mat-row/mat-cell[contains(text(),'" + quotesalesordernumber
				+ "')]/parent::mat-row/mat-cell[contains(text(),'Invoiced')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Awaiting Receipt Status Text */
	public WebElement txtStatusAwaitingReceipt(String quotesalesordernumber) {
		String xpath = "//mat-row/mat-cell[contains(text(),'" + quotesalesordernumber
				+ "')]/parent::mat-row/mat-cell[contains(text(),'Awaiting Receipt')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Quote Number Text */
	public WebElement txtQuoteNumber(String quotesalesordernumber) {
		String xpath = "//h3[text()='Quote " + quotesalesordernumber + "']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Accepted Status Text */
	@FindBy(xpath = "//h4[contains(text(),'Accepted')]")
	private WebElement txtAcceptedStatus;

	/* Quote Sales Order Options Button */
	@FindBy(xpath = "//span[contains(text(),' Quote / Sales Order Options')]")
	private WebElement btnQuoteSalesOrderOptions;

	/* Quote Sales Order Options Option */
	public WebElement otnQuoteSalesOrderOptions(String salesorderoption) {
		String xpath = "//span[contains(text(),' Quote / Sales Order Options')]/parent::button/following::ul/li/a[contains(text(),'"
				+ salesorderoption + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Are You Sure That You Want To Perform This Action txt */
	@FindBy(xpath = "//div[contains(text(),'Are you sure')]")
	private WebElement txtAreYouSureThatYouWantToPerformThisAction;

	/* Are You Sure That You Want To Perform This Action Ok Button */
	@FindBy(xpath = "//div[contains(text(),'Are you sure')]/parent::div/following::div/button[text()='OK']")
	private WebElement btnOkAreYouSureThatYouWantToPerformThisAction;

	/* Are You Sure That You Want To Perform This Action Cancel Button */
	@FindBy(xpath = "//div[contains(text(),'Are you sure')]/parent::div/following::div/button[text()='Cancel']")
	private WebElement btnCancelAreYouSureThatYouWantToPerformThisAction;

	/* Updated Successfully Ok Button */
	@FindBy(xpath = "//div[contains(text(),'Updated successfully')]/parent::div/following::div/button[text()='OK']")
	private WebElement btnOkUpdatedSuccessfully;

	/* Updated Successfully Text */
	@FindBy(xpath = "//div[contains(text(),'Updated successfully')]")
	private WebElement txtUpdatedSuccessfully;

	/* Quote Sales Order Page */
	@FindBy(xpath = "//h3[contains(.,'Quote / Sales Order')]")
	private WebElement txtheaderQuoteSalesOrder;

	/* Create Sales Invoice Page */
	@FindBy(xpath = "//h3[contains(.,' Create Sales Invoice')]")
	private WebElement txtheaderCreateSalesInvoice;

	/* Invoice Type Option */
	public WebElement txtQuoteNumberHeader(String ordernumber) {
		String xpath = "//h3[contains(.,'Quote " + ordernumber + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Create Quote Sales Order Page */
	@FindBy(xpath = "//h3[contains(.,'Create Quote / Sales Order')]")
	private WebElement txtheaderCreateQuoteSalesOrder;

	/* Due Date Textfield */
	@FindBy(xpath = "//label[text()='Due Date']/parent::span/parent::div/input")
	private WebElement txtfieldDueDate;

	@FindBy(xpath = "//label[text()='Expiry Date']/parent::span/parent::div/input")
	private WebElement txtfieldExpiryDate;

	/* Invoice Number Text */
	@FindBy(xpath = "//label[text()='Invoice Number']/parent::span/parent::div/input")
	private WebElement txtfieldInvoiceNumber;

	/* Invoice Type Option */
	public WebElement otnInvoiceType(String invoicetype) {
		String xpath = "//div[@class='cdk-overlay-pane']//mat-option/span[contains(text(),' " + invoicetype + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Invoice Type Dropdown */
	@FindBy(xpath = "//span[text()='Invoice Type']/parent::div/ancestor::mat-select")
	private WebElement ddInvoiceType;

	/* Approve Button */
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement btnApprove;

	/* Send Button */
	@FindBy(xpath = "//span[text()='Send']")
	private WebElement btnSend;

	/* Invoice Created Successfully Ok Button */
	@FindBy(xpath = "//div[text()='Created successfully']/parent::div/following::div/button[text()='OK']")
	private WebElement btnOkInvoiceCreatedSuccessfully;

	/* Invoices Header Text */
	@FindBy(xpath = "//h3[contains(.,'Invoices')]")
	private WebElement txtInvoicesHeader;

	/* Billing address textbox */
	@FindBy(xpath = "//label[text()='Address']/ancestor::div/input")
	private WebElement tbBillingAddress;

	/* Pin code textbox */
	@FindBy(xpath = "//label[text()='Pin Code']/ancestor::div/input")
	private WebElement tbPinCode;

	/* State Text box */
	@FindBy(css = "input[placeholder='State']")
	private WebElement tbState;

	/* Country Text box */
	@FindBy(css = "input[placeholder='Country']")
	private WebElement tbCountry;

	/* City Text box */
	@FindBy(css = "input[placeholder='City']")
	private WebElement tbCity;

	/* Save button */
	@FindBy(xpath = "//div[@class='modal-body']/descendant::span[text()='Save']")
	private WebElement btnSave;

	/* Billing address tooltip */
	@FindBy(xpath = "//b[text()='Billing Address']/parent::div/button")
	private WebElement billingAddressTooltip;

	/* Quote / Sales Order Number Text */
	public WebElement otnQuote(String ordernumber) {
		String xpath = "//b[text()='Quote / Sales Order Number']/parent::label/following::p[text()='" + ordernumber
				+ "']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Pin code */
	private WebElement selectPincode(String pinCode) {
		String xpath = "//span[contains(text(),'" + pinCode + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	/**
	 * Description: Method to Click on Quotes Sales Order Option
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkQuotesSalesOrderOption() {
		try {
			actionUtil.waitForElement(otnBooks, "Books Option");
			actionUtil.actionMouseOver(otnBooks, "Books Option");
			actionUtil.waitForElement(otnQuotesSalesOrder, "Quotes Sales Order Option");
			actionUtil.clickOnElement(otnQuotesSalesOrder, "Quotes Sales Order Option");
			String expected = "Quote / Sales Order";
			actionUtil.validateText(expected, txtheaderQuoteSalesOrder, "Quotes Sales Order Page",
					"Quotes Sales Order Page is displayed", "Quotes Sales Order Page is not displayed", "blue");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select Quotes Sales Order Option");
			Assert.fail("Unable to select Quotes Sales Order Option");
		}
	}

	/**
	 * Description: Method to Click on Add Quotes Sales Order Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkAddQuotesSalesOrderButton() {
		try {
			actionUtil.waitForElement(btnQuoteSalesOrder, "Quotes Sales Order Add Button");
			actionUtil.clickOnElement(btnQuoteSalesOrder, "Quotes Sales Order Add Button");
			String expected = "Create Quote / Sales Order";
			actionUtil.validateText(expected, txtheaderCreateQuoteSalesOrder, "Create Quote Sales Order Page",
					"Create Quote Sales Order Page is displayed", "Create Quote Sales Order Page is not displayed",
					"blue");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Quotes Sales Order Add Button");
			Assert.fail("Unable to on Quotes Sales Order Add Button");
		}
	}

	/**
	 * Description: Method to Enter the Order Number into the Quote Sales Order
	 * Number Textfield
	 * 
	 * @param ordernumber
	 * @author Manish Kumar C D
	 */
	public synchronized void setQuoteSalesOrderNumberTextfield(String ordernumber) {
		try {
			actionUtil.waitForElement(txtfieldQuoteSalesOrderNumber, "Quotes Sales Order Number Textfield");
			actionUtil.typeText(txtfieldQuoteSalesOrderNumber, ordernumber, "Quotes Sales Order Number Textfield");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to type Order Number into Quotes Sales Order Number Textfield");
			Assert.fail("Unable to type Order Number into Quotes Sales Order Number Textfield");
		}
	}

	/**
	 * Description: Method to Enter the duedate into the Due Date Textfield
	 * 
	 * @param duedate
	 * @author Manish Kumar C D
	 */
	public synchronized void setDueDateTextfield(String duedate) {
		try {
			actionUtil.waitForElement(txtfieldDueDate, "Due Date Textfield");
			actionUtil.typeText(txtfieldDueDate, duedate, "Due Date Textfield");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to type Due date into Due Date Textfield");
			Assert.fail("Unable to type Due date into Due Date Textfield");
		}
	}

	/**
	 * Description: Method to Enter the expirydate into the Expiry Date
	 * Textfield
	 * 
	 * @param duedate
	 * @author Manish Kumar C D
	 */
	public synchronized void setExpiryDateTextfield(String expirydate) {
		try {
			actionUtil.waitForElement(txtfieldExpiryDate, "Expiry Date Textfield");
			actionUtil.typeText(txtfieldExpiryDate, expirydate, "Expiry Date Textfield");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to type expiry date into Expiry Date Textfield");
			Assert.fail("Unable to type expiry date into Expiry Date Textfield");
		}
	}

	/**
	 * Description: Method to Enter the customername into Customer Textfield
	 * 
	 * @param customername
	 * @param contactid
	 * @author Manish Kumar C D
	 */
	public synchronized void setCustomerName(String customername) {
		try {
			actionUtil.waitForElement(txtCustomer, "Customer Text");
			actionUtil.clickOnElement(txtCustomer, "Customer Text");
			// actionUtil.typeText(txtCustomer, customername, "Customer Text");
			actionUtil.waitForElement(otnCustomer(customername), "Customer Option");
			actionUtil.clickOnElement(otnCustomer(customername), "Customer Option");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select " + customername + " Option from Customer Dropdown");
			Assert.fail("Unable to select " + customername + " Option from Customer Dropdown");
		}
	}

	/**
	 * Description: Method to Enter the placeofsupply into Place of Supply
	 * Textfield
	 * 
	 * @param placeofsupply
	 * @author Manish Kumar C D
	 */
	public synchronized void setPlaceOfSupply(String placeofsupply) {
		try {
			actionUtil.waitForElement(txtPlaceofSupply, "Place Of Supply Text");
			actionUtil.clickOnElement(txtPlaceofSupply, "Place Of Supply Text");
			actionUtil.waitForElement(otnPlaceofSupply(placeofsupply), "Place Of Supply Option");
			actionUtil.clickOnElement(otnPlaceofSupply(placeofsupply), "Place Of Supply Option");
			String actualPlaceofSupply = txtPlaceofSupply.getText();
			String expectedPlaceofSupply = placeofsupply;
			if (expectedPlaceofSupply.equals(actualPlaceofSupply)) {
				actionUtil.info("" + expectedPlaceofSupply + " is diplayed");
			}

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select " + placeofsupply + " Option from Place of Supply Dropdown");
			Assert.fail("Unable to select " + placeofsupply + " Option from Place of Supply Dropdown");
		}
	}

	/**
	 * Description: Method to Enter the item into Item Textfield
	 * 
	 * @param item
	 * @author Manish Kumar C D
	 */
	public synchronized void setItemTextfield(String item, String itemname) {
		try {
			actionUtil.waitForElement(txtItem, "Item Text");
			actionUtil.scrollToElement(txtItem, "Item Text");
			actionUtil.clickOnElement(txtItem, "Item Text");
			actionUtil.waitForElement(txtfieldItem, "Item Textfield");
			actionUtil.typeText(txtfieldItem, item, "Item Textfield");
			actionUtil.poll(2000);
			actionUtil.clickOnElement(otnItem(itemname), "Item Option");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select " + item + " Option from Item Dropdown");
			Assert.fail("Unable to select " + item + " Option from Item Dropdown");
		}
	}

	/**
	 * Description: Method to validate Item Text
	 * 
	 * @param item
	 * @author Manish Kumar C D
	 */
	public synchronized void validateItemTextfield(String item) {
		try {
			String actualItem = txtItem.getText();
			String expectedItem = item;
			if (actualItem.equals(expectedItem)) {
				actionUtil.info("" + expectedItem + " is displayed");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate " + item + " with actual item ");
			Assert.fail("Unable to validate " + item + " with actual item ");
		}
	}

	/**
	 * Description: Method to Enter the qty into Qty Textfield
	 * 
	 * @param qty
	 * @author Manish Kumar C D
	 */
	public synchronized void setQtyTextfield(String qty) {
		try {
			actionUtil.waitForElement(txtQty, "Qty Text");
			actionUtil.clickOnElement(txtQty, "Qty Text");
			actionUtil.waitForElement(txtfieldQty, "Qty Textfield");
			actionUtil.typeText(txtfieldQty, qty, "Qty Textfield");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter " + qty + " into Qty Textfield ");
			Assert.fail("Unable to enter " + qty + " into Qty Textfield");
		}
	}

	/**
	 * Description: Method to validate Qty Text
	 * 
	 * @param item
	 * @author Manish Kumar C D
	 */
	public synchronized void validateQtyTextfield(String qty) {
		try {
			String actualQty = txtQty.getText();
			String expectedQty = qty;
			if (actualQty.equals(actualQty)) {
				actionUtil.info("" + expectedQty + " is displayed");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate " + qty + " with actual qty");
			Assert.fail("Unable to validate " + qty + " with actual qty ");
		}
	}

	/**
	 * Description: Method to Enter the unitprice into Unit Price Textfield
	 * 
	 * @param unitprice
	 * @author Manish Kumar C D
	 */
	public synchronized void setUnitPriceTextfield(String unitprice) {
		try {
			actionUtil.waitForElement(txtUnitPrice, "UnitPrice Text");
			actionUtil.clickOnElement(txtUnitPrice, "UnitPrice Text");
			actionUtil.waitForElement(txtfieldUnitPrice, "UnitPrice Textfield");
			actionUtil.typeText(txtfieldUnitPrice, unitprice, "UnitPrice Textfield");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter " + unitprice + " into Unit Price Textfield ");
			Assert.fail("Unable to enter " + unitprice + " into Unit Price Textfield");
		}
	}

	/**
	 * Description: Method to validate unitprice Text
	 * 
	 * @param item
	 * @author Manish Kumar C D
	 */
	public synchronized void validateUnitPriceTextfield(String unitprice) {
		try {
			String actualUnitPrice = txtUnitPrice.getText();
			String expectedUnitPrice = unitprice;
			if (actualUnitPrice.equals(actualUnitPrice)) {
				actionUtil.info("" + expectedUnitPrice + " is displayed");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate " + unitprice + " with actual unitprice");
			Assert.fail("Unable to validate " + unitprice + " with actual unitprice ");
		}
	}

	/**
	 * Description: Method to Enter the account into Account Textfield
	 * 
	 * @param account
	 * @author Manish Kumar C D
	 */
	public synchronized void setAccountTextfield(String account) {
		try {
			actionUtil.waitForElement(txtAccount, "Account Text");
			actionUtil.clickOnElement(txtAccount, "Account Text");
			actionUtil.waitForElement(txtfieldAccount, "Account Textfield");
			actionUtil.clickOnElement(otnAccount(account), "Account Option");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter " + account + " into Account Textfield ");
			Assert.fail("Unable to enter " + account + " into Account Textfield");
		}
	}

	/**
	 * Description: Method to Enter the gstrate into GST Rate Textfield
	 * 
	 * @param gstrate
	 * @author Manish Kumar C D
	 */
	public synchronized void setGstRateTextfield(String gstrate) {
		try {
			actionUtil.waitForElement(txtGstRate, "GST Rate Text");
			actionUtil.doubleClickOnElement(txtGstRate, "GST Rate Text");
			actionUtil.waitForElement(txtfieldGstRate, "GST Rate Textfield");
			actionUtil.typeText(txtfieldGstRate, gstrate, "GST Rate Textfield");
			actionUtil.clickOnElement(otnGstRate(gstrate), "GST Rate Option");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter " + gstrate + " into GST Rate Textfield ");
			Assert.fail("Unable to enter " + gstrate + " into GST Rate Textfield");
		}
	}

	/**
	 * Description: Method to validate GstRate Text
	 * 
	 * @param item
	 * @author Manish Kumar C D
	 */
	public synchronized void validateGstRateTextfield(String gstrate) {
		try {
			String actualGstRate = txtUnitPrice.getText();
			String expectedGstRate = gstrate;
			if (actualGstRate.equals(actualGstRate)) {
				actionUtil.info("" + expectedGstRate + " is displayed");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate " + gstrate + " with actual GstRate");
			Assert.fail("Unable to validate " + gstrate + " with actual GstRate ");
		}
	}

	/**
	 * Description: Method to Click on Send Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkSendButton() {
		try {
			actionUtil.waitForElement(btnSend, "Send Button");
			actionUtil.clickOnElement(btnSend, "Send Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Send Button");
			Assert.fail("Unable to on Send Button");
		}
	}

	/**
	 * Description: Method to Click on Quote Sales Order Ok Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkQuoteSalesOrderOkButton() {
		try {
			String quoteSalesOrder = txtQuoteSalesOrder.getText();
			String createdSuccessfully = txtCreatedSuccessfully.getText();
			String expected = "Created successfully";
			if (expected.equals(createdSuccessfully)) {
				actionUtil.validationinfo("" + quoteSalesOrder + "" + createdSuccessfully + " message is displayed",
						"blue");
			}
			actionUtil.waitForElement(btnOkCreatedSuccessfully, "Quote Sales Order Ok Button");
			actionUtil.clickOnElement(btnOkCreatedSuccessfully, "Quote Sales Order Ok Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Quote Sales Order Ok Button");
			Assert.fail("Unable to click on Quote Sales Order Ok Button");
		}
	}

	/**
	 * Description: Method to Click on Customer Name Link
	 * 
	 * @param ordernumber
	 * @param sentstatus
	 * @author Manish Kumar C D
	 */
	public synchronized void clkCustomerNameLink(String ordernumber, String sentstatus) {
		try {
			actionUtil.waitForElement(txtStatusSent(ordernumber), "Sent Status Text");
			actionUtil.validateText(sentstatus, txtStatusSent(ordernumber), "Sent Status Text",
					"Sent Status message is displayed in Quote/Sales Order listing Page",
					"Sent Status message is not displayed in Quote/Sales Order listing Page", "green");
			actionUtil.waitForElement(lnkCustomerName(ordernumber), "Customer Name Link");
			actionUtil.clickOnElement(lnkCustomerName(ordernumber), "Customer Name Link");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Customer Name Link");
			Assert.fail("Unable to click on Customer Name Link");
		}
	}

	/**
	 * Description: Method to Click on Quote Sales Order Options Button
	 * 
	 * @param salesorderoption
	 * @author Manish Kumar C D
	 */
	public synchronized void clkQuoteSalesOrderOptionsButton(String salesorderoption) {
		try {
			actionUtil.waitForElement(btnQuoteSalesOrderOptions, "Quote Sales Order Options Button");
			actionUtil.clickOnElement(btnQuoteSalesOrderOptions, "Quote Sales Order Options Button");
			actionUtil.waitForElement(otnQuoteSalesOrderOptions(salesorderoption), "Quote Sales Order Options Option");
			actionUtil.clickOnElement(otnQuoteSalesOrderOptions(salesorderoption), "Quote Sales Order Options Option");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on " + salesorderoption + " under Quote Sales Order Options Button");
			Assert.fail("Unable to  click on " + salesorderoption + " under Quote Sales Order Options Button");
		}
	}

	/**
	 * Description: Method to Click on Are You Sure That You Want To Perform
	 * This Action Ok Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkAreYouSureThatYouWantToPerformThisActionOkButton() {
		try {
			actionUtil.waitForElement(btnOkAreYouSureThatYouWantToPerformThisAction,
					"Are You Sure That You Want To Perform This Action Ok Button");
			actionUtil.validateisElementDisplayed(btnOkAreYouSureThatYouWantToPerformThisAction,
					"Are You Sure That You Want To Perform This Action Ok Button",
					"Are You Sure That You Want To Perform This Action Ok Button is Displayed",
					"Are You Sure That You Want To Perform This Action Ok Button is not displayed", "blue");
			actionUtil.validateisElementDisplayed(btnCancelAreYouSureThatYouWantToPerformThisAction,
					"Are You Sure That You Want To Perform This Action Cancel Button",
					"Are You Sure That You Want To Perform This Action Cancel Button is Displayed",
					"Are You Sure That You Want To Perform This Action Cancel Button is not displayed", "blue");
			actionUtil.clickOnElement(btnOkAreYouSureThatYouWantToPerformThisAction,
					"Are You Sure That You Want To Perform This Action Ok Button");

			String quotesalesorder = txtQuoteSalesOrder.getText();
			String updatedsuccessfully = txtUpdatedSuccessfully.getText();
			String expectedupdatedsuccessfully = "Updated successfully";
			if (expectedupdatedsuccessfully.equals(updatedsuccessfully)) {
				actionUtil.validationinfo("" + quotesalesorder + "" + updatedsuccessfully + " message is displayed",
						"blue");
			}
			actionUtil.waitForElement(btnOkUpdatedSuccessfully, "Updated Successfully Button");
			actionUtil.clickOnElement(btnOkUpdatedSuccessfully, "Updated Successfully Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Are You Sure That You Want To Perform This Action Ok Button");
			Assert.fail("Unable to  click on Are You Sure That You Want To Perform This Action Ok Button");
		}
	}

	/**
	 * Description: Method to validate Quote Order Number Header
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void validateQuoteOrderNumberHeader(String ordernumber) {
		try {
			String actualtext = "Quote " + ordernumber + "";
			actionUtil.validateText(actualtext, txtQuoteNumberHeader(ordernumber), "Quote Number Header Text",
					"Quote " + ordernumber + " Page is displayed", "Quote " + ordernumber + " Page is not displayed",
					"blue");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate Quote Order Number Header");
			Assert.fail("Unable to  validate Quote Order Number Header");
		}
	}

	/**
	 * Description: Method to validate Accepted Status
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void validateAcceptedStatus() {
		try {
			String actualtext = "Accepted";
			actionUtil.validateText(actualtext, txtAcceptedStatus, "Accepted StatusText",
					"Status of the Quote/Sales Order is displayed as Accepted ",
					"Status of the Quote/Sales Order is not displayed ", "blue");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate Status of the Quote/Sales Order");
			Assert.fail("Unable to  validate Status of the Quote/Sales Order");
		}
	}

	/**
	 * Description: Method to validate Create Sales Invoice Header
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void validateCreateSalesInvoiceHeader() {
		try {
			String actualtext = "Create Sales Invoice";
			actionUtil.validateText(actualtext, txtheaderCreateSalesInvoice, "Create Sales Invoice Header Text",
					"Create Sales Invoice Page is displayed", "Create Sales Invoice Page is not displayed", "blue");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate Quote Order Number Header");
			Assert.fail("Unable to  validate Quote Order Number Header");
		}
	}

	/**
	 * Description: Method to enter invoicenumber into Invoice Number Textfield.
	 * 
	 * @param invoicenumber
	 * @author Manish Kumar C D
	 */
	public synchronized void setInvoiceNumberTextfield(String invoicenumber) {
		try {
			actionUtil.waitForElement(txtfieldInvoiceNumber, "Invoice Number Textfield");
			actionUtil.typeText(txtfieldInvoiceNumber, invoicenumber, "Invoice Number Textfield");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to type into Invoice Number Textfield");
			Assert.fail("Unable to type into Invoice Number Textfield");
		}
	}

	/**
	 * Description: Method to Click on InvoiceType from Invoice Type Dropdown.
	 * 
	 * @param invoicetype
	 * @author Manish Kumar C D
	 */
	public synchronized void clkInvoiceTypeText(String invoicetype) {
		try {
			actionUtil.waitForElement(ddInvoiceType, "Invoice Type Dropdown");
			actionUtil.clickOnElement(ddInvoiceType, "Invoice Type Dropdown");

			actionUtil.waitForElement(otnInvoiceType(invoicetype), "Invoice Type Option");
			actionUtil.clickOnElement(otnInvoiceType(invoicetype), "Invoice Type Option");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select " + invoicetype + " from Invoice Type Option");
			Assert.fail("Unable to  select " + invoicetype + " from Invoice Type Option");
		}
	}

	/**
	 * Description: Method to Click on Approve Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkApproveButton() {
		try {
			actionUtil.waitForElement(btnApprove, "Approve Button");
			actionUtil.clickOnElement(btnApprove, "Approve Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Approve Button");
			Assert.fail("Unable to  click on Approve Button");
		}
	}

	/**
	 * Description: Method to Click on Invoice Created Successfully Ok Button
	 * 
	 * @author Manish Kumar C D
	 */
	public synchronized void clkInvoiceCreatedSuccessfullyOkButton() {
		try {
			actionUtil.validateisElementDisplayed(btnOkInvoiceCreatedSuccessfully,
					"Invoice Created Successfully Ok Button", "Invoice Created Successfully Ok Button is displayed",
					"Invoice Created Successfully Ok Button is not displayed", "blue");
			actionUtil.waitForElement(btnOkInvoiceCreatedSuccessfully, "Invoice Created Successfully Ok Button");
			actionUtil.clickOnElement(btnOkInvoiceCreatedSuccessfully, "Invoice Created Successfully Ok Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Invoice Created Successfully Ok Button");
			Assert.fail("Unable to  click on Invoice Created Successfully Ok Button");
		}
	}

	/**
	 * Description: Method to validate Awaiting Status Text
	 * 
	 * @param ordernumber
	 * @param awaitingreceiptstatus
	 * @author Manish Kumar C D
	 */
	public synchronized void validateAwaitingStatusText(String ordernumber, String awaitingreceiptstatus) {
		try {
			// String invoicesUrl =
			// "https://inaccounts.hostbooks.com/accounts-books/invoices";

			String expectedText = "Invoices";
			actionUtil.validateText(expectedText, txtInvoicesHeader, "Invoice Header Text",
					"Create Sales Invoice Page is displayed", "Create Sales Invoice Page is not displayed", "blue");
			actionUtil.waitForElement(txtStatusAwaitingReceipt(ordernumber), "Awaiting Receipt Status Text");

			String expectedStatus = awaitingreceiptstatus;
			actionUtil.validateText(expectedStatus, txtStatusAwaitingReceipt(ordernumber),
					"Awaiting Status Receipt Text", "Awaiting Status Receipt Status is displayed",
					"Awaiting Status Receipt Status is not displayed", "green");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate Awaiting Receipt Status");
			Assert.fail("Unable to validate Awaiting Receipt Status");
		}
	}

	/**
	 * Description: Method to Click on Billing address
	 * 
	 * @author Manish Kumar C D
	 * 
	 */

	public synchronized void clkBillingaddressTooltip() {
		try {
			actionUtil.waitForElement(billingAddressTooltip, "Billing address tool tip");
			actionUtil.clickOnElementUsingJS(billingAddressTooltip, "Billing address tool tip");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on Billing address tool tip");
			Assert.fail("Unable to Click on Billing address tool tip");
		}

	}

	/**
	 * Description: Method to Enter Billling address
	 * 
	 * @author Manish Kumar C D
	 * @param address
	 * @param pinCode
	 * 
	 */

	public synchronized void setBillingAddress(String address, String pinCode) {

		try {
			actionUtil.waitForElement(tbBillingAddress, "BillingAddress");
			actionUtil.clearText(tbBillingAddress, "BillingAddress");
			actionUtil.typeText(tbBillingAddress, address, "BillingAddress");
			actionUtil.waitForElement(tbPinCode, "Pin code");
			actionUtil.clearText(tbPinCode, "Pin code");
			actionUtil.typeText(tbPinCode, pinCode, "Pin code");
			actionUtil.poll(2000);
			actionUtil.clickOnElement(selectPincode(pinCode), "Pin code option");
			// tbPinCode.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to fill the Billing address");
			Assert.fail("Unable to fill the Billing address");
		}

	}

	/**
	 * Description: Method to Click on save button
	 * 
	 * @author Manish Kumar C D
	 * 
	 * 
	 */

	public synchronized void clkSaveButton() {

		try {
			actionUtil.waitForElement(btnSave, "Save Button");
			actionUtil.clickOnElement(btnSave, "Save Button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on save button");
			Assert.fail("Unable to Click on save button");
		}

	}


	/**
	 * Description: Validates Customer Details
	 * 
	 * @author Manish Kumar C D
	 * @param customerData
	 * @param address
	 */

	public synchronized void validateCustomerDetail(String[] expectedDetails) {
		try {

			WebElement textPlaceofSupply = driver.findElement(
					By.xpath("//label[text()='Place of Supply']/parent::span/parent::div/mat-select//span/span"));
			WebElement textCompanyGSTIN = driver
					.findElement(By.xpath("//label[text()='Company GSTIN']/parent::span/parent::div//span/span"));
			WebElement textBranch = driver
					.findElement(By.xpath("//label[text()='Branch']/parent::span/parent::div//span/span"));
			WebElement textCategory = driver
					.findElement(By.xpath("//label[text()='Category']/parent::span/parent::div//span/span"));

			String companyGstinText = textCompanyGSTIN.getText();
			String placeofSupplyText = textPlaceofSupply.getText();
			String branchText = textBranch.getText();
			String categoryText = textCategory.getText();

			List<String> actualData = new ArrayList<String>();
			List<String> expectedData = new ArrayList<String>();

			for (String details : expectedDetails) {
				expectedData.add(details);
			}
			expectedData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");

			String[] expectedArray = new String[expectedData.size()];
			expectedArray = expectedData.toArray(expectedArray);

			actualData.add(companyGstinText);
			actualData.add(branchText);
			actualData.add(categoryText);
			actualData.add(placeofSupplyText);
			while (actualData.contains(""))
				actualData.remove("");
			actualData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");
			
			System.out.println(actualData);
			System.out.println(expectedData);

			String[] actualArray = new String[actualData.size()];
			actualArray = actualData.toArray(actualArray);
			System.out.println(actualData.size());
			System.out.println(expectedData.size());
			
			String[][] twoDArray = null;
			twoDArray = new String[][] {
					{ "", "<font size=\"2\"class=\"label white-text orange\">Company GSTIN</font>",
							"<font size=\"2\"class=\"label white-text orange\">Branch</font>",
							"<font size=\"2\"class=\"label white-text orange\">Category</font>",
							"<font size=\"2\"class=\"label white-text orange\">Place of Supply</font>"},
					expectedArray, actualArray };
			actionUtil.createTable(twoDArray);

			if (actualData.containsAll(expectedData)) {
				actionUtil.validationinfo("Customer details is automapped from Quote/Sales Order", "green");
				actionUtil.info("Customer details is automapped from Quote/Sales Order");
			} else {
				actionUtil.error("Customer data didn't match with given fields in Item Table");
				actionUtil.fail("Customer data didn't match with given fields in Item Table");
			}

		} catch (Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to validate Customer details from Quote/Sales Order");
			Assert.fail("Unable to validate Customer details from Quote/Sales Order");
		}
	}

	/**
	 * Description: Method to convert decimal to number
	 * 
	 * @author vikas
	 * @param number
	 * @return
	 */
	public static String digit(String number) {
		String num = number.replaceAll(",", "");

		return num.substring(0, num.length() - 3);

	}
	/**
	 * Description: Method to validate Line Item details in Table
	 * 
	 * @author Manish Kumar C D
	 * @param contactName
	 * @param expectedDetails
	 */
	public synchronized void validateLineItem(String item, String[] expectedDetails) {
		try {
			List<WebElement> txtDetails = driver.findElements(By.xpath(
					"//span[contains(.,'" + item + "')]/ancestor::tr/td/span[@class='ui-cell-data ng-star-inserted']"));

			List<String> actualData = new ArrayList<String>();
			List<String> expectedData = new ArrayList<String>();

			for (String details : expectedDetails) {
				expectedData.add(details);
			}

			expectedData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");

			String[] expectedArray = new String[expectedData.size()];
			expectedArray = expectedData.toArray(expectedArray);

			for (WebElement text : txtDetails) {
				if (text.getText().trim().equals("") || text.getText().trim().equals("[^a-zA-Z0-9]")) {
				} else {
					actualData.add(text.getText().split("\\.")[0].replace(",", ""));

				}

			}

			while (actualData.contains(""))
				actualData.remove("");
			actualData.add(0, "<font size=\"2\"color=\"yellow\">Expected/Actual</font>");

			actualData.remove(12);
			actualData.remove(11);
			actualData.remove(10);
			actualData.remove(9);
			actualData.remove(7);
			actualData.remove(4);
			actualData.remove(1);
			actualData.add(5, actualData.get(5).replace(" ", ""));
			actualData.remove(6);

			System.out.println(actualData);
			System.out.println(expectedData);

			String[] actualArray = new String[actualData.size()];
			actualArray = actualData.toArray(actualArray);
			System.out.println(actualData.size());
			System.out.println(expectedData.size());
			String[][] twoDArray = null;
			twoDArray = new String[][] {
					{ "", "<font size=\"2\"class=\"label white-text orange\">Item</font>",
							"<font size=\"2\"class=\"label white-text orange\">Quantity</font>",
							"<font size=\"2\"class=\"label white-text orange\">Unit Price</font>",
							"<font size=\"2\"class=\"label white-text orange\">Account</font>",
							"<font size=\"2\"class=\"label white-text orange\">GST Rate</font>", },
					expectedArray, actualArray };
			actionUtil.createTable(twoDArray);

			if (actualData.containsAll(expectedData)) {
				actionUtil.validationinfo("Line Item details is automapped from Quote/Sales Order", "green");
				actionUtil.info("Line Item details is automapped from Quote/Sales Order");
			} else {
				actionUtil.error("Items data didn't match with given fields in Item Table");
				actionUtil.fail("Items data didn't match with given fields in Item Table");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to validate contact details in All Contacts listing table");
			Assert.fail("Unable to validate contact details in All Contacts listing table");
		}

	}

}

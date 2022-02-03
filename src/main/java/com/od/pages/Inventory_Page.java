package com.od.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.od.util.WebActionUtil;

/**
 * Description: This class implements the methods for Inventory Page
 * 
 * @author vikas
 */
public class Inventory_Page {

		public WebDriver driver;
		public WebActionUtil actionUtil;
		public long ETO = 30;

		public Inventory_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.actionUtil = actionUtil;
			this.ETO = ETO;
		}
	/* Add Inventory Button */
	@FindBy(xpath = "(//button[@color='primary']/span)[2]")	
	private WebElement btnAddInventory;
	
	/* Inventory Items text */
	@FindBy(xpath = "//div[text()='Inventory Items']")	
	private WebElement txtInventoryItems;
	
	/* Product/Service information popup text */
	@FindBy(xpath = "//div[@class='modal-content']/div/h4")
	private WebElement txtInformationPopup;
	
	/* Inventory link */
	@FindBy(xpath = "//span/descendant::b[text()='Inventory']")
	private WebElement lnkInventory;
	
	/* Item/SKU Code text field */
	@FindBy(xpath = "//input[@placeholder='Item/SKU Code']")
	private WebElement tbItemCode;
	
	/* Name of Product text field */
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement tbNameOfProduct;
	
	/* Unit Of Measurement text field */
	@FindBy(xpath = "//label[text()='(none)']")
	private WebElement tbUnitOfMeasurement;
	
	/* Method to select unit of measurement */
	public WebElement clkUnitOfMeasurement(String unitOfMeasurement)
	{
		return driver.findElement(By.xpath("//span[text()='"+unitOfMeasurement+"']"));
	}
	
	/* HSN/SAC Code drop down */
	@FindBy(xpath = "//input[contains(@placeholder,'SAC Code')]")
	private WebElement ddHSNSACCode;
	
	/* Method to select HSN/SAC Code from drop down */
	public WebElement selectHSNSACCode(String hSNSACCode)
	{
		return driver.findElement(By.xpath("(//span[contains(text(),'"+hSNSACCode+"')])[1]"));
	}
	
	/* Inventory Method drop down */
	@FindBy(xpath = "//mat-select[@placeholder='Inventory Method']")
	private WebElement ddInventoryMethod;
	
	/* Method to select Inventory method from drop down */
	public WebElement selectInventoryMethod(String inventoryMethod)
	{
		return driver.findElement(By.xpath("//span[text()=' "+inventoryMethod+" ']"));
	}
	
	/* Purchase Account text field*/ 
	@FindBy(xpath = "//input[@placeholder='Purchase Account']")
	private WebElement tbPurchaseAccount;
	
	/* Purchase Price/Rate text field*/ 
	@FindBy(xpath = "//input[@placeholder='Purchase Price/Rate']")
	private WebElement tbPurchasePrice;
	
	/* Purchase GST Rate drop down */ 
	@FindBy(xpath = "//span[contains(text(),'I Purchase this Product/Service')]/ancestor::div[@class='row']/descendant::span[text()='GST Rate']")
	private WebElement ddPurchaseGSTRate;
	
	/* Method to select GST Rate from drop down */
	public WebElement selectPurchaseGSTRate(String gstRate)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'"+gstRate+"')]"));
	}
	
	/* Cess Amount text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Purchase this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Cess Amount (optional)']")
	private WebElement tbPurchaseCessAmount;
	
	/* Discount (%) text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Purchase this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Discount (%)']")
	private WebElement tbPurchaseDiscount;
	
	/* Expiry Date text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Purchase this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Expiry Date']")
	private WebElement tbPurchaseExpiryDate;
	
	/* MRP text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Purchase this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='MRP']")
	private WebElement tbPurchaseMRP;
	
	/* Purchases Description text area */
	@FindBy(xpath = "//textarea[@placeholder='Purchases Description (for my suppliers)']")
	private WebElement tbAreaPurchasesDescriptions;
	
	
	/* Sales Price/Rate text field*/ 
	@FindBy(xpath = "//input[@placeholder='Sales Price/Rate']")
	private WebElement tbSalesPrice;
	
	/* Sell GST Rate drop down */ 
	@FindBy(xpath = "//span[contains(text(),'I Sell this Product/Service')]/ancestor::div[@class='row']/descendant::span[text()='GST Rate']")
	private WebElement ddSellGSTRate;
	
	/* Method to select GST Rate from drop down */
	public WebElement selectSellGSTRate(String gstRate)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'"+gstRate+"')]"));
	}
	
	/* Cess Amount text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Sell this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Cess Amount (optional)']")
	private WebElement tbSellCessAmount;
	
	/* Discount (%) text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Sell this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Discount (%)']")
	private WebElement tbSellDiscount;
	
	/* Expiry Date text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Sell this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='Expiry Date']")
	private WebElement tbSellExpiryDate;
	
	/* MRP text field */ 
	@FindBy(xpath = "//span[contains(text(),'I Sell this Product/Service')]/ancestor::div[@class='row']/descendant::input[@placeholder='MRP']")
	private WebElement tbSellMRP;
	
	/* Sales Description text area */
	@FindBy(xpath = "//textarea[@placeholder='Sales Description (for my customers)']")
	private WebElement tbAreaSalesDescriptions;
	
	/* Opening Stock check box*/
	@FindBy(xpath = "//span[text()='Opening Stock']")
	private WebElement cbOpeningStock;
	
	/* Quantity In Hand text field */
	@FindBy(xpath = "//input[@placeholder='Quantity in Hand']")
	private WebElement tbQuantityInHand;
	
	/* Cost Amount text field */
	@FindBy(xpath = "//input[@placeholder='Cost Amount']")
	private WebElement tbCostAmount;
	
	/* Item Notes text area */
	@FindBy(xpath = "//textarea[@placeholder='Item Notes']")
	private WebElement tbAreaItemNotes;
	
	/* Item Notes text area */
	@FindBy(xpath = "//div[text()='Item is added successfully.']")
	private WebElement txtInventoryAddedSuccessMessage;
	
	/* Ok button */
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement btnOk;
	
	/* Save button */
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement btnSave;
	
	/* Unit Of Measurment Search text box */
	@FindBy(xpath = "//div/input[contains(@class,'ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all')]")
	private WebElement searchtbUnitOMeasurment;
	
	/* Method to select Inventory Item form table */
	public List<WebElement> tableInventoryItem(String itemCode)
	{
		List<WebElement> el = driver.findElements(By.xpath("//a[contains(text(),'"+itemCode+"')]/ancestor::mat-row/mat-cell"));
		return el;
	}
	
	/**
	 * Description: Method to convert decimal to number
	 * 
	 * @author vikas
	 * @param number
	 * @return
	 */
	public static String digit(String number)
	{
		String num = number.replaceAll(",", "");
		
		return num.substring(0, num.length()-3);
		
	}
	/**
	 * Description: Method to validate data present in Inventory Item table
	 * 
	 * @author vikas
	 * 
	 * @param itemCode
	 * @param nameOfProduct
	 * @param purchasePrice
	 * @param salesPrice
	 * @param quantity
	 * @param costAmount
	 */
	public synchronized void validateInventoryItem(String itemCode, String nameOfProduct, String purchasePrice, String salesPrice, String quantity, String costAmount)
	{
		try {
			List<WebElement> inventoryTableData = tableInventoryItem(itemCode);
			ArrayList<String> expecteddata = new ArrayList<String>();
			ArrayList<String> actualData = new ArrayList<String>();
			
			actualData.add(itemCode);
			actualData.add(nameOfProduct);
			actualData.add(purchasePrice);
			actualData.add(salesPrice);
			actualData.add(quantity);
			actualData.add(""+(Integer.parseInt(costAmount) * Integer.parseInt(quantity)));
			int k=0;
			for(WebElement data : inventoryTableData)
			{
				if(k < inventoryTableData.size()-1)
				{
					if(k<=1)
						expecteddata.add(data.getText());
					else
						expecteddata.add(digit(data.getText()));
					k++;
				}
				else
					break;
				
			}
			Assert.assertTrue(expecteddata.containsAll(actualData));
			actionUtil.pass("Created item is displayed in Invetory Items listing table.");
			actionUtil.info("Created item is displayed in Invetory Items listing table.");
		} catch (AssertionError e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Created item is not displayed in Invetory Items listing table.");
			Assert.fail("Created item is not displayed in Invetory Items listing table.");
		}
		
	}
	
	/**
	 * Description: Method to Click on Add Inventory Button 
	 * 
	 * @author vikas
	 */
	public synchronized void clkAddInventoryBtn() {
		try {
			actionUtil.waitForElement(btnAddInventory, "Add Inventory Button");
			actionUtil.clickOnElement(btnAddInventory, "Add Inventory Button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Add Inventory Button");
			Assert.fail("Unable to click on Add Inventory Button");
		}
	}
	
	/**
	 * Description: Method to validate Inventory page
	 * 
	 * @author vikas
	 */
	public synchronized void validateInventoryPage() {
		try {
			actionUtil.waitForElement(txtInventoryItems, "Add Inventory Button");
			if(txtInventoryItems.getText().equals("Inventory Items") && driver.getCurrentUrl().equals("https://inaccounts.hostbooks.com/accounts-books/inventory"))
			{
				actionUtil.pass("Inventory listing page is displayed");
				actionUtil.info("Inventory listing page is displayed");
			}
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Inventory listing page is not displayed");
			Assert.fail("Inventory listing page is not displayed");
		}
	}
	
	/**
	 * Description: Method to validate Product Service Information Popup
	 * 
	 * @author vikas
	 */
	public synchronized void validateProductServiceInformationPopup() {
		try {
			actionUtil.waitForElement(txtInformationPopup, "Product/Service Information text");
			
			Assert.assertTrue(txtInformationPopup.getText().equals("Product/Service information"));
			actionUtil.pass("Product/Service Information Popup is displayed");
			actionUtil.info("Product/Service Information Popup is displayed");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Product/Service Information Popup is not displayed");
			Assert.fail("Product/Service Information Popup is not displayed");
		}
	}
	
	/**
	 * Description: Method to validate Inventory Added Success Message
	 * 
	 * @author vikas
	 */
	public synchronized void validateInventoryAddedSuccessMessage() {
		try {
			actionUtil.waitForElement(txtInventoryAddedSuccessMessage, "Inventory Added Success Message");
			
			Assert.assertTrue(txtInventoryAddedSuccessMessage.getText().equals("Item is added successfully."));
			actionUtil.pass("Inventory Added Success Message is displayed");
			actionUtil.info("Inventory Added Success Message is displayed");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Inventory Added Success Message is not displayed");
			Assert.fail("Inventory Added Success Message is not displayed");
		}
	}
	
	/**
	 * Description: Method to Click on Inventory Check box
	 * 
	 * @author vikas
	 * @param proceedWith
	 */
	public synchronized void clkInventoryCb() {
		try {
			actionUtil.waitForElement(lnkInventory, "Inventory Check box");
			actionUtil.clickCheckBox(lnkInventory, "Inventory Check box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Inventory Check box");
			Assert.fail("Unable to click on Inventory Check box");
		}
	}
	
	/**
	 * Description: Method to enter data in Item/SKU Code text box
	 * 
	 * @author vikas
	 * @param itemCode
	 */
	public synchronized void setItemCode(String itemCode) {
		try {
			actionUtil.waitForElement(tbItemCode, "Item/SKU Code text Box");
			actionUtil.typeText(tbItemCode, itemCode, "Item/SKU Code text Box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Item/SKU Code text Box");
			Assert.fail("Unable to enter value in Item/SKU Code text Box");
		}
	}
	
	/**
	 * Description: Method to enter data in Name Of Product text box
	 * 
	 * @author vikas
	 * @param nameOfProduct
	 */
	public synchronized void setNameOfProduct(String nameOfProduct) {
		try {
			actionUtil.waitForElement(tbNameOfProduct, "Name Of Product text box");
			actionUtil.typeText(tbNameOfProduct, nameOfProduct, "Name Of Product text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Name Of Product text box");
			Assert.fail("Unable to enter value in Name Of Product text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Unit of Measurement text box
	 * 
	 * @author vikas
	 * @param unitOfMeasurement
	 */
	public synchronized void setUnitOfMeasurment(String unitOfMeasurement) {
		try {
			actionUtil.waitForElement(tbUnitOfMeasurement, "Unit of Measurement text box");
			actionUtil.clickOnElement(tbUnitOfMeasurement, "Unit of Measurement text box");
			actionUtil.typeText(searchtbUnitOMeasurment, unitOfMeasurement, "Unit of Measurement Search text box");
			
			actionUtil.clickOnElement(clkUnitOfMeasurement(unitOfMeasurement), "Unit of Measurement");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Unit of Measurement text box");
			Assert.fail("Unable to enter value in Unit of Measurement text box");
		}
	}
	
	/**
	 * Description: Method to enter data in HSN/SAC Code text box
	 * 
	 * @author vikas
	 * @param hSNSACCode
	 */
	public synchronized void setHSNSACCode(String hSNSACCode) {
		try {
			actionUtil.waitForElement(ddHSNSACCode, "HSN/SAC Code text box");
			actionUtil.clickOnElement(ddHSNSACCode, " HSN/SAC Code text box");
			
			actionUtil.clickOnElement(selectHSNSACCode(hSNSACCode), "HSN/SAC Code drop down");
			
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in  HSN/SAC Code text box");
			Assert.fail("Unable to enter value in HSN/SAC Code text box");
		}
	}
	
	/**
	 * Description: Method to select Inventory method from drop down
	 * 
	 * @author vikas
	 * @param inventoryMethod
	 */
	public synchronized void setInventoryMethod(String inventoryMethod) {
		try {
			actionUtil.waitForElement(ddInventoryMethod, "Inventory Method drop down");
			actionUtil.clickOnElement(ddInventoryMethod, "Inventory Method drop down");
			
			actionUtil.clickOnElement(selectInventoryMethod(inventoryMethod), "Inventory Method");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select the value in Inventory Method drop down");
			Assert.fail("Unable to select the value in Inventory Method drop down");
		}
	}
	
	/**
	 * Description: Method to enter data in Purchase Price/Rate text box
	 * 
	 * @author vikas
	 * @param purchasePrice
	 */
	public synchronized void setPurchasePrice(String purchasePrice) {
		try {
			actionUtil.waitForElement(tbPurchasePrice, "Purchase Price/Rate text box");
			actionUtil.typeText(tbPurchasePrice, purchasePrice, "Purchase Price/Rate text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Purchase Price/Rate text box");
			Assert.fail("Unable to enter value in Purchase Price/Rate text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Purchase GST Rate drop down
	 * 
	 * @author vikas
	 * @param gstRate
	 */
	public synchronized void setPurchaseGSTRate(String gstRate) {
		try {
			actionUtil.waitForElement(ddPurchaseGSTRate, "Purchase GST Rate drop down");
			actionUtil.clickOnElement(ddPurchaseGSTRate, "Purchase GST Rate drop down");
			
			actionUtil.clickOnElement(selectPurchaseGSTRate(gstRate), "Purchase GST Rate");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select the value in Purchase GST Rate drop down");
			Assert.fail("Unable to select the value in Purchase GST Rate drop down");
		}
	}
	
	/**
	 * Description: Method to enter data in Cess Amount text box
	 * 
	 * @author vikas
	 * @param cessAmount
	 */
	public synchronized void setPurchaseCessAmount(String cessAmount) {
		try {
			actionUtil.waitForElement(tbPurchaseCessAmount, "Cess Amount text box");
			actionUtil.typeText(tbPurchaseCessAmount, cessAmount, "Cess Amount text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Purchase Price/Rate text box");
			Assert.fail("Unable to enter value in Purchase Price/Rate text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Discount (%) text box
	 * 
	 * @author vikas
	 * @param discount
	 */
	public synchronized void setPurchaseDiscount(String discount) {
		try {
			actionUtil.waitForElement(tbPurchaseDiscount, "Discount (%) text box");
			actionUtil.typeText(tbPurchaseDiscount, discount, "Discount (%) text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Purchase Discount (%) text box");
			Assert.fail("Unable to enter value in Purchase Discount (%) text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Purchase Expiry Date text box
	 * 
	 * @author vikas
	 * @param expiryDate
	 */
	public synchronized void setPurchaseExpiryDate(String expiryDate) {
		try {
			actionUtil.waitForElement(tbPurchaseExpiryDate, "Expiry Date text box");
			actionUtil.typeText(tbPurchaseExpiryDate, expiryDate, "Expiry Date text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Purchase Expiry Date text box");
			Assert.fail("Unable to enter value in Purchase Expiry Date text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Purchase MRP text box
	 * 
	 * @author vikas
	 * @param mrp
	 */
	public synchronized void setPurchaseMRP(String mrp) {
		try {
			actionUtil.waitForElement(tbPurchaseMRP, "MRP text box");
			actionUtil.typeText(tbPurchaseMRP, mrp, "MRP text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Purchase MRP text box");
			Assert.fail("Unable to enter value in Purchase MRP text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Sales Price/Rate text box
	 * 
	 * @author vikas
	 * @param salesPrice
	 */
	public synchronized void setSalesPrice(String salesPrice) {
		try {
			actionUtil.waitForElement(tbSalesPrice, "Sales Price/Rate text box");
			actionUtil.typeText(tbSalesPrice, salesPrice, "Sales Price/Rate text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Sales Price/Rate text box");
			Assert.fail("Unable to enter value in Sales Price/Rate text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Sell GST Rate drop down
	 * 
	 * @author vikas
	 * @param gstRate
	 */
	public synchronized void setSellGSTRate(String gstRate) {
		try {
			actionUtil.waitForElement(ddSellGSTRate, "Sell GST Rate drop down");
			actionUtil.clickOnElement(ddSellGSTRate, "Sell GST Rate drop down");
			
			actionUtil.clickOnElement(selectSellGSTRate(gstRate), "Sell GST Rate");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to select the value in Sell GST Rate drop down");
			Assert.fail("Unable to select the value in Sell GST Rate drop down");
		}
	}
	
	/**
	 * Description: Method to enter data in Sell Cess Amount text box
	 * 
	 * @author vikas
	 * @param cessAmount
	 */
	public synchronized void setSellCessAmount(String cessAmount) {
		try {
			actionUtil.waitForElement(tbSellCessAmount, "Cess Amount text box");
			actionUtil.typeText(tbSellCessAmount, cessAmount, "Cess Amount text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Sell Price/Rate text box");
			Assert.fail("Unable to enter value in Sell Price/Rate text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Discount (%) text box
	 * 
	 * @author vikas
	 * @param discount
	 */
	public synchronized void setSellDiscount(String discount) {
		try {
			actionUtil.waitForElement(tbSellDiscount, "Discount (%) text box");
			actionUtil.typeText(tbSellDiscount, discount, "Discount (%) text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Sell Discount (%) text box");
			Assert.fail("Unable to enter value in Sell Discount (%) text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Sell Expiry Date text box
	 * 
	 * @author vikas
	 * @param expiryDate
	 */
	public synchronized void settbSellExpiryDateExpiryDate(String expiryDate) {
		try {
			actionUtil.waitForElement(tbSellExpiryDate, "Expiry Date text box");
			actionUtil.typeText(tbSellExpiryDate, expiryDate, "Expiry Date text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Sell Expiry Date text box");
			Assert.fail("Unable to enter value in Sell Expiry Date text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Sell MRP text box
	 * 
	 * @author vikas
	 * @param mrp
	 */
	public synchronized void setSellMRP(String mrp) {
		try {
			actionUtil.waitForElement(tbSellMRP, "MRP text box");
			actionUtil.typeText(tbSellMRP, mrp, "MRP text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Sell MRP text box");
			Assert.fail("Unable to enter value in Sell MRP text box");
		}
	}
	
	/**
	 * Description: Method to Click on Opening Stock Check box
	 * 
	 * @author vikas
	 * @param proceedWith
	 */
	public synchronized void clkOpeningStockCb() {
		try {
			actionUtil.waitForElement(cbOpeningStock, "Opening Stock Check box");
			actionUtil.clickCheckBox(cbOpeningStock, "Opening Stock Check box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Opening Stock Check box");
			Assert.fail("Unable to click on Opening Stock Check box");
		}
	}
	
	/**
	 * Description: Method to enter data in Quantity In Hand text box
	 * 
	 * @author vikas
	 * @param quantity
	 */
	public synchronized void setQuantityInHand(String quantity) {
		try {
			actionUtil.waitForElement(tbQuantityInHand, "Quantity In Hand text box");
			actionUtil.typeText(tbQuantityInHand, quantity, "Quantity In Hand text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Quantity In Hand text box");
			Assert.fail("Unable to enter value in Quantity In Hand text box");
		}
	}
	
	/**
	 * Description: Method to enter data in Cost Amount text box
	 * 
	 * @author vikas
	 * @param costAmount
	 */
	public synchronized void setCostAmount(String costAmount) {
		try {
			actionUtil.waitForElement(tbCostAmount, "Cost Amount text box");
			actionUtil.typeText(tbCostAmount, costAmount, "Cost Amount text box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Cost Amount text box");
			Assert.fail("Unable to enter value in Cost Amount text box");
		}
	}
	
	/**
	 * Description: Method to Click on Ok Button
	 * TAX) Check box
	 * 
	 * @author vikas
	 * @param proceedWith
	 */
	public synchronized void clkOk() {
		try {
			actionUtil.waitForElement(btnOk, "Ok Button");
			actionUtil.clickOnElement(btnOk, "Ok Button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Ok Button");
			Assert.fail("Unable to click on Ok Button");
		}
	}
	
	/**
	 * Description: Method to Click on Save Button
	 * TAX) Check box
	 * 
	 * @author vikas
	 * @param proceedWith
	 */
	public synchronized void clkSave() {
		try {
			actionUtil.waitForElement(btnSave, "Save Button");
			actionUtil.clickOnElement(btnSave, "Save Button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to click on Save Button");
			Assert.fail("Unable to click on Save Button");
		}
	}
}
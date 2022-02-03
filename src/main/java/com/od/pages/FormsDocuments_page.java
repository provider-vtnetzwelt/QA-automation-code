package com.od.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.od.util.WebActionUtil;

public class FormsDocuments_page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;
	public static  String sDirpath = System.getProperty("user.dir");
	String imgpath = sDirpath +"\\src\\main\\resources\\data\\testing.docx";
	public FormsDocuments_page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}
	/* Add Document button */
	@FindBy(xpath = "(//input[starts-with(@id,'mat-input')])[1]")
	private WebElement txtbxtitle;
	
	
	/* Tabs Options */
	private WebElement selecttaboption(String taboption) {
		return driver.findElement(By.xpath("//span[contains(text(),'" + taboption + "')]"));
	}

	/* Tabs sub Options */
	private WebElement selectsuboption(String suboption) {
		return driver.findElement(By.xpath("//div[text()='" + suboption + "']/parent::a"));
	}

	@FindBy(id = "fuse-splash-screen")
	private WebElement spiner;

	/* Add Document button */
	@FindBy(xpath = "//span[text()='Add Document']/parent::button")
	private WebElement btnaddDocument;
	
	/* publish date */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[3]/child::input")
	private WebElement txtpublishdate;
	
	/* upload-input-file button */
	@FindBy(xpath = "//span[text()=' To upload a Form & Document, simply drag-and-drop your file here OR click here to select a file on your device.']/parent::div")
	private WebElement btnuploadfile;
	
	
	/* set dates */
	private WebElement selectdate(String publishdate) {
		return driver.findElement(By.xpath("//div[text()='" + publishdate + "']/parent::td"));
	}
	
	/* category Details */
	private WebElement categoryDetailsrb2(String categoryDetailsrb1) {
		return driver.findElement(
				By.xpath("//div[normalize-space(text())='" + categoryDetailsrb1 + "']/preceding-sibling::div"));
	}

	/* category Details */
	private WebElement jurisdictionDetailscb(String jurisdictionDetailscb) {
		return driver.findElement(By.xpath("//span[text()='" + jurisdictionDetailscb + "']/preceding-sibling::div"));
	}

	
	/**
	 * Description Method to Set Title in Title text box
	 * 
	 * @author Vivek
	 * @param title
	 */
	public synchronized void settitle(String title) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(txtbxtitle, "Title text box");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(txtbxtitle, "Title text box");	
			actionUtil.typeText(txtbxtitle, title, "Title text box");
			
			

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to set value on  " + txtbxtitle);
			Assert.fail("Unable to set value  " + txtbxtitle);
		}
	}
	
	
	
	
	
	
	
	/**
	 * Description Method to Click on tab option
	 * 
	 * @author Vivek
	 */
	public synchronized void clkontaboption(String taboption) {
		try {
			if (actionUtil.isElementVisible(spiner, "appliction is loading"))
				actionUtil.wait();
			{
				actionUtil.waitForAngularPageToLoad();
				actionUtil.waitForElement(selecttaboption(taboption), "Forms & Documents Tab");
				actionUtil.waitForAngularPageToLoad();
				actionUtil.clickOnElement(selecttaboption(taboption), "Forms & Documents tab");
			}

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + taboption);
			Assert.fail("Unable to Click on  " + taboption);
		}
	}

	/**
	 * Description Method to Click on Sub Option
	 * 
	 * @author Vivek
	 */
	public synchronized void clkontabsuboption(String tabsuboption) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(selectsuboption(tabsuboption), "" + tabsuboption);
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(selectsuboption(tabsuboption), "" + tabsuboption);

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + tabsuboption);
			Assert.fail("Unable to Click on  " + tabsuboption);
		}
	}

	/**
	 * Description Method to Click on Add Document Button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonaddDocumentButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(btnaddDocument, "Add Document");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(btnaddDocument, "Add Document Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnaddDocument);
			Assert.fail("Unable to Click on  " + btnaddDocument);
		}
	}

	/**
	 * Description Method to click on jurisdiction Details check box
	 * 
	 * @author Vivek
	 * @param jurisdictionDetailscbjurisdictionDetailscb
	 */
	public synchronized void clkonjurisdictionDetailscb(String jurisdictionDetailscb) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(jurisdictionDetailscb(jurisdictionDetailscb), "jurisdiction Details cheackbox ");
			actionUtil.clickOnElement(jurisdictionDetailscb(jurisdictionDetailscb), "jurisdiction Details cheackbox ");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  jurisdiction Details check box");
			Assert.fail("Unable to Click on jurisdiction Details check box");
		}
	}

	/**
	 * Description Method to click on category Details drop down
	 * 
	 * @author Vivek
	 * @param categoryDetailsdd
	 */
	public synchronized void clkoncategoryDetails1(String categoryDetailsrb) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(categoryDetailsrb2(categoryDetailsrb), "category Details radio button option");
			actionUtil.clickOnElement(categoryDetailsrb2(categoryDetailsrb), "category Details radio button option");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  category Details drop down");
			Assert.fail("Unable to Click on category Details drop down ");
		}
	}

	
	/**
	 * Description Method to Set publish date
	 * 
	 * @author Vivek
	 * @param publish date
	 */
	public synchronized void setpublishdate(String publishdate) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(txtpublishdate, "publish date text box");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", txtpublishdate);
			actionUtil.clickOnElement(txtpublishdate, "publish date text box");
			actionUtil.clickOnElement(selectdate(publishdate), "publish date");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Set on  " + txtpublishdate);
			Assert.fail("Unable to Set on  " + txtpublishdate);
		}
	}
	
	/**
	 * Description Method to Click on upload-input-file button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonuploadfileButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(btnuploadfile, "upload-input-file button");
			actionUtil.waitForAngularPageToLoad();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", btnuploadfile);
			actionUtil.clickOnElement(btnuploadfile, "upload-input-file button");
			actionUtil.upload(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\testing.docx");
			Thread.sleep(3000);
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnuploadfile);
			Assert.fail("Unable to Click on  " + btnuploadfile);
		}
	}
	
	
}

package com.od.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.od.util.WebActionUtil;

public class Quick_Guides_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;

	public Quick_Guides_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}

	/* Tabs Options */
	private WebElement selecttaboption(String taboption) {
		return driver.findElement(By.xpath("//span[contains(text(),'" + taboption + "')]"));
	}

	@FindBy(id = "fuse-splash-screen")
	private WebElement spiner;

	/* Add Quick_Guides button */
	@FindBy(xpath = "//span[text()='Add Quick Guide']/parent::button")
	private WebElement btnQuickGuides;

	/* category Details */
	private WebElement jurisdictionDetailscb(String jurisdictionDetailscb) {
		return driver.findElement(By.xpath("//span[text()='" + jurisdictionDetailscb + "']/preceding-sibling::div"));
	}

	/* category Details */
	private WebElement categoryDetailsrb2(String categoryDetailsrb1) {
		return driver.findElement(
				By.xpath("//div[normalize-space(text())='" + categoryDetailsrb1 + "']/preceding-sibling::div"));
	}

	/* publish date */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[2]/child::input")
	private WebElement txtpublishdate;
	
	/* set dates */
	private WebElement selectdate(String publishdate) {
		return driver.findElement(By.xpath("//div[text()='" + publishdate + "']/parent::td"));
	}
	
	/* upload-input-file button */
	@FindBy(xpath = "//input[@id='upload-input-file']/parent::div/parent::div")
	private WebElement btnuploadfile;
	
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
				actionUtil.waitForElement(selecttaboption(taboption), "Quick_Guides Tab");
				actionUtil.waitForAngularPageToLoad();
				actionUtil.clickOnElement(selecttaboption(taboption), "Quick_Guides tab");
			}

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + taboption);
			Assert.fail("Unable to Click on  " + taboption);
		}
	}

	/**
	 * Description Method to Click on Add summary Button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonQuickGuidesButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(btnQuickGuides, "Quick_Guides");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(btnQuickGuides, "Quick_Guides button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnQuickGuides);
			Assert.fail("Unable to Click on  " + btnQuickGuides);
		}
	}
	
	
	/**
	 * Description Method to click on jurisdiction Details check box
	 * 
	 * @author Vivek
	 * @param jurisdictionDetailscb
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
			actionUtil.upload(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\file_example_JPG_100kB.jpg");
			Thread.sleep(3000);
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnuploadfile);
			Assert.fail("Unable to Click on  " + btnuploadfile);
		}
	}	
	
	
	
}

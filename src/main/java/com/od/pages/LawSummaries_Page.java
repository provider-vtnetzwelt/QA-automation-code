package com.od.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.od.util.WebActionUtil;

/**
 * Description: This class implements the methods for Law Summaries Page
 * 
 * @author Vivek Dogra
 */
public class LawSummaries_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;
	public static  String sDirpath = System.getProperty("user.dir");
	String imgpath = sDirpath +"\\src\\main\\resources\\data\\file_example_JPG_100kB.jpg";
	public LawSummaries_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}

	/* Add summary button */
	@FindBy(xpath = "//div[@class='logo']/img")
	private WebElement loderlogo;

	/* Tabs Options */
	private WebElement selecttaboption(String taboption) {
		return driver.findElement(By.xpath("//span[contains(text(),'" + taboption + "')]"));
	}

	/* Tabs sub Options */
	private WebElement selectsuboption(String suboption) {
		return driver.findElement(By.xpath("//div[text()='" + suboption + "']/parent::a"));
	}

	/* Add summary button */
	@FindBy(xpath = "//span[text()='Add Summary']/parent::button")
	private WebElement btnaddSummary;

	/* Fedral Radio button */
	@FindBy(xpath = "(//div[@class='mat-radio-container']/child::div)[1]/parent::div")
	private WebElement rdbtnfedral;

	/* Fedral Radio button */
	@FindBy(xpath = "(//div[@class='mat-radio-container']/child::div)[8]/parent::div")
	private WebElement rdbtnCriminalBantheBox;

	/* upload-input-file button */
	@FindBy(xpath = "//input[@id='upload-input-file']/parent::div/parent::div")
	private WebElement btnuploadfile;

	/* publish date */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[2]/child::input")
	private WebElement txtpublishdate;

	/* Effective form date */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[3]/child::input")
	private WebElement txteffectivedate;

	/* set dates */
	private WebElement selectdate(String publishdate) {
		return driver.findElement(By.xpath("//div[text()='" + publishdate + "']/parent::td"));
	}
	/* publish button */
	@FindBy(xpath = "//span[text()=' PUBLISH '] /parent::button")
	private WebElement btnpublish;
	
	@FindBy(id = "fuse-splash-screen")
	private WebElement spiner;
	
	/* category Details */
	private WebElement categoryDetailsdd(String categoryDetails) {
		return driver.findElement(By.xpath("//span[text()='"+categoryDetails+"']/../button/child::span"));
	}
	
	/* category Details */
	private WebElement categoryDetailsrb(String categoryDetailsrb) {
		return driver.findElement(By.xpath("//div[text()='"+categoryDetailsrb+"']/preceding-sibling::div"));
	}
	
	/* category Details */
	private WebElement categoryDetailsrb2(String categoryDetailsrb1) {
		return driver.findElement(By.xpath("//div[normalize-space(text())='"+categoryDetailsrb1+"']/preceding-sibling::div"));
	}
	
	//div[normalize-space(text())='Express Employment Protections']/preceding-sibling::div
	
	
	/* toast message */
	@FindBy(xpath = "//span[text()='Law Summary has been added successfully.']/parent::simple-snack-bar")
	private WebElement msgtoast;
	
	//span[text()='Form & Document has been added successfully.']/..
	//span[text()='Law Summary has been added successfully.']/parent::simple-snack-bar

	/**
	 * Description Method to Click on tab option
	 * 
	 * @author Vivek
	 */
	public synchronized void clkontaboption(String taboption) {
		try {
			if (actionUtil.isElementVisible(spiner, "appliction is loading"))
			actionUtil.wait();{
				actionUtil.waitForAngularPageToLoad();
				actionUtil.waitForElement(selecttaboption(taboption), "Law Summaries Tab");
				actionUtil.waitForAngularPageToLoad();
				actionUtil.clickOnElement(selecttaboption(taboption), "Law summaries tab");
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
	 * Description Method to Click on Add summary Button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonaddsummaryButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(btnaddSummary, "Add summary");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(btnaddSummary, "Add summary Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnaddSummary);
			Assert.fail("Unable to Click on  " + btnaddSummary);
		}
	}

	/**
	 * Description Method to Click on fedral radio Button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonfedralradioButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(rdbtnfedral, "fedral radio Button");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(rdbtnfedral, "fedral radio Button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + rdbtnfedral);
			Assert.fail("Unable to Click on  " + rdbtnfedral);
		}
	}

	/**
	 * Description Method to Click on Criminal Ban the Box radio button
	 * 
	 * @author Vivek
	 */
	public synchronized void clkonCriminalBantheBoxradioButton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(rdbtnCriminalBantheBox, "Criminal Ban the Box radio button");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.clickOnElement(rdbtnCriminalBantheBox, "Criminal Ban the Box radio button");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + rdbtnCriminalBantheBox);
			Assert.fail("Unable to Click on  " + rdbtnCriminalBantheBox);
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
			actionUtil.upload(
					imgpath);
			Thread.sleep(3000);
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + btnuploadfile);
			Assert.fail("Unable to Click on  " + btnuploadfile);
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
	 * Description Method to Set effectivedate date
	 * 
	 * @author Vivek
	 * @param
	 */
	public synchronized void setEffecteddate(String effectivedate) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(txteffectivedate, "Effectiv date text box");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", txteffectivedate);
			actionUtil.clickOnElement(txteffectivedate, "Effectiv date text box");
			actionUtil.clickOnElement(selectdate(effectivedate), " effective form date");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Set on  " + txteffectivedate);
			Assert.fail("Unable to Set on  " + txteffectivedate);
		}
	}
	/**
	 * Description Method to click on publish button
	 * 
	 * @author Vivek
	 * @param
	 */
	public synchronized void clkpublishbutton() {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(btnpublish, "publish button");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", btnpublish);
			actionUtil.clickOnElement(btnpublish, "publish button");
			actionUtil.waitForAngularPageToLoad();
			//Thread.sleep(10);
			actionUtil.poll(15);
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  " + txtpublishdate);
			Assert.fail("Unable to Click on  " + txtpublishdate);
		}
	}
	
	
	/**
	 * Description Method to click on category Details drop down
	 * 
	 * @author Vivek
	 * @param categoryDetailsdd
	 */
	public synchronized void clkoncategoryDetails(String categoryDetailsdd,String categoryDetailsrb) {
		try {
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(categoryDetailsdd(categoryDetailsdd), "category Details drop down");
			actionUtil.clickOnElement(categoryDetailsdd(categoryDetailsdd), "category Details drop down");
			actionUtil.waitForAngularPageToLoad();
			actionUtil.waitForElement(categoryDetailsrb2(categoryDetailsrb), "category Details radio button option");
			actionUtil.clickOnElement(categoryDetailsrb2(categoryDetailsrb), "category Details radio button option");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Click on  category Details drop down");
			Assert.fail("Unable to Click on category Details drop down " );
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
			Assert.fail("Unable to Click on category Details drop down " );
		}
	}
	
	
	
	
	/**
	 * Description Method to click on category Details drop down
	 * 
	 * @author Vivek
	 * @param
	 */
	public synchronized void validatetoastmessage() {
		try {
			String toastmsg = "Law Summary has been added successfully.";
			String actulymsg = msgtoast.getText();
			actionUtil.waitForElement(msgtoast, "Sucessfuly add sommary toast meassage");
			actionUtil.validateText(toastmsg, msgtoast, "Sucessfuly add summary toast meassage", "Summary is sucessfuly added", "Summary is unable to  added", "green");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to add summary ");
			Assert.fail("Unable to add summary" );
		}
	}
	
	
	public synchronized void writedes() {
		try {
			driver.switchTo().frame(0);
		    driver.findElement(By.xpath("/html/body")).sendKeys("testing");
		    driver.switchTo().defaultContent();
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to add summary ");
			Assert.fail("Unable to add summary" );
		}
	}
	
	
	
	
	
	
	
}

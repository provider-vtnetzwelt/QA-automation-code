package com.od.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.od.util.WebActionUtil;

/**
 * Description: This class implements the methods for DashBoard Page
 * 
 * @author Vivek Dogra
 */
public class Login_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;

	public Login_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}

	/* Email Text box */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[1]//input")
	private WebElement tbEmail;

	/* Password Text box */
	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[2]//input")
	private WebElement tbPassword;

	/* I am not a robot Check box */
	@FindBy(xpath = "//button[@class='submit-button mat-raised-button mat-accent']/span")
	private WebElement btnsignin;

	/**
	 * Description Method to enter data in Email Text Box
	 * 
	 * @author Vivek
	 * @param email
	 */
	public synchronized void setEmail(String email) {
		try {
			actionUtil.waitForElement(tbEmail, "Email Text Box");
			actionUtil.clickOnElement(tbEmail, email);
			actionUtil.typeText(tbEmail, email, "Email Text Box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Email Text Box");
			Assert.fail("Unable to enter value in Email Text Box");
		}
	}

	/**
	 * Description Method to enter data in Password Text Box
	 * 
	 * @author vivek
	 * @param password
	 */
	public synchronized void setPassword(String password) {
		try {
			actionUtil.waitForElement(tbPassword, "Password Text Box");
			actionUtil.clickOnElement(tbPassword, password);
			actionUtil.typeText(tbPassword, password, "Password Text Box");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to enter value in Password Text Box");
			Assert.fail("Unable to enter value in Password Text Box");
		}
	}

	/**
	 * Description: Method to Click on I am not a robot check box
	 * 
	 * @author Sajal
	 * @param email
	 * @param password
	 */
	public synchronized void loginToApplication(String email, String password) {
		try {
			setEmail(email);
			setPassword(password);
			actionUtil.waitForElement(btnsignin, "sign Button");
			actionUtil.clickOnElement(btnsignin, "sign Button");

		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Unable to Login to application");
			Assert.fail("Unable to Login to application");
		}
	}

}

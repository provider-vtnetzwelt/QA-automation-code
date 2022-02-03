package com.od.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.od.util.WebActionUtil;

public class Add_Quick_Guide_Page {
	public WebDriver driver;
	public WebActionUtil actionUtil;
	public long ETO = 15;

	public Add_Quick_Guide_Page(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionUtil = actionUtil;
		this.ETO = ETO;
	}
}

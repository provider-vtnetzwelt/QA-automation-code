package com.od.testscripts;

import org.testng.annotations.Test;

import com.od.baseutil.BaseTest;

public class Quick_Guides extends BaseTest {
	@Test(description = "Description: Script to Add Quick Guides")
	public void addQuickGuides()

	{
		pages.QuickGuides.clkontaboption(prop.getProperty("Quick_Guides"));
		pages.QuickGuides.clkonQuickGuidesButton();
		pages.QuickGuides.clkonjurisdictionDetailscb(prop.getProperty("Federal"));
		pages.QuickGuides.clkoncategoryDetails1(prop.getProperty("Initial_Groundwork"));
		pages.QuickGuides.setpublishdate(prop.getProperty("Publish_date"));
		pages.LawSummaries.writedes();
		//pages.QuickGuides.clkonuploadfileButton();
		pages.LawSummaries.clkpublishbutton();

	}
}

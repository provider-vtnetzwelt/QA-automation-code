package com.od.testscripts;

import org.testng.annotations.Test;

import com.od.baseutil.BaseTest;

public class LawSummaries extends BaseTest {

	@Test
	public void Employment_Applications()

	{

		pages.LawSummaries.clkontaboption(prop.getProperty("Law_Summaries"));
		pages.LawSummaries.clkontabsuboption(prop.getProperty("Employment_Applications"));
		pages.LawSummaries.clkonaddsummaryButton();
		pages.LawSummaries.clkonfedralradioButton();
		pages.LawSummaries.clkonCriminalBantheBoxradioButton();
		pages.LawSummaries.setpublishdate(prop.getProperty("Publish_date"));
		pages.LawSummaries.setEffecteddate(prop.getProperty("Effective_From"));
		pages.LawSummaries.writedes();
		pages.LawSummaries.clkpublishbutton();

	}

//	@Test
//	public void Garnishments()
//
//	{
//
//		pages.LawSummaries.clkontaboption(prop.getProperty("Law_Summaries"));
//		pages.LawSummaries.clkontabsuboption(prop.getProperty("Garnishments"));
//		pages.LawSummaries.clkonaddsummaryButton();
//		pages.LawSummaries.clkonfedralradioButton();
//		pages.LawSummaries.clkoncategoryDetails(prop.getProperty("Creditor_Wage_Garnishments"),
//				prop.getProperty("Background"));
//		pages.LawSummaries.setpublishdate(prop.getProperty("Publish_date"));
//		pages.LawSummaries.setEffecteddate(prop.getProperty("Effective_From"));
//		pages.LawSummaries.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//		pages.LawSummaries.validatetoastmessage();
//
//	}

//	@Test
//	public void Marijuana_Laws()
//
//	{
//
//		pages.LawSummaries.clkontaboption(prop.getProperty("Law_Summaries"));
//		pages.LawSummaries.clkontabsuboption(prop.getProperty("Marijuana_Laws"));
//		pages.LawSummaries.clkonaddsummaryButton();
//		pages.LawSummaries.clkonfedralradioButton();
//		pages.LawSummaries.clkoncategoryDetails(prop.getProperty("Medical_Marijuana"), prop.getProperty("General"));
//		pages.LawSummaries.setpublishdate(prop.getProperty("Publish_date"));
//		pages.LawSummaries.setEffecteddate(prop.getProperty("Effective_From"));
//		pages.LawSummaries.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//
//	}
//
//	@Test
//	public void State_Leave_Laws()
//
//	{
//
//		pages.LawSummaries.clkontaboption(prop.getProperty("Law_Summaries"));
//		pages.LawSummaries.clkontabsuboption(prop.getProperty("State_Leave_Laws"));
//		pages.LawSummaries.clkonaddsummaryButton();
//		pages.LawSummaries.clkonfedralradioButton();
//		pages.LawSummaries.clkoncategoryDetails1(prop.getProperty("Blood_Donation"));
//		pages.LawSummaries.setpublishdate(prop.getProperty("Publish_date"));
//		pages.LawSummaries.setEffecteddate(prop.getProperty("Effective_From"));
//		pages.LawSummaries.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//
//	}

//	@Test
//	public void StateWageHour_Issues()
//
//	{
//
//		pages.LawSummaries.clkontaboption(prop.getProperty("Law_Summaries"));
//		pages.LawSummaries.clkontabsuboption(prop.getProperty("State_Wage&Hour_Issues"));
//		pages.LawSummaries.clkonaddsummaryButton();
//		pages.LawSummaries.clkonfedralradioButton();
//		pages.LawSummaries.clkoncategoryDetails1(prop.getProperty("Accrued_Vacation"));
//		pages.LawSummaries.setpublishdate(prop.getProperty("Publish_date"));
//		pages.LawSummaries.setEffecteddate(prop.getProperty("Effective_From"));
//		pages.LawSummaries.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//
//	}
}

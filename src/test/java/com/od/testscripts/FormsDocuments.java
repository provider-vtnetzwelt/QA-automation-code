package com.od.testscripts;

import org.testng.annotations.Test;

import com.od.baseutil.BaseTest;

public class FormsDocuments extends BaseTest {

	@Test(description = "Description: Script to Background_Checks")
	public void Background_Checks()

	{
        pages.FormsDocuments.clkontaboption(prop.getProperty("Forms_Documents"));
		pages.FormsDocuments.clkontabsuboption(prop.getProperty("Background_Checks"));
		pages.FormsDocuments.clkonaddDocumentButton();
		pages.FormsDocuments.settitle("Testing Demo");
		pages.FormsDocuments.clkonjurisdictionDetailscb(prop.getProperty("Federal"));
		pages.FormsDocuments.clkoncategoryDetails1(prop.getProperty("Disclosure_Authorization_Screens"));
		pages.FormsDocuments.setpublishdate(prop.getProperty("Publish_date"));
		pages.FormsDocuments.clkonuploadfileButton();	
		pages.LawSummaries.clkpublishbutton();

	}

//	@Test
//	public void Employment_Applications()
//
//	{
//		pages.FormsDocuments.clkontaboption(prop.getProperty("Forms_Documents"));
//		pages.FormsDocuments.clkontabsuboption(prop.getProperty("Employment_Applications"));
//		pages.FormsDocuments.clkonaddDocumentButton();
//		pages.FormsDocuments.settitle("Testing Demo");
//		pages.FormsDocuments.clkonjurisdictionDetailscb(prop.getProperty("Federal"));
//		pages.FormsDocuments.clkoncategoryDetails1(prop.getProperty("Template_Forms"));
//		pages.FormsDocuments.setpublishdate(prop.getProperty("Publish_date"));
//		pages.FormsDocuments.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//
//	}
//	
//	@Test
//	public void Marijuana_Laws()
//
//	{
//		pages.FormsDocuments.clkontaboption(prop.getProperty("Forms_Documents"));
//		pages.FormsDocuments.clkontabsuboption(prop.getProperty("Marijuana_Laws"));
//		pages.FormsDocuments.clkonaddDocumentButton();
//		pages.FormsDocuments.settitle("Testing Demo");
//		pages.FormsDocuments.clkonjurisdictionDetailscb(prop.getProperty("Federal"));
//		pages.FormsDocuments.clkoncategoryDetails1(prop.getProperty("Drug_Testing_Laws"));
//		pages.FormsDocuments.setpublishdate(prop.getProperty("Publish_date"));
//		pages.FormsDocuments.clkonuploadfileButton();
//		pages.LawSummaries.clkpublishbutton();
//
//	}
}

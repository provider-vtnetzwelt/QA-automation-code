package com.od.baseutil;

import org.openqa.selenium.WebDriver;

import com.od.pages.Add_Contact_Page;
import com.od.pages.DashBoard_Page;
import com.od.pages.FormsDocuments_page;
import com.od.pages.HB_Accounts_Page;
import com.od.pages.Inventory_Page;
import com.od.pages.LawSummaries_Page;
import com.od.pages.Login_Page;
import com.od.pages.Quick_Guides_Page;
import com.od.pages.QuoteOrSalesOrder_Page;
import com.od.util.WebActionUtil;

/**
 * Description: Initializes all pages with driver instance ,Explicit Time out,
 * WebAactionUtility using variables driver,ETO,WebactionUtil
 * 
 * @author :Vivek Dogra
 */
public class InitializePages {

	public DashBoard_Page dashBoardPage;
	public HB_Accounts_Page hbAccountsPage;
	public Login_Page loginPage;
	public Add_Contact_Page addContactPage;
	public Inventory_Page inventoryPage;
	public QuoteOrSalesOrder_Page quoteorSalesOrderPage;
	public LawSummaries_Page LawSummaries;
	public FormsDocuments_page FormsDocuments;
	public Quick_Guides_Page QuickGuides;
	
	public InitializePages(WebDriver driver, long ETO, WebActionUtil actionUtil) {
		LawSummaries = new LawSummaries_Page(driver, ETO, actionUtil);
		dashBoardPage = new DashBoard_Page(driver, ETO, actionUtil);
		hbAccountsPage = new HB_Accounts_Page(driver, ETO, actionUtil);
		loginPage = new Login_Page(driver, ETO, actionUtil);
		addContactPage = new Add_Contact_Page(driver, ETO, actionUtil);
		inventoryPage = new Inventory_Page(driver, ETO, actionUtil);
		quoteorSalesOrderPage = new QuoteOrSalesOrder_Page(driver, ETO, actionUtil);
		FormsDocuments = new FormsDocuments_page(driver, ETO, actionUtil);
		QuickGuides = new Quick_Guides_Page(driver, ETO, actionUtil);
	}

}

package com.od.testscripts;

import org.testng.annotations.Test;

import com.od.baseutil.BaseTest;
import com.od.dataproviders.DataProviderFactory;
import com.od.dataproviders.DataProviderFile;

public class LoginAppliction extends BaseTest {

	
	@Test
	public void login()
			
	{

		pages.loginPage.loginToApplication("neeraj.kaundal@vtnetzwelt.com", "Qwerty@123");
		
		
	
	} 

}
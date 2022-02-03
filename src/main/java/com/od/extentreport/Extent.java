package com.od.extentreport;
import com.od.baseutil.BaseTest;
import com.od.fileutils.FileVariables;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


/**
 * Description: Implements the creation of the Extent Html report with specified
 * name after loading the Extent config file from specified location.
 * 
 * @author Vivek Dogra
 */
public class Extent {
	
	private ExtentReports extent;
	FileVariables fileVariables = new FileVariables();
	/**
	 * Description: Creates of HTML report in specified path
	 * 
	 * @author  Vivek Dogra
	 * @param filepath
	 */
	public  ExtentReports getExtent(String filepath) {

		if (extent == null) {
			try {
				extent = new ExtentReports();
				extent.attachReporter(getHtmlReporter(filepath+  " _Report.html"));
				return extent; 
			} catch (Exception e) {
				BaseTest.logger.error("Exception while creating report html file.");
				
			}
		}
		return extent;
	}
	/**s
	 * Description :Loads the Extent-config file specified from the location
	 * 
	 * @author  Vivek Dogra
	 * @param filePath
	 */
	private static ExtentHtmlReporter getHtmlReporter(String filePath) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filePath);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "./config\\extent-config.xml");
		return htmlReporter;
	}

}

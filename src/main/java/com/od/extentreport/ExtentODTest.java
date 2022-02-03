package com.od.extentreport;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.od.baseutil.BaseTest;

/**
 * Description : Creates the HTML report based on the name specified.
 * @author Vivek Dogra
 * 
 */
public class ExtentODTest {
	private static ExtentTest extentTtest;
	private static ExtentReports extentReports;
	
	
	/**
	 * Description : Creates the HTML report based on the name specified
	 * @author Vivek Dogra
	 * @param name
	 */
	public static ExtentTest createTest(String name) {

		extentTtest = extentReports.createTest(name);
		return extentTtest;
	}

	public static ExtentReports getExtent() {
		return extentReports;
	}
	/**
	 * Description : Initializes report specified in the file path
	 * @author Vivek Dogra
	 * @param filepath
	 */
	public void initReport(String filepath) {
		extentReports = new Extent().getExtent(filepath);
		BaseTest.logger.info("Report Initiated");
	}

}

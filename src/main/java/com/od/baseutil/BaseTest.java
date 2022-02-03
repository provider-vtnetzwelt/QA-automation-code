package com.od.baseutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.od.extentreport.ExtentODManager;
import com.od.extentreport.ExtentODTest;
import com.od.fileutils.FileOperation;
import com.od.util.ApplicationUtil;
import com.od.util.WebActionUtil;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

/***********************************************************************
 * Description : Implements Application Precondition and Postcondition.
 * 
 * @author : Vivek Dogra
 * @BeforeSuite: Creates all the folder structure for Extent Reports
 * @BeforeClass : sets extent report.
 * @BeforeMethod :Launches the browser according to the browser name specified.
 * @Aftermethod : Closes the browser after completion of execution
 * @AfterSuite: Kills the driver (example chromedriver.exe) according to browser
 *              specified.
 */
public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger = LogManager.getLogger();
	public static final String CONFIGPATH = System.getProperty("user.dir") + "./config/config.properties";
	public static WebActionUtil actionUtil;
	public static ApplicationUtil applicationUtil;
	public static final int ITO = 10;
	public static final int ETO = 30;
	public static final String EXCELPATH = System.getProperty("user.dir") + "./src/main/resources/data/Data.xlsx";
	public static final String MESSAGESPATH = System.getProperty("user.dir")
			+ "./src/main/resources/data/messages.properties";
	public static InitializePages pages;
	ATUTestRecorder recorder;
	static {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(CONFIGPATH);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Description : Creates folder structure for Extent reports.
	 * 
	 * @author:Vivek Dogra
	 */
	@Parameters("browserName")
	@BeforeSuite(alwaysRun = true)
	public synchronized void createFolder(String browserName) {
		
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		try {
			recorder = new ATUTestRecorder(System.getProperty("user.dir")+"/video/","RecordedVideo-"+dateFormat.format(date),false);
			recorder.start();
			//recorder = new ATUTestRecorder("C:\\Users\\Netzwelt\\Documents\\vt\\OD-20220124T195045Z-001\\VT\\video","RecordedVideo-"+dateFormat.format(date),false);
		} catch (ATUTestRecorderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			logger.info("Folder creation for Extent");
			FileOperation fileOperation = new FileOperation();
			fileOperation.CreateFiles();
//			 driver = CreateDriver.getInstance().launchBrowser(browserName);
		} catch (Exception e) {
			logger.error("Exception while report inititation");
		}

	}

	/**
	 * Description: sets extent report
	 * 
	 * @author:Vivek Dogra
	 * 
	 */
	@BeforeClass
	public void setExtentReport() {
		try {
			ExtentTest parentExtentTest = ExtentODTest.createTest(getClass().getSimpleName());
			ExtentODManager.setParentReport(parentExtentTest);

//			logger = LogManager.getLogger(getClass().getName());
//			driver = CreateDriver.getInstance().launchBrowser(browserName);
//			actionUtil = new WebActionUtil(driver, ETO);
//			applicationUtil = new ApplicationUtil(driver, ETO);
//			if (driver.getWindowHandles().size() > 0) {
//				WebActionUtil.validationinfo(browserName + " Browser is launched", "blue");
//				WebActionUtil.info(browserName + " Browser is launched");
//			} else {
//				WebActionUtil.fail("Failed to launch the Browser");
//				WebActionUtil.error("Failed to launch the Browser");
//			}
//			// driver.get(prop.getProperty("App_URL"));
//			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
//			actionUtil.deleteXlFilesFromDownloads(System.getProperty("user.home") + "/Downloads");
//			driver.manage().window().maximize();
//			pages = new InitializePages(driver, ETO, actionUtil);
		} catch (Exception e) {
			WebActionUtil.error("Unable to create the node for class");
		}
	}

	/**
	 * Description: launches browser and creates node for extent report.
	 * 
	 * @author:Vivek Dogra
	 * @param:browserName
	 * @param: methodName
	 */
	@Parameters("browserName")
	@BeforeMethod
	public void launchBrowser(String browserName, Method methodName) {
		try {
			String description = methodName.getAnnotation(Test.class).description();
			ExtentTest testReport = ExtentODManager.getParentReport().createNode(methodName.getName(), description);
			ExtentODManager.setTestReport(testReport);
			 logger = LogManager.getLogger(getClass().getName());
			
			// driver = CreateDriver.getInstance().launchBrowser(browserName);
			 
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
			 actionUtil = new WebActionUtil(driver, ETO);
			 applicationUtil = new ApplicationUtil(driver, ETO);
			 if (driver.getWindowHandles().size() > 0) {
			 WebActionUtil.validationinfo(browserName + " Browser is launched", "blue");
			 WebActionUtil.info(browserName + " Browser is launched");
			 } else {
			 WebActionUtil.fail("Failed to launch the Browser");
			 WebActionUtil.error("Failed to launch the Browser");
			 }
			  driver.get(prop.getProperty("App_URL"));
			  
			  
			 driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			 actionUtil.deleteXlFilesFromDownloads(System.getProperty("user.home") +
			 "/Downloads");
			 driver.manage().window().maximize();
			 pages = new InitializePages(driver, ETO, actionUtil);
			 pages.loginPage.loginToApplication(prop.getProperty("UserName"), prop.getProperty("Password"));
			 actionUtil.waitForAngularPageToLoad();
		} catch (Throwable e) {
			WebActionUtil.fail("Failed to launch the Browser");
			WebActionUtil.error("Failed to launch the Browser");
		}

	}
	/**
	 * Description: Browser is closed
	 * 
	 * @author:Vivek Dogra
	 
	 */
	
	@AfterMethod
	public void browserclose() {
		
		try {
			driver.close();
			actionUtil.info("Browser is closed sucessfuly");
		} catch (Exception e) {
			actionUtil.error(e.getMessage());
			actionUtil.fail("Browser is unable to closed ");
		}
		
		
		
	}
	

	 /**
	 * Description: Kills browser
	 *
	 * @author:
	 *
	 */
	 @AfterMethod
	 public void killBrowser() {
//	 try {
//	 if (driver != null) {
//	
//	 driver.quit();
//	
//	 } else {
//	 WebActionUtil.error("Failed to close the Browser");
//	 }
//	 } catch (Exception e) {
//	 WebActionUtil.error("Failed to close the Browser");
//	 }
	 }

//	/**
//	 * Description: Kills browser
//	 * 
//	 * @author:Shreya U
//	 * 
//	 */
//	@AfterClass
//	public void killBrowser() {
//		try {
//			if (driver != null) {
//
//				driver.quit();
//
//			} else {
//				WebActionUtil.error("Failed to close the Browser");
//			}
//		} catch (Exception e) {
//			WebActionUtil.error("Failed to close the Browser");
//		}
//	}

	/**
	 * Description: Kills drivers.
	 * 
	 * @author:vivek
	 * @param:browserName
	 */
	@Parameters("browserName")
	@AfterSuite
	public synchronized void killTask(String browserName) {
		 try {
		 if (driver != null) {
		 recorder.stop();
		 driver.quit();
		
		 } else {
		 WebActionUtil.error("Failed to close the Browser");
		 }
		 } catch (Exception e) {
		 WebActionUtil.error("Failed to close the Browser");
		 }
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			} else if (browserName.equalsIgnoreCase("firefox")) {
				Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
			} else if (browserName.equalsIgnoreCase("edge")) {
				Runtime.getRuntime().exec("taskkill /F /IM MicrosoftEdgeCP.exe");
			} else {
				logger.error("Browser name not specified properly to kill the task");
			}

		} catch (IOException e) {
			WebActionUtil.error("Unable to kill the task for " + browserName);
		}
		
	}
}

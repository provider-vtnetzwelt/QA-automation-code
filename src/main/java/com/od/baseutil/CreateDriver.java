package com.od.baseutil;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDriver {

	private static CreateDriver instance = null;

	private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	/* constructor */
	private CreateDriver() {
	}

	/**
	 * getInstance method to retrieve active driver instance
	 *
	 * @return CreateDriver
	 */
	public static CreateDriver getInstance() {
		if (instance == null) {
			instance = new CreateDriver();
		}
		return instance;
	}

	/**
	 * Description :Sets the driver instance
	 * 
	 * @author Aatish Slathia ,Shreya, Vivek
	 * @param browser
	 * 
	 */

	public WebDriver setDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		} else if (browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		} else if (browser == "Edge") {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		} else {

		}
		return null;
	}

	/**
	 * Description :Sets the driver instance
	 * 
	 * @author Aatish Slathia ,Shreya, Vivek
	 * @param browser
	 * 
	 */

	/**
	 * Description :Sets the capabilities of web driver according to the Browser
	 * 
	 * @author Aatish Slathia ,Shreya, Vivek
	 * @param browser
	 * @param capabilities
	 * 
	 */

	public DesiredCapabilities setWebDriverCapabilities(String browser) {
		DesiredCapabilities capabilities;

		switch (browser) {
		case "ie":
			capabilities = new DesiredCapabilities().internetExplorer();
			break;
		case "firefox":
			capabilities = new DesiredCapabilities().firefox();
			break;
		case "chrome":
			capabilities = new DesiredCapabilities().chrome();
			break;
		case "edge":
			capabilities = new DesiredCapabilities().edge();
			break;
		case "safari":
			capabilities = new DesiredCapabilities().safari();
			break;
		default:
			capabilities = null;
		}

		return capabilities;
	}

	/**
	 * Description :Sets the capabilities of web driver according to the Browser
	 * 
	 * @author Aatish Slathia ,Shreya, Vivek
	 * @param browser
	 * @param capabilities
	 * @param LOCAL_HUB_URL
	 * 
	 */
	public WebDriver setWebDriverGrid(String browser, String LOCAL_HUB_URL) throws IOException {

		DesiredCapabilities capabilities;
		switch (browser) {
		case "Ie":
			capabilities = new DesiredCapabilities().internetExplorer();
			break;
		case "Firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setHeadless(true);
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile testprofile = profile.getProfile(null);
			testprofile.setPreference("dom.webnotifications.enabled", false);
			testprofile.setPreference("dom.push.enabled", false);
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(BrowserType.FIREFOX);
			capabilities.setCapability(FirefoxDriver.PROFILE, testprofile);
			capabilities.setCapability(firefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
			firefoxOptions.merge(capabilities);
			break;
		case "Chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--disable-popup-blocking");
			chromeOptions.addArguments("--disable-infobars");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(BrowserType.CHROME);
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeOptions.merge(capabilities);
			break;
		case "Edge":
			EdgeOptions edgeoptions = new EdgeOptions();
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(BrowserType.EDGE);
			capabilities.setPlatform(Platform.WINDOWS);
			break;
		case "Safari":
			capabilities = new DesiredCapabilities().safari();
			break;
		default:
			capabilities = null;
		}

		try {
			return new RemoteWebDriver(new URL(LOCAL_HUB_URL), capabilities);

		} catch (MalformedURLException e) {

		}
		return null;
	}

	/**
	 * Description :Sets the driver instance
	 * 
	 * @author Aatish Slathia ,Shreya, Vivek
	 * @param browser
	 * 
	 */
	public WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("debuggerAddress", "127.0.0.1:1111");
			return new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			return new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/EdgeDriver.exe");
			return new EdgeDriver();
		} else {
			return null;
		}

	}
}

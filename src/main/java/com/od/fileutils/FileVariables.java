package com.od.fileutils;




import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Description : Implements creation of file variables required to perform various file operations.
 * @author: Vivek Dogra
 *  
 */
public class FileVariables {
	private String extentDir;
	private static String screenShotPath;
	private String sStartTime;
	private String extentReportFolderPath;
	private Date date;
	private SimpleDateFormat sdf;
	private String sDate;
	private String hash;
	/**
	 * Description:Gets the  screenshot path 
	 * @author:Vivek Dogra
	 * @param screenShotPath
	 */
	public static String getScreenShotPath() {
		return screenShotPath;
	}
	/**
	 * Description:Sets the  screenshot path 
	 * @author:Vivek Dogra
	 * @param screenShotPath
	 */
	public void setScreenShotPath(String screenShotPath) {
		FileVariables.screenShotPath = screenShotPath;
	}

	/**
	 * Description:Gets start time
	 * @author:Vivek Dogra
	 * @return sStartTime
	 */

	public String getsStartTime() {
		return sStartTime;
	}
	/**
	 * Description:Sets the  start time 
	 * @author:Vivek Dogra
	 * @param sStartTime
	 */
	public void setsStartTime(String sStartTime) {
		this.sStartTime = sStartTime;
	}
	/**
	 * Description:Gets Extent report folder path
	 * @author:Vivek Dogra
	 * @return extentReportFolderPath
	 */
	public String getExtentReportFolderPath() {
		return extentReportFolderPath;
	}
	/**
	 * Description:Sets the  Extent report folder path 
	 * @author:Vivek Dogra
	 * @param extentReportFolderPath
	 */
	public void setExtentReportFolderPath(String extentReportFolderPath) {
		this.extentReportFolderPath = extentReportFolderPath;
	}
	/**
	 * Description:Gets Date
	 * @author:Vivek Dogra
	 * @return date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Description:Sets the  date 
	 * @author:Vivek Dogra
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * Description:Gets simple date format
	 * @author:Vivek Dogra
	 * @return sdf
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	/**
	 * Description:Sets the simple date format
	 * @author:Vivek Dogra
	 * @param sdf
	 */
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	/**
	 * Description:Gets Date
	 * @author:Vivek Dogra
	 * @return sDate
	 */
	public String getsDate() {
		return sDate;
	}
	/**
	 * Description:Sets the date
	 * @author:Vivek Dogra
	 * @param sDate
	 */
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	/**
	 * Description:Gets Hash
	 * @author:Vivek Dogra
	 * @return hash
	 */
	public String getHash() {
		return hash;
	}
	/**
	 * Description Sets the hash
	 * @author:,Vivek Dogra
	 * @param  hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	/**
	 * Description:Gets extent directory
	 * @author:Vivek Dogra
	 * @return extentDir
	 */
	public String getExtentDir() {
		return extentDir;
	}
	/**
	 * Description:Sets extent dir
	 * @author:Vivek Dogra
	 * @param extentDir
	 */
	public void setExtentDir(String extentDir) {
		this.extentDir = extentDir;
	}
}

package com.blazeclan.qa.reports;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.constants.IConstants;

public class ExtentManager extends CommonFunctions{
  public static final ExtentReports extentReports= new ExtentReports();
   public synchronized static ExtentReports createExtentReports() {
	   Properties prop= CommonFunctions.init_properties(IConstants.EXTENT_CONFIG_PATH);
	   ExtentSparkReporter reporter = new ExtentSparkReporter(prop.getProperty("OutputDirectory"));
	   reporter.config().setReportName(prop.getProperty("ReportName"));
	   extentReports.attachReporter(reporter);
	   extentReports.setSystemInfo("Branch Name", prop.getProperty("BranchName"));
	   extentReports.setSystemInfo("Author", prop.getProperty("Author"));
	   extentReports.setSystemInfo("Platform", String.valueOf(((RemoteWebDriver)driver).getCapabilities().getPlatformName()));
	   
	   
	   return extentReports;
	   
   }
}

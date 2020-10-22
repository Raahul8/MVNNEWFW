package com.vtiger.org;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{

	@Test
	public void login() throws IOException 
	{
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Advance_Report/TestRep.html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Environment", "Window");
		extent.setSystemInfo("Reporter", "Rahul Raj");
		
		
		ExtentTest logger = extent.createTest("Login");
		logger.log(Status.INFO,"Login to page");
		logger.log(Status.PASS,"Login to Homepage");
		logger.log(Status.PASS,"Login to Userpage");
		
		extent.flush();
		
		ExtentTest logger2 = extent.createTest("Loginoff");
		logger2.log(Status.INFO,"Login to page");
		logger2.log(Status.WARNING,"Login to Userpage");
		logger2.log(Status.FAIL,"Login to Homepage");
		
		//logger2.addScreenCaptureFromPath("\"C:\\Users\\sanskrity raj\\Desktop\\Failed.png\"");
		
		
		extent.flush();
		
		
	}		
	}


package com.salesforce.dev.framework;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.io.IOException;
import java.util.Date;


/**
 * Created by Marcelo.Vargas on 6/22/2015.
 */
public class TestListener implements ITestListener {
    WebDriver driver;
    String filePath = "src\\test\\results";

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Execution Start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("***** Error " + result.getName() + " test has failed *****");
        String methodName = result.getName().toString().trim();
        takeScreenShot(methodName);
    }

    public void takeScreenShot(String methodName) {
        driver = DriverManager.getInstance().getDriver();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            File myFile = new File(filePath + "\\" + methodName + ".png");
            FileUtils.copyFile(scrFile, myFile);
            System.out.println("***Placed screen shot in "+filePath+" ***");
            reportLogScreenshot(myFile);
        } catch (IOException e) {
            System.out.println("___ catch exception");
            e.printStackTrace();
        }
    }

    protected void reportLogScreenshot(File file) {
        System.setProperty("org.uncommons.reportng.escape-output", "false");

        String absolute = file.getAbsolutePath();
        int beginIndex = absolute.indexOf(".");
        String relative = absolute.substring(beginIndex).replace(".\\","");

        Reporter.log("<p align=\"left\">Error screenshot at " + new Date()+ "</p>");
        Reporter.log("<p><img width=\"1024\" src=\"" + file.getAbsoluteFile()  + "\" alt=\"screenshot at " + new Date()+ "\"/></p><br />");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}

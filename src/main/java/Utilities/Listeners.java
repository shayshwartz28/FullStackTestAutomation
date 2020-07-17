package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonOps implements ITestListener
{
    public void onStart(ITestContext execution)
    {
        System.out.println("------------{ Starting Execution }------------");
    }

    public void onFinish(ITestContext execution)
    {
        System.out.println("------------{ Ending Execution }------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        System.out.println("------------{ NOT all Tests have passed: " + arg0 + " }------------");
    }

    public void onTestSkipped(ITestResult test)
    {
        System.out.println("------------{ Skipping Test: " + test.getName() + " }------------");
    }

    public void onTestStart(ITestResult test)
    {
        System.out.println("------------{ Starting Test: " + test.getName() + " }------------");
    }

    public void onTestSuccess(ITestResult test)
    {
        System.out.println("------------{ Test: " + test.getName() + " - Passed }------------");
    }

    public void onTestFailure(ITestResult test)
    {
        System.out.println("------------{ Test: "  + test.getName() + " - Failed }------------");

        if(!getData("PlatformName").equalsIgnoreCase("api"))
            saveScreenShot();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenShot()
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}

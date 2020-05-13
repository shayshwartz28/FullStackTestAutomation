package WorkFlows;

//-------------------------------------
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.By;
//-------------------------------------

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.remote.RemoteWebDriver;
import Extensions.uiActions;
import Utilities.base;
import Utilities.commonOps;
import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mortgageMobileFlow extends commonOps
{
    @Step("Fill in form and Calculate Mortgage")
    public static void calculateMortgage(String amount, String term, String rate)
    {
        uiActions.updateText(mortgageMainPage.text_Amount, amount);
        uiActions.updateText(mortgageMainPage.text_Term, term);
        uiActions.updateText(mortgageMainPage.text_Rate, rate);
        uiActions.click(mortgageMainPage.btn_Calculate);
    }

    @Step("Verify saved monthly repayments")
    public static void verifySavedCalculations()
    {
//        List <WebElement> viewGroup = mortgageSavedRepaymentPage.header_ViewGroup;
//
//        for (int i = 0; i < viewGroup.size(); i++)
//        {
//            System.out.println(viewGroup.get(i).getText());
//        }
//       uiActions.click(mortgageSavedRepaymentPage.header_saveddddd); // Doesn't work

//            MobileDriver.swipe(956, 222, 436, 222, 2000); //saved button
//        MobileDriver.swipe(436, 222, 956, 222, 1500);
//        TouchAction touchAction = new TouchAction((base.MobileDriver));
//        WebElement calculator = driver.findElement(By.xpath("//*[@text='Calculator']"));
//        WebElement saved = driver.findElement(By.xpath("//*[@text='Saved']"));
//        touchAction.press(calculator)
//                .waitAction(200)
//                .moveTo(saved)
//                .release()
//                .perform();
//
//        public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
//        Dimension size = driver.manage().window().getSize();
//        int anchor = (int) (size.height * anchorPercentage);
//        int startPoint = (int) (size.width * startPercentage);
//        int endPoint = (int) (size.width * finalPercentage);
//        new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
//
//
//        swipeHorizontal(driver,0.9,0.01,0.5,3000); // Start X and Start second X, Y, Duration
//        In documentation they mention moveTo coordinates are relative to initial ones, but thats not happening. When it does we need to use the function below
//        new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint-startPoint,0).release().perform();
    }
}

package WorkFlows;

import org.openqa.selenium.remote.RemoteWebDriver;
import Extensions.uiActions;
import Utilities.base;
import Utilities.commonOps;
import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;

import java.util.List;

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
} 

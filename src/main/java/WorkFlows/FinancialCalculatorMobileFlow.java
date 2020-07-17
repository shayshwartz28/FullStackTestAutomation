package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FinancialCalculatorMobileFlow extends CommonOps
{
    @Step("Verify Percentage Calculations")
    public static void enterAppCheckCalculations(String xPercentFromY, String xPercentFromYAmount, String percentXFromY, String percentXFromYAmount, String PercentChangeFrom, String PercentChangeTo)
    {
        UIActions.click(financialCalculatorAppsMainPage.icon_Percentage_Calculator);

        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y,xPercentFromY);
        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y_Amount,xPercentFromYAmount);

        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageOf_Y,percentXFromY);
        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageOf_Y_Amount,percentXFromYAmount);

        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_Percentage_Change_X,PercentChangeFrom);
        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_Percentage_Change_Y,PercentChangeTo);
    }

    @Step("Verify Input and reset button")
    public static void verifyLayoutResult(String xPercentFromY, String xPercentFromYAmount)
    {
        List <WebElement> layoutResult = financialCalculatorAppsPercentageApp.text_Value_Result_Layout;
        driver.navigate().back();

        UIActions.click(financialCalculatorAppsMainPage.icon_Percentage_Calculator);
        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y,xPercentFromY);
        UIActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y_Amount,xPercentFromYAmount);
        UIActions.click(financialCalculatorAppsPercentageApp.btn_Reset_X_Per_Of_Y);
        driver.navigate().back();
    }
}

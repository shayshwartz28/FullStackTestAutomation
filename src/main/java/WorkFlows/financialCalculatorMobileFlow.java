package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.util.List;

public class financialCalculatorMobileFlow extends commonOps
{
    @Step("Verify Percentage Calculations")
    public static void enterAppCheckCalculations(String xPercentFromY, String xPercentFromYAmount, String percentXFromY, String percentXFromYAmount, String PercentChangeFrom, String PercentChangeTo)
    {
        uiActions.click(financialCalculatorAppsMainPage.icon_Percentage_Calculator);

        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y,xPercentFromY);
        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y_Amount,xPercentFromYAmount);

        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageOf_Y,percentXFromY);
        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageOf_Y_Amount,percentXFromYAmount);

        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_Percentage_Change_X,PercentChangeFrom);
        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_Percentage_Change_Y,PercentChangeTo);
    }

    @Step("Verify Input")
    public static void verifyLayoutResult(String xPercentFromY, String xPercentFromYAmount) throws Exception
    {
        List <WebElement> layoutResult = financialCalculatorAppsPercentageApp.text_Value_Result_Layout;
        System.out.println("The size of the list is: " + layoutResult.size() + " <-----------");

        uiActions.click(financialCalculatorAppsMainPage.icon_Percentage_Calculator);
        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y,xPercentFromY);
        uiActions.updateText(financialCalculatorAppsPercentageApp.textField_X_PercentageFrom_Y_Amount,xPercentFromYAmount);

        System.out.println("The size of the list is: " + layoutResult.size()+ " <-----------" );

        uiActions.click(financialCalculatorAppsPercentageApp.btn_Reset_X_Per_Of_Y);

        //assertTrue(MenuItemLayoutHelper.LayoutResult.isEmpty(),"The List is empty --> no Element that show the Result after reset."); //YONI - Use here in assertion or in the Sanity??

        System.out.println("The size of the list is: " + layoutResult.size() + " <-----------");
    }
}

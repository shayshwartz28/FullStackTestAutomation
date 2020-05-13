package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class desktopCalculatorFlow extends commonOps
{
    @Step("Calculate Addition")
    public static void calculateAddition()
    {
        uiActions.click(calcMain.btn_Open_Navigation);
        uiActions.click(calcMain.btn_Standard_Calculator);
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Addition);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Subtraction")
    public static void calculateSubtraction()
    {
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Eight);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Subtraction);
        uiActions.click(calcMain.btn_Eight);
        uiActions.click(calcMain.btn_Zero);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Division")
    public static void calculateDivision()
    {
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Seven);
        uiActions.click(calcMain.btn_Division);
        uiActions.click(calcMain.btn_Seven);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Multiplication")
    public static void calculateMultiplication()
    {
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Eight);
        uiActions.click(calcMain.btn_Multiplication);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Currency Exchange")
    public static void calculateCurrencyExchange()
    {
        uiActions.click(calcMain.btn_Open_Navigation);
        uiActions.click(calcMain.btn_Currency_Exchange);
        uiActions.click(currencyExchangeCalculator.btn_Clear_Entry);
        uiActions.click(currencyExchangeCalculator.input_Input_Unit);
        uiActions.click(currencyExchangeCalculator.text_Japan_Yen_Coin);
        uiActions.click(currencyExchangeCalculator.btn_One);
        uiActions.click(currencyExchangeCalculator.btn_Zero);
        uiActions.click(currencyExchangeCalculator.input_OutPut_Unit);
        uiActions.click(currencyExchangeCalculator.text_Israel_Shekel_Coin);

       //YONI -- How to do scroll down to USA DOllLAR? ClickablePoint: true | {x:2741 y:1022} for USA Dollar
    }
}

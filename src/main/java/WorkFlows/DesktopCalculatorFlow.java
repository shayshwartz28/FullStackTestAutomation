package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class DesktopCalculatorFlow extends CommonOps
{
    @Step("Calculate Addition")
    public static void calculateAddition()
    {
        UIActions.click(calcMain.btn_Open_Navigation);
        UIActions.click(calcMain.btn_Standard_Calculator);
        UIActions.click(calcMain.btn_Clear);
        UIActions.click(calcMain.btn_Four);
        UIActions.click(calcMain.btn_Addition);
        UIActions.click(calcMain.btn_Four);
        UIActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Subtraction")
    public static void calculateSubtraction()
    {
        UIActions.click(calcMain.btn_Clear);
        UIActions.click(calcMain.btn_Eight);
        UIActions.click(calcMain.btn_One);
        UIActions.click(calcMain.btn_Subtraction);
        UIActions.click(calcMain.btn_Eight);
        UIActions.click(calcMain.btn_Zero);
        UIActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Division")
    public static void calculateDivision()
    {
        UIActions.click(calcMain.btn_Clear);
        UIActions.click(calcMain.btn_Seven);
        UIActions.click(calcMain.btn_Division);
        UIActions.click(calcMain.btn_Seven);
        UIActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Multiplication")
    public static void calculateMultiplication()
    {
        UIActions.click(calcMain.btn_Clear);
        UIActions.click(calcMain.btn_Eight);
        UIActions.click(calcMain.btn_Multiplication);
        UIActions.click(calcMain.btn_Four);
        UIActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Currency Exchange")
    public static void calculateCurrencyExchange()
    {
        UIActions.click(calcMain.btn_Open_Navigation);
        UIActions.click(calcMain.btn_Currency_Exchange);
        UIActions.click(currencyExchangeCalculator.btn_Clear_Entry);
        UIActions.click(currencyExchangeCalculator.input_Input_Unit);
        UIActions.click(currencyExchangeCalculator.text_Japan_Yen_Coin);
        UIActions.click(calcMain.btn_One);
        UIActions.click(calcMain.btn_Zero);
        UIActions.click(currencyExchangeCalculator.input_OutPut_Unit);
        UIActions.click(currencyExchangeCalculator.text_Israel_Shekel_Coin);
    }
}

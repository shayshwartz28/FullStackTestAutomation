package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.desktopCalculatorFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class calculatorDesktop extends commonOps
{
    // WinAppDriver running in the background is required in order to operate the test's

    @Test(priority = 0, description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void test01_Addition()
    {
        String expectedResult = "8";

        desktopCalculatorFlow.calculateAddition();
        verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 1, description = "Test02: Verify Subtraction Command")
    @Description("Test Description: Verify Subtraction Command in Calculator")
    public void test02_Subtraction()
    {
        String expectedResult = "1";

        desktopCalculatorFlow.calculateSubtraction();
        verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 2, description = "Test03: Verify Multiplication Command")
    @Description("Test Description: Verify Multiplication Command in Calculator")
    public void test03_Multiplication()
    {
        String expectedResult = "32";

        desktopCalculatorFlow.calculateMultiplication();
        verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 3, description = "Test04: Verify Division Command")
    @Description("Test Description: Verify Division Command in Calculator")
    public void test04_Division()
    {
        String expectedResult = "1";

        desktopCalculatorFlow.calculateDivision();
        verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 4, description = "Test05: Calculate Currency Change")
    @Description("Test Description: Verify Currency Change in Calculator")
    public void test05_CurrencyChange()
    {
        String expectedResult = "0.33";

        desktopCalculatorFlow.calculateCurrencyExchange();
        verifications.textInElementAssertEquals(currencyExchangeCalculator.input_Second_Currency, expectedResult);
    }
}

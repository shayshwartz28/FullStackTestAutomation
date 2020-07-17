package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.DesktopCalculatorFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps
{
    // WinAppDriver running in the background is required in order to execute the test's

    @Test(priority = 0, description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void test01_Addition()
    {
        String expectedResult = "8";

        DesktopCalculatorFlow.calculateAddition();
        Verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 1, description = "Test02: Verify Subtraction Command")
    @Description("Test Description: Verify Subtraction Command in Calculator")
    public void test02_Subtraction()
    {
        String expectedResult = "1";

        DesktopCalculatorFlow.calculateSubtraction();
        Verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 2, description = "Test03: Verify Multiplication Command")
    @Description("Test Description: Verify Multiplication Command in Calculator")
    public void test03_Multiplication()
    {
        String expectedResult = "32";

        DesktopCalculatorFlow.calculateMultiplication();
        Verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 3, description = "Test04: Verify Division Command")
    @Description("Test Description: Verify Division Command in Calculator")
    public void test04_Division()
    {
        String expectedResult = "1";

        DesktopCalculatorFlow.calculateDivision();
        Verifications.textInElementAssertEquals(calcMain.btn_Field_Result, expectedResult);
    }

    @Test(priority = 4, description = "Test05: Calculate Currency Change")
    @Description("Test Description: Verify Currency Change in Calculator")
    public void test05_CurrencyChange()
    {
        String expectedResult = "0.33";

        DesktopCalculatorFlow.calculateCurrencyExchange();
        Verifications.textInElementAssertEquals(currencyExchangeCalculator.input_Second_Currency, expectedResult);
    }
}

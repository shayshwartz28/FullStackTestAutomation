package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.FinancialCalculatorMobileFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class FinancialCalculatorMobile extends CommonOps
{
    @Test(priority = 0, description = "Test01: Enter Percentage calculator application")
    @Description("Test Description: Enter Percentage calculator application and verify the conversions")
    public void test01_PercentageCalculatorVerification()
    {
        FinancialCalculatorMobileFlow.enterAppCheckCalculations("10", "100", "10",
                "100", "100", "10");

        Verifications.textInElementAssertEquals(financialCalculatorAppsPercentageApp.text_X_FROM_Y_Value_Result,"10.0000");
        Verifications.textInElementAssertEquals(financialCalculatorAppsPercentageApp.text_X_Percent_Value_Result,"10.0000%");
        Verifications.textInElementAssertEquals(financialCalculatorAppsPercentageApp.text_Percentage_Change_Result,"-90.0000%");
    }

    @Test(priority = 1, description = "Test02: Check value result layout as disappeared ")
    @Description("Test Description: Enter Percentage calculator app, put input, see the result, delete result and verify its disappeared")
    public void test02_CheckResultDisappeared()
    {
        int expectedElementsInList = 0;
        String xPerFromY = "10";
        String xPerFromYAmount = "100";

        FinancialCalculatorMobileFlow.verifyLayoutResult(xPerFromY, xPerFromYAmount);
        Verifications.verifyListIsEmpty(financialCalculatorAppsPercentageApp.text_Value_Result_Layout);
    }

    @Test(priority = 2, description = "Test03: Verify two Logos are identical")
    @Description("Test Description: Compare pictures of two logos and verifies they identical")
    public void test03_comparingTwoLogos() throws Exception
    {
        Verifications.visualElement(financialCalculatorAppsMainPage.icon_Regular_Calculator,
                "FinancialCalculator_Regular_Calculator_Version_1.00"); // This will --> NOT <-- activate the Assertion Error
    }
}

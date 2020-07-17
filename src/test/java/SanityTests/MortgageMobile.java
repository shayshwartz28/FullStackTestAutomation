package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.MortgageMobileFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class MortgageMobile extends CommonOps
{
    @Test(priority = 0, description = "Test01: Verify Mortgage")
    @Description("Test Description: Fill in Mortgage fields and calculate the repayment")
    public void test01_VerifyMortgageRepayment()
    {
        MortgageMobileFlow.calculateMortgage("1000", "3", "4");
        Verifications.textInElementAssertEquals(mortgageMainPage.text_Repayment, "£30.03");
    }
}

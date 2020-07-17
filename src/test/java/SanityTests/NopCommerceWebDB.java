package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.NopCommerceWebFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class NopCommerceWebDB extends CommonOps
{
    @Test(priority = 0, description = "Test01: Login to nopCommerce with DB")
    @Description("Test Description: Login to nopCommerce Web Application with DB")
    public void test01_loginDB() throws InterruptedException
    {
        NopCommerceWebFlow.loginWithDB(); // Real password is 1234567
        Verifications.testInElementAssertTrueIsDisplayed(nopCommerceLogin.txt_PopUp_login_Failed);
    }
}

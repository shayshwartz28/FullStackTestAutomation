package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.nopCommerceWebFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Utilities.base.nopCommerceRegister;

@Listeners(Utilities.Listeners.class)
public class nopCommerceWebDB extends commonOps
{
    @Test(priority = 0, description = "Test01: Login to nopCommerce with DB")
    @Description("Test Description: Login to nopCommerce Web Application with DB")
    public void test01_loginDB() throws InterruptedException
    {
        nopCommerceWebFlow.loginWithDB(); // Real password is 1234567
        verifications.testInElementAssertTrueIsDisplayed(nopCommerceLogin.txt_PopUp_login_Failed);
    }
}

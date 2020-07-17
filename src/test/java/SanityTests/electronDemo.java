package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ElectronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class electronDemo extends CommonOps
{
    @Test(priority = 0, description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Getting the Resolution from App and Verify it")
    public void test01_getScreenInfo()
    {
        String expectedResolution = "Your screen is: 1920px x 1080px";

        ElectronFlow.getScreenInfo();
        Verifications.textInElementAssertEquals(electronMain.field_Screen_Info, expectedResolution);
    }
}

package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.nopCommerceWebFlow;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test(description = "Taking photo of the camera name")
    public void createScreenShotComparingCameraPicture()
    {
        nopCommerceWebFlow.validationOfShoppingCart("Price: High to Low");
        helperMethods.takeElementScreenShot(nopCommerceValidationOfShoppingCart.pic_Camera_Photo_Comparing, "NopCommerce_LeicaT_Photo_Version_1.00");
    }
 
    @Test(description = "Taking photo of the regular calculator logo")
    public void createScreenShotComparingTwoLogos()
    {
        helperMethods.takeElementScreenShot(financialCalculatorAppsMainPage.icon_Regular_Calculator, "FinancialCalculator_Regular_Calculator_Version_1.00");
    }
}

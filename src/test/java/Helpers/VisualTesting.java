package Helpers;

import Utilities.CommonOps;
import Utilities.HelperMethods;
import WorkFlows.NopCommerceWebFlow;
import org.testng.annotations.Test;

public class VisualTesting extends CommonOps
{
    @Test(description = "Taking photo of the camera name")
    public void createScreenShotComparingCameraPicture()
    {
        NopCommerceWebFlow.validationOfShoppingCart("Price: High to Low");
        HelperMethods.takeElementScreenShot(nopCommerceValidationOfShoppingCart.pic_Camera_Photo_Comparing, "NopCommerce_LeicaT_Photo_Version_1.00");
    }

    @Test(description = "Taking photo of the regular calculator logo")
    public void createScreenShotComparingTwoLogos()
    {
        HelperMethods.takeElementScreenShot(financialCalculatorAppsMainPage.icon_Regular_Calculator, "FinancialCalculator_Regular_Calculator_Version_1.00");
    }
}

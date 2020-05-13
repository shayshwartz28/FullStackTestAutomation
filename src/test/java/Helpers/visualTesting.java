package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.nopCommerceWebFlow;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test(description = "Taking photo of the camera name")
    public void createScreenShot()
    {
        nopCommerceWebFlow.validationOfShoppingCart("Price: High to Low");
        helperMethods.takeElementScreenShot(nopCommerceValidationOfShoopingCart.pic_CameraPhotoComparing, "CameraPictureVersion1.00");
    }

    @Test(description = "Taking photo of the camera name")
    public void createScreenShot2()
    {
        nopCommerceWebFlow.validationOfShoppingCart("Price: High to Low");
        helperMethods.takeElementScreenShot(nopCommerceValidationOfShoopingCart.pic_CameraPhotoComparing2, "CameraPictureVersion1.00_LeicaT");
    }


    @Test(description = "Taking photo of the regular calculator logo")
    public void createScreenShotComparingTwoLogos()
    {
        helperMethods.takeElementScreenShot(financialCalculatorAppsMainPage.icon_CreditCard_Payoff_Calculator, "CameraPictureCreditCardPayoffCalculator1.00");
    }

    @Test(description = "Taking photo of the Bond calculator logo")
    public void createScreenShotComparingTwoLogosTwo()
    {
        helperMethods.takeElementScreenShot(financialCalculatorAppsMainPage.icon_Bond_Calculator, "CameraPictureBondCalculatorVersion1.00");
    }
}

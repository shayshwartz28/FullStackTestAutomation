package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.NopCommerceWebFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class nopCommerceWeb extends CommonOps
{
    @Test(priority = 0, description = "Test01: Register to nopCommerce")
    @Description("Test Description: Register to nopCommerce Web Application")
    public void test01_register()
    {
        NopCommerceWebFlow.register("shay", "shosho", "28", "May", "1989", "kuku222@",
                "kuku2", "12345678", "1234578");
        Verifications.testInElementAssertTrueIsDisplayed(nopCommerceRegister.txt_User_Email_Register_Error);
    }

    @Test(priority = 1, description = "Test02: Login to nopCommerce")
    @Description("Test Description: Login to nopCommerce Web Application")
    public void test02_login() throws InterruptedException
    {
        NopCommerceWebFlow.login("kuku@gmail.com", "123456789"); // Real password is 1234567
        Verifications.testInElementAssertTrueIsDisplayed(nopCommerceLogin.txt_PopUp_login_Failed);
    }

    @Test(priority = 2, description = "Test03: Verify number of elements")
    @Description("Test Description: Selecting product Category and subcategory, verifies number of cameras and that the prices are sort, Should be 3 products")
    public void test03_comparingCameras()
    {
        int expectedElementsInList = 3;

        NopCommerceWebFlow.checkCamerasPriceBySort("Price: Low to High");
        Verifications.numberOfElementsInList(nopCommerceCameraAndPhotoPage.txt_cameras_Prices, expectedElementsInList);
    }

    @Test(priority = 3, description = "Test04: Verify Cameras name")
    @Description("Test Description: Selecting product Category and subcategory")
    public void test04_verifyCamerasNameByOrder()
    {
        String [] expectedCamerasName = {"Apple iCam", "Nikon D5500 DSLR", "Leica T Mirrorless Digital Camera"};

        NopCommerceWebFlow.verifyCamerasName("Price: High to Low");
        Verifications.testInElementVerifyListNamesToExpectedArrayNames(nopCommerceCameraAndPhotoPage.txt_cameras_Title, expectedCamerasName);
    }

    @Test(priority = 4, description = "Test05: Validation of adding product to shoppingCart")
    @Description("Test Description: Select category and subcategory, adding product and verify it by message that displayed")
    public void test05_validationOfAddingProductToShoppingCart()
    {
        NopCommerceWebFlow.validationOfShoppingCart("Price: High to Low");
        Verifications.testInElementAssertTrueIsDisplayed(nopCommerceValidationOfShoppingCart.msg_ProductAdded);
    }

    @Test(priority = 5, description = "Test06: Verify Quantity and total Sum")
    @Description("Test Description: Add product to shoppingCart, change the Quantity and verify the total Sum")
    public void test06_addNewItemAndVerifySumOfMoney() throws InterruptedException
    {
        String expectedValue = "$1,060.00";
        String expectedQuantity = "2";

        NopCommerceWebFlow.addItemAndVerifyTotalPrice("Price: High to Low");
        Verifications.textInElementAssertEquals(nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Total_Money, expectedValue);
        Verifications.textInElementAssertEqualsAttribute(nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity, expectedQuantity);
    }

    @Test(priority = 6, description = "Test07: Validation of Maximum Rating")
    @Description("Test Description: Check that the product Rating it not above Maximum that been chosen")
    public void test07_productRating()
    {
        int maximumRating = 100; //The rating currently to 22/05/2020 is: 100

        NopCommerceWebFlow.verifyRating(nopCommerceSearchPage.logo_Rating,"apple"); // The product is: "Apple MacBook Pro 13-inch"
        Verifications.testInElementAssertRatingProduct(nopCommerceSearchPage.logo_Rating, maximumRating);
    }

    @Test(priority = 7, description = "Test08: Verify images identical")
    @Description("Test Description: Verify two images of cameras are identical")
    public void test08_verifyImage()
    {
        NopCommerceWebFlow.stepIntoMainProductPageAndCompareImages("Price: High to Low");
        Verifications.visualElement(nopCommerceValidationOfShoppingCart.pic_Camera_Photo_Comparing, "NopCommerce_LeicaT_Photo_Version_1.00");
    }
}

package WorkFlows;

import Extensions.DBActions;
import Extensions.UIActions;
import Utilities.CommonOps;
import com.google.common.collect.Ordering;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(Utilities.Listeners.class)
public class NopCommerceWebFlow extends CommonOps
{
    @Step("Register to nopCommerce website")
    public static void register(String firstName, String lastName, String dayOfBirth , String monthOfBirth, String yearOfBirth,
                                String Email, String companyName, String password, String confirmPassword)
    {
        UIActions.click(nopCommerceRegister.Btn_Register);
        UIActions.click(nopCommerceRegister.btn_Radio_Btn);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))); //use "By.id" because known bug of selenium- problem to use PageObject
        UIActions.updateText(nopCommerceRegister.txt_First_Name, firstName);
        UIActions.updateText(nopCommerceRegister.txt_Last_Name, lastName);
        UIActions.click(nopCommerceRegister.scroll_Down_day_Of_Birth);
        UIActions.updateText(nopCommerceRegister.scroll_Down_day_Of_Birth, dayOfBirth);
        UIActions.click(nopCommerceRegister.scroll_Down_Month_Of_Birth);
        UIActions.updateDropDown(nopCommerceRegister.scroll_Down_Month_Of_Birth, monthOfBirth);
        UIActions.click(nopCommerceRegister.scroll_Down_Year_Of_Birth);
        UIActions.updateDropDown(nopCommerceRegister.scroll_Down_Year_Of_Birth, yearOfBirth);
        UIActions.updateText(nopCommerceRegister.txt_User_Email_Register, Email);
        UIActions.updateText(nopCommerceRegister.txt_Company_Name, companyName);
        UIActions.click(nopCommerceRegister.check_Box_Btn);
        UIActions.updateText(nopCommerceRegister.field_Password, password);
        UIActions.updateText(nopCommerceRegister.field_Confirm_Password, confirmPassword);
        UIActions.click(nopCommerceRegister.btn_Finish_Register);
    }

    @Step("Login to nopCommerce website")
    public static void login(String user, String password) throws InterruptedException
    {
        UIActions.click(nopCommerceLogin.btn_primary_login);
        Thread.sleep(500);
        UIActions.updateText(nopCommerceLogin.txt_User_Email, user);
        UIActions.updateText(nopCommerceLogin.txt_User_Password, password);
        UIActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Login to nopCommerce website with the DB Credentials")
    public static void loginWithDB() throws InterruptedException
    {
        UIActions.click(nopCommerceLogin.btn_primary_login);
        List <String> cred = DBActions.getCredentials("SELECT user_name, Password FROM Credentials WHERE id='2'"); // If The ID=5 test will fail, With ID=2 test will succeed

        Thread.sleep(500);
        UIActions.updateText(nopCommerceLogin.txt_User_Email, cred.get(0));
        UIActions.updateText(nopCommerceLogin.txt_User_Password, cred.get(1));
        UIActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Validation cameras price sorted by expected order")
    public static void checkCamerasPriceBySort(String orderBy)
    {
        UIActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        UIActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, orderBy);
        List <WebElement> productsPrice = nopCommerceCameraAndPhotoPage.txt_cameras_Prices;
        List <String> tempChangeToString = new ArrayList <String>();
        List <Double> newListDouble = new ArrayList <Double>();

        for(int i = 0; i < productsPrice.size(); i++)
        {
            tempChangeToString.add(productsPrice.get(i).getText().replaceAll("From \\$", "").replaceAll("\\$", "").replaceAll(",", ""));
            newListDouble.add(Double.parseDouble(tempChangeToString.get(i)));
        }

        boolean isSorted = Ordering.natural().isOrdered(newListDouble);
        assertTrue(isSorted,"The List of the prices is NOT sort!");
    }

    @Step("Verify cameras name")
    public static void verifyCamerasName(String order)
    {
        UIActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        UIActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
    }

    @Step("Validation product added to shoppingCart")
    public static void validationOfShoppingCart(String order)
    {
        UIActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        UIActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        UIActions.click(nopCommerceValidationOfShoppingCart.btn_AddToCart);
        UIActions.click(nopCommerceValidationOfShoppingCart.btn_ClosePopUp);
    }

    @Step("Add product and change the quantity and verify total price")
    public static void addItemAndVerifyTotalPrice(String order) throws InterruptedException
    {
        UIActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        UIActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        UIActions.click(nopCommerceValidationOfShoppingCart.btn_AddToCart);
        UIActions.click(nopCommerceValidationOfShoppingCart.btn_GoToCart);
        nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity.clear();
        Thread.sleep(2500);
        UIActions.updateText(nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity, "2");
        UIActions.click(nopCommerceAddNewItemAndVerifyTotalPrice.btn_Update_Shopping_Cart);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("product-subtotal"), "$1,060.00"));
    }

    @Step("Verify Maximum rating of products")
    public static void verifyRating(List <WebElement> elemList, String searchValue)
    {
        UIActions.updateText(nopCommerceLowerHeader.field_Search_Box, searchValue);
        UIActions.click(nopCommerceLowerHeader.btn_Main_Search);
    }

    @Step("Verify two images are identical")
    public static void stepIntoMainProductPageAndCompareImages(String order)
    {
        UIActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        UIActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        UIActions.click(nopCommerceValidationOfShoppingCart.link_Leica_T_Page);
    }
}

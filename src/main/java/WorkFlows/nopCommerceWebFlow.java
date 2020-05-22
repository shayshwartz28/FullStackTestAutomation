package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import com.google.common.collect.Ordering;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(Utilities.Listeners.class)
public class nopCommerceWebFlow extends commonOps
{
    @Step("Register to nopCommerce website")
    public static void register(String firstName, String lastName, String dayOfBirth , String monthOfBirth, String yearOfBirth,
                                String Email, String companyName, String password, String confirmPassword)
    {
        uiActions.click(nopCommerceRegister.Btn_Register);
        uiActions.click(nopCommerceRegister.btn_Radio_Btn);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))); //use "By.id" because known bug of selenium- problem to use PageObject
        uiActions.updateText(nopCommerceRegister.txt_First_Name, firstName);
        uiActions.updateText(nopCommerceRegister.txt_Last_Name, lastName);
        uiActions.click(nopCommerceRegister.scroll_Down_day_Of_Birth);
        uiActions.updateText(nopCommerceRegister.scroll_Down_day_Of_Birth, dayOfBirth);
        uiActions.click(nopCommerceRegister.scroll_Down_Month_Of_Birth);
        uiActions.updateDropDown(nopCommerceRegister.scroll_Down_Month_Of_Birth, monthOfBirth);
        uiActions.click(nopCommerceRegister.scroll_Down_Year_Of_Birth);
        uiActions.updateDropDown(nopCommerceRegister.scroll_Down_Year_Of_Birth, yearOfBirth);
        uiActions.updateText(nopCommerceRegister.txt_User_Email_Register, Email);
        uiActions.updateText(nopCommerceRegister.txt_Company_Name, companyName);
        uiActions.click(nopCommerceRegister.check_Box_Btn);
        uiActions.updateText(nopCommerceRegister.field_Password, password);
        uiActions.updateText(nopCommerceRegister.field_Confirm_Password, confirmPassword);
        uiActions.click(nopCommerceRegister.btn_Finish_Register);
    }

    @Step("Login to nopCommerce website")
    public static void login(String user, String password) throws InterruptedException
    {
        uiActions.click(nopCommerceLogin.btn_primary_login);
        Thread.sleep(500);
        uiActions.updateText(nopCommerceLogin.txt_User_Email, user);
        uiActions.updateText(nopCommerceLogin.txt_User_Password, password);
        uiActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Login to nopCommerce website with the DB Credentials")
    public static void loginWithDB() throws InterruptedException
    {
        uiActions.click(nopCommerceLogin.btn_primary_login);
        List <String> cred = dbActions.getCredentials("SELECT user_name, Password FROM Credentials WHERE id='2'"); // If The ID=5 test will fail, With ID=2 test will succeed

        Thread.sleep(500);
        uiActions.updateText(nopCommerceLogin.txt_User_Email, cred.get(0));
        uiActions.updateText(nopCommerceLogin.txt_User_Password, cred.get(1));
        uiActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Validation cameras price sorted by expected order")
    public static void checkCamerasPriceBySort(String orderBy)
    {
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, orderBy);
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
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
    }

    @Step("Validation product added to shoppingCart")
    public static void validationOfShoppingCart(String order)
    {
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        uiActions.click(nopCommerceValidationOfShoppingCart.btn_AddToCart);
        uiActions.click(nopCommerceValidationOfShoppingCart.btn_ClosePopUp);
    }

    @Step("Add product and change the quantity and verify total price")
    public static void addItemAndVerifyTotalPrice(String order) throws InterruptedException
    {
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        uiActions.click(nopCommerceValidationOfShoppingCart.btn_AddToCart);
        uiActions.click(nopCommerceValidationOfShoppingCart.btn_GoToCart);
        nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity.clear();
        Thread.sleep(2500);
        uiActions.updateText(nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity, "2");
        uiActions.click(nopCommerceAddNewItemAndVerifyTotalPrice.btn_Update_Shopping_Cart);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("product-subtotal"), "$1,060.00"));
    }

    @Step("Verify Maximum rating of products")
    public static void verifyRating(List <WebElement> elemList, String searchValue)
    {
        uiActions.updateText(nopCommerceLowerHeader.field_Search_Box, searchValue);
        uiActions.click(nopCommerceLowerHeader.btn_Main_Search);
    }

    @Step("Verify two images are identical")
    public static void stepIntoMainProductPageAndCompareImages(String order)
    {
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        uiActions.click(nopCommerceValidationOfShoppingCart.link_Leica_T_Page);
    }
}

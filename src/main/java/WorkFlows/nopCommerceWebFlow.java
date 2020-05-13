package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.commonOps;
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
public class nopCommerceWebFlow extends commonOps
{
    @Step("Register to nopCommerce website")
    public static void register(String firstName, String lastName, String dayOfBirth , String monthOfBirth, String yearOfBirth, String Email, String companyName, String password, String confirmPassword)
    {
        uiActions.click(nopCommerceRegister.Btn_Register);
        uiActions.click(nopCommerceRegister.btn_Radio_Btn);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))); // YONI - Why i cant use pageObject?
        uiActions.updateText(nopCommerceRegister.txt_First_Name, firstName);
        uiActions.updateText(nopCommerceRegister.txt_Last_Name, lastName);
        uiActions.click(nopCommerceRegister.scroll_Down_day_Of_Birth);
        uiActions.updateText(nopCommerceRegister.scroll_Down_day_Of_Birth, dayOfBirth);
        uiActions.click(nopCommerceRegister.scroll_Down_Month_Of_Birth);
        uiActions.updateDropDown(nopCommerceRegister.scroll_Down_Month_Of_Birth, monthOfBirth);
        uiActions.click(nopCommerceRegister.scroll_Down_Year_Of_Birth);
        uiActions.updateDropDown(nopCommerceRegister.scroll_Down_Year_Of_Birth, yearOfBirth);
        uiActions.updateText(nopCommerceRegister.txt_User_Email_Register, Email); //YONI - The website approve 'kuku@gmail  - its a problem
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
        Thread.sleep(500); // YONI - i didn't succeed to implement explicitly wait.......
        //wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(nopCommerceLogin.txt_userEmail));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

        uiActions.updateText(nopCommerceLogin.txt_User_Email, user);
        uiActions.updateText(nopCommerceLogin.txt_User_Password, password);
        uiActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Login to nopCommerce website with the DB Credentials")
    public static void loginWithDB() throws InterruptedException
    {
        uiActions.click(nopCommerceLogin.btn_primary_login);
        List <String> cred = dbActions.getCredentials("SELECT user_name, Password FROM Credentials WHERE id='2'"); // If The ID=5 test will fail, With ID=2 test will succeed

        Thread.sleep(500); // YONI - i didn't succeed to implement explicitly wait.......
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

        //Collections.sort(newListDouble); // This line will sort the list - YONI - to keep or delete?
        boolean isSorted = Ordering.natural().isOrdered(newListDouble);
        assertTrue(isSorted,"The List of the prices is not sort"); // YONI - there is a way to move it to nopCommercerWeb?
        //for(int i = 0; i < newListDouble.size(); i++)
        //{
            //System.out.println(newListDouble.get(i));
        //}
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
        uiActions.click(nopCommerceValidationOfShoopingCart.btn_AddToCart);
        uiActions.click(nopCommerceValidationOfShoopingCart.btn_ClosePopUp);
    }

    @Step("Add product and change the quantity and verify total price")
    public static void addItemAndVerifyTotalPrice(String order)
    {
        uiActions.mouseOverElements(nopCommerceHeaderMenu.top_Header_Menu_Link_Electronics, nopCommercesubListElectronics.subListlink_Camera_And_Photo);
        uiActions.updateDropDown(nopCommerceCameraAndPhotoPage.dropDown_Products_Order, order);
        uiActions.click(nopCommerceValidationOfShoopingCart.btn_AddToCart);

        //        YONI - This code is the mouse over i didn't succeed to operate
//        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='header-links']/ul/li[4]/a")));
//        uiActions.mouseOverElements(nopCommerceValidationOfShoopingCart.btn_ShoppingCart, nopCommerceValidationOfShoopingCart.btn_mouseOverGoToCart);
//        //Thread.sleep(2500);
//        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='mini-shopping-cart']/div[4]/input")));

        uiActions.click(nopCommerceValidationOfShoopingCart.btn_GoToCart);
        nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity.clear();
        uiActions.updateText(nopCommerceAddNewItemAndVerifyTotalPrice.txt_Items_Quantity, "2");
        uiActions.click(nopCommerceAddNewItemAndVerifyTotalPrice.btn_Update_Shopping_Cart);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("product-subtotal"), "$1,060.00"));

        //uiActions.click(nopCommerceValidationOfShoopingCart.btn_ShoppingCart);
    }

    @Step("Verify Maximum rating of products")
    public static void verifyRating(List <WebElement> elemList, String searchValue)
    {
        //YONI - There is a way to send the result of the assert?
        uiActions.updateText(nopCommerceLowerHeader.field_Search_Box, searchValue);
        uiActions.click(nopCommerceLowerHeader.btn_Main_Search);
    }
}

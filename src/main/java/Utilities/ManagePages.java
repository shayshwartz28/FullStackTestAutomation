package Utilities;

import PageObjects.Calculator.CalculatorMainPage;
import PageObjects.Calculator.CurrencyExchangeCalculator;
import PageObjects.financialCalculator.AppsMainPage;
import PageObjects.nopCommerce.*;
import PageObjects.Mortgage.*;
import PageObjects.financialCalculator.*;
import PageObjects.ElectronDemo.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        //--------{ Web objects - NopCommerce}--------
        nopCommerceRegister = PageFactory.initElements(driver, RegisterPage.class);
        nopCommerceLogin = PageFactory.initElements(driver, LoginPage.class);
        nopCommerceHeaderMenu = PageFactory.initElements(driver, HeaderMenu.class);
        nopCommercesubListElectronics = PageFactory.initElements(driver, SubListElectronics.class);
        nopCommerceCameraAndPhotoPage = PageFactory.initElements(driver, CameraAndPhotoPage.class);
        nopCommerceValidationOfShoppingCart = PageFactory.initElements(driver, ValidationOfShoppingCart.class);
        nopCommerceUpperHeaderMenu = PageFactory.initElements(driver, UpperHeaderMenu.class);
        nopCommerceAddNewItemAndVerifyTotalPrice = PageFactory.initElements(driver, AddNewItemAndVerifyTotalPrice.class);
        nopCommerceLowerHeader = PageFactory.initElements(driver, LowerHeader.class);
        nopCommerceSearchPage = PageFactory.initElements(driver, SearchPage.class);

        // --------{ Mobile objects - Mortgage calculator }--------
        mortgageMainPage = PageFactory.initElements(driver, MainPage.class);
        mortgageSavedRepaymentPage = PageFactory.initElements(driver, SavedMonthlyRepaymentPage.class);

        // --------{ Mobile objects - Financial calculator }--------
        financialCalculatorAppsMainPage = PageFactory.initElements(driver, AppsMainPage.class);
        financialCalculatorAppsPercentageApp = PageFactory.initElements(driver, PercentageCalculatorApp.class);

        // --------{ Electron Application }--------
        electronMain = PageFactory.initElements(driver, ElectronMainPage.class);

        // --------{ Desktop objects - Calculator }--------
        calcMain = PageFactory.initElements(driver, CalculatorMainPage.class);
        currencyExchangeCalculator = PageFactory.initElements(driver, CurrencyExchangeCalculator.class);
    }
}

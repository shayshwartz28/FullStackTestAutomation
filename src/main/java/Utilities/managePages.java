package Utilities;

import PageObjects.financialCalculator.appsMainPage;
import PageObjects.nopCommerce.*;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        //--------{ Web objects - NopCommerce}--------
        nopCommerceRegister = PageFactory.initElements(driver, registerPage.class);
        nopCommerceLogin = PageFactory.initElements(driver, loginPage.class);
        nopCommerceHeaderMenu = PageFactory.initElements(driver, headerMenu.class);
        nopCommercesubListElectronics = PageFactory.initElements(driver, subListElectronics.class);
        nopCommerceCameraAndPhotoPage = PageFactory.initElements(driver, cameraAndPhotoPage.class);
        nopCommerceValidationOfShoopingCart = PageFactory.initElements(driver, validationOfShoppingCart.class);
        nopCommerceUpperHeaderMenu = PageFactory.initElements(driver, upperHeaderMenu.class);
        nopCommerceAddNewItemAndVerifyTotalPrice = PageFactory.initElements(driver, addNewItemAndVerifyTotalPrice.class);
        nopCommerceLowerHeader = PageFactory.initElements(driver, lowerHeader.class);
        nopCommerceSearchPage = PageFactory.initElements(driver, searchPage.class);

        // --------{ Mobile objects - Mortgage calculator }--------
        mortgageMainPage = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
        mortgageSavedRepaymentPage = PageFactory.initElements(driver, PageObjects.Mortgage.savedMonthlyRepaymentPage.class);

        // --------{ Mobile objects - Financial calculator }--------
        financialCalculatorAppsMainPage = PageFactory.initElements(driver, PageObjects.financialCalculator.appsMainPage.class);
        financialCalculatorAppsPercentageApp = PageFactory.initElements(driver, PageObjects.financialCalculator.percentageCalculatorApp.class);

        // --------{ Electron Application }--------
        electronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.mainPage.class);

        // --------{ Desktop objects - Calculator }--------
        calcMain = PageFactory.initElements(driver, PageObjects.Calculator.mainPage.class);
        currencyExchangeCalculator = PageFactory.initElements(driver, PageObjects.Calculator.currencyExchangeCalculator.class);
    }
}

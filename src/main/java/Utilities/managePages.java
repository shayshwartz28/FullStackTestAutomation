package Utilities;

import PageObjects.Calculator.calculatorMainPage;
import PageObjects.financialCalculator.appsMainPage;
import PageObjects.nopCommerce.*;
import PageObjects.Mortgage.*;
import PageObjects.financialCalculator.*;
import PageObjects.ElectronDemo.*;
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
        nopCommerceValidationOfShoppingCart = PageFactory.initElements(driver, validationOfShoppingCart.class);
        nopCommerceUpperHeaderMenu = PageFactory.initElements(driver, upperHeaderMenu.class);
        nopCommerceAddNewItemAndVerifyTotalPrice = PageFactory.initElements(driver, addNewItemAndVerifyTotalPrice.class);
        nopCommerceLowerHeader = PageFactory.initElements(driver, lowerHeader.class);
        nopCommerceSearchPage = PageFactory.initElements(driver, searchPage.class);

        // --------{ Mobile objects - Mortgage calculator }--------
        mortgageMainPage = PageFactory.initElements(driver, mainPage.class);
        mortgageSavedRepaymentPage = PageFactory.initElements(driver, savedMonthlyRepaymentPage.class);

        // --------{ Mobile objects - Financial calculator }--------
        financialCalculatorAppsMainPage = PageFactory.initElements(driver, appsMainPage.class);
        financialCalculatorAppsPercentageApp = PageFactory.initElements(driver, percentageCalculatorApp.class);

        // --------{ Electron Application }--------
        electronMain = PageFactory.initElements(driver, electronMainPage.class);

        // --------{ Desktop objects - Calculator }--------
        calcMain = PageFactory.initElements(driver, calculatorMainPage.class);
        currencyExchangeCalculator = PageFactory.initElements(driver, PageObjects.Calculator.currencyExchangeCalculator.class);
    }
}

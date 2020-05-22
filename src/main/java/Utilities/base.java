package Utilities;

import PageObjects.Calculator.calculatorMainPage;
import PageObjects.ElectronDemo.electronMainPage;
import PageObjects.nopCommerce.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class base
{
    //--------{ Extensions & Utilities }--------
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static AndroidDriver<AndroidElement> MobileDriver = null;

    //--------{ Ashot & Visual testing }--------
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;

    //--------{ Web objects }--------
    public static loginPage nopCommerceLogin;
    public static registerPage nopCommerceRegister;
    public static headerMenu nopCommerceHeaderMenu;
    public static subListElectronics nopCommercesubListElectronics;
    public static cameraAndPhotoPage nopCommerceCameraAndPhotoPage;
    public static validationOfShoppingCart nopCommerceValidationOfShoppingCart;
    public static upperHeaderMenu nopCommerceUpperHeaderMenu;
    public static addNewItemAndVerifyTotalPrice nopCommerceAddNewItemAndVerifyTotalPrice;
    public static lowerHeader nopCommerceLowerHeader;
    public static searchPage nopCommerceSearchPage;

    //--------{ Mobile }--------
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static PageObjects.Mortgage.mainPage mortgageMainPage;
    public static PageObjects.Mortgage.savedMonthlyRepaymentPage mortgageSavedRepaymentPage;
    public static PageObjects.financialCalculator.appsMainPage financialCalculatorAppsMainPage;
    public static PageObjects.financialCalculator.percentageCalculatorApp financialCalculatorAppsPercentageApp;

    //--------{ RestAPI }--------
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    //--------{ Electron Application }--------
    public static electronMainPage electronMain;

    //--------{ Desktop Application }--------
    public static calculatorMainPage calcMain;
    public static PageObjects.Calculator.currencyExchangeCalculator currencyExchangeCalculator ;

    //--------{ configuration of Data Base - RemoteMySql}--------
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    //--------{ configuration of main platform to execute Sanity Tests with Jenkins }--------
    public static  String Platform;
}

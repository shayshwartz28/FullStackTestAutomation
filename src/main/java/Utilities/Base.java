package Utilities;

import PageObjects.Calculator.CalculatorMainPage;
import PageObjects.Calculator.CurrencyExchangeCalculator;
import PageObjects.ElectronDemo.ElectronMainPage;
import PageObjects.Mortgage.MainPage;
import PageObjects.Mortgage.SavedMonthlyRepaymentPage;
import PageObjects.financialCalculator.AppsMainPage;
import PageObjects.financialCalculator.PercentageCalculatorApp;
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

public class Base
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
    public static LoginPage nopCommerceLogin;
    public static RegisterPage nopCommerceRegister;
    public static HeaderMenu nopCommerceHeaderMenu;
    public static SubListElectronics nopCommercesubListElectronics;
    public static CameraAndPhotoPage nopCommerceCameraAndPhotoPage;
    public static ValidationOfShoppingCart nopCommerceValidationOfShoppingCart;
    public static UpperHeaderMenu nopCommerceUpperHeaderMenu;
    public static AddNewItemAndVerifyTotalPrice nopCommerceAddNewItemAndVerifyTotalPrice;
    public static LowerHeader nopCommerceLowerHeader;
    public static SearchPage nopCommerceSearchPage;

    //--------{ Mobile }--------
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static MainPage mortgageMainPage;
    public static SavedMonthlyRepaymentPage mortgageSavedRepaymentPage;
    public static AppsMainPage financialCalculatorAppsMainPage;
    public static PercentageCalculatorApp financialCalculatorAppsPercentageApp;

    //--------{ RestAPI }--------
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    //--------{ Electron Application }--------
    public static ElectronMainPage electronMain;

    //--------{ Desktop Application }--------
    public static CalculatorMainPage calcMain;
    public static CurrencyExchangeCalculator currencyExchangeCalculator ;

    //--------{ configuration of Data Base - RemoteMySql}--------
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    //--------{ configuration of main platform to execute Sanity Tests with Jenkins }--------
    public static  String Platform;
}

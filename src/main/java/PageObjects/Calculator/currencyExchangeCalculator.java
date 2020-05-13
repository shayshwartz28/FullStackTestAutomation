package PageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class currencyExchangeCalculator
{
    @FindBy(how = How.NAME, using = "Input unit")
    public WebElement input_Input_Unit;

    @FindBy(how = How.NAME, using = "Output unit")
    public WebElement input_OutPut_Unit;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='Value1']")
    public WebElement input_First_Currency;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='Value2']")
    public WebElement input_Second_Currency;

    @FindBy(how = How.NAME, using = "Clear entry")
    public WebElement btn_Clear_Entry;

    @FindBy(how = How.NAME, using = "Israel Shekel")
    public WebElement text_Israel_Shekel_Coin;

    @FindBy(how = How.NAME, using = "Japan Yen")
    public WebElement text_Japan_Yen_Coin;

    @FindBy(how = How.NAME, using = "United States Dollar")
    public WebElement text_USA_Dollar_Coin;

    @FindBy(how = How.NAME, using = "Backspace")
    public WebElement btn_Delete;

    @FindBy(how = How.NAME, using = "Zero")
    public WebElement btn_Zero;

    @FindBy(how = How.NAME, using = "One")
    public WebElement btn_One;

    @FindBy(how = How.NAME, using = "Two")
    public WebElement btn_Two;

    @FindBy(how = How.NAME, using = "Three")
    public WebElement btn_Three;

    @FindBy(how = How.NAME, using = "Four")
    public WebElement btn_Four;

    @FindBy(how = How.NAME, using = "Five")
    public WebElement btn_Five;

    @FindBy(how = How.NAME, using = "Six")
    public WebElement btn_Six;

    @FindBy(how = How.NAME, using = "Seven")
    public WebElement btn_Seven;

    @FindBy(how = How.NAME, using = "Eight")
    public WebElement btn_Eight;

    @FindBy(how = How.NAME, using = "Nine")
    public WebElement btn_Nine;

    @FindBy(how = How.NAME, using = "Decimal Separator")
    public WebElement btn_Decimal_Separator;
}

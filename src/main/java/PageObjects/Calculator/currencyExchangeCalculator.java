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

    @FindBy(how = How.NAME, using = "Decimal Separator")
    public WebElement btn_Decimal_Separator;
}

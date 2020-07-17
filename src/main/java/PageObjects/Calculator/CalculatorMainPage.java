package PageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalculatorMainPage
{
    @FindBy(how = How.NAME, using = "Standard Calculator")
    public WebElement btn_Standard_Calculator;

    @FindBy(how = How.NAME, using = "Open Navigation")
    public WebElement btn_Open_Navigation;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement btn_Field_Result;

    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_Clear;

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

    @FindBy(how = How.NAME, using = "Minus")
    public WebElement btn_Subtraction;

    @FindBy(how = How.NAME, using = "Plus")
    public WebElement btn_Addition;

    @FindBy(how = How.NAME, using = "Multiply by")
    public WebElement btn_Multiplication;

    @FindBy(how = How.NAME, using = "Divide by")
    public WebElement btn_Division;

    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_Equals;

    @FindBy(how = How.NAME, using = "Square roo")
    public WebElement btn_Square_Root;

    @FindBy(how = How.NAME, using = "Currency Converter")
    public WebElement btn_Currency_Exchange;
}

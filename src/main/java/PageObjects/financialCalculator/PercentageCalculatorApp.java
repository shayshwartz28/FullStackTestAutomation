package PageObjects.financialCalculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PercentageCalculatorApp
{
    @FindBy(how = How.ID, using = "yPercentInput")
    public WebElement textField_X_PercentageFrom_Y;

    @FindBy(how = How.ID, using = "xAmountInput")
    public WebElement textField_X_PercentageFrom_Y_Amount;

    @FindBy(how = How.ID, using = "percentValueResult")
    public WebElement text_X_FROM_Y_Value_Result;

    @FindBy(how = How.ID, using = "reset")
    public WebElement btn_Reset_X_Per_Of_Y;

    @FindBy(how = How.ID, using = "valueResultLayout")
    public List <WebElement> text_Value_Result_Layout;

    @FindBy(how = How.ID, using = "valueResultLayout")
    public WebElement back_To_Main_Page;

    //--------------------------------------------------------------

    @FindBy(how = How.ID, using = "xValueInput")
    public WebElement textField_X_PercentageOf_Y;

    @FindBy(how = How.ID, using = "yValueInput")
    public WebElement textField_X_PercentageOf_Y_Amount;

    @FindBy(how = How.ID, using = "percentResult")
    public WebElement text_X_Percent_Value_Result;

    @FindBy(how = How.ID, using = "percentReset")
    public WebElement btn_Reset_Percent;

    //--------------------------------------------------------------

    @FindBy(how = How.ID, using = "xInput")
    public WebElement textField_Percentage_Change_X;

    @FindBy(how = How.ID, using = "yInput")
    public WebElement textField_Percentage_Change_Y;

    @FindBy(how = How.ID, using = "changeResult")
    public WebElement text_Percentage_Change_Result;

    @FindBy(how = How.ID, using = "changeReset")
    public WebElement btn_Reset_Change_Percentage;
}

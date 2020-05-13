package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class mainPage
{
    @FindBy(how = How.ID, using = "etAmount")
    public WebElement text_Amount;

    @FindBy(how = How.ID, using = "etTerm")
    public WebElement text_Term;

    @FindBy(how = How.ID, using = "etRate")
    public WebElement text_Rate;

    @FindBy(how = How.ID, using = "btnCalculate")
    public WebElement btn_Calculate;

    @FindBy(how = How.ID, using = "tvRepayment")
    public WebElement text_Repayment;

    @FindBy(how = How.XPATH, using = "//*[@text='Calculator']")
    public WebElement text_HeaderCalculator;
}

package PageObjects.financialCalculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppsMainPage
{
    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='TVM Calculator']]")
    public WebElement icon_TVM_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Currency Converter']]")
    public WebElement icon_Currency_Converter;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Loan Calculator']]")
    public WebElement icon_Loan_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Compound Interest Calculator']]")
    public WebElement icon_Compound_Interest_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Credit Card Payoff Calculator']]")
    public WebElement icon_CreditCard_Payoff_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Retirement/401K Calculator']]")
    public WebElement icon_Retirement_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Tip Calculator']]")
    public WebElement icon_Tip_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Calculator']]")
    public WebElement icon_Regular_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='APR Calculator']]")
    public WebElement icon_APR_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='ROI Calculator']]")
    public WebElement icon_ROI_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Auto Loan Calculator']]")
    public WebElement icon_Auto_Loan_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Credit Card Minimum Payment']]")
    public WebElement icon_Credit_Card_Minimum_Payment;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Discount and Tax Calculator']]")
    public WebElement icon_Discount_And_Tax_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='IRR NPV Calculator']]")
    public WebElement icon_IRR_NPV_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Percentage Calculator']]")
    public WebElement icon_Percentage_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Bond Calculator']]")
    public WebElement icon_Bond_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Stock Calculator']]")
    public WebElement icon_Stock_Calculator;

    @FindBy(how = How.XPATH, using = "//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Miscellaneous Calculation']]")
    public WebElement icon_Miscellaneous_Calculation;
}

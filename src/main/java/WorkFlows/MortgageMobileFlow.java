package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class MortgageMobileFlow extends CommonOps
{
    @Step("Fill in form and Calculate Mortgage")
    public static void calculateMortgage(String amount, String term, String rate)
    {
        UIActions.updateText(mortgageMainPage.text_Amount, amount);
        UIActions.updateText(mortgageMainPage.text_Term, term);
        UIActions.updateText(mortgageMainPage.text_Rate, rate);
        UIActions.click(mortgageMainPage.btn_Calculate);
    }
}

package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LowerHeader
{
    @FindBy(how = How.ID, using = "small-searchterms")
    public WebElement field_Search_Box;

    @FindBy(how = How.CSS, using = "input[value^='Search'")
    public WebElement btn_Main_Search;
}

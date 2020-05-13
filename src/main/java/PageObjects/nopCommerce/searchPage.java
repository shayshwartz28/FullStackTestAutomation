package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class searchPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='rating']/div")
    public List <WebElement> logo_Rating;
}

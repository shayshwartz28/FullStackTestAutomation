package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='item-grid']/div[2]/div/div[2]/div/div/div")
    public List <WebElement> logo_Rating;
}

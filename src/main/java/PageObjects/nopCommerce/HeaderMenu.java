package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderMenu
{
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[1]/a")
    public WebElement top_Header_Menu_Link_Computers;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[2]/a")
    public WebElement top_Header_Menu_Link_Electronics;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[3]/a")
    public WebElement top_Header_Menu_Link_Apparel;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[4]/a")
    public WebElement top_Header_Menu_Link_DigitalDownloads;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[5]/a")
    public WebElement top_Header_Menu_Link_Books;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[6]/a")
    public WebElement top_Header_Menu_Link_Jewelry;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[7]/a")
    public WebElement top_Header_Menu_Link_giftCards;
}

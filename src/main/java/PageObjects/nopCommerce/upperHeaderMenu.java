package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class upperHeaderMenu
{
    @FindBy(how = How.CLASS_NAME, using = "ico-register")
    public WebElement upperHeaderLink_Register;

    @FindBy(how = How.CLASS_NAME, using = "ico-login")
    public WebElement upperHeaderLink_Login;

    @FindBy(how = How.CLASS_NAME, using = "ico-wishlist")
    public WebElement upperHeaderLink_WishList;

    @FindBy(how = How.CLASS_NAME, using = "ico-cart")
    public WebElement upperHeaderLink_ShoppingCart;
}

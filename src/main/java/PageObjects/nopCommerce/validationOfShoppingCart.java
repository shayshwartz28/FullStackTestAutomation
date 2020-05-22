package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class validationOfShoppingCart
{
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a[1]")
    public WebElement link_CameraAndPhoto;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[2]/a[1]")
    public WebElement link_Electronics;

    @FindBy(how = How.XPATH, using = "//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[1]")
    public WebElement btn_AddToCart;

    @FindBy(how = How.ID, using = "bar-notification")
    public WebElement msg_ProductAdded;

    @FindBy(how = How.XPATH, using = "//div[@class='bar-notification success']/span")
    public WebElement btn_ClosePopUp;

    @FindBy(how = How.XPATH, using = "//div[@class='mini-shopping-cart']/div[4]/input")
    public WebElement btn_mouseOverGoToCart;

    @FindBy(how = How.XPATH, using = "//div[@class='header-links']/ul/li[4]/a")
    public WebElement btn_ShoppingCart;

    @FindBy(how = How.CLASS_NAME, using = "ico-cart")
    public WebElement btn_GoToCart;

    @FindBy(how = How.LINK_TEXT, using = "Leica T Mirrorless Digital Camera")
    public WebElement link_Leica_T_Page;

    @FindBy(how = How.CSS, using = "img[src='https://demo.nopcommerce.com/images/thumbs/0000039_leica-t-mirrorless-digital-camera_550.jpeg")
    public WebElement pic_Camera_Photo_Comparing;
}

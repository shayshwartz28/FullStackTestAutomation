package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class validationOfShoppingCart
{
    //YONI - to use this link or the one from the "subListElectronics" PageObjects? or i need to put him here as well?
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a[1]")
    public WebElement link_CameraAndPhoto;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu']/ul[1]/li[2]/a[1]")
    public WebElement link_Electronics;

    @FindBy(how = How.XPATH, using = "//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[1]")
    public WebElement btn_AddToCart;
    //YONI - input[@value='Add to cart'] is give me only the first "ADD TO CART", how can i get the specific one? (third after sort)

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

    @FindBy(how = How.CSS, using = "img[src='//demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg']")
    public WebElement pic_CameraPhotoComparing;

    @FindBy(how = How.CSS, using = "img[src='//demo.nopcommerce.com/images/thumbs/0000039_leica-t-mirrorless-digital-camera_415.jpeg']")
    public WebElement pic_CameraPhotoComparing2;
}

package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CameraAndPhotoPage
{
    @FindBy(how = How.ID, using = "products-orderby")
    public WebElement dropDown_Products_Order;

    @FindBy(how = How.XPATH, using = "//span[@class='price actual-price']")
    public List <WebElement> txt_cameras_Prices;

    @FindBy(how = How.XPATH, using = "//h2[@class='product-title']/a")
    public List <WebElement> txt_cameras_Title;
}

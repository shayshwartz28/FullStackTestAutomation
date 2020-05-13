package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addNewItemAndVerifyTotalPrice
{
    @FindBy(how = How.CSS, using = "input[id^='itemquantity']")
    public WebElement txt_Items_Quantity;

    @FindBy(how = How.CLASS_NAME, using = "product-subtotal")
    public WebElement txt_Items_Total_Money;

    @FindBy(how = How.CSS, using = "input[name='updatecart']")
    public WebElement btn_Update_Shopping_Cart;
}

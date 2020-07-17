package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy(how = How.CLASS_NAME, using = "ico-login")
    public WebElement btn_primary_login;

    @FindBy(how = How.ID, using = "Email")
    public WebElement txt_User_Email;

    @FindBy(how = How.ID, using = "Password")
    public WebElement txt_User_Password;

    @FindBy(how = How.CSS, using = "input[value^='Log in'")
    public WebElement btn_login;

    @FindBy(how = How.XPATH, using = "//div[@class='returning-wrapper fieldset']/form/div")
    public WebElement txt_PopUp_login_Failed;
}

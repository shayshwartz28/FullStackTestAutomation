package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage
{
    @FindBy(how = How.CLASS_NAME ,using = "ico-register")
    public WebElement Btn_Register;

    @FindBy(how = How.ID ,using = "gender-male")
    public  WebElement btn_Radio_Btn;

    @FindBy(how = How.ID ,using = "FirstName")
    public WebElement txt_First_Name;

    @FindBy(how = How.ID ,using = "LastName")
    public WebElement txt_Last_Name;

    @FindBy(how = How.NAME, using = "DateOfBirthDay")
    public WebElement scroll_Down_day_Of_Birth;

    @FindBy(how = How.NAME, using = "DateOfBirthMonth")
    public WebElement scroll_Down_Month_Of_Birth;

    @FindBy(how = How.NAME, using = "DateOfBirthYear")
    public WebElement scroll_Down_Year_Of_Birth;

    @FindBy(how = How.ID, using = "Email")
    public WebElement txt_User_Email_Register;

    @FindBy(how = How.ID, using = "Email-error")
    public WebElement txt_User_Email_Register_Error;

    @FindBy(how = How.ID ,using = "Company")
    public WebElement txt_Company_Name;

    @FindBy(how = How.ID ,using = "Newsletter")
    public WebElement check_Box_Btn;

    @FindBy(how = How.ID ,using = "Password")
    public WebElement field_Password;

    @FindBy(how = How.ID ,using = "ConfirmPassword")
    public WebElement field_Confirm_Password;

    @FindBy(how = How.ID ,using = "register-button")
    public WebElement btn_Finish_Register;
}

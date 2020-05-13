package PageObjects.ElectronDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.ID, using = "button-windows")
    public WebElement btn_Windows;

    @FindBy(how = How.ID, using = "button-app-sys-information")
    public WebElement btn_Information;

    @FindBy(how = How.ID, using = "screen-info-demo-toggle")
    public WebElement btn_DemoToggle;

    @FindBy(how = How.ID, using = "screen-info")
    public WebElement btn_Screen_Info;

    @FindBy(how = How.ID, using = "got-screen-info")
    public WebElement field_Screen_Info;
}

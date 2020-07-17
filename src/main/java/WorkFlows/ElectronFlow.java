package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class ElectronFlow extends CommonOps
{
    @Step("Get Screen Info Resolution")
    public static void getScreenInfo()
    {
        UIActions.click(electronMain.btn_Windows);
        UIActions.click(electronMain.btn_Information);
        UIActions.click(electronMain.btn_DemoToggle);
        UIActions.click(electronMain.btn_DemoToggle);
        UIActions.click(electronMain.btn_Screen_Info);
    }
}

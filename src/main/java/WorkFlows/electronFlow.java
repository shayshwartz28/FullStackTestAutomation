package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class electronFlow extends commonOps
{
    @Step("Get Screen Info Resolution")
    public static void getScreenInfo()
    {
        uiActions.click(electronMain.btn_Windows);
        uiActions.click(electronMain.btn_Information);
        uiActions.click(electronMain.btn_DemoToggle);
        uiActions.click(electronMain.btn_DemoToggle);
        uiActions.click(electronMain.btn_Screen_Info);
    }
}

package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.io.File;

public class HelperMethods extends CommonOps
{
    public static void takeElementScreenShot(WebElement imageElement, String imageName)
    {
        imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement); // Windows 10
        //imageScreenShot = new AShot().takeScreenshot(driver, imageElement); // Windows 7
        try
        {
            ImageIO.write(imageScreenShot.getImage(), getData("screenShotFormat"), new File(getData("ImageRepo") + imageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error writing image file, see details: " + e);
        }
    }
}

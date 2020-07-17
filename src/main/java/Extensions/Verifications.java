package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import static org.apache.commons.collections.CollectionUtils.isEmpty;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps
{
    @Step("Verify Text in Element")
    public static void textInElementAssertEquals(WebElement elem, String expectedValue)
    {
        if(!Platform.equalsIgnoreCase("mobile")
                && !Platform.equalsIgnoreCase("electron")
                && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        if(Platform.equalsIgnoreCase("desktop"))
            assertEquals(elem.getText().replaceAll("[^\\.0123456789]","").trim(), expectedValue); // More generic
        else
            assertEquals(elem.getText(), expectedValue);
    }

    @Step("Verify Value of Attribute")
    public static void textInElementAssertEqualsAttribute(WebElement elem, String expectedValue)
    {
        if(!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getAttribute("value"), expectedValue);
    }

    @Step("Verify the Number of Element Equals to expected value")
    public static void numberOfElementsInList(List <WebElement> elements, int expectedValue)
    {
        if(!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elements.get(elements.size()-1)));
        assertEquals(elements.size(), expectedValue,"The List is NOT Empty!");
    }

    @Step("Verify Element is Displayed")
    public static void testInElementAssertTrueIsDisplayed(WebElement elem)
    {
        if(!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Maximum of product Rating")
    public static void testInElementAssertRatingProduct(List <WebElement> elemList, int maximumValue)
    {
        String rating;
        for(int i = 0; i < elemList.size(); i++)
        {
            rating = elemList.get(i).getAttribute("style").split(": ")[1].split("%")[0];
            assertTrue(Integer.parseInt(rating) <= maximumValue, "Verification failed, rating of product is bigger than: " + maximumValue);
        }
    }

    @Step("Verify Elements List of names Equals Array of names")
    public static void testInElementVerifyListNamesToExpectedArrayNames(List <WebElement> elemList, String [] expectedNames) // YONI - can i make it bool function that return bool of assert result?
    {
        for (int i = 0; i < elemList.size(); i++)
        {
            textInElementAssertEquals(elemList.get(i), expectedNames[i]);
        }
    }

    @Step("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading Image file: " + e);
        }
        Screenshot imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(),"Images are NOT identical!");
    }

    @Step("Verify Text with Text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText, expectedText);
    }

    @Step("Verify List is Empty")
    public static void verifyListIsEmpty(List <WebElement> elements)
    {
        assertTrue(isEmpty(elements),"The List is NOT empty!");
    }
}

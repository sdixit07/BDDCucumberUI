package utils;

import org.openqa.selenium.WebElement;

public class Helper {

    public static void enterTextInTheTextBox(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}

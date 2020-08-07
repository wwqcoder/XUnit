package wework.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wework.page.MainPage;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class Wait {

    public static void displayWaitToBeClickable(WebDriver driver, int seconds, By by){
        new WebDriverWait(MainPage.webDriver,seconds).until(
                ExpectedConditions.elementToBeClickable(by));
    }

}

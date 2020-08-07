package wework.page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/

public class MainPage {

    public static WebDriver webDriver = null;

    public MainPage() {
        //System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","/Users/wangweiqi/Downloads/driver/chromedriver");

        //复用浏览器
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        webDriver = new ChromeDriver(options);
        //webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    public ContactPage toContact(){
        webDriver.findElement(By.id("menu_contacts")).click();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return new ContactPage();
    }
}

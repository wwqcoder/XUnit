package test_web.wework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public RemoteWebDriver webDriver;
    public WebDriverWait wait;

    public BasePage() {
        System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","/Users/wangweiqi/Downloads/driver/chromedriver");

        //复用浏览器
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        webDriver = new ChromeDriver(options);
        //webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        wait = new WebDriverWait(webDriver,10);
    }

    public BasePage(RemoteWebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver,10);

    }

    public void quit(){
        webDriver.quit();
    }

    public void click(By by){
        try {
            //todo 异常处理
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(by));
            webDriver.findElement(by).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by,String content){
        //todo 异常处理
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        webDriver.findElement(by).sendKeys(content);
    }

    public void upload(By by,String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        webDriver.findElement(by).sendKeys(path);
    }


}

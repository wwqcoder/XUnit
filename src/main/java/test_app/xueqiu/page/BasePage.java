package test_app.xueqiu.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public AndroidDriver driver;

    public BasePage() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "192.168.56.106:5555");
        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
        desiredCapabilities.setCapability("noReset", "true");


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void quit(){
        driver.quit();
    }

    public void click(By by){
        try {
            //todo 异常处理
            Thread.sleep(1000);
            ((MobileElement)driver.findElement(by)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by,String content){
        driver.findElement(by).sendKeys(content);
    }

}

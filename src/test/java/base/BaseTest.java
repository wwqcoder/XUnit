package base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class BaseTest {

    public static WebDriver webDriver ;

    @BeforeAll
    public void before(){
        System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
        //复用浏览器
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        webDriver = new ChromeDriver(options);
        //webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
}

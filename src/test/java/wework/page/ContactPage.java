package wework.page;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wework.util.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class ContactPage {
    By addMemeber = By.linkText("添加成员");
    By username1 = By.name("username");


    public ContactPage addMember(String username,String acctid,String mobile){
        //显示等待
        Wait.displayWaitToBeClickable(MainPage.webDriver,10,addMemeber);
        MainPage.webDriver.findElement(addMemeber).click();
        MainPage.webDriver.findElement(username1).sendKeys(username);
        MainPage.webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MainPage.webDriver.findElement(By.name("acctid")).sendKeys(acctid);
        MainPage.webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MainPage.webDriver.findElement(By.name("mobile")).sendKeys(mobile);
        MainPage.webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MainPage.webDriver.findElement(By.cssSelector(".js_btn_save")).click();
        MainPage.webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        return this;

    }
}

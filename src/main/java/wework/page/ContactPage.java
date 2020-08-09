package wework.page;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import wework.util.Wait;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class ContactPage extends BasePage {

    By addMemeber = By.linkText("添加成员");
    By username1 = By.name("username");
    By delete = By.linkText("删除");

    public ContactPage(RemoteWebDriver webDriver) {
        super(webDriver);
    }


    public ContactPage addMember(String username,String acctid,String mobile){
        //显示等待
        Wait.displayWaitToBeClickable(webDriver,10,addMemeber);
        webDriver.findElement(addMemeber).click();
        webDriver.findElement(username1).sendKeys(username);
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        webDriver.findElement(By.name("acctid")).sendKeys(acctid);
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        webDriver.findElement(By.name("mobile")).sendKeys(mobile);
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector(".js_btn_save")).click();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return this;
    }

    public ContactPage search(String keyword) throws InterruptedException {
        webDriver.findElement(By.id("memberSearchInput")).sendKeys(keyword);
        Thread.sleep(5000);
        Wait.displayWaitVisibility(webDriver,10,delete);
        return this;
    }

    public ContactPage delete(){
        webDriver.findElement(delete).click();
        webDriver.findElement(By.linkText("确认")).click();
        webDriver.findElement(By.id("clearMemberSearchInput")).click();
        return this;

    }
}

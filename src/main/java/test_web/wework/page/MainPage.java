package test_web.wework.page;

import org.openqa.selenium.By;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/

public class MainPage extends BasePage{

    public MainPage() {
        super();
    }

    public ContactPage toContact(){
        click(By.id("menu_contacts"));
        return new ContactPage(webDriver);
    }
}

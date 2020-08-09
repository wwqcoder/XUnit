package wework.page;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {

    public RemoteWebDriver webDriver;

    public BasePage() {
    }

    public BasePage(RemoteWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void quit(){
        webDriver.quit();
    }



}

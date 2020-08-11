package test_web.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.impl.WebDriverThreadLocalContainer;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * @Date 2020/8/6
 * @Autor weiqi.wang
 **/
public class BaiduTest {

    @Test
    public void before(){
        WebDriverThreadLocalContainer container = new WebDriverThreadLocalContainer();

        Configuration.screenshots = false;

        container.clearBrowserCache();

        Configuration.browser = "chrome";

        Configuration.remote = "http://180.76.235.76:5001/wd/hub";

        String baseUrl = "http://www.baidu.com";

        Selenide.open(baseUrl);

        String text = $(byId("su")).getValue();
        System.out.println(text);

    }

}

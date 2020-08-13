package test_app.xueqiu.testcase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import test_app.xueqiu.page.MainPage;
import test_app.xueqiu.page.StockPage;

import java.net.MalformedURLException;

public class StockPageTest {

    static MainPage mainPage;
    static StockPage stockPage;

    @BeforeAll
    static void before() throws MalformedURLException {
        mainPage = new MainPage();
        stockPage = mainPage.toStock();
    }

    @Test
    void checkAllDel(){
        stockPage.search("alibaba").clickSelf().checkAllDel();
    }



}

package test_app.xueqiu.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import test_app.xueqiu.page.MainPage;
import test_app.xueqiu.page.SearchPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class SearchPageTest {

    static MainPage mainPage;
    static SearchPage searchPage;

    @BeforeAll
    static void before() throws MalformedURLException {
        mainPage = new MainPage();
        searchPage = mainPage.toSearch();
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "alibaba,阿里巴巴",
                    "jd,京东"
            }
    )
    void search(String keyword,String name) {
        assertEquals(searchPage.search(keyword).getSearchList().get(0),name);

    }

    @Test
    void getPrice() {
        assertTrue(searchPage.getPrice() > 200 );
    }
}
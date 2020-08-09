package wework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import wework.page.ContactPage;
import wework.page.MainPage;
import wework.util.Wait;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class TestContact {
    static MainPage mainPage = null;
    static ContactPage contactPage = null;

    @BeforeAll
    static void before(){
        mainPage = new MainPage();
        contactPage = mainPage.toContact();

    }

    @Test
    void testAddMember(){
        contactPage.addMember("3","3","16601360633");
        /// TODO: 2020/8/7
    }

    @Test
    void testSearch() throws InterruptedException {
        contactPage.search("3").delete();
    }
}

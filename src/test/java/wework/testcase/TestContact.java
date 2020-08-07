package wework.testcase;

import org.junit.jupiter.api.Test;
import wework.page.MainPage;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class TestContact {

    @Test
    void testAddMember(){
        MainPage mainPage = new MainPage();
        mainPage.toContact().addMember("3","3","16601360631");
        /// TODO: 2020/8/7
    }
}

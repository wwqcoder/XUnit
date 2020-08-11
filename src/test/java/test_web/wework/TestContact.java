package test_web.wework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import test_web.wework.page.ContactPage;
import test_web.wework.page.MainPage;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testAddMember() throws InterruptedException {
        String username = contactPage.addMember("3", "3", "16601360633").search("3").getUsername();
        assertEquals(username,3);
        /// TODO: 2020/8/7
    }

    @Test
    void testSearch() throws InterruptedException {
        contactPage.search("3").delete();
    }

    @Test
    void TestImportFromFile() throws UnsupportedEncodingException {
        contactPage.importFromFile("D:/project/XUnit/src/main/resources/通讯录批量导入模板.xlsx");
    }

    @Test
    void addDepartment(){
        contactPage.addDepartment("abc").deleteDepartment("abc");
    }
}

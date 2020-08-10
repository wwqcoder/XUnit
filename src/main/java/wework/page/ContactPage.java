package wework.page;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

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
        click(addMemeber);
        sendKeys(username1,username);
        sendKeys(By.name("acctid"),acctid);
        sendKeys(By.name("mobile"),mobile);
        click(By.cssSelector(".js_btn_save"));
        return this;
    }

    public ContactPage search(String keyword) throws InterruptedException {
        sendKeys(By.id("memberSearchInput"),keyword);
        return this;
    }

    public String getUsername(){
        return webDriver.findElement(By.cssSelector("member_display_cover_detail_name")).getText();
    }

    public ContactPage delete(){
        click(delete);
        click(By.linkText("确认"));
        click(By.id("clearMemberSearchInput"));
        return this;
    }

    public ContactPage importFromFile(String path) throws UnsupportedEncodingException {
        //String path_utf8 = URLDecoder.decode(path.getFile(), "UTF-8");
        click(By.cssSelector(".ww_operationBar:nth-child(1) .ww_btn_PartDropdown_right"));
        click(By.linkText("文件导入"));
        upload(By.id("js_upload_file_input"),path);
        click(By.id("submit_csv"));
        click(By.id("reloadContact"));
        return this;
    }

    public ContactPage addDepartment(String department){
        click(By.cssSelector(".member_colLeft_top_addBtn"));
        click(By.linkText("添加部门"));
        sendKeys(By.name("name"),department);
        click(By.linkText("选择所属部门"));
        click(By.xpath("(//li[@id='1688853799666049']/i)[2]"));
        click(By.id("1688853799666048_anchor"));
        click(By.linkText("确定"));
        return this;
    }

    public ContactPage deleteDepartment(String department){
        click(By.linkText("标签"));
        click(By.linkText("组织架构"));
        click(By.xpath("//li[@id='1688853799666049']/i"));
        click(By.xpath("//li[@id='1688853799666048']/i"));
        click(By.xpath("//a[contains(text(),'"+department+"')]"));
        click(By.xpath("//li/ul/li/ul/li/ul/li/a/span"));
        click(By.xpath("(//a[contains(text(),'删除')])[3]"));
        click(By.linkText("确定"));
        return this;
    }
}
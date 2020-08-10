package junit.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/8/7
 * @Autor weiqi.wang
 **/
public class AutoLogin {

    public RemoteWebDriver webDriver;

    @BeforeAll
    public void before(){
        //System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","/Users/wangweiqi/Downloads/driver/chromedriver");

        //复用浏览器
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        webDriver = new ChromeDriver(options);
        //webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }


    /**
     * 切记 访问网址后加cookie，再访问网址
     * @throws InterruptedException
     */
    @Test
    void run() throws InterruptedException {

        //saveCookies();

        webDriver.get("https://work.weixin.qq.com/wework_admin/frame");
        readCookies();
        webDriver.get("https://work.weixin.qq.com/wework_admin/frame");

        Thread.sleep(2000);

    }
    //保存cookie到本地文件
    public void saveCookies() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("cookie.txt"));


        for (Cookie cookie : webDriver.manage().getCookies()) {
            writer.write(cookie.getName() +";"+
                    cookie.getDomain() +";"+
                    cookie.getPath() + ";" +
                    cookie.getValue() + ";" +
                    cookie.getExpiry() + ";" +
                    cookie.isSecure()

            );
            //换行符
            writer.newLine();
        }
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 读取本地保存的cookie
    public void readCookies(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("cookie.txt"));

            String line;
            while ((line = reader.readLine()) != null){
                StringTokenizer tokenizer = new StringTokenizer(line,";");
                String name = tokenizer.nextToken();
                String domain = tokenizer.nextToken();
                String path = tokenizer.nextToken();
                String value = tokenizer.nextToken();
                String expire = tokenizer.nextToken();
                Date expireExt = null;
                //日期转换
                if (!expire.equals("null")){
                    SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
                    expireExt = format.parse(expire);
                }
                String isSecure = tokenizer.nextToken();
                Cookie cookie = new Cookie(name, value, domain, path, expireExt, Boolean.parseBoolean(isSecure));
                webDriver.manage().addCookie(cookie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

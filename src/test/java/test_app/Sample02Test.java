package test_app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sample02Test {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("deviceName", "192.168.56.106:5555");
    desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
    desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
    desiredCapabilities.setCapability("noReset", "true");


    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @Test
  public void sampleTest() {

    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.RelativeLayout[2]/android.widget.ImageView");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementById("com.xueqiu.android:id/search_input_text");
    el3.sendKeys("alibaba");
    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.TextView");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementById("com.xueqiu.android:id/action_delete_text");
    el6.click();
    MobileElement el9 = (MobileElement) driver.findElementById("com.xueqiu.android:id/action_close");
    el9.click();
    MobileElement el11 = (MobileElement) driver.findElementById("com.xueqiu.android:id/edit_group");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementById("com.xueqiu.android:id/check_all");
    el12.click();
    MobileElement el13 = (MobileElement) driver.findElementById("com.xueqiu.android:id/cancel_follow");
    el13.click();
    MobileElement el14 = (MobileElement) driver.findElementById("com.xueqiu.android:id/tv_right");
    el14.click();
    MobileElement el15 = (MobileElement) driver.findElementById("com.xueqiu.android:id/action_close");
    el15.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

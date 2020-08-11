package test_app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

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
    MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ViewFlipper/android.widget.LinearLayout/android.widget.TextView");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementById("com.xueqiu.android:id/search_input_text");
    el2.sendKeys("alibaba");
    MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
    el4.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

package test_app.xueqiu.page;

import com.google.common.collect.Lists;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索页面
 */
public class SearchPage extends BasePage {

    public SearchPage(AndroidDriver driver) {
        super(driver);

    }
    public SearchPage search(String keyword){
        //MobileElement el2 = (MobileElement) driver.findElementById("com.xueqiu.android:id/search_input_text");
        //el2.sendKeys(keyword);
        sendKeys(By.id("com.xueqiu.android:id/search_input_text"),keyword);
        return this;
    }

    public List<String> getSearchList(){
        ArrayList<String> names = Lists.newArrayList();
        for (Object element : driver.findElements(By.id("name"))) {
            names.add(((WebElement)element).getText());
        }
        return names;
    }

    public double getPrice(){
        //MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
        //el3.click();
        click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));
        return Double.parseDouble(driver.findElement(By.id("current_price")).getText());
    }
}

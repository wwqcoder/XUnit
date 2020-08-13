package test_app.xueqiu.page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * 行情页面
 */
public class StockPage extends BasePage {

    public  SearchPage searchPage;

    public StockPage(AndroidDriver driver) {
        super(driver);
        searchPage = new SearchPage(driver);
    }

    public StockPage search(String keyword){
        click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));
        searchPage.search(keyword);
        click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));
        return this;
    }

    public StockPage clickSelf(){
        click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.TextView"));
        click(By.id("com.xueqiu.android:id/action_delete_text"));
        click(By.id("com.xueqiu.android:id/action_close"));
        return this;
    }

    public StockPage checkAllDel(){
        click(By.id("com.xueqiu.android:id/edit_group"));
        click(By.id("com.xueqiu.android:id/check_all"));
        click(By.id("com.xueqiu.android:id/cancel_follow"));
        click(By.id("com.xueqiu.android:id/tv_right"));
        click(By.id("com.xueqiu.android:id/action_close"));
        return this;
    }






}

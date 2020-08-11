package test_app.xueqiu.page;

import com.google.common.collect.Lists;

import java.util.List;

public class SearchPage {

    public SearchPage search(String keyword){

        return this;
    }

    public List<String> getSearchList(){
        return Lists.newArrayList("1","2","3");
    }

    public double getPrice(){
        return 1.1;
    }
}

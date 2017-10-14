package top.ningg.weibo4j.examples.trends;

import java.util.List;

import top.ningg.weibo4j.Trend;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Trends;
import top.ningg.weibo4j.model.WeiboException;

public class GetTrendsDaily {
    public static void main(String[] args) {
        String access_token = args[0];
        Trend tm = new Trend(access_token);
        try {
            List<Trends> trends = tm.getTrendsDaily();
            for (Trends ts : trends) {
                Log.logInfo(ts.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

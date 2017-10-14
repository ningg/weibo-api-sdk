package top.ningg.weibo4j.examples.timeline;

import top.ningg.weibo4j.Timeline;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONObject;

public class QueryId {

    public static void main(String[] args) {
        String access_token = args[0];
        String mid = args[1];
        Timeline tm = new Timeline(access_token);
        try {
            JSONObject id = tm.queryId(mid, 1, 1);
            Log.logInfo(id.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

package top.ningg.weibo4j.examples.timeline;

import top.ningg.weibo4j.Timeline;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONArray;
import top.ningg.weibo4j.org.json.JSONException;

public class GetStatusesCount {

    public static void main(String[] args) throws JSONException {
        String access_token = args[0];
        String ids = args[1];
        Timeline tm = new Timeline(access_token);
        try {
            JSONArray json = tm.getStatusesCount(ids);
            for (int i = 0; i < json.length(); i++) {
                Log.logInfo(json.getString(i));
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

package top.ningg.weibo4j.examples.location;

import top.ningg.weibo4j.Location;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONObject;

public class SearchBusStation {

    public static void main(String[] args) {
        String access_token = args[0];
        String q = args[1];
        Location l = new Location(access_token);
        try {
            JSONObject json = l.searchBusStation(q);
            Log.logInfo(json.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }
}

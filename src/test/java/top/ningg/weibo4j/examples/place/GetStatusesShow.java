package top.ningg.weibo4j.examples.place;

import top.ningg.weibo4j.Place;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Status;
import top.ningg.weibo4j.model.WeiboException;

public class GetStatusesShow {
    public static void main(String[] args) {
        String access_token = args[0];
        String id = args[1];
        Place p = new Place(access_token);
        try {
            Status s = p.statusesShow(id);
            Log.logInfo(s.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }
}

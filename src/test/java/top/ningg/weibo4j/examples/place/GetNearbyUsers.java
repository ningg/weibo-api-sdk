package top.ningg.weibo4j.examples.place;

import top.ningg.weibo4j.Place;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.UserWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetNearbyUsers {

    public static void main(String[] args) {
        String access_token = args[0];
        String lat = args[1];
        String lon = args[2];
        Place p = new Place(access_token);
        try {
            UserWapper uw = p.nearbyUsers(lat, lon);
            Log.logInfo(uw.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

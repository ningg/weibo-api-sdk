package top.ningg.weibo4j.examples.place;

import top.ningg.weibo4j.Place;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.UserWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetPoisUserList {

    public static void main(String[] args) {
        String access_token = args[0];
        String poiid = args[1];
        Place p = new Place(access_token);
        try {
            UserWapper uw = p.poisUsersList(poiid);
            Log.logInfo(uw.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

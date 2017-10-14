package top.ningg.weibo4j.examples.place;

import top.ningg.weibo4j.Place;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.StatusWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetUserTimeLine {

    public static void main(String[] args) {
        String access_token = args[0];
        String uid = args[1];
        Place p = new Place(access_token);
        try {
            StatusWapper sw = p.userTimeLine(uid);
            Log.logInfo(sw.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

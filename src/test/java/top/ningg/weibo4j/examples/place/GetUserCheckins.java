package top.ningg.weibo4j.examples.place;

import java.util.List;

import top.ningg.weibo4j.Place;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Places;
import top.ningg.weibo4j.model.WeiboException;

public class GetUserCheckins {

    public static void main(String[] args) {
        String access_token = args[0];
        String uid = args[1];
        Place p = new Place(access_token);
        try {
            List<Places> list = p.checkinsList(uid);
            for (Places pl : list) {
                Log.logInfo(pl.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

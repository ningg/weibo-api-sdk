package top.ningg.weibo4j.examples.timeline;

import top.ningg.weibo4j.Timeline;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.StatusWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetRepostByMe {

    public static void main(String[] args) {
        String access_token = args[0];
        Timeline tm = new Timeline(access_token);
        try {
            StatusWapper status = tm.getRepostByMe();
            Log.logInfo(status.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

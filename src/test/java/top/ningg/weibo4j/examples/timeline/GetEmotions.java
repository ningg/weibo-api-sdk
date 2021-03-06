package top.ningg.weibo4j.examples.timeline;

import java.util.List;

import top.ningg.weibo4j.Timeline;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Emotion;
import top.ningg.weibo4j.model.WeiboException;

public class GetEmotions {

    public static void main(String[] args) {
        String access_token = args[0];
        Timeline tm = new Timeline(access_token);
        try {
            List<Emotion> emotions = tm.getEmotions();
            for (Emotion e : emotions) {
                Log.logInfo(e.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

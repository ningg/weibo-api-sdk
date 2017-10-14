package top.ningg.weibo4j.examples.tags;

import top.ningg.weibo4j.Tags;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.TagWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetTagsBatch {

    public static void main(String[] args) {
        String access_token = args[0];
        String uids = args[1];
        Tags tm = new Tags(access_token);
        try {
            TagWapper tags = tm.getTagsBatch(uids);
            Log.logInfo(tags.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

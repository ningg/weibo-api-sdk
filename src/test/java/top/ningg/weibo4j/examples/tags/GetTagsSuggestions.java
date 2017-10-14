package top.ningg.weibo4j.examples.tags;

import java.util.List;

import top.ningg.weibo4j.Tags;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Tag;
import top.ningg.weibo4j.model.WeiboException;

public class GetTagsSuggestions {

    public static void main(String[] args) {
        String access_token = args[0];
        Tags tm = new Tags(access_token);
        List<Tag> tags = null;
        try {
            tags = tm.getTagsSuggestions();
            for (Tag tag : tags) {
                Log.logInfo(tag.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

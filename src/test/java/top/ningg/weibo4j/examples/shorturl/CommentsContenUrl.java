package top.ningg.weibo4j.examples.shorturl;

import top.ningg.weibo4j.ShortUrl;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONObject;

public class CommentsContenUrl {

    public static void main(String[] args) {
        String access_token = args[0];
        String url = args[1];
        ShortUrl su = new ShortUrl(access_token);
        try {
            JSONObject jo = su.commentsContentUrl(url);
            System.out.println(jo.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

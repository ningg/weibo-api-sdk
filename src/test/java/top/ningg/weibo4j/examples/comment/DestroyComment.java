package top.ningg.weibo4j.examples.comment;

import top.ningg.weibo4j.Comments;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Comment;
import top.ningg.weibo4j.model.WeiboException;

public class DestroyComment {

    public static void main(String[] args) {
        String access_token = args[0];
        String cid = args[1];
        Comments cm = new Comments(access_token);
        try {
            Comment com = cm.destroyComment(cid);
            Log.logInfo(com.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

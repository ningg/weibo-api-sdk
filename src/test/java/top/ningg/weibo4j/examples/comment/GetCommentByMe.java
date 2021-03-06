package top.ningg.weibo4j.examples.comment;

import top.ningg.weibo4j.Comments;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.CommentWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetCommentByMe {

    public static void main(String[] args) {
        String access_token = args[0];
        Comments cm = new Comments(access_token);
        try {
            CommentWapper comment = cm.getCommentByMe();
            Log.logInfo(comment.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }
}

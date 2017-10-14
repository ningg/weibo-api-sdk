package top.ningg.weibo4j.examples.comment;

import top.ningg.weibo4j.Comments;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.CommentWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetCommentById {

    public static void main(String[] args) {
        String access_token = args[0];
        String id = args[1];
        Comments cm = new Comments(access_token);
        try {
            CommentWapper comment = cm.getCommentById(id);
            Log.logInfo(comment.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}
package top.ningg.weibo4j.examples.friendships;

import top.ningg.weibo4j.Friendships;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.User;
import top.ningg.weibo4j.model.UserWapper;
import top.ningg.weibo4j.model.WeiboException;

public class GetFollowersById {

    public static void main(String[] args) {
        String access_token = args[0];
        String uid = args[1];
        Friendships fm = new Friendships(access_token);
        try {
            UserWapper users = fm.getFollowersById(uid);
            for (User u : users.getUsers()) {
                Log.logInfo(u.toString());
            }
            System.out.println(users.getNextCursor());
            System.out.println(users.getPreviousCursor());
            System.out.println(users.getTotalNumber());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

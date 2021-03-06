package top.ningg.weibo4j.examples.user;

import top.ningg.weibo4j.Users;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.User;
import top.ningg.weibo4j.model.WeiboException;

public class ShowUserByDomain {

    public static void main(String[] args) {
        String access_token = args[0];
        String domain = args[1];
        Users um = new Users(access_token);
        try {
            User user = um.showUserByDomain(domain);
            Log.logInfo(user.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

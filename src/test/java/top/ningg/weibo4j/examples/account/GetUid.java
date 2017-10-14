package top.ningg.weibo4j.examples.account;

import top.ningg.weibo4j.Account;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONObject;

public class GetUid {

    public static void main(String[] args) {
        String access_token = args[0];
        Account am = new Account(access_token);
        try {
            JSONObject uid = am.getUid();
            Log.logInfo(uid.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }
}

package top.ningg.weibo4j.examples.account;

import top.ningg.weibo4j.Account;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.RateLimitStatus;
import top.ningg.weibo4j.model.WeiboException;

public class GetAccountRateLimitStatus {

    public static void main(String[] args) {
        String access_token = args[0];
        Account am = new Account(access_token);
        try {
            RateLimitStatus json = am.getAccountRateLimitStatus();
            Log.logInfo(json.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

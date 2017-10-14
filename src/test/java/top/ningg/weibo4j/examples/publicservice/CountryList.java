package top.ningg.weibo4j.examples.publicservice;

import top.ningg.weibo4j.PublicService;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONArray;

public class CountryList {

    public static void main(String[] args) {
        String access_token = args[0];
        PublicService ps = new PublicService(access_token);
        try {
            JSONArray jo = ps.countryList();
            System.out.println(jo.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

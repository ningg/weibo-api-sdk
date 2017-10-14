package top.ningg.weibo4j.examples.publicservice;

import top.ningg.weibo4j.PublicService;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONArray;

public class CityList {

    public static void main(String[] args) {
        String access_token = args[0];
        String province = args[1];
        PublicService ps = new PublicService(access_token);
        JSONArray jo;
        try {
            jo = ps.cityList(province);
            System.out.println(jo.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}
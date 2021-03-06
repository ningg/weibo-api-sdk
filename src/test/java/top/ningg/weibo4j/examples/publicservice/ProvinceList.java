package top.ningg.weibo4j.examples.publicservice;

import top.ningg.weibo4j.PublicService;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONArray;

public class ProvinceList {

    public static void main(String[] args) {
        String access_token = args[0];
        String country = args[1];
        PublicService ps = new PublicService(access_token);
        try {
            JSONArray jo = ps.provinceList(country);
            System.out.println(jo.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

package top.ningg.weibo4j.examples.location;

import java.util.List;

import top.ningg.weibo4j.Location;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Geos;
import top.ningg.weibo4j.model.WeiboException;

public class IpToGeo {

    public static void main(String[] args) {
        String access_token = args[0];
        String ip = args[1];
        Location l = new Location(access_token);
        try {
            List<Geos> list = l.ipToGeo(ip);
            for (Geos g : list) {
                Log.logInfo(g.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

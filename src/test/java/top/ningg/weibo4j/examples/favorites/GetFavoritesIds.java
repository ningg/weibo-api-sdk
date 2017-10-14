package top.ningg.weibo4j.examples.favorites;

import java.util.List;

import top.ningg.weibo4j.Favorite;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.FavoritesIds;
import top.ningg.weibo4j.model.WeiboException;

public class GetFavoritesIds {

    public static void main(String[] args) {
        String access_token = args[0];
        Favorite fm = new Favorite(access_token);
        try {
            List<FavoritesIds> ids = fm.getFavoritesIds();
            for (FavoritesIds s : ids) {
                Log.logInfo(s.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }

    }

}

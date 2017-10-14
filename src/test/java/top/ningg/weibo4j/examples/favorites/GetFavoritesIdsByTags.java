package top.ningg.weibo4j.examples.favorites;

import java.util.List;

import top.ningg.weibo4j.Favorite;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.FavoritesIds;
import top.ningg.weibo4j.model.WeiboException;

public class GetFavoritesIdsByTags {

    public static void main(String[] args) {
        String access_token = args[0];
        Favorite fm = new Favorite(access_token);
        String tid = args[1];
        try {
            List<FavoritesIds> favors = fm.getFavoritesIdsByTags(tid);
            for (FavoritesIds s : favors) {
                Log.logInfo(s.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

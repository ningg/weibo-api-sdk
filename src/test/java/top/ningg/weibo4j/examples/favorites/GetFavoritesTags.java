package top.ningg.weibo4j.examples.favorites;

import java.util.List;

import top.ningg.weibo4j.Favorite;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.FavoritesTag;
import top.ningg.weibo4j.model.WeiboException;

public class GetFavoritesTags {

    public static void main(String[] args) {
        String access_token = args[0];
        Favorite fm = new Favorite(access_token);
        try {
            List<FavoritesTag> favors = fm.getFavoritesTags();
            for (FavoritesTag s : favors) {
                Log.logInfo(s.toString());
            }
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}
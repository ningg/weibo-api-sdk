package top.ningg.weibo4j.examples.favorites;

import top.ningg.weibo4j.Favorite;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Favorites;
import top.ningg.weibo4j.model.WeiboException;

public class UpdateFavoritesTags {

    public static void main(String[] args) {
        String access_token = args[0];
        Favorite fm = new Favorite(access_token);
        String id = args[1];
        String tags = args[2];
        try {
            Favorites favors = fm.updateFavoritesTags(id, tags);
            Log.logInfo(favors.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

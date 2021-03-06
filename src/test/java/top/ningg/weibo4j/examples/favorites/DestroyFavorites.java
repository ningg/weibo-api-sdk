package top.ningg.weibo4j.examples.favorites;

import top.ningg.weibo4j.Favorite;
import top.ningg.weibo4j.examples.oauth2.Log;
import top.ningg.weibo4j.model.Favorites;
import top.ningg.weibo4j.model.WeiboException;

public class DestroyFavorites {

    public static void main(String[] args) {
        String access_token = args[0];
        String id = args[1];
        Favorite fm = new Favorite(access_token);
        try {
            Favorites favors = fm.destroyFavorites(id);
            Log.logInfo(favors.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

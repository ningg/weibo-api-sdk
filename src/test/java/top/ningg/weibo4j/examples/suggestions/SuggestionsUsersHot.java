package top.ningg.weibo4j.examples.suggestions;

import top.ningg.weibo4j.Suggestion;
import top.ningg.weibo4j.model.WeiboException;
import top.ningg.weibo4j.org.json.JSONArray;

public class SuggestionsUsersHot {

    public static void main(String[] args) {
        String access_token = args[0];
        Suggestion suggestion = new Suggestion(access_token);
        try {
            JSONArray jo = suggestion.suggestionsUsersHot();
            System.out.println(jo.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}

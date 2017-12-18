package com.rinor.myapplication.model;

import org.json.JSONObject;

/**
 * Created by Rinor on 12/15/2017.
 */

public class User {

    String userId;
    String emri;
    String username;

    public String getEmri() {
        return emri;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;

    }

    public User(JSONObject jsonObject){
        userId=jsonObject.optString("UserID");
        emri=jsonObject.optString("Emri");
        username=jsonObject.optString("Username");



    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", emri='" + emri + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

package com.rinor.myapplication.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Rinor on 12/18/2017.
 */

public class LoginResponse {

    User user;


    public LoginResponse(String u) throws JSONException {
        JSONObject jsonObject = new JSONObject(u);
        JSONArray jsonArray = jsonObject.optJSONArray("User");
        user = new User(jsonArray.getJSONObject(0));
    }
    public User getUser(){
            return user;
    }



}

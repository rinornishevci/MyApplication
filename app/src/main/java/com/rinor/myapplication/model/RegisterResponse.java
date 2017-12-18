package com.rinor.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.SQLOutput;

/**
 * Created by Rinor on 12/15/2017.
 */

public class RegisterResponse {

    String status;
    String message;
    User user;

    public RegisterResponse(String s)throws JSONException{

        JSONObject jsonObject=new JSONObject(s);
        System.out.println(jsonObject.toString());
        status=jsonObject.optString("status");
        message=jsonObject.optString(",message");
        if(message==null) {
            user = new User(jsonObject.optJSONObject("user"));
        }

    }

    public String getMessage() {
        return message;
    }

    public String getStatus(){

        return status;
    }

    public User getUser(){
        return user;

    }

    @Override
    public String toString() {
        return "RegisterResponse{" +
                "status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
}

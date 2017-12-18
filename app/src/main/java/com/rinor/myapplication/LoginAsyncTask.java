package com.rinor.myapplication;

import android.os.AsyncTask;

import com.rinor.myapplication.callback.LoginCallback;
import com.rinor.myapplication.callback.RegisterCallback;
import com.rinor.myapplication.model.LoginResponse;
import com.rinor.myapplication.model.RegisterResponse;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by Rinor on 12/18/2017.
 */

public class LoginAsyncTask   extends AsyncTask<String, String, String> {

    LoginCallback callback;

    public LoginAsyncTask(LoginCallback callback){
        this.callback=callback;

    }
    @Override
    protected void onPreExecute(){
        super.onPreExecute();

    }

    protected String doInBackground(String... strings){
        try{
            return ApiService.get(strings[0]);
        } catch (IOException e){
            e.printStackTrace();
            return null;

        }

    }

    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);
        try {
            LoginResponse lr=new LoginResponse(s);
            callback.onLoginResponse(lr.getUser());
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


}
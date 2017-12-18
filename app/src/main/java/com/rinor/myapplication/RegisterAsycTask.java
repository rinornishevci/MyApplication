package com.rinor.myapplication;

import android.os.AsyncTask;

import com.rinor.myapplication.callback.RegisterCallback;
import com.rinor.myapplication.model.RegisterResponse;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by Rinor on 12/15/2017.
 */

public class RegisterAsycTask extends AsyncTask<String, String, String>{

    RegisterCallback callback;

    public RegisterAsycTask(RegisterCallback callback){
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
        try{
            RegisterResponse response = new RegisterResponse(s);
            callback.onRegisterResponse(response.getUser(), response.getMessage() == null);

        }catch (JSONException e){
            e.printStackTrace();

        }

    }


}

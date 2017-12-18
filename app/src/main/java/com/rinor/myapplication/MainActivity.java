package com.rinor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rinor.myapplication.callback.LoginCallback;
import com.rinor.myapplication.callback.RegisterCallback;
import com.rinor.myapplication.model.User;

public class MainActivity extends AppCompatActivity implements RegisterCallback, LoginCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String loginurl="http://appsix.net/paintbook/index.php?User=testtest&Password=28a34010e84b881fb087359c7e280a08";
        String url = "http://appsix.net/paintbook/index.php?RegisterUser=&?User=gentb&Password=d9fe557f92f909fd5aa1504fb5a30aaa?User=gentb&Password=d9fe557f92f909fd5aa1504fb5a30aaa";
        //new RegisterAsycTask(this).execute(url);
        new LoginAsyncTask(this).execute(loginurl);


    }


    @Override
    public void onRegisterResponse(User user, boolean status){
        System.out.println("user"+user.toString());

    }


    @Override
    public void onLoginResponse(User user) {
        System.out.println(user.toString());
    }
}

package com.rinor.myapplication.callback;

import com.rinor.myapplication.model.User;

/**
 * Created by Rinor on 12/15/2017.
 */



    public interface RegisterCallback {
        void onRegisterResponse(User user,boolean sucess);

    }

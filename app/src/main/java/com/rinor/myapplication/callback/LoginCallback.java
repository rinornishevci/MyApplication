package com.rinor.myapplication.callback;

import com.rinor.myapplication.model.User;

/**
 * Created by Rinor on 12/18/2017.
 */

public interface LoginCallback  {
    void onLoginResponse(User user);

}

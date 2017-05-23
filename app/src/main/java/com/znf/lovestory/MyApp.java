package com.znf.lovestory;

import android.app.Application;

import com.znf.lovestory.util.GlobalContext;

/**
 * Created by wwq on 2017/5/23.
 */

public class MyApp  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        GlobalContext.setContext(this);
    }
}

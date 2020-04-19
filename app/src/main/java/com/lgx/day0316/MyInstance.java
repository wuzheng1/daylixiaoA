package com.lgx.day0316;

import android.app.Activity;
import android.view.View;

public class MyInstance {

    private static MyInstance myInstance;
    private Activity activity;

    private MyInstance(){}

    public static MyInstance getInstance(){
        if (myInstance == null){
            synchronized (MyInstance.class){
                if (myInstance == null){
                    myInstance = new MyInstance();
                }
            }
        }
        return myInstance;
    }

    public void setContext(Activity activity){
        this.activity = activity;
    }
}

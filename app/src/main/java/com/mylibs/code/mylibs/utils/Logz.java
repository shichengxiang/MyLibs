package com.mylibs.code.mylibs.utils;

import android.util.Log;

/**
 * Created by shichengxinag on 2018/2/1.
 */

public class Logz {
    static final String TAG = "===";

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    /**
     * debug
     * @param msg
     */
    public static void d(String msg){
        Log.d(TAG,msg);
    }
}

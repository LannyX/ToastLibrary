package com.lanny.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMsg {

    //Custom Toast Msg
    public static void showLXMsg(Context c, String msg){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }

}

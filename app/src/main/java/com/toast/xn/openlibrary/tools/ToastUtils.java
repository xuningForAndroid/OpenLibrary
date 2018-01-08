package com.toast.xn.openlibrary.tools;

/**
 * Created by xuning on 2018/1/8 0008.
 */

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 */
public class ToastUtils {
    public static void showToast(Context context,String content,boolean isShort){
        if (isShort){
            Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, content, Toast.LENGTH_LONG).show();
        }
    }
}

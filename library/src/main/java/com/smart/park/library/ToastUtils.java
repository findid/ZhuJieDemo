package com.smart.park.library;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public void showToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }
}

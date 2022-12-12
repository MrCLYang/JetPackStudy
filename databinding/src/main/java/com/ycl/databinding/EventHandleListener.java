package com.ycl.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public
/**
 *Time:2022/12/11
 *Author:YCL
 *Description:
 */
class EventHandleListener {
    private Context context;

    public EventHandleListener(Context context) {
        this.context = context;
    }

    public void buttonOnClick(View view){
        Toast.makeText(context,"喜欢",Toast.LENGTH_LONG).show();
    }
}

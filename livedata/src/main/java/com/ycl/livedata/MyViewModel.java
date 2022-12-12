package com.ycl.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public
/**
 *Time:2022/12/10
 *Author:YCL
 *Description:
 */
class MyViewModel extends ViewModel {
    public MutableLiveData<Integer> currentSecond;

    public MutableLiveData<Integer> getCurrentSecond() {
        if(currentSecond==null){
            currentSecond=new MutableLiveData<>();
            currentSecond.setValue(0);
        }
        return currentSecond;
    }
}

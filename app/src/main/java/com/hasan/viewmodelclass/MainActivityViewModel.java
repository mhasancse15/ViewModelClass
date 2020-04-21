package com.hasan.viewmodelclass;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;
    private MutableLiveData<Integer> countLiveData=new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount() {
        countLiveData.setValue(clickCount);

        return countLiveData;
    }

    public void getCurrentCount() {

        clickCount += 1;
        countLiveData.setValue(clickCount);

    }
}

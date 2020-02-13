package com.example.maple_stat.ui.efficiency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EfficiencyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EfficiencyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
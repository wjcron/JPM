package com.example.myapplication.ui.saenghwal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaenghwalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SaenghwalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Saenghwal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.example.myapplication.ui.car;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("자동차관");

    }
    public LiveData<String> getText() {
        return mText;
    }
}
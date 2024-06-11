package com.example.myapplication.ui.limgok;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LimgokViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LimgokViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("임곡관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
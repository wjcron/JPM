package com.example.myapplication.ui.toegye;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToegyeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ToegyeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("퇴계관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
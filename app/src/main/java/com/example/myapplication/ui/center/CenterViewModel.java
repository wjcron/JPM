package com.example.myapplication.ui.center;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CenterViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CenterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("학생본부");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
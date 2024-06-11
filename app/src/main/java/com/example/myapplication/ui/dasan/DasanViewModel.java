package com.example.myapplication.ui.dasan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DasanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DasanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("다산관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
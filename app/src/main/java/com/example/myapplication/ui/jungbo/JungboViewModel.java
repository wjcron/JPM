package com.example.myapplication.ui.jungbo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JungboViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public JungboViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is jungbo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
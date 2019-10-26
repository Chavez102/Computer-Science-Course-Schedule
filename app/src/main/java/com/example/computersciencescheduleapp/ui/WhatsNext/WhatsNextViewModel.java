package com.example.computersciencescheduleapp.ui.WhatsNext;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WhatsNextViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WhatsNextViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("this is me now ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

package com.example.computersciencescheduleapp.ui.Degree;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DegreeViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DegreeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}

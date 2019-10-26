package com.example.computersciencescheduleapp.ui.DegreeTemplate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DegreeTemplateViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public DegreeTemplateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home degree template");
    }

    public LiveData<String> getText() {
        return mText;
    }







}

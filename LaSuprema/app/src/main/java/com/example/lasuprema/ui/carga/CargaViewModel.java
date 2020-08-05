package com.example.lasuprema.ui.carga;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CargaViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public CargaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}

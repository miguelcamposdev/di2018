package com.miguelcr.a05_viewmodel_comunicacionfragments;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ColorViewModel extends ViewModel {
    private final MutableLiveData<String> colorSeleccionado = new MutableLiveData<String>();

    // Master > Detail (comunicación del dato)
    public void selectColor(String color) {
        colorSeleccionado.setValue(color);
    }

    public LiveData<String> getSelectedColor() {
        return colorSeleccionado;
    }


}

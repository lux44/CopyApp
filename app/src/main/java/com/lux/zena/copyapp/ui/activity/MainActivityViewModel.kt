package com.lux.zena.copyapp.ui.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(): ViewModel() {
    private var numbers = MutableLiveData<Int>()

    val number : LiveData<Int> get() = numbers

    init {
        numbers.value = 100
    }

    fun increase(){
        numbers.value = numbers.value?.plus(1)
    }
}
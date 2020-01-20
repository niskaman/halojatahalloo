package com.example.halojatahalloo.ui.dial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DialViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is number dial Fragment"
    }
    val text: LiveData<String> = _text
}
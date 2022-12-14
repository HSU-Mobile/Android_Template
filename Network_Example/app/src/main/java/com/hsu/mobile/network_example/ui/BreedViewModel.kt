package com.hsu.mobile.network_example.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hsu.mobile.network_example.model.Breed
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BreedViewModel : ViewModel() {

    val loading = MutableLiveData<Boolean>(true)

    private val _breedList = MutableLiveData<List<Breed>>()
    val breedList: LiveData<List<Breed>> get() = _breedList

    init {

    }
}
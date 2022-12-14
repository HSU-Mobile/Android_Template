package com.hsu.mobile.network_example.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hsu.mobile.network_example.model.Breed
import com.hsu.mobile.network_example.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BreedViewModel : ViewModel() {

    val loading = MutableLiveData<Boolean>(true)

    private val _breedList = MutableLiveData<List<Breed>>()
    val breedList: LiveData<List<Breed>> get() = _breedList

    init {
        RetrofitClient.getApiService().getBreeds().enqueue(object: Callback<List<Breed>> {
            override fun onResponse(call: Call<List<Breed>>, response: Response<List<Breed>>) {
                if (response.isSuccessful) {
                    _breedList.value = response.body()
                    loading.value = false
                }
            }

            override fun onFailure(call: Call<List<Breed>>, t: Throwable) {}
        })
    }
}
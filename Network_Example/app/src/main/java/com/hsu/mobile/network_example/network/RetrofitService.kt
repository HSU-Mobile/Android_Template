package com.hsu.mobile.network_example.network

import com.hsu.mobile.network_example.model.Breed
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("/v1/breeds")
    fun getBreeds() : Call<List<Breed>>
}
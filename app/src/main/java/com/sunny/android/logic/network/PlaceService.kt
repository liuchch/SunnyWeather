package com.sunny.android.logic.network

import com.sunny.android.MyApplication
import com.sunny.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${MyApplication.TOKEN}&lnag=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}
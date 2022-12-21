package com.example.newsapp.data.Retrofit

import com.example.newsapp.models.apiModel
import com.example.newsapp.utils.Constants
import com.example.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countrycode:String = "us",
        @Query("page")
        page:Int = 1,
        @Query("apikey")
        apikey:String = API_KEY
    ):Response<apiModel>


    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q")
        search:String,
        @Query("page")
        page:Int = 1,
        @Query("apikey")
        apikey:String = API_KEY
    ):Response<apiModel>

}
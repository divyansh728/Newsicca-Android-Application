package com.example.newsicca.api

import com.example.newsicca.models.NewsResponse
import com.example.newsicca.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Locale.IsoCountryCode

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(

    @Query("country")
    countryCode: String = "us",
    @Query("page")
    pageNumber: Int = 1,
    @Query("apikey")
    apiKey: String = API_KEY,

    ): Response<NewsResponse>


    @GET("v2/everything")
    suspend fun seachForNews(

        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apikey")
        apiKey: String = API_KEY,

    ):Response<NewsResponse>
}
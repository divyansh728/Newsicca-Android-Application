package com.example.newsicca.repository

import androidx.room.Query
import com.example.newsicca.api.RetrofitInstance
import com.example.newsicca.db.ArticleDatabase
import com.example.newsicca.models.Article
import retrofit2.Retrofit
import java.util.Locale.IsoCountryCode

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.seachForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}
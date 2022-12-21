package com.example.newsapp.ui

data class Article(
    val articles: List<ArticleX>,
    val status: String,
    val totalResults: Int
)
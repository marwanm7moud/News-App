package com.example.newsapp.models

data class apiModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
package com.example.todo

import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<ApiTask>
}

data class ApiTask(
    val id: Int,
    val title: String,
    val body: String,
    val userId: Int
)
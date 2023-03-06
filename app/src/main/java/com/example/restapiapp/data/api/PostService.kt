package com.example.restapiapp.data.api

import com.example.restapiapp.data.api.models.PostResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface PostService {
    @GET("/post")
    suspend fun getAllPosts(): Response<List<PostResponse>>

    @POST("/posts")
    suspend fun postPost(@Body body: PostResponse): Response<PostResponse>

    @PUT("/post/{id}")
    suspend fun putPost(@Path("id") id: String): Response<PostResponse>

    @PATCH("/post/{id}")
    suspend fun putchPost(@Path("id") id: String): Response<PostResponse>

    @DELETE("/post/{id}")
    suspend fun deletePost(@Path("id") id: String): Response<PostResponse>
}
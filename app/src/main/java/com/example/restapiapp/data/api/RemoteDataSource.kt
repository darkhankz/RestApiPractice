package com.example.restapiapp.data.api

import com.example.restapiapp.data.api.models.PostResponse
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val postService: PostService) {
    suspend fun getAllPosts() = postService.getAllPosts()
    suspend fun postPosts(body: PostResponse) = postService.postPost(body = body)
    suspend fun putPosts(id: String) = postService.putPost(id = id)
    suspend fun putchPosts(id: String) = postService.putchPost(id = id)
    suspend fun deletePosts(id: String) = postService.deletePost(id = id)



}
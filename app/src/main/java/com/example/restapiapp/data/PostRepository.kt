package com.example.restapiapp.data

import com.example.restapiapp.data.api.RemoteDataSource
import com.example.restapiapp.data.api.models.PostResponse
import com.example.restapiapp.utils.BaseApiResponse
import com.example.restapiapp.utils.NetworkResult
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val remeteDataSource: RemoteDataSource): BaseApiResponse() {

    suspend fun getAllPosts(): NetworkResult<List<PostResponse>>{
        return safeApiCall { remeteDataSource.getAllPosts() }
    }

    suspend fun postPost(body: PostResponse): NetworkResult<PostResponse>{
        return safeApiCall { remeteDataSource.postPosts(body = body) }
    }

    suspend fun putPost(id: String): NetworkResult<PostResponse>{
        return safeApiCall { remeteDataSource.putPosts(id = id) }
    }

    suspend fun putchPost(id: String): NetworkResult<PostResponse>{
        return safeApiCall { remeteDataSource.putchPosts(id = id) }
    }

    suspend fun deletePost(id: String): NetworkResult<PostResponse>{
        return safeApiCall { remeteDataSource.deletePosts(id = id) }
    }

}
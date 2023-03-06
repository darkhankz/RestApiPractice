package com.example.restapiapp.domain.usecases

import com.example.restapiapp.data.PostRepository
import javax.inject.Inject

class PutchPostUseCase @Inject constructor(private val postRepository: PostRepository) {
    suspend fun invoke(id: String) = postRepository.putchPost(id = id)
}
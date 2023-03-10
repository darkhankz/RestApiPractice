package com.example.restapiapp.data.api.models

import com.google.gson.annotations.SerializedName

class PostResponse(
    @SerializedName("userId")
    val userId: Long? = null,
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("body")
    val body: String? = null
)
package com.example.appdogsteam.model.response

import com.google.gson.annotations.SerializedName

data class ResponseRandomDog (
    @SerializedName("message")
    val data: String,
    @SerializedName("status")
    val status: String
)
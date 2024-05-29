package com.example.appdogsteam.model.response

import com.google.gson.annotations.SerializedName

data class ResponseDogs(

    @SerializedName("message")
    val dataList: List<String>,
    @SerializedName("status")
    val status: String
)

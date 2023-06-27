package com.example.praktikum10.Api

import com.example.praktikum10.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponseMorty>
}
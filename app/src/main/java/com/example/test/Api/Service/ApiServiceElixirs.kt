package com.example.test.Api.Service

import com.example.test.Api.Elixir
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceElixirs {
    @GET("Elixirs")
    fun getElixir(): Call<List<Elixir>>
}
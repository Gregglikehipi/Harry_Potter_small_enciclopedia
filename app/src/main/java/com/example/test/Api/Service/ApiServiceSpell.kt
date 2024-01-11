package com.example.test.Api.Service

import com.example.test.Api.Spell
import com.example.test.Api.Wizard
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceSpell {
    @GET("Spells")
    fun getSpell(): Call<List<Spell>>
}
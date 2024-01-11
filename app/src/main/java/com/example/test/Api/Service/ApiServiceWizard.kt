package com.example.test.Api.Service

import com.example.test.Api.Wizard
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceWizard {
    @GET("Wizards")
    fun getWizard(): Call<List<Wizard>>
}
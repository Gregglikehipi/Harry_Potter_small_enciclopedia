package com.example.test.Api

import com.example.test.Api.Service.ApiServiceElixirs
import com.example.test.Api.Service.ApiServiceSpell
import com.example.test.Api.Service.ApiServiceWizard
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://wizard-world-api.herokuapp.com/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

object ApiClientElixir {
    val apiServiceElixir: ApiServiceElixirs by lazy {
        RetrofitClient.retrofit.create(ApiServiceElixirs::class.java)
    }
}

object ApiClientWizard {
    val apiServiceWizard: ApiServiceWizard by lazy {
        RetrofitClient.retrofit.create(ApiServiceWizard::class.java)
    }
}

object ApiClientSpell {
    val apiServiceSpell: ApiServiceSpell by lazy {
        RetrofitClient.retrofit.create(ApiServiceSpell::class.java)
    }
}
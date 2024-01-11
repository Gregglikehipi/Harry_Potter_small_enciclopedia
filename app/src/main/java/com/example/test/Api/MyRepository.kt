package com.example.test.Api

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyRepository() {
    companion object {
        fun getElixir(callback: (List<Elixir>?, Throwable?) -> Unit) {
            val call = ApiClientElixir.apiServiceElixir.getElixir()

            call.enqueue(object : Callback<List<Elixir>> {
                override fun onResponse(call: Call<List<Elixir>>, response: Response<List<Elixir>>) {
                    if (response.isSuccessful) {
                        val post = response.body()
                        callback(post, null)
                    } else {
                        // Handle error
                        callback(null, Exception("Failed to get posts"))
                    }
                }

                override fun onFailure(call: Call<List<Elixir>>, t: Throwable) {
                    callback(null, t)
                }
            })
        }

        fun getSpell(callback: (List<Spell>?, Throwable?) -> Unit) {
            val call = ApiClientSpell.apiServiceSpell.getSpell()

            call.enqueue(object : Callback<List<Spell>> {
                override fun onResponse(call: Call<List<Spell>>, response: Response<List<Spell>>) {
                    if (response.isSuccessful) {
                        val post = response.body()
                        callback(post, null)
                    } else {
                        // Handle error
                        callback(null, Exception("Failed to get posts"))
                    }
                }

                override fun onFailure(call: Call<List<Spell>>, t: Throwable) {
                    callback(null, t)
                }
            })
        }

        fun getWizard(callback: (List<Wizard>?, Throwable?) -> Unit) {
            val call = ApiClientWizard.apiServiceWizard.getWizard()

            call.enqueue(object : Callback<List<Wizard>> {
                override fun onResponse(call: Call<List<Wizard>>, response: Response<List<Wizard>>) {
                    if (response.isSuccessful) {
                        val post = response.body()
                        callback(post, null)
                    } else {
                        // Handle error
                        callback(null, Exception("Failed to get posts"))
                    }
                }

                override fun onFailure(call: Call<List<Wizard>>, t: Throwable) {
                    callback(null, t)
                }
            })
        }
    }
}
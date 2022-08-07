package com.example.skrateapp.network


import com.example.skrateapp.model.UpcomingSession

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class UserReciever {


    companion object{

        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://mocki.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofitInterface: RetrofitInterface by lazy {
            retrofit.create(RetrofitInterface::class.java)
        }
    }

    suspend fun getUsers():List<UpcomingSession>{
        return retrofitInterface.getUsers()
    }
}
package com.example.skrateapp.network


import com.example.skrateapp.model.UpcomingSession
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("v1/bb11aecd-ba61-44b9-9e2c-beabc442d818")
    suspend fun getUsers():List<UpcomingSession>
}
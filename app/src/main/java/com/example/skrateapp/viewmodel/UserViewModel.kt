package com.example.skrateapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skrateapp.model.UpcomingSession
import com.example.skrateapp.network.UserReciever


import kotlinx.coroutines.launch
import java.lang.Exception

class UserViewModel(private val userReciever: UserReciever):ViewModel() {

    val response:MutableLiveData<List<UpcomingSession>> = MutableLiveData()

    fun getUsers(){
        viewModelScope.launch {
            try {
                val my_response = userReciever.getUsers()
                response.value = my_response

            }catch (exception:Exception){
                Log.d("exception","message: ${exception.message}")
            }
        }
    }

}
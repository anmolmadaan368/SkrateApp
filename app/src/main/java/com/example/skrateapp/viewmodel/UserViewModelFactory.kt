package com.example.skrateapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.skrateapp.network.UserReciever


class UserViewModelFactory(private val userReciever: UserReciever):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UserViewModel(userReciever) as T
    }

}
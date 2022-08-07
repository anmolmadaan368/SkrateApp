package com.example.skrateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skrateapp.adapter.UserAdapter1
import com.example.skrateapp.model.UpcomingSession
import com.example.skrateapp.network.UserReciever
import com.example.skrateapp.viewmodel.UserViewModel
import com.example.skrateapp.viewmodel.UserViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val userReciever:UserReciever = UserReciever()
    private lateinit var userAdapter: UserAdapter1
    private lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView()
        val viewModelFactory = UserViewModelFactory(userReciever)
        userViewModel = ViewModelProvider(this,viewModelFactory)[UserViewModel::class.java]
        userViewModel.getUsers()
        userViewModel.response.observe(this, Observer {
            userAdapter.setUserData(it as ArrayList<UpcomingSession>)
            recycler_view_1.visibility= View.VISIBLE

        })
    }

    private fun recyclerView(){
        userAdapter = UserAdapter1(this,ArrayList())

        recycler_view_1.apply {
            recycler_view_1.layoutManager = LinearLayoutManager(this@MainActivity)
            adapter=userAdapter
        }

    }
}
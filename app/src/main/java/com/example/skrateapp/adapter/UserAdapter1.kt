package com.example.skrateapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.skrateapp.R
import com.example.skrateapp.model.JobPosting
import com.example.skrateapp.model.UpcomingSession

class UserAdapter1 (private val context: Context, private var userResponse:ArrayList<UpcomingSession>) :
    RecyclerView.Adapter<UserAdapter1.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter1.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.items_sessions, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UserAdapter1.ViewHolder, position: Int) {
        val user = userResponse[position]

        holder.name.text = user.mentor_name
        holder.techStack.text = user.session_type
        holder.date.text = user.date
        holder.time1.text = user.timings

    }

    override fun getItemCount(): Int {
        return userResponse.size
    }

    fun setUserData(list: ArrayList<UpcomingSession>){
        this.userResponse = list
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)
        val techStack: TextView = itemView.findViewById(R.id.tech_stack)
        val date: TextView = itemView.findViewById(R.id.date)
        val time1: TextView = itemView.findViewById(R.id.time)

    }

}
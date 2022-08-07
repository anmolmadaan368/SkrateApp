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

class UserAdapter2 (private val context: Context, private var userResponse:ArrayList<JobPosting>) :
    RecyclerView.Adapter<UserAdapter2.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter2.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_jobs,parent,false))
}

    override fun onBindViewHolder(holder: UserAdapter2.ViewHolder, position: Int) {
        val user = userResponse[position]

        holder.tech.text = user.role
        holder.company.text = user.organization_name
        holder.home.text = user.location
        holder.time.text = user.date_posted

    }

    override fun getItemCount(): Int {
        return userResponse.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tech: TextView = itemView.findViewById(R.id.tech)
        val company: TextView = itemView.findViewById(R.id.company)
        val home: TextView = itemView.findViewById(R.id.home)
        val time: TextView = itemView.findViewById(R.id.time_1)

    }

}
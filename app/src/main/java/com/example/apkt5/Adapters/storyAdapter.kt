package com.example.apkt5.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apkt5.Models.insta_storyModel
import com.example.apkt5.R

class storyAdapter(private val storyList: ArrayList<insta_storyModel>):
    RecyclerView.Adapter<storyAdapter.myviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sample_storieslayout,parent,false)
        return myviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myviewHolder, position: Int) {
        val currentItem = storyList[position]
        holder.instaStory.setImageResource(currentItem.instaPic)
        holder.storyId.text = currentItem.instaId
    }

    override fun getItemCount(): Int {
        return storyList.size
    }


    class myviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val instaStory = itemView.findViewById<ImageView>(R.id.profile_image)
        val storyId = itemView.findViewById<TextView>(R.id.story_id)
    }
}
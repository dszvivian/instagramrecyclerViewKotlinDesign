package com.example.apkt5.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apkt5.Models.insta_postModel
import com.example.apkt5.R

class postAdapter(private val postList:ArrayList<insta_postModel>):
    RecyclerView.Adapter<postAdapter.myviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sample_postlayout,parent,false)
        return myviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myviewHolder, position: Int) {
        val currentList = postList[position]
        holder.instaStory.setImageResource(currentList.profilePic)
        holder.instaPost.setImageResource(currentList.uploadPic)
        holder.instaId.text = currentList.instaId
        holder.instaPlace.setText(currentList.place)
    }

    override fun getItemCount(): Int {
        return postList.size
    }


    class myviewHolder(val itemView : View):RecyclerView.ViewHolder(itemView) {
        val instaStory  = itemView.findViewById<ImageView>(R.id.story_image)
        val instaPost  = itemView.findViewById<ImageView>(R.id.upload_image)
        val instaId  = itemView.findViewById<TextView>(R.id.insta_id)
        val instaPlace  = itemView.findViewById<TextView>(R.id.insta_place)

    }
}
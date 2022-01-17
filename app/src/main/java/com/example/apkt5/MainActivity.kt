package com.example.apkt5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apkt5.Adapters.postAdapter
import com.example.apkt5.Adapters.storyAdapter
import com.example.apkt5.Models.insta_postModel
import com.example.apkt5.Models.insta_storyModel
import com.example.apkt5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val postList = ArrayList<insta_postModel>()

        val adapter = postAdapter(postList)
        binding.rvPost.adapter = adapter

        //post
        postList.add(insta_postModel(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"))
        postList.add(insta_postModel(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"))
        postList.add(insta_postModel(R.drawable.instahacker , R.drawable.hackersetup , "Hacker Dude" , "Somewhere out of nowhere"))
        postList.add(insta_postModel(R.drawable.insta1 , R.drawable.insta1 , "Mr.x" , "Hawaii"))
        postList.add(insta_postModel(R.drawable.insta2 , R.drawable.insta1 , "Mr.y" , "Hawaii"))
        postList.add(insta_postModel(R.drawable.insta3 , R.drawable.insta1 , "Mr.P" , "Hawaii"))
        postList.add(insta_postModel(R.drawable.insta4 , R.drawable.insta1 , "Mr.k" , "Hawaii"))
        postList.add(insta_postModel(R.drawable.insta5 , R.drawable.insta1 , "Mr.v" , "Hawaii"))

        binding.rvPost.layoutManager = LinearLayoutManager(this)


        val storyList = ArrayList<insta_storyModel>()

        val storyAdapter = storyAdapter(storyList)
        binding.rvStories.adapter = storyAdapter

        //model
        storyList.add(insta_storyModel(R.drawable.photographerpic , "Mr.Photographer"))
        storyList.add(insta_storyModel(R.drawable.gamerkeyboard , "Gaming Soul"))
        storyList.add(insta_storyModel(R.drawable.hackersetup , "Hacker Dude"))
        storyList.add(insta_storyModel(R.drawable.insta1 , "Mr.x"))
        storyList.add(insta_storyModel(R.drawable.insta1 , "Mr.y"))
        storyList.add(insta_storyModel(R.drawable.insta1 , "Mr.P"))
        storyList.add(insta_storyModel(R.drawable.insta1 , "Mr.k"))
        storyList.add(insta_storyModel(R.drawable.insta1 , "Mr.v"))

        binding.rvStories.layoutManager = LinearLayoutManager(this , RecyclerView.HORIZONTAL , true)

    }
}
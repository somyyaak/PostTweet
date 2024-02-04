package com.example.tweetie

data class Post (
    val text : String="",
    val createdAt: Long =0L,
    val createdBy: User=User(),
    val likedBy: ArrayList<String> = ArrayList()
)
package com.sohail.animez


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("airing")
    val airing: Boolean,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("episodes")
    val episodes: Int,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("mal_id")
    val malId: Int,
    @SerializedName("members")
    val members: Int,
    @SerializedName("rated")
    val rated: String,
    @SerializedName("score")
    val score: Double,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)
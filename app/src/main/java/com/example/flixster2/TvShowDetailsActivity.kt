package com.example.flixster2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide


class TvShowDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show_details)

        val tvShowName = intent.getStringExtra("TV_SHOW_TITLE")
        val tvShowReleaseDate = intent.getStringExtra("TV_SHOW_RELEASE_DATE")
        val tvShowRating = intent.getStringExtra("TV_SHOW_RATING")
        val tvShowOverview = intent.getStringExtra("TV_SHOW_OVERVIEW")
        val tvShowPosterPath = intent.getStringExtra("TV_SHOW_POSTER_PATH")

        findViewById<TextView>(R.id.textViewTvShowTitle).text = tvShowName
        findViewById<TextView>(R.id.textViewTvShowReleaseDate).text = tvShowReleaseDate
        findViewById<TextView>(R.id.textViewTvShowRating).text = tvShowRating
        findViewById<TextView>(R.id.textViewTvShowOverview).text = tvShowOverview

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/$tvShowPosterPath")
            .into(findViewById<ImageView>(R.id.imageViewTvShowPoster))
    }
}
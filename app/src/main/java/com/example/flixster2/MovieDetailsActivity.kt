package com.example.flixster2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide


class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val movieTitle = intent.getStringExtra("MOVIE_TITLE")
        val movieReleaseDate = intent.getStringExtra("MOVIE_RELEASE_DATE")
        val movieRating = intent.getStringExtra("MOVIE_RATING")
        val movieOverview = intent.getStringExtra("MOVIE_OVERVIEW")
        val moviePosterPath = intent.getStringExtra("MOVIE_POSTER_PATH")

        findViewById<TextView>(R.id.textViewMovieTitle).text = movieTitle
        findViewById<TextView>(R.id.textViewReleaseDate).text = movieReleaseDate
        findViewById<TextView>(R.id.textViewRating).text = movieRating
        findViewById<TextView>(R.id.textViewOverview).text = movieOverview

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/$moviePosterPath")
            .into(findViewById<ImageView>(R.id.imageViewMoviePoster))
    }
}
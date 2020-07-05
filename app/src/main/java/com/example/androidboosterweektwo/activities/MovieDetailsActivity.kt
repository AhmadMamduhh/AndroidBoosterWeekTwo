package com.example.androidboosterweektwo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidboosterweektwo.R
import kotlinx.android.synthetic.main.activity_movie_details.*
import kotlinx.android.synthetic.main.movie_item_layout.*

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        backButton.setOnClickListener(){ finish() }
        var bundle = intent.extras
        movieDetailsImg.setImageResource(bundle.getInt("Movie Image"))
        movieDetailsName.text = bundle?.getString("Movie Title")
        movieDetailsDesc.text = bundle?.getString("Movie Description")
        movieDetailsDate.text = "Release Date: ${bundle?.getString("Movie Date")}"
        ratingBar.rating = bundle.getFloat("Movie Rating")

    }
}

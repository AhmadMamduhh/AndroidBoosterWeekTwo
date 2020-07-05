package com.example.androidboosterweektwo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidboosterweektwo.R
import com.example.androidboosterweektwo.data.DataObtainer
import com.example.androidboosterweektwo.ui.MovieRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movieList = DataObtainer.getMovieList()
        val recyclerAdapter = MovieRecyclerAdapter(this, movieList)
        movie_recycler_view.layoutManager = GridLayoutManager(this, 2)
        movie_recycler_view.adapter = recyclerAdapter
    }
}

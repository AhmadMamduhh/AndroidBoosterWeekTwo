package com.example.androidboosterweektwo.data

import com.example.androidboosterweektwo.R
import com.example.androidboosterweektwo.model.Movie

object DataObtainer {
    fun getMovieList() : ArrayList<Movie>{
        val movieList = ArrayList<Movie>()

        movieList.add(Movie("Batman", R.drawable.batman,"This is a movie about batman",
            "25-3-2005", 4.5f))
        movieList.add(Movie("Superman", R.drawable.superman,"This is a movie about superman",
            "25-3-2011", 3.5f))
        movieList.add(Movie("Joker", R.drawable.joker,"This is a movie about the joker",
            "25-3-2007", 2.5f))
        movieList.add(Movie("Corona", R.drawable.coronavirus,"This is a movie about corona",
            "25-3-2020", 4.9f))

        return movieList
    }
}
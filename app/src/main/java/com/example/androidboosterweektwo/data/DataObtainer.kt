package com.example.androidboosterweektwo.data

import com.example.androidboosterweektwo.R
import com.example.androidboosterweektwo.model.Movie

object DataObtainer {
    fun getMovieList() : ArrayList<Movie>{
        val movieList = ArrayList<Movie>()

        movieList.add(Movie("3D-MAN", R.drawable.ddd_man,"This is a movie about 3D-MAN. He's " +
                "one of the most powerful superheroes who likes to fight his enemies with his 3D glasses on.",
            "25-3-2005", 4.5f))
        movieList.add(Movie("Captain America", R.drawable.cap_america,
            "This is a movie about captain america. He's a superhero who likes to fight" +
                    " his enemies while wearing the USA flag.",
            "25-3-2011", 3.5f))
        movieList.add(Movie("Spider Man", R.drawable.spider_man,"This is a movie about spider man." +
                "he likes to throw webs at his enemies.",
            "25-3-2007", 2.5f))
        movieList.add(Movie("HULK", R.drawable.hulk,"This is a movie about HULK. He's " +
                "one of the most powerful superheroes who likes to fight his enemies with his shorts on.",
            "12-2-2003", 4.5f))
        movieList.add(Movie("Captain America 2", R.drawable.captain_america_poster,
            "This is a movie about captain america. He's a superhero who likes to fight" +
                    " his enemies while wearing the USA flag. No reason to watch this movie if you've watched" +
                    " the previous captain america movie honestly.",
            "25-3-2013", 3.5f))
        movieList.add(Movie("Iron Man", R.drawable.iron_man,"This is a movie about iron man." +
                " He likes to fight his enemies with iron.",
            "25-3-2007", 2.5f))
        movieList.add(Movie("Captain America 3", R.drawable.the_captain,
            "This is basically the worst movie ever made.",
            "25-3-2014", 1f))
        movieList.add(Movie("Corona Virus", R.drawable.coronavirus,"This is a movie about corona virus.",
            "25-3-2020", 5f))


        return movieList
    }
}
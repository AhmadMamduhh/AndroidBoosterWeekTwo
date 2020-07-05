package com.example.androidboosterweektwo.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidboosterweektwo.R
import com.example.androidboosterweektwo.activities.MovieDetailsActivity
import com.example.androidboosterweektwo.model.Movie
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MovieRecyclerAdapter(private val context : Context, private val movieList : List<Movie>)
    : RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder>()
    {
    override fun onCreateViewHolder( parent: ViewGroup,  viewType: Int)
            : MovieViewHolder{
        return MovieViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_item_layout,
            parent, false))
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieRecyclerAdapter.MovieViewHolder, position: Int) {
        holder.movieImage?.setImageResource(movieList[position].image)
        holder.movieText?.text = movieList[position].name
        holder.view.setOnClickListener(){
            val intent = Intent(context, MovieDetailsActivity::class.java).apply {
                putExtra("Movie Title", movieList[position].name)
                putExtra("Movie Image", movieList[position].image)
                putExtra("Movie Description", movieList[position].description)
                putExtra("Movie Rating", movieList[position].rating)
                putExtra("Movie Date", movieList[position].releaseDate)
                context.startActivity(this)
            }
        }
    }

        inner class MovieViewHolder(var view: View, var movieText : TextView? = null,
                                    var movieImage : ImageView? = null) : RecyclerView.ViewHolder(view){
            init{
                movieText = view.movie_title_text
                movieImage = view.movieImageView
            }
        }
}
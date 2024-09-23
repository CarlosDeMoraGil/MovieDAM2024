package edu.iesam.dam2024.features.movies.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.dam2024.R
import edu.iesam.dam2024.features.movies.data.MovieDataRepository
import edu.iesam.dam2024.features.movies.data.remote.MovieMockRemoteDataSource
import edu.iesam.dam2024.features.movies.domain.GetMovieUseCase

class MovieActivity : AppCompatActivity() {

    private val movieFactory : MovieFactory = MovieFactory()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = movieFactory.buildModel
        val movies = viewModel.viewCreated()
        Log.d("@dev",movies.toString())
    }

    override fun onStart(){
        super.onStart()
    }

    override fun onResume(){
        super.onResume()
    }

}

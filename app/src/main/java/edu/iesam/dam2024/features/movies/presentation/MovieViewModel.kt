package edu.iesam.dam2024.features.movies.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.dam2024.features.movies.domain.GetMovieUseCase
import edu.iesam.dam2024.features.movies.domain.Movie

class MovieViewModel (private val getMovieUseCase: GetMovieUseCase) : ViewModel() {

    fun  viewCreated() : List<Movie>  {
        return getMovieUseCase.invoke()
    }

}
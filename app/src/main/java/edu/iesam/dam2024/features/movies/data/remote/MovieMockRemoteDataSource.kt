package edu.iesam.dam2024.features.movies.data.remote

import edu.iesam.dam2024.features.movies.domain.Movie


/**
 * Naming: Modelo + Tecnologia + RemoteDataSource
 */

class MovieMockRemoteDataSource {

    private val movies =  listOf(
        Movie("1", "White Chicks", "poster1"),
        Movie("2", "Wicked", "poster2"),
        Movie("3", "Excuse me, i love you", "poster3"),
        Movie(title = "Los Miller", poster = "poster4", id = "4")

    )

    fun getMovies() : List<Movie>{
        return movies
    }

    fun getMovie(movieId: String): Movie? {
        return movies.firstOrNull { movie ->
            movie.id == movieId
        }
    }


}
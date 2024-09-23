package edu.iesam.dam2024.features.movies.data.remote

import edu.iesam.dam2024.features.movies.domain.Movie


/**
 * Naming: Modelo + Tecnologia + RemoteDataSource
 */

class MovieMockRemoteDataSource {

    fun getMovies() : List<Movie>{

        return listOf(
            Movie("1", "White Chicks", "poster1"),
            Movie("2", "Wicked", "poster2"),
            Movie("3", "Excuse me, i love you", "poster3"),
            Movie(title = "Title4", poster = "poster4", id = "4")

        )

    }

}
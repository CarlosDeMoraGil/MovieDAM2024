package edu.iesam.dam2024.features.movies.domain


class GetMovieUseCase (private val movieRepository: MovieRepository){

    operator fun invoke() : List<Movie>{
        return movieRepository.getMovies()
    }

}
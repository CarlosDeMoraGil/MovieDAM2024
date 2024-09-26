package edu.iesam.dam2024.features.superhero.presentation

import edu.iesam.dam2024.features.superhero.data.SuperheroDataRepository
import edu.iesam.dam2024.features.superhero.data.remote.SuperheroMockRemoreDataSource
import edu.iesam.dam2024.features.superhero.domain.GetSuperheroesUseCase

/**
 * CONSTRUYE LO QUE SE VA A VER POR PANTALLA
 */

class SuperheroFactory {

    fun buildViewModel() : SuperheroViewModel {
        return SuperheroViewModel(
            GetSuperheroesUseCase(SuperheroDataRepository(SuperheroMockRemoreDataSource())))
    }

}
package edu.iesam.dam2024.features.superhero.domain

/**
 *  1º CONSTRUCTOR CON REPOSITORY
 *  2º METODO INVOKE
 */

class GetSuperheroesUseCase
    (private val superheroRepository: SuperheroRepository){

    operator fun invoke() : List<Superhero>{
        return superheroRepository.getSuperheroes()
    }

}
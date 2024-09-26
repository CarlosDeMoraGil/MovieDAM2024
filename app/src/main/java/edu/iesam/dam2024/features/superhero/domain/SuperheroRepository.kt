package edu.iesam.dam2024.features.superhero.domain

/**
 *  1º IMPLEMENTAMOS LOS CASOS DE USO
 */

interface SuperheroRepository {

    fun getSuperheroes() : List<Superhero>

}
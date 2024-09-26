package edu.iesam.dam2024.features.superhero.data.remote

import edu.iesam.dam2024.features.superhero.domain.Superhero

/**
 *  1º DATOS SIMULADOS
 *  2º METODOS / LOGICA
 */

class SuperheroMockRemoreDataSource {
    val superheros = listOf(
        Superhero("1", "Flash", "idk", "150", "alto", "le cayo un rayo", "superheroes?", "hijo de thor", "image1"),
        Superhero("2", "Superman", "Krypton", "200", "muy alto", "salvo el mundo", "Justice League", "El", "image2"),
        Superhero("3", "Batman", "Gotham", "90", "medio", "es el vigilante de Gotham", "Justice League", "Wayne", "image3")
    )

    fun getSuperheroes() : List<Superhero>{
        return superheros
    }


}
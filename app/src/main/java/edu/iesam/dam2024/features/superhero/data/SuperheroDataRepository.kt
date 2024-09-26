package edu.iesam.dam2024.features.superhero.data

import edu.iesam.dam2024.features.superhero.data.remote.SuperheroMockRemoreDataSource
import edu.iesam.dam2024.features.superhero.domain.Superhero
import edu.iesam.dam2024.features.superhero.domain.SuperheroRepository

/**
 *  -GESTIONA LAS FUENTES DE DATOS
 *  1º CREAMOS EL CONSTRUCTOR CON LA FUENTE DE DATOS
 *  2º IMPLEMENTAMOS EL REPOSITORY CON LOS METODOS
 *  3º METODOS CON LA LOGICA DE LA FUENTE DE DATOS
 */

class SuperheroDataRepository (val mockRemoreDataSource: SuperheroMockRemoreDataSource) : SuperheroRepository{

    override fun getSuperheroes(): List<Superhero> {
        return mockRemoreDataSource.getSuperheroes()
    }


}
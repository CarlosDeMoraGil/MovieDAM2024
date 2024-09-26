package edu.iesam.dam2024.features.superhero.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.dam2024.features.superhero.domain.GetSuperheroesUseCase
import edu.iesam.dam2024.features.superhero.domain.Superhero

/**
 *  - COGE LA INFORMACION QUE DEVUELVEN LOS CASOS DE USO
 *    Y LA GESTIONA PARA MOSTRAR POR PANTALLA
 *
 *  1º AÑADIMOS LOS CASOS DE USO COMO PARAMETROS EN EL CONSTRUCTOR DEL MODELO VISTA
 *  2º IMEPLEMENTA VIEWMODEL
 */

class SuperheroViewModel (private val getSuperheroesUseCase: GetSuperheroesUseCase) : ViewModel() {

    fun viewCreated() : List<Superhero>{
        return getSuperheroesUseCase.invoke()
    }

}
package edu.iesam.dam2024.features.superhero.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.dam2024.R

class SuperheroActivity : AppCompatActivity() {

    private val SuperheroFactory: SuperheroFactory = SuperheroFactory()
    private val viewModel = SuperheroFactory.buildViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Superheros = viewModel.viewCreated()
        Log.d("@dev",Superheros.toString())
    }
    
}
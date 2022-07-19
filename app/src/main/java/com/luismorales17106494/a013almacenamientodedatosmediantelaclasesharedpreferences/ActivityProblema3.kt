package com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences.databinding.ActivityProblemaPropuestoBinding

/*
Problema propuesto

Realizar un programa que genere un número aleatorio entre 1 y 50, pedir que el operador lo adivine,
informar si ganó o si el número es mayor o menor al ingresado. Cuando el operador lo adivine
incrementar en uno el puntaje de juego. Cada vez que se ingrese a la aplicación mostrar el
puntaje actual, es decir recordar el puntaje en un archivo de preferencias.

 */


class ActivityProblema3 : AppCompatActivity() {
    private lateinit var binding: ActivityProblemaPropuestoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProblemaPropuestoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val SHARED_USER_SCORE = "score"
        val store = applicationContext.getSharedPreferences("Mydtb", 0)
        var puntuaje = store.getInt(SHARED_USER_SCORE, 0)

        var numRandom = (0..50).random()
        Toast.makeText(this, numRandom.toString(), Toast.LENGTH_SHORT).show()
        binding.tvScore.setText("Puntuaje : $puntuaje")

        binding.btnVerificar.setOnClickListener() {
            if (binding.etNumeroIngresado.text.isNotBlank()) {
                val numeroIngresado = binding.etNumeroIngresado.text.toString().toInt()
                when {
                    numRandom == numeroIngresado -> {
                        Toast.makeText(this, "Número Adivinado ", Toast.LENGTH_SHORT).show()
                        puntuaje++
                        store.edit().putInt(SHARED_USER_SCORE, puntuaje).apply()
                        binding.tvScore.setText("Puntuaje : $puntuaje")
                        numRandom = (0..50).random()
                        Toast.makeText(this, numRandom.toString(), Toast.LENGTH_SHORT).show()

                    }
                    numRandom > numeroIngresado -> {
                        Toast.makeText(
                            this,
                            "El número ingresado en menor al número Random ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    numRandom < numeroIngresado -> {
                        Toast.makeText(
                            this,
                            "El número ingresado en mayor al número Random ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

            } else {
                Toast.makeText(this, "Ingresa un número", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
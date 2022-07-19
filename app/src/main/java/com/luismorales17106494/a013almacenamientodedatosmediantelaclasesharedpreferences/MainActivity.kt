package com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences.databinding.ActivityMainBinding

/*
La plataforma de Android nos da varias facilidades para el almacenamiento
permanente de datos (es decir que los mismos no se borran cuando se apaga o
cierra la aplicación)

Según el tipo de necesidades utilizaremos alguno de estos métodos:

Mediante la clase SharedPreferences.
Mediante archivos de Texto.
En una base de datos con acceso a SQL.
No será raro que una aplicación utilice más de uno de estos métodos para el
almacenamiento de datos.

Cuando tenemos que almacenar una cantidad limitada de datos es adecuado utilizar
la clase SharedPreferences. Por ejemplo configuraciones de la aplicación como
pueden ser colores de pantalla, nivel actual en un juego, datos iniciales de
controles de entrada etc.
 */

/*
Problema 1:
Confeccionar un programa que solicite el ingrese del mail de una persona.
Guardar el mail ingresado utilizando la clase SharedPreferences.
Cada vez que se inicie la aplicación almacenar en el control EditText
el último mail ingresado. Disponer un botón para almacenar el mail ingresado
y finalizar el programa.
 */


/*
Problema 2:
Confeccionar un programa que permita administrar una agenda personal.
Nuestra clave será el nombre de la persona.
 */

/*
Problema propuesto

Realizar un programa que genere un número aleatorio entre 1 y 50, pedir que el operador lo adivine,
informar si ganó o si el número es mayor o menor al ingresado. Cuando el operador lo adivine
incrementar en uno el puntaje de juego. Cada vez que se ingrese a la aplicación mostrar el
puntaje actual, es decir recordar el puntaje en un archivo de preferencias.

 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProblema1.setOnClickListener() {
            val myIntent = Intent(
                this,
                ActivityProblema1::class.java
            )
            startActivity(myIntent)
        }

        binding.btnProblema2.setOnClickListener() {
            val myIntet = Intent(
                this,
                ActivityProblema2::class.java
            )
            startActivity(myIntet)
        }
        binding.btnProblema3.setOnClickListener() {
            startActivity(Intent(this,ActivityProblema3::class.java))

        }


    }


}
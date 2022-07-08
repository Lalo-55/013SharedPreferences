package com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
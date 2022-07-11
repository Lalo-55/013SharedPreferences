package com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences.databinding.ActivityProblema1Binding

/*
Problema 1:
Confeccionar un programa que solicite el ingrese del mail de una persona.
Guardar el mail ingresado utilizando la clase SharedPreferences.
Cada vez que se inicie la aplicación almacenar en el control EditText
el último mail ingresado. Disponer un botón para almacenar el mail ingresado
y finalizar el programa.
 */
class ActivityProblema1 : AppCompatActivity() {
    private lateinit var _binding: ActivityProblema1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProblema1Binding.inflate(layoutInflater)
        setContentView(_binding.root)


        val store = this.getSharedPreferences("dataBase", 0)
        val SHARED_USER_EMAIL = "mail"

        _binding.btnGuardar.setOnClickListener() {
            if (_binding.etMail.text.isNotBlank()) {
                store.edit().putString(SHARED_USER_EMAIL, _binding.etMail.text.toString()).apply()
                Toast.makeText(
                    this, "Correo guardado correctamente",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                Toast.makeText(
                    this, "ingrese su correo",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        _binding.btnVer.setOnClickListener() {
            _binding.tvCorreoGuardado.text =
                store.getString(SHARED_USER_EMAIL, "Aun no hay ningun correo registrado")
        }


    }
}
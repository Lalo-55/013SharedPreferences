package com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences.databinding.ActivityProblema1Binding
import com.luismorales17106494.a013almacenamientodedatosmediantelaclasesharedpreferences.databinding.ActivityProblema2Binding

class ActivityProblema2 : AppCompatActivity() {
    private lateinit var _binding: ActivityProblema2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(_binding.root)

        val store = this.getSharedPreferences("dtb", 0)
        var SHARED_USER: String


        _binding.btGrabar.setOnClickListener() {
            if (_binding.etName.text.isNotBlank() && _binding.etDatos.text.isNotBlank()) {
                SHARED_USER = _binding.etName.text.toString()

                store.edit().putString(SHARED_USER, _binding.etDatos.text.toString()).apply()
                Toast.makeText(
                    this, "Correo guardado correctamente",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    this, "ingrese los datos",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
        _binding.btMostrar.setOnClickListener(){
            val datos = store.getString(_binding.etName.text.toString(), "registro no encontrado")
            _binding.etDatos.setText(datos)
        }


    }
}
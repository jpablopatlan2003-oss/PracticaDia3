package com.example.practicadia3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEntrada: EditText = findViewById(R.id.etEntrada)
        val btnProcesar: Button = findViewById(R.id.btnProcesar)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btnProcesar.setOnClickListener {
            // 1. Leer texto de forma segura (Null Safety con ?)
            val textoIngresado: String? = etEntrada.text?.toString()


            // 2. Uso de 'if / else' para validar si está vacío
            if (textoIngresado.isNullOrEmpty()) {
                tvResultado.text = "⚠️ Por favor, escribe algo en el campo"
            } else {
                // 3. Uso de 'when' para reaccionar a palabras clave
                val respuesta = when (textoIngresado.lowercase().trim()) {
                    "hola" -> "¡Hola! ¿Cómo estás?"
                    "biomedica" -> "¡Es la mejor ingenieria!"
                    "adios" -> "¡Hasta luego!"
                    else -> "Escribiste: $textoIngresado"
                }

                // 4. Cambiar el texto del TextView
                tvResultado.text = respuesta
            }
        }
    }
}
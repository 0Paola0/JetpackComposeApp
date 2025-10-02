package com.example.myapplicationpractica03dsm104_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtAbierto: TextView
    private lateinit var txtSuspendido: TextView
    private lateinit var txtCerrado: TextView
    private lateinit var txtEstado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtAbierto = findViewById(R.id.txtAbierto)
        txtSuspendido = findViewById(R.id.txtSuspendido)
        txtCerrado = findViewById(R.id.txtCerrado)
        txtEstado = findViewById(R.id.txtEstado)
        lifecycle.addObserver(
            LifeCyclerObserver(
                this,
                txtAbierto,
                txtSuspendido,
                txtCerrado,
                txtEstado
            )
        )
    }
}

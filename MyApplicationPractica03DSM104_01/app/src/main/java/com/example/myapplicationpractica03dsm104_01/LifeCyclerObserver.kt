package com.example.myapplicationpractica03dsm104_01
import android.app.Activity
import android.graphics.Color
import android.widget.TextView
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class LifeCyclerObserver (
    private val activity: Activity,
    private val txtAbierto: TextView,
    private val txtSuspendido: TextView,
    private val txtCerrado: TextView,
    private val txtEstado: TextView
    ) : DefaultLifecycleObserver {
    private var contadorAbierto = 0
    private var contadorSuspendido = 0
    private var contadorCerrado = 0

    override fun onStart(owner: LifecycleOwner) {
        contadorAbierto++
        txtEstado.text = "Estado actual: onStart"
        activity.window.decorView.setBackgroundColor(Color.GREEN)
        actualizarPantalla()
    }

    override fun onPause(owner: LifecycleOwner) {
        contadorSuspendido++
        txtEstado.text = "Estado actual: onPause"
        activity.window.decorView.setBackgroundColor(Color.YELLOW)
        actualizarPantalla()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        contadorCerrado++
        txtEstado.text = "Estado actual: onDestroy"
        activity.window.decorView.setBackgroundColor(Color.RED)
        actualizarPantalla()
    }
    private fun actualizarPantalla() {
        txtAbierto.text = "Veces abierto: $contadorAbierto"
        txtSuspendido.text = "Veces suspendido: $contadorSuspendido"
        txtCerrado.text = "Veces cerrado: $contadorCerrado"
    }
}


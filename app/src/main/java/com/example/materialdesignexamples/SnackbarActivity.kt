package com.example.materialdesignexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {

    private lateinit var coordinatorLayout: CoordinatorLayout
    private lateinit var btnSaludar: Button
    private lateinit var btnDespedir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        setupUI()
    }

    private fun setupUI() {
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        btnSaludar = findViewById(R.id.btnSaludar)
        btnDespedir = findViewById(R.id.btnDespedir)

        btnSaludar.setOnClickListener { mostrarSnackbar() }
        btnDespedir.setOnClickListener { mostrarSnackbarAccion() }
    }

    private fun mostrarSnackbar() {
        Snackbar.make(coordinatorLayout, "Buenos dias !", Snackbar.LENGTH_LONG).show()
    }

    private fun mostrarSnackbarAccion() {
        Snackbar.make(coordinatorLayout, "Adiós !", Snackbar.LENGTH_LONG)
            .setAction(
                "Cancelar",
                {it.visibility = View.GONE}
            )
            .show()
    }
}

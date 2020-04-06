package com.example.materialdesignexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView

class NavigationViewActivity : AppCompatActivity() {

    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_view)

        setupUI()
    }

    private fun setupUI() {
        navigationView = findViewById(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menuIrA -> irA() //Implementar
                R.id.menuSalir -> finish()
            }
            true
        }
    }

    private fun irA() {
        //TODO Implementar
    }
}

package com.example.materialdesignexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavViewActivity : AppCompatActivity() {

    private lateinit var bottomNavView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav_view)

        setupUI()
    }

    private fun setupUI() {
        bottomNavView = findViewById(R.id.bottomNavigation)
        bottomNavView.setOnNavigationItemSelectedListener {
            val seleccion = it.title
            Toast.makeText(this, seleccion, Toast.LENGTH_SHORT).show()
            true
        }
    }
}

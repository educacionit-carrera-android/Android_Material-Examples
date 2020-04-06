package com.example.materialdesignexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FABActivity : AppCompatActivity() {

    private lateinit var fab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab)

        setupUI()
    }

    private fun setupUI() {
        fab = findViewById(R.id.floatingActionButton)
        fab.setOnClickListener {
            Toast.makeText(this,"Floating Action Button presionado",Toast.LENGTH_SHORT).show()
        }
    }
}

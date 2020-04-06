package com.example.materialdesignexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCollapsingToolbar: Button
    private lateinit var btnBottomNavView: Button
    private lateinit var btnNavigationView: Button
    private lateinit var btnToolbarNavigationView: Button
    private lateinit var btnFAB: Button
    private lateinit var btnSnackbar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        btnCollapsingToolbar = findViewById(R.id.btnCollapsingToolbar)
        btnCollapsingToolbar.setOnClickListener { startActivity(Intent(this, CollapsingToolbarActivity::class.java)) }

        btnBottomNavView = findViewById(R.id.btnBottomNavView)
        btnBottomNavView.setOnClickListener { startActivity(Intent(this, BottomNavViewActivity::class.java)) }

        btnNavigationView = findViewById(R.id.btnNavigationView)
        btnNavigationView.setOnClickListener { startActivity(Intent(this, NavigationViewActivity::class.java)) }

        btnToolbarNavigationView = findViewById(R.id.btnToolbarNavigationView)
        btnToolbarNavigationView.setOnClickListener { startActivity(Intent(this, ToolbarNavigationViewActivity::class.java)) }

        btnFAB = findViewById(R.id.btnFAB)
        btnFAB.setOnClickListener { startActivity(Intent(this, FABActivity::class.java)) }

        btnSnackbar = findViewById(R.id.btnSnackbar)
        btnSnackbar.setOnClickListener { startActivity(Intent(this, SnackbarActivity::class.java)) }
    }

}

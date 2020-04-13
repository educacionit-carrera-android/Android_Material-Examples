package com.example.materialdesignexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SharedTransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_transition)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFinishAfterTransition()
    }
}

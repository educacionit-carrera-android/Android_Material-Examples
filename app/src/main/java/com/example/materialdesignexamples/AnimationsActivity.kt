package com.example.materialdesignexamples

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.AnimRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat

class AnimationsActivity : AppCompatActivity() {

    private lateinit var imgHome: ImageView
    private lateinit var imgMap: ImageView
    private lateinit var btnSharedTransition: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)

        setupUI()
        applyAnimation(imgHome, R.anim.anim_pendulum)
    }

    private fun setupUI() {
        imgHome = findViewById(R.id.imgHome)
        imgMap = findViewById(R.id.imgMap)
        btnSharedTransition = findViewById(R.id.btnSharedTransition)
        btnSharedTransition.setOnClickListener {
            val intent = Intent(this, SharedTransitionActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                imgMap,
                getString(R.string.map_transition)
            )
            startActivity(intent, options.toBundle())
        }
    }

    private fun applyAnimation(view: View, @AnimRes animationResource: Int) {
        val animation = AnimationUtils.loadAnimation(applicationContext, animationResource)
        view.startAnimation(animation)
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {

            }

            override fun onAnimationStart(animation: Animation?) {

            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}

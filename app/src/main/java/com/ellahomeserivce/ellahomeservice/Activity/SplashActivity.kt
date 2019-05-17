package com.ellahomeserivce.ellahomeservice.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ellahomeserivce.ellahomeservice.R
import com.ellahomeserivce.ellahomeservice.registerlogin.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    private lateinit var myRunnable: Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        myRunnable = Runnable {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        imageview_splash_screen.setOnClickListener {
            handler.removeCallbacks(myRunnable)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        handler.postDelayed(myRunnable, 5000)
    }
}

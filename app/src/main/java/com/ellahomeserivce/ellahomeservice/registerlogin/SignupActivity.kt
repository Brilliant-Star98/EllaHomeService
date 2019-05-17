package com.ellahomeserivce.ellahomeservice.registerlogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ellahomeserivce.ellahomeservice.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signup_imageview_signup.requestFocus()
    }
}

package com.bigmeco.hangoutsinthecity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class SplashActivity: AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth!!.currentUser
        routeToAppropriatePage(currentUser)
        finish()
    }


    private fun routeToAppropriatePage(user: FirebaseUser?) {
        when (user) {
            null -> startActivity(Intent(this, MainActivity::class.java))
            else ->  startActivity(Intent(this, MainActivity::class.java))
        }
    }

}
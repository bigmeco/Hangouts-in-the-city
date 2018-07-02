package com.bigmeco.hangoutsinthecity

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //transitionFragment(MapsFragment())


    }

    private fun transitionFragment(newFragment: Fragment) {
        val ft = fragmentManager.beginTransaction()
        ft.replace(R.id.fragments, newFragment)
        ft.commit()

    }
}




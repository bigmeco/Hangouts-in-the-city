package com.bigmeco.hangoutsinthecity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        if (false) {
            MyActivityUI({}).setContentView(this)

        } else {
            MyActivityUI2().setContentView(this)
        }



}
}




package com.bigmeco.hangoutsinthecity

import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MyActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
        scrollView {
            verticalLayout {
                for (i in 1..50) {
                    println(i)

                    textView(i.toString() + " ") {
                        id = Ids.textView
                    }.lparams(width = wrapContent, height = wrapContent)
                }
            }
        }
    }.view

    private object Ids {
        val textView = 1
    }
}
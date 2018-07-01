package com.bigmeco.hangoutsinthecity

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MyActivityUI(listener: () -> Unit) : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply() {
        scrollView(){
            verticalLayout {
                button("Login") {
                    onClick {

                    }
                }
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


     fun clickView() {

    }
}
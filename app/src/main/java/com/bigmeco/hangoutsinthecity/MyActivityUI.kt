package com.bigmeco.hangoutsinthecity

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MyActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }.view
}
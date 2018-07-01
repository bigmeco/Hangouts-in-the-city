package com.bigmeco.hangoutsinthecity

import android.content.Context
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MyCustomRootLayout<T : Context>(val customize: AnkoContext<T>.() -> Unit = {}) : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            button("Hello")
            {
                onClick {   customize() }
            }
            textView("myFriend")

        }
    }
}
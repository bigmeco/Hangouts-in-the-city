package com.bigmeco.hangoutsinthecity

import android.content.Context
import android.os.Build
import android.widget.LinearLayout
import com.bigmeco.hangoutsinthecity.R.style.ThemeOverlay_AppCompat_Dark
import org.jetbrains.anko.*
import android.view.Gravity.BOTTOM
import android.view.Gravity.START
import android.view.View
import android.widget.LinearLayout.VERTICAL
import com.bigmeco.hangoutsinthecity.R.style.TextAppearance_AppCompat_Body1

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.dimen
import org.jetbrains.anko.horizontalPadding
import org.jetbrains.anko.imageView
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.textView
import org.jetbrains.anko.themedLinearLayout
import org.jetbrains.anko.topPadding
import org.jetbrains.anko.verticalPadding
class MyActivityUI2 : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View {
        return with(ui) {
            MyCustomRootLayout<MainActivity>({
                recyclerView()
            }).createView(ui)
        }
    }

    private fun recyclerView() {
        println("fff")
    }
}


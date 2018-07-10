package com.bigmeco.hangoutsinthecity

import android.app.Fragment
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.transition.TransitionManager
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bigmeco.hangoutsinthecity.R.id.buttonChat
import kotlinx.android.synthetic.main.activity_full_info.*

class FullInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_info)
        transitionFragment(InfoFragment())


    }


    fun onClickBeck(view: View) {
        finish()
    }

    fun onClickChat(view: View) {
        val set = ConstraintSet()
        removeTabColor(buttonChat)
        set.clone(parentButtonView)
        onReportLayout(set)
        TransitionManager.beginDelayedTransition(parentButtonView)
        set.applyTo(parentButtonView)
        transitionFragment(ChatLocalFragment())
    }

    fun onClickInfo(view: View) {
        val set = ConstraintSet()
        removeTabColor(buttonInfo)
        set.clone(parentButtonView)
        onListLayout(set)
        TransitionManager.beginDelayedTransition(parentButtonView)
        set.applyTo(parentButtonView)
        transitionFragment(InfoFragment())
    }


    private fun transitionFragment(fragment: Fragment) {

        val ft = fragmentManager.beginTransaction()
        ft.replace(R.id.fragment, fragment)
        ft.commit()

    }

    private fun onListLayout(set: ConstraintSet) {
        set.clear(R.id.dividerHorizontal, ConstraintSet.START)
        set.connect(R.id.dividerHorizontal, ConstraintSet.START, R.id.dividerVertical, ConstraintSet.END)
        set.clear(R.id.dividerHorizontal, ConstraintSet.END)
        set.connect(R.id.dividerHorizontal, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)


    }

    private fun onReportLayout(set: ConstraintSet) {
        set.clear(R.id.dividerHorizontal, ConstraintSet.START)
        set.connect(R.id.dividerHorizontal, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        set.clear(R.id.dividerHorizontal, ConstraintSet.END)
        set.connect(R.id.dividerHorizontal, ConstraintSet.END, R.id.dividerVertical, ConstraintSet.START)
    }


    private fun removeTabColor(itam: TextView) {
        buttonChat.setTextColor(resources.getColor(R.color.cardview_dark_background))
        buttonInfo.setTextColor(resources.getColor(R.color.cardview_dark_background))
        itam.setTextColor(resources.getColor(R.color.colorAccent))


    }
}

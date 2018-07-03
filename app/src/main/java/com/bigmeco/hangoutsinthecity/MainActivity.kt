package com.bigmeco.hangoutsinthecity

import android.app.Fragment
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SensorEventListener {

    var mSensorManager: SensorManager? = null

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        addChat.rotation = Math.round(-event!!.values[0]).toFloat()

    }


    fun onClickChat(view: View) {
        val ft = fragmentManager.beginTransaction()
        ft.setCustomAnimations(R.animator.start_chat,
                R.animator.end_chat)
        ft.replace(R.id.fragments, ChatFragment())
        ft.commit()

    }

    fun onClickUser(view: View) {
        val ft = fragmentManager.beginTransaction()
        ft.setCustomAnimations(R.animator.start_user,
                R.animator.end_user)
        ft.replace(R.id.fragments, UserFragment())
        ft.commit()
    }

    fun onClickAddChat(view: View) {
        val ft = fragmentManager.beginTransaction()
        ft.setCustomAnimations(R.animator.start_maps,
                R.animator.end_maps)
        ft.replace(R.id.fragments, MapsFragment())
        ft.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        transitionFragment(MapsFragment())
        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

    }


    override fun onResume() {
        super.onResume()

        //Устанавливаем слушателя ориентации сенсора
        mSensorManager!!.registerListener(this, mSensorManager!!.getDefaultSensor(Sensor.TYPE_ORIENTATION),
                SensorManager.SENSOR_DELAY_GAME)
    }


    private fun transitionFragment(newFragment: Fragment) {
        val ft = fragmentManager.beginTransaction()
        ft.replace(R.id.fragments, newFragment)
        ft.commit()

    }

}




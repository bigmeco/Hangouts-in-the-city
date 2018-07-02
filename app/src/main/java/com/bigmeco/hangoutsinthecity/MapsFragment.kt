package com.bigmeco.hangoutsinthecity

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.support.constraint.ConstraintSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment(), OnMapReadyCallback {

    private var mMap: MapView? = null
    private var cardInfoBoll: Boolean = true


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        mMap?.onSaveInstanceState(outState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_maps, container, false)
        mMap = view?.findViewById(R.id.mapView) as MapView
        mMap?.onCreate(savedInstanceState)
        mMap?.getMapAsync(this)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



    override fun onResume() {
        super.onResume()
        mMap?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mMap?.onPause()
    }

    override fun onStart() {
        super.onStart()
        mMap?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mMap?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mMap?.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mMap?.onLowMemory()
    }

    override fun onMapReady(googleMap: GoogleMap) {

        googleMap.addMarker(MarkerOptions()
                .position(LatLng(37.4233438, -122.0728817))
                .title("LinkedIn")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))

        googleMap.addMarker(MarkerOptions()
                .position(LatLng(37.4629101, -122.2449094))
                .title("Facebook")
                .snippet("Facebook HQ: Menlo Park"))

        googleMap.addMarker(MarkerOptions()
                .position(LatLng(37.3092293, -122.1136845))
                .title("Apple"))

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(37.4233438, -122.0728817), 10f))
    }
}

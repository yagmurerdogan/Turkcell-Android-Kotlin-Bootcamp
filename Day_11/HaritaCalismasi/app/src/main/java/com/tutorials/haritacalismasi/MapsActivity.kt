package com.tutorials.haritacalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_maps.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        buttonKonumGit.setOnClickListener {
            //40.9552534,29.1159207,17z
            val konumum = LatLng(40.9552534, 29.1159207)
            mMap.addMarker(MarkerOptions().position(konumum)
                .title("Turkcell")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.konum_resim))
            )
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konumum,17f))
            mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
        }


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val konumum = LatLng(40.0, 29.0)
        mMap.addMarker(MarkerOptions().position(konumum).title("Bir yer"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konumum,13f))
    }

    //40.9552534,29.1159207,17z
}
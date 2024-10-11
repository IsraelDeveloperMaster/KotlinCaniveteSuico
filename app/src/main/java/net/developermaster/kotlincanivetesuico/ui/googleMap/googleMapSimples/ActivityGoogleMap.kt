package net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import net.developermaster.kotlincanivetesuico.R

class ActivityGoogleMap : AppCompatActivity() , OnMapReadyCallback {

    private lateinit var map: GoogleMap

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_map)

        //todo Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        createMapFragment()

    }
    private fun createMapFragment() {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
}

package net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapCompose.view.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapCompose.view.ui.theme.KotlinCaniveteSuicoTheme

class GoogleMapCompose() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinCaniveteSuicoTheme {

                GoogleMapComCompose()
            }
        }
    }
    @Composable
    fun GoogleMapComCompose() {
        val singapore = LatLng(1.35, 103.87)
        val cameraPositionState = rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(singapore, 18f)
        }
        GoogleMap( modifier = Modifier.fillMaxSize(),

            //todo propriedades do mapa
            properties = MapProperties(

                //todo tipo do mapa (TERRAIN, SATELLITE, HYBRID, NONE)
                mapType = MapType.HYBRID,

                //todo habilitar a localizacao
                isMyLocationEnabled = true,

                //todo habilitar a rota
                isTrafficEnabled = true,

                //todo habilitar a direcao
                isIndoorEnabled = true,

                //todo previsualizacao de edificios 3D
                isBuildingEnabled = true,

                //todo camera target (ponto de vista)
                latLngBoundsForCameraTarget = null,

                //todo configuracoes de zoom
                maxZoomPreference = 20f,

                //todo zoom minimo
                minZoomPreference = 3.0f ),

            //todo barra de ferramentas do mapa
            uiSettings = MapUiSettings(

                //todo controles de zoom
                zoomControlsEnabled = true,

                //todo controles de direcao
                compassEnabled = true,

                //todo controles de rota
                rotationGesturesEnabled = true,

                //todo controles de pan
                scrollGesturesEnabled = true,

                //todo controles de zoom
                zoomGesturesEnabled = true,

                indoorLevelPickerEnabled = true,

                //todo ferramentas do mapa
                mapToolbarEnabled = true,

                //todo minhap localizacao
                myLocationButtonEnabled = true,

                ),

            //todo camera position state
            cameraPositionState = cameraPositionState,

            //todo implementacao de metodos do mapa
            onMapClick = {
                println("Map Clicked")
            },

            //todo cliques longos no mapa
            onMapLongClick = {
                println("Map Long Clicked")
            },

            //todo cliques em marcadores
            onMapLoaded = {
                println("Map Loaded")
            },

            //todo botao de localizacao
            onMyLocationButtonClick = {
                println("My Location Button Clicked")
                true
            },

            //todo mi localizacao
            onMyLocationClick = {
                println("My Location Clicked")
            },

            //todo cliques em pontos de interesse
            onPOIClick = {
                println("POI Clicked")
            },

        ) {
            Marker(
                state = MarkerState(position = singapore),
                title = "Singapore",
                snippet = "Marker in Singapore"
            )
        }
    }


}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinCaniveteSuicoTheme {
    }
}
*/
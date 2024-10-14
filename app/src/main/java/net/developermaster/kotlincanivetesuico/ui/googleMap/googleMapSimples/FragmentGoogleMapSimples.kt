package net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CustomCap
import com.google.android.gms.maps.model.Dash
import com.google.android.gms.maps.model.Dot
import com.google.android.gms.maps.model.Gap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.gms.maps.model.RoundCap
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.classes.ClasseInformacaoJanelaInformacao
import net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.classes.JsonLugares
import net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.classes.ModelLugares
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos

class FragmentGoogleMapSimples : Fragment(), OnMapReadyCallback,
    GoogleMap.OnMyLocationButtonClickListener, OnMyLocationClickListener  {

    //////// GOOGLE MAP ////////

        val classeInformacaoJanelaInformacao = ClasseInformacaoJanelaInformacao(requireContext())

    //todo lista de lugares
    private val ModelLugares: List<ModelLugares> by lazy {
        JsonLugares(requireContext()).read()
    }

    //todo variavel do googleMap
    private lateinit var googleMap: GoogleMap

    //todo desenho de linha ( Dot() = Ponto, Gap() = Espaço, Dash() = Linha)
    val pattern = listOf( Dot(), Gap(10F), Dash(50F), Gap(10F)
    )

    //todo verifica se tem permissao para acessar a localização
    companion object {
        const val REQUEST_CODE_LOCATION = 0
    }

    //todo configuracao de googleMap aqui
    override fun onMapReady(googleMap: GoogleMap) {

        //todo configuracao de googleMap aqui
        this.googleMap = googleMap

        //todo edifícios 3D
        this.googleMap.isBuildingsEnabled = true

        //todo habilitar mapas internos
        this.googleMap.isIndoorEnabled = true

        //todo rota do mapa
        this.googleMap.isTrafficEnabled = true

        //todo habilitar os controles de zoom
        this.googleMap.uiSettings.isZoomGesturesEnabled = true

        //todo habilitar controles de zoom
        this.googleMap.uiSettings.isZoomControlsEnabled = true

        //todo Ativa ou desativa a bússola
        this.googleMap.uiSettings.isCompassEnabled = true

        //todo Ativa ou desativa a butao de localização
        this.googleMap.uiSettings.isMyLocationButtonEnabled = true

        //todo implementacao do metodo OnMyLocationButtonClickListener
        googleMap.setOnMyLocationButtonClickListener(this)

        //todo implementacao do metodo OnMyLocationClickListener
        googleMap.setOnMyLocationClickListener(this)

        //todo Ativa ou desativa a barra de ferramentas
        this.googleMap.uiSettings.isMapToolbarEnabled = true

        criandoMarcadores()

        criandoDesenhos()

        habilitandoLocalizacao()

//        listaDeLugares()

    }

    private fun listaDeLugares() {

         val london = LatLng(51.403186, -0.126446)
         val sanFrancisco = LatLng( 37.7576, -122.4194)

        googleMap.addMarker(MarkerOptions().position(london).title("london").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        googleMap.addMarker(MarkerOptions().position(sanFrancisco).title("sanFrancisco"))

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(london, 10f))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sanFrancisco, 10f))

        googleMap.animateCamera(CameraUpdateFactory.zoomTo(10f), 2000, null)




/*
        ModelLugares.forEach { lugares ->

            googleMap.addMarker( MarkerOptions() .title(lugares.name) .position(lugares.latLng) )
        }
*/

    }

    private fun criandoDesenhos() {
        val polylineOptions = PolylineOptions()
            //todo linha
            .add(LatLng(40.419173113350965, -3.705976009368897))
            .add(LatLng(40.4150807746539, -3.706072568893432))
            .add(LatLng(40.41517062907432, -3.7012016773223873))
            .add(LatLng(40.41713105928677, -3.7037122249603267))
            .add(LatLng(40.41926296230622, -3.701287508010864))
            .add(LatLng(40.419173113350965, -3.7048280239105225))

            //todo fechamento da linha
//            .add(LatLng(40.419173113350965, -3.705976009368897))

            //todo espessura da linhavvvf
            .width(30f)

            //todo cor da linha
            .color(ContextCompat.getColor(requireContext(), R.color.purple))

        val polyline = googleMap.addPolyline(polylineOptions)

        //todo cantos da linha
        polyline.startCap = RoundCap()

        //todo figura no final da linha
        polyline.endCap = CustomCap(BitmapDescriptorFactory.fromResource(R.drawable.kotlin), 500f)

        //todo linhas pontilhadas
        polyline.pattern = pattern

        //todo polylines clicáveis
        polyline.isClickable = true

        //todo polylines clicáveis
        googleMap.setOnPolylineClickListener {

            mundaCorPolylineRandom(polyline)

            Toast.makeText(requireContext(), "Linha clicada", Toast.LENGTH_SHORT).show()
        }
    }

    //todo cria os marcadores fixos
    private fun criandoMarcadores() {

        //todo marcador
        val lugarFavorito = LatLng(28.044195, -16.5363842 )

        googleMap.addMarker(MarkerOptions().position(lugarFavorito).title("Mi playa favorita!").icon(BitmapDescriptorFactory.fromResource(
            R.drawable.ic_architecture
        )).snippet("Ilhas Canarias") )

        //todo animacao da camera
        googleMap.animateCamera( CameraUpdateFactory.newLatLngZoom(lugarFavorito, 20f), 4000, null )
    }

    //todo verifica se tem permissao para acessar a localização
    private fun verificaPermissaoUsuario() = ContextCompat.checkSelfPermission(
        requireContext(), Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    //todo habilita a localização no mapa
    private fun habilitandoLocalizacao() {

        if (!::googleMap.isInitialized) return

        if (verificaPermissaoUsuario()) {

            if (ActivityCompat.checkSelfPermission(
                    requireContext(), Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return
            }
            googleMap.isMyLocationEnabled = true
        } else {
            verificaPermissaoLocalizacao()
        }
    }

    //todo verifica se tem permissao para acessar a localização
    private fun verificaPermissaoLocalizacao() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            Toast.makeText(
                requireContext(), "Ve a ajustes y acepta los permisos", Toast.LENGTH_SHORT
            ).show()
        } else {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE_LOCATION
            )
        }
    }

    //todo verifica se tem permissao para acessar a localização
    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        when (requestCode) {

            REQUEST_CODE_LOCATION -> if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                if (ActivityCompat.checkSelfPermission(
                        requireContext(), Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {

                    return
                }

                googleMap.isMyLocationEnabled = true

            } else {

                Toast.makeText(
                    requireContext(),
                    "Para activar la localización ve a ajustes y acepta los permisos",
                    Toast.LENGTH_SHORT
                ).show()
            }

            else -> {}
        }
    }

    //todo implementacao do metodo OnMyLocationButtonClickListener
    override fun onMyLocationButtonClick(): Boolean {
        Toast.makeText(
            requireContext(), "Localização atual clicada com sucesso!", Toast.LENGTH_SHORT
        ).show()
        return false
    }

    override fun onMyLocationClick(localizacao: Location) {
        Toast.makeText(
            requireContext(),
            "voce esta em ${localizacao.latitude}, ${localizacao.longitude}",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun mundaCorPolylineRandom(polyline: Polyline){
        val color = (0..3).random()
        when(color){
            0 -> polyline.color = ContextCompat.getColor(requireContext(), R.color.red)
            1 -> polyline.color = ContextCompat.getColor(requireContext(), R.color.yellow)
            2 -> polyline.color = ContextCompat.getColor(requireContext(), R.color.green)
            3 -> polyline.color = ContextCompat.getColor(requireContext(), R.color.blue)
        }
    }

    //////// GOOGLE MAP ////////

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentGoogleMapSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGoogleMapSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        funcaoChamaFragmentGoogleMap()
    }

    private fun funcaoChamaFragmentGoogleMap() {

        val fragmentGoogleMap = childFragmentManager.findFragmentById(R.id.fragmentGoogleMap) as SupportMapFragment

        fragmentGoogleMap.getMapAsync( this)
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

//        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

//        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
//        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


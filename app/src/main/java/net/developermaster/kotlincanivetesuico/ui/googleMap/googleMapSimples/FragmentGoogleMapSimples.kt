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
import com.google.android.gms.maps.model.Dash
import com.google.android.gms.maps.model.Dot
import com.google.android.gms.maps.model.Gap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapSimplesBinding
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos

class FragmentGoogleMapSimples : Fragment(), OnMapReadyCallback ,
    GoogleMap.OnMyLocationButtonClickListener , OnMyLocationClickListener {

    //////// GOOGLE MAP ////////

    //todo desenho de linha
    val pattern = listOf(
        Dot(), Gap(10F), Dash(50F), Gap(10F)
    )
//    polyline.pattern = pattern

    //todo variavel do googleMap
    private lateinit var googleMap: GoogleMap

    //todo verifica se tem permissao para acessar a localização
    companion object {
        const val REQUEST_CODE_LOCATION = 0
    }

    //todo configuracao de googleMap aqui
    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap
        this.googleMap.uiSettings.isZoomControlsEnabled = true

        criandoMarcadores()

        //todo desenhos
        criandoDesenhos()

        habilitandoLocalizacao()

        //todo implementacao do metodo OnMyLocationButtonClickListener
        googleMap.setOnMyLocationButtonClickListener(this)

        //todo implementacao do metodo OnMyLocationClickListener
        googleMap.setOnMyLocationClickListener(this)

    }

    private fun criandoDesenhos(){
        val polylineOptions = PolylineOptions()
            //todo linha
            .add(LatLng(40.419173113350965,-3.705976009368897))
            .add(LatLng( 40.4150807746539, -3.706072568893432))
            .add(LatLng( 40.41517062907432, -3.7012016773223873))
            .add(LatLng( 40.41713105928677, -3.7037122249603267))
            .add(LatLng( 40.41926296230622,  -3.701287508010864))
            .add(LatLng( 40.419173113350965, -3.7048280239105225))
            .add(LatLng(40.419173113350965,-3.705976009368897))

            //todo espessura da linhavvvf
            .width(30f)

        val polyline = googleMap.addPolyline(polylineOptions)
    }

    //todo cria os marcadores
    private fun criandoMarcadores() {

        //todo marcador
        val lugarFavorito = LatLng(28.044195, -16.5363842)
        googleMap.addMarker(MarkerOptions().position(lugarFavorito).title("Mi playa favorita!"))

        //todo animacao da camera
        googleMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(lugarFavorito, 20f), 4000, null
        )
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
        Toast.makeText(requireContext(), "Localização atual clicada com sucesso!", Toast.LENGTH_SHORT).show()
        return false
    }

    override fun onMyLocationClick(localizacao: Location) {
        Toast.makeText(requireContext(), "voce esta em ${localizacao.latitude}, ${localizacao.longitude}", Toast.LENGTH_SHORT).show()
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

        funcaoSupportMapFragment()
    }

    private fun funcaoSupportMapFragment() {

        val mapFragment =
            childFragmentManager.findFragmentById(R.id.fragmentMap) as SupportMapFragment

        mapFragment.getMapAsync(this)

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


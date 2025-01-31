package net.developermaster.kotlincanivetesuico.utils.codigos

class modelCodigos {

      //////////////////////////////////////////
/*     todo ATENCAO  sempre eleminar a segunda barra ao lado dos n  *ficara assim \n *

       todo ATENCAO  sempre eleminar a aspas ao lado dos $  *ficara assim \$ *

       todo ATENCAO  adicionar um contra barra ao lado dos $  *ficara assim \$ *
       //////////////////////////////////////////


    //todo **********AQUI PARA CIMA************

          " Copie daqui -> \n\n 👇 \n\n  " +


          "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************

*/


    //todo*************** MVC *************************
    fun mvc(): List<String> {

        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +

                    "//todo ////////////////// Controller //////////////////\n" +
                    "\n" +
                    "//todo classe que retorna as informacoes para a main\n" +
                    "class UsuarioControlerMVC( val fragmentMvc: FragmentMVC) { //todo alto acoplamento ****** alta dependencia de FragmentMVC\n" +
                    "\n" +
                    "    //todo instancia usuario api\n" +
                    "    val usuarioApiMVC = UsuarioApiMVC()\n" +
                    "\n" +
                    "    fun recuperar_usuarios() {\n" +
                    "\n" +
                    "        //todo regra de negocio\n" +
                    "        val lista_de_usuarios_recuperada = usuarioApiMVC.recuperar_usuarios()\n" +
                    "\n" +
                    "        //todo envia os parametros para o fragment mvc\n" +
                    "        fragmentMvc.funcaoQueEstaDentroDoFragmentoMVC(lista_de_usuarios_recuperada)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "\n" +
                    "//todo classe de informcoes dos ususarios\n" +
                    "class UsuarioApiMVC {\n" +
                    "\n" +
                    "    fun recuperar_usuarios() : List < UsuarioMVC > {\n" +
                    "\n" +
                    "        val lista_de_usuarios = listOf(\n" +
                    "\n" +
                    "            UsuarioMVC( \" Ana\" ,20 ) ,\n" +
                    "            UsuarioMVC( \"Carlos\" ,30 ) ,\n" +
                    "            UsuarioMVC( \"Lucas\" ,40 ) ,\n" +
                    "            UsuarioMVC( \"Maria\" ,50 ) ,\n" +
                    "\n" +
                    "        )\n" +
                    "\n" +
                    "        return lista_de_usuarios\n" +
                    "\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo classe de dados\n" +
                    "data class UsuarioMVC (\n" +
                    "\n" +
                    "    val nome: String,\n" +
                    "    val idade: Int\n" +
                    "\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "\n" +
                    "class FragmentMVC() : Fragment() {\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentMvcBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo instancia do controlador ja com os dados dos usuarios recuperados da classe usuarios_api\n" +
                    "    private lateinit var usuarioControlerMVC: UsuarioControlerMVC\n" +
                    "\n" +
                    "    fun funcaoQueEstaDentroDoFragmentoMVC(lista: List<UsuarioMVC>) {\n" +
                    "\n" +
                    "        var textoUsuariosRecuperados = \"\"\n" +
                    "\n" +
                    "        lista.forEach { usuariosListados ->\n" +
                    "\n" +
                    "            textoUsuariosRecuperados += \"Nome: \${usuariosListados.nome} , idade: \${usuariosListados.idade} \n \n \"\n" +
                    "\n" +
                    "            Log.w(\"controler\", \" \$textoUsuariosRecuperados \")\n" +
                    "\n" +
                    "            binding.textView.text = textoUsuariosRecuperados\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentMvcBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        usuarioControlerMVC = UsuarioControlerMVC(this)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.MENSAGEM_MVC))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.MENSAGEM_MVC))\n" +
                    "\n" +
                    "            usuarioControlerMVC.recuperar_usuarios()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.Mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.xmlMvc()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +

                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )


        return lista
    }
    fun mvcXml(): List<String> {

        val lista = listOf(

            //todo **********AQUI PARA CIMA************
            " Copie daqui -> \n\n 👇 \n\n  " +


                    " <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".ui.Arquitetura.Mvc.View.FragmentMVC\">\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_USUARIO_MVC\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"16dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_codigo\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        android:focusable=\"true\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"16dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toEndOf=\"@+id/fabCodigo\"\n" +
                    "        android:focusable=\"true\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout> " +

                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Até Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "
            //todo **********AQUI PARA BAIXO************
        )

        return lista
    }

    //todo*************** MVP *************************
    fun mvpSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "  \n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "//todo classe de dados\n" +
                    "data class ClasseUsuariosMvpSimples (val nome: String, val idade: Int )\n" +
                    "\n" +
                    "//todo ////////////////// Presenter //////////////////\n" +
                    "interface InterfacePresenterMvpSimples {\n" +
                    "\n" +
                    "    fun metodoExibirUsuariosQueEstaNaInterface( usuarios : ClasseUsuariosMvpSimples )\n" +
                    "}\n" +
                    "\n" +
                    "//todo alta dependencia /// alto acoplamentos     //RESOLVIDOS//\n" +
                    "\n" +
                    "//todo agora tem um baixa dependencia /// e um baixo acoplamento\n" +
                    "class UsuariosPresenterMvpSimples( private val interfacePresenterMvpSimples: InterfacePresenterMvpSimples ) {\n" +
                    "\n" +
                    "    fun recuperaUsuarios() {\n" +
                    "\n" +
                    "        val usuarios = ClasseUsuariosMvpSimples(\"Maria\", 30)\n" +
                    "\n" +
                    "        interfacePresenterMvpSimples.metodoExibirUsuariosQueEstaNaInterface(usuarios)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentMvpSimples : Fragment(), InterfacePresenterMvpSimples {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentMvpSimplesBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo instancia do controlador ja com os dados dos usuarios recuperados da classe usuarios_api\n" +
                    "    private lateinit var usuariosPresenterMvpSimples: UsuariosPresenterMvpSimples\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentMvpSimplesBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        usuariosPresenterMvpSimples = UsuariosPresenterMvpSimples(this)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_MVP_SIMPLES))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.NAV_MVP_SIMPLES))\n" +
                    "\n" +
                    "            usuariosPresenterMvpSimples.recuperaUsuarios()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo funcao herdada da interface\n" +
                    "    override fun metodoExibirUsuariosQueEstaNaInterface(usuarios: ClasseUsuariosMvpSimples) {\n" +
                    "\n" +
                    "        var texto_usuarios_recuperados = \"\"\n" +
                    "\n" +
                    "        val nome = usuarios.nome\n" +
                    "        val idade = usuarios.idade\n" +
                    "\n" +
                    "        texto_usuarios_recuperados += \"Nome: \${nome} , idade: \${idade} \n \n \"\n" +
                    "\n" +
                    "        Log.w(\"controler\", \" \$texto_usuarios_recuperados \")\n" +
                    "\n" +
                    "        binding.textView.text = \"\${texto_usuarios_recuperados}\"\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "}\n  " +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvpSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\"-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_USUARIO_MVP_SIMPLES\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvpApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// API //////////////////\n" +
                    "interface InterfaceRetrofitApiJsonPlaceHolder_MvpApi {\n" +
                    "\n" +
                    "    @GET( \"posts\" )\n" +
                    "    suspend fun interfaceRecupetarEnderecoApiJsonPlaceHolder(  /*@Path( \"posts\" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>>\n" +
                    "}\n" +
                    "\n" +
                    "//object RetrofitJsonPlaceHolder_MvpApi {\n" +
                    "class RetrofitJsonPlaceHolder_MvpApi {\n" +
                    "\n" +
                    "    /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitApiJsonPlaceHolder_MvpApi {\n" +
                    "\n" +
                    "        return Retrofit.Builder()\n" +
                    "\n" +
                    "            //todo endereco base\n" +
                    "            .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "            //todo conversor para Json\n" +
                    "            .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "            .build()\n" +
                    "\n" +
                    "            .create( InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java )\n" +
                    "    }*/\n" +
                    "\n" +
                    "    companion object {\n" +
                    "\n" +
                    "        val retrofit = Retrofit.Builder()\n" +
                    "\n" +
                    "            //todo endereco base\n" +
                    "            .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "            //todo conversor para Json\n" +
                    "            .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "            .build()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Model /////////////////\n" +
                    "data class ClasseDeDadosAPIJsonPlaceHolder_MvpApi(\n" +
                    "val body: String,\n" +
                    "val id: Int,\n" +
                    "val title: String,\n" +
                    "val userId: Int\n" +
                    ")\n" +
                    "\n" +
                    "class PostagemApiJsonPlaceHolder_MvpApi {\n" +
                    "\n" +
                    "    //todo Atribuindo o Retrofit\n" +
                    "    private val classeRetrofitJsonPlaceholderMvpApi by lazy {\n" +
                    "\n" +
                    "        RetrofitJsonPlaceHolder_MvpApi.retrofit\n" +
                    "    }\n" +
                    "\n" +
                    "    suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi> {\n" +
                    "\n" +
                    "        val retorno_interface_recupetar_api_json_placeholder = classeRetrofitJsonPlaceholderMvpApi.create(InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java)\n" +
                    "\n" +
                    "        //todo cep passado pela caixa de texto\n" +
                    "//        val dados_recebida_pelo_caixa_de_texto = \"posts\"\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            //todo metodo da interface\n" +
                    "            val retornaAsPostagens = retorno_interface_recupetar_api_json_placeholder.interfaceRecupetarEnderecoApiJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)\n" +
                    "\n" +
                    "            if (retornaAsPostagens.isSuccessful) {\n" +
                    "\n" +
                    "                retornaAsPostagens.body()?.let { retornoDasPostagensApiRecuperadasPorLet ->\n" +
                    "\n" +
                    "                    return retornoDasPostagensApiRecuperadasPorLet\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            //todo teste de erro\n" +
                    "        } catch (erro_postagens: Exception) {\n" +
                    "\n" +
                    "            erro_postagens.printStackTrace()\n" +
                    "        }\n" +
                    "\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Presenter //////////////////\n" +
                    "interface InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi {\n" +
                    "\n" +
                    "    //todo funcao para exibir os dados na tela\n" +
                    "    fun exibirUsuariosApartirDaInterfacePresenter( lista : List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>  )\n" +
                    "\n" +
                    "    //todo progress bar\n" +
                    "    fun progressBar(carregando : Boolean )\n" +
                    "}\n" +
                    "\n" +
                    "class PostagemPresenterApiJsonPlaceHolder_MvpApi(private val interfacePresenterPostagemapijsonplaceholderMvpapi : InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi, private val postagemapijsonplaceholderMvpapi: PostagemApiJsonPlaceHolder_MvpApi) : AppCompatActivity() {\n" +
                    "\n" +
                    "    fun recuperaPostagensApiJsonPlaceHolder() {\n" +
                    "\n" +
                    "        interfacePresenterPostagemapijsonplaceholderMvpapi.progressBar(true)\n" +
                    "\n" +
                    "        CoroutineScope(Dispatchers.IO).launch {\n" +
                    "\n" +
                    "            withContext(Dispatchers.Main) {\n" +
                    "\n" +
                    "                //todo cuida automaticamente do ciclo de vida da activity\n" +
                    "                lifecycleScope.launch {\n" +
                    "\n" +
                    "                    val postagemApiRecuperadasPeloPresenter = postagemapijsonplaceholderMvpapi.funcaoRecuperaPostagens()\n" +
                    "\n" +
                    "                    interfacePresenterPostagemapijsonplaceholderMvpapi.exibirUsuariosApartirDaInterfacePresenter(postagemApiRecuperadasPeloPresenter)\n" +
                    "\n" +
                    "//                    Log.i(\" msg_API \", \" \$postagemApiRecuperadasPeloPresenter \")\n" +
                    "\n" +
                    "                    interfacePresenterPostagemapijsonplaceholderMvpapi.progressBar(false)\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentMvpApi : Fragment(),\n" +
                    "InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi { //todo interface presenter postagens\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentMvpApiBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo instancia do presente ja com os dados da api recuperados\n" +
                    "    private lateinit var postagem_Presenter_ApiJsonPlaceHolder: PostagemPresenterApiJsonPlaceHolder_MvpApi\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentMvpApiBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instancias da classe postagemApiJsonPlaceHolder\n" +
                    "        val postagemApiJsonPlaceHolder = PostagemApiJsonPlaceHolder_MvpApi()\n" +
                    "\n" +
                    "        //todo instancias da classe presenter\n" +
                    "        postagem_Presenter_ApiJsonPlaceHolder =\n" +
                    "            PostagemPresenterApiJsonPlaceHolder_MvpApi(this, postagemApiJsonPlaceHolder)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_MVP_API))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.NAV_MVP_API))\n" +
                    "\n" +
                    "            postagem_Presenter_ApiJsonPlaceHolder.recuperaPostagensApiJsonPlaceHolder()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun exibirUsuariosApartirDaInterfacePresenter(lista: List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>) {\n" +
                    "\n" +
                    "        var textoSerExibido = \"\"\n" +
                    "\n" +
                    "        lista.forEach { postagensRecebidasApartirDaInterface ->\n" +
                    "\n" +
                    "            textoSerExibido += \"\${postagensRecebidasApartirDaInterface.id} - \${postagensRecebidasApartirDaInterface.title} \n \"\n" +
                    "\n" +
                    "            binding.textView.text = textoSerExibido\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(carregando: Boolean) {\n" +
                    "\n" +
                    "        if (carregando) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvpApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\"-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_USUARIO_MVP_SIMPLES\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** VIEWMODEL *************************
    fun viewmodelContador(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "class ClasseViewModel : ViewModel() {\n" +
                    "\n" +
                    "    //todo variavel contador\n" +
                    "    private var contador = 0\n" +
                    "\n" +
                    "    //todo variavel texto da caixa de texto\n" +
                    "    var textoDaCaixaDeTexto: String = \"\"\n" +
                    "\n" +
                    "    fun recuperarContador(): Int {\n" +
                    "\n" +
                    "        return contador\n" +
                    "    }\n" +
                    "\n" +
                    "    fun adicionarMaisUmParaCadaClique() {\n" +
                    "\n" +
                    "        contador++\n" +
                    "    }\n" +
                    "\n" +
                    "    fun recuperaTextoDigitado(): String {\n" +
                    "\n" +
                    "        return \" Lucia \"\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentViewModelContador( ) : Fragment()  {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding : FragmentViewmodelContadorBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo chama o viewmodel\n" +
                    "    private lateinit var classeViewModel : ClasseViewModel\n" +
                    "\n" +
                    "    //todo a variavel se iniciara sempre com 0\n" +
                    "    private var contador = 0\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?,\n" +
                    "        savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentViewmodelContadorBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instancia de classeviewmodel\n" +
                    "//        classeViewModel = ClasseViewModelSimples()\n" +
                    "\n" +
                    "        //todo instanciando viewmodel\n" +
                    "        classeViewModel = ViewModelProvider( this ).get(  ClasseViewModel::class.java )\n" +
                    "\n" +
                    "        //todo recupera o valor da variavel contador que esta na classeviewmodel\n" +
                    "        val resultadoTextoContador = classeViewModel.recuperarContador()\n" +
                    "\n" +
                    "        //todo depois recebe novamento o nome Lucia\n" +
                    "//        binding.textViewNome.text = \" Nome: \${classeViewModel.recuperaTextoDigitado()} \"\n" +
                    "\n" +
                    "        //todo vinculo do ViewModel à caixa de texto\n" +
                    "//        binding.idTextInputNome.setText(classeViewModel.textoDaCaixaDeTexto)\n" +
                    "\n" +
                    "        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto mudar\n" +
                    "        binding.idTextInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->\n" +
                    "            classeViewModel.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo vinculo do ViewModel à caixa de texto idade\n" +
                    "//        binding.textInputIdade.setText(classeViewModel.textoDaCaixaDeTexto)\n" +
                    "\n" +
                    "        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar\n" +
                    "        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->\n" +
                    "            classeViewModel.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btnContar.setOnClickListener {\n" +
                    "\n" +
                    "            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel\n" +
                    "            classeViewModel.adicionarMaisUmParaCadaClique()\n" +
                    "\n" +
                    "            //todo caixa de texto inicio com Maria\n" +
                    "            binding.textViewNome.text = \" Nome: Maria \"\n" +
                    "\n" +
                    "//            binding.textViewNome.text = \" Nome: \${classeViewModel.recuperaTextoDigitado()} \"\n" +
                    "\n" +
                    "            //todo recupera funcao recuperarContador que esta na classeviewmodel\n" +
                    "            binding.textViewIdade.text = \" Idade: \${classeViewModel.recuperarContador()} \"\n" +
                    "\n" +
                    "            mensagemToast(\"  Numero: \${classeViewModel.recuperarContador()}  \")\n" +
                    "\n" +
                    "            mensagemSnackBar( getString(R.string.SNACKBAR_VIEWMODEL) )\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun viewmodelContadorXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "    <!--    tools:context=\".Fragment_de_Exemplo\"-->\n" +
                    "\n" +
                    "    <com.google.android.material.textfield.TextInputLayout\n" +
                    "        android:id=\"@+id/textInput_nome_layout\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:hint=\"Digite seu Nome\"\n" +
                    "        app:endIconMode=\"clear_text\"\n" +
                    "        app:helperText=\"Help\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:startIconDrawable=\"@android:drawable/ic_menu_edit\">\n" +
                    "\n" +
                    "        <com.google.android.material.textfield.TextInputEditText\n" +
                    "            android:id=\"@+id/id_TextInput_nome\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "    </com.google.android.material.textfield.TextInputLayout>\n" +
                    "\n" +
                    "    <com.google.android.material.textfield.TextInputLayout\n" +
                    "        android:id=\"@+id/id_TextInput_idade_layout\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:hint=\"Digite sua idade\"\n" +
                    "        app:endIconMode=\"clear_text\"\n" +
                    "        app:helperText=\"Help\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textInput_nome_layout\"\n" +
                    "        app:startIconDrawable=\"@android:drawable/ic_menu_my_calendar\">\n" +
                    "\n" +
                    "        <com.google.android.material.textfield.TextInputEditText\n" +
                    "            android:id=\"@+id/textInput_idade\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:inputType=\"number\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "    </com.google.android.material.textfield.TextInputLayout>\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView_nome\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"Nome:\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.441\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/id_TextInput_idade_layout\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView_idade\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"idade: 0\"\n" +
                    "        android:textSize=\"20sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.43\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView_nome\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_contar\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_VIEWMODEL_CONTADOR\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView_idade\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun viewmodelSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// View Model //////////////////\n" +
                    "class ClasseViewModelSimples : ViewModel() {\n" +
                    "\n" +
                    "    var contador = 0\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentViewModelSimples : Fragment() {\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo instancia classeviewmodel\n" +
                    "    private lateinit var classeViewModelSimples: ClasseViewModelSimples\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentViewmodelSimplesBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentViewmodelSimplesBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        classeViewModelSimples = ViewModelProvider(this).get(ClasseViewModelSimples::class.java)\n" +
                    "\n" +
                    "        fun funcaoViewModelSimple(): Unit {\n" +
                    "\n" +
                    "            classeViewModelSimples.contador++\n" +
                    "\n" +
                    "            binding.textView.text = \"ViewModel \${classeViewModelSimples.contador}\"\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_VIEWMODEL_SIMPLES))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.SNACKBAR_VIEWMODEL))\n" +
                    "\n" +
                    "            funcaoViewModelSimple()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun viewmodelSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_VIEWMODEL_CONTADOR_SIMPLES\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"50dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"30sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** LIVEDATA *************************
    fun livedataContador(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "class ClasseViewModelLiveDataContador : ViewModel() {\n" +
                    "\n" +
                    "    //todo variavel contador\n" +
                    "    private var contador = 0\n" +
                    "\n" +
                    "    //todo variavel livedata do que esta sendo observado // observavel //\n" +
                    "    private var liveDataDoQueEstaSendoObservado = MutableLiveData< Int > ()\n" +
                    "\n" +
                    "    //todo variavel texto da caixa de texto\n" +
                    "    var textoDaCaixaDeTexto: String = \"\"\n" +
                    "\n" +
                    "    fun recuperarLiveData() : MutableLiveData< Int > {\n" +
                    "\n" +
                    "        liveDataDoQueEstaSendoObservado.value = contador // a variavel livedata recebo o contador com valor 0\n" +
                    "\n" +
                    "        return liveDataDoQueEstaSendoObservado\n" +
                    "    }\n" +
                    "\n" +
                    "    fun adicionarMaisUmParaCadaClique() {\n" +
                    "\n" +
                    "        contador++\n" +
                    "        liveDataDoQueEstaSendoObservado.value = contador // contador adiciona + 1\n" +
                    "    }\n" +
                    "\n" +
                    "    fun recuperaTextoDigitado() : String {\n" +
                    "\n" +
                    "        return \" Lucia \"\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentLiveDataContador : Fragment()  {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding : FragmentLivedataContadorBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo viewmodel\n" +
                    "    private lateinit var classeViewModelLiveDataContador: ClasseViewModelLiveDataContador\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?,\n" +
                    "        savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentLivedataContadorBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "                //todo instanciando viewmodel\n" +
                    "        classeViewModelLiveDataContador = ViewModelProvider( this ).get(  ClasseViewModelLiveDataContador::class.java )\n" +
                    "\n" +
                    "        //todo criando o observador\n" +
                    "\n" +
                    "        val observadorLiveData = classeViewModelLiveDataContador.recuperarLiveData()\n" +
                    "\n" +
                    "        observadorLiveData.observe( viewLifecycleOwner ,  ) { contador ->\n" +
                    "\n" +
                    "            //todo caixa de texto inicio com Maria\n" +
                    "            binding.textViewNome.text = \" Nome: Maria \"\n" +
                    "\n" +
                    "            //todo recupera funcao recuperarContador que esta na classeviewmodel\n" +
                    "            binding.textViewIdade.text = \" Idade: \${contador} \"\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto mudar\n" +
                    "        binding.idTextInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->\n" +
                    "            classeViewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar\n" +
                    "        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->\n" +
                    "            classeViewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btnContar.setOnClickListener { view ->\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_LIVEDATA_CONTADOR))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.SNACKBAR_LIVEDATA))\n" +
                    "\n" +
                    "            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel\n" +
                    "            classeViewModelLiveDataContador.adicionarMaisUmParaCadaClique()\n" +
                    "\n" +
                    "            //todo recupera funcao recuperaTextoDigitado que esta na classeviewmodel\n" +
                    "            binding.idTextInputNome.setText(\" Nome: \${classeViewModelLiveDataContador.recuperaTextoDigitado()} \")\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun livedataContadorXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "    <!--    tools:context=\".Fragment_de_Exemplo\"-->\n" +
                    "\n" +
                    "    <com.google.android.material.textfield.TextInputLayout\n" +
                    "        android:id=\"@+id/textInput_nome_layout\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:hint=\"Digite seu Nome\"\n" +
                    "        app:endIconMode=\"clear_text\"\n" +
                    "        app:helperText=\"Help\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:startIconDrawable=\"@android:drawable/ic_menu_edit\">\n" +
                    "\n" +
                    "        <com.google.android.material.textfield.TextInputEditText\n" +
                    "            android:id=\"@+id/id_TextInput_nome\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "    </com.google.android.material.textfield.TextInputLayout>\n" +
                    "\n" +
                    "    <com.google.android.material.textfield.TextInputLayout\n" +
                    "        android:id=\"@+id/id_TextInput_idade_layout\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:hint=\"Digite sua idade\"\n" +
                    "        app:endIconMode=\"clear_text\"\n" +
                    "        app:helperText=\"Help\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textInput_nome_layout\"\n" +
                    "        app:startIconDrawable=\"@android:drawable/ic_menu_my_calendar\">\n" +
                    "\n" +
                    "        <com.google.android.material.textfield.TextInputEditText\n" +
                    "            android:id=\"@+id/textInput_idade\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:inputType=\"number\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "    </com.google.android.material.textfield.TextInputLayout>\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView_nome\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"Nome:\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.441\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/id_TextInput_idade_layout\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView_idade\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"idade: 0\"\n" +
                    "        android:textSize=\"20sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.43\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView_nome\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_contar\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"16dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_VIEWMODEL_CONTADOR\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView_idade\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun livedataSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "class ClasseViewModelLiveDataSimples : ViewModel() {\n" +
                    "\n" +
                    "    //todo variavel contador\n" +
                    "    private var contador = 0\n" +
                    "\n" +
                    "    //todo variavel texto da caixa de texto\n" +
                    "    var variavelString: String = \"\"\n" +
                    "\n" +
                    "    //todo variavel livedata do que esta sendo observado // observavel //\n" +
                    "    private var liveDataDoQueEstaSendoObservado = MutableLiveData<Int>()\n" +
                    "\n" +
                    "    fun recuperarLiveData(): MutableLiveData<Int> {\n" +
                    "\n" +
                    "        liveDataDoQueEstaSendoObservado.value = contador // a variavel livedata recebo o contador com valor 0\n" +
                    "\n" +
                    "        return liveDataDoQueEstaSendoObservado\n" +
                    "    }\n" +
                    "\n" +
                    "    fun adicionarMaisUmParaCadaClique() {\n" +
                    "\n" +
                    "        contador++\n" +
                    "\n" +
                    "        liveDataDoQueEstaSendoObservado.value = contador // contador adiciona + 1\n" +
                    "    }\n" +
                    "\n" +
                    "    fun subtraiMaisUmParaCadaClique() {\n" +
                    "\n" +
                    "        contador--\n" +
                    "\n" +
                    "        liveDataDoQueEstaSendoObservado.value = contador // contador subtrai + 1\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentLiveDataSimples : Fragment() {\n" +
                    "\n" +
                    "    //todo viewmodel\n" +
                    "    private lateinit var classeViewModelLiveDataSimples: ClasseViewModelLiveDataSimples\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentLivedataSimplesBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentLivedataSimplesBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instanciando viewmodel\n" +
                    "        classeViewModelLiveDataSimples = ViewModelProvider(this).get(ClasseViewModelLiveDataSimples::class.java)\n" +
                    "\n" +
                    "        //todo criando o observador\n" +
                    "\n" +
                    "        val observadorLiveData = classeViewModelLiveDataSimples.recuperarLiveData()\n" +
                    "\n" +
                    "        observadorLiveData.observe(viewLifecycleOwner) { contador ->\n" +
                    "\n" +
                    "            //todo recupera funcao recuperarContador que esta na classeviewmodel\n" +
                    "            binding.textView.text = \" Novo Valor: \${contador} \"\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar\n" +
                    "        binding.textView.addTextChangedListener { textoQuePermaneceraNaCaixaDeTexto ->\n" +
                    "            classeViewModelLiveDataSimples.variavelString = textoQuePermaneceraNaCaixaDeTexto.toString()\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.SNACKBAR_LIVEDATA))\n" +
                    "\n" +
                    "            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel\n" +
                    "            classeViewModelLiveDataSimples.adicionarMaisUmParaCadaClique()\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn02.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.SNACKBAR_LIVEDATA))\n" +
                    "\n" +
                    "            //todo recupera a subraiMaisUmACadaClique que esta na classeviewmodel\n" +
                    "            classeViewModelLiveDataSimples.subtraiMaisUmParaCadaClique()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun livedataSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"+ 1\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_02\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"- 1\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"30sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_02\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** MVVM *************************
    fun mvvmApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Api //////////////////\n" +
                    "interface InterfaceRetrofitApiJsonPlaceHolder_MvvmApi {\n" +
                    "\n" +
                    "    @GET( \"posts\" )\n" +
                    "\n" +
                    "    suspend fun interfaceRecupetarPostagemApiJsonPlaceHolder(  /*@Path( \"posts\" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi>>\n" +
                    "}\n" +
                    "\n" +
                    "//object RetrofitJsonPlaceHolder_MvpApi {\n" +
                    "class RetrofitJsonPlaceHolder_MvvmApi {\n" +
                    "\n" +
                    "        /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitApiJsonPlaceHolder_MvvmApi {\n" +
                    "\n" +
                    "            return Retrofit.Builder()\n" +
                    "\n" +
                    "                //todo endereco base\n" +
                    "                .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "                //todo conversor para Json\n" +
                    "                .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "                .build()\n" +
                    "\n" +
                    "                .create( InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java )\n" +
                    "        }*/\n" +
                    "\n" +
                    "        companion object {\n" +
                    "\n" +
                    "            val retrofit = Retrofit.Builder()\n" +
                    "\n" +
                    "                //todo endereco base\n" +
                    "                .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "                //todo conversor para Json\n" +
                    "                .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "                .build()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "//todo ////////////////// Model /////////////////\n" +
                    "data class ClasseDeDadosAPIJsonPlaceHolder_MvvmApi(\n" +
                    "\n" +
                    "    val body: String,\n" +
                    "\n" +
                    "    val id: Int,\n" +
                    "\n" +
                    "    val title: String,\n" +
                    "\n" +
                    "    val userId: Int\n" +
                    ")\n" +
                    "\n" +
                    "class PostagemApiJsonPlaceHolder_MvvmApi(  ) {\n" +
                    "\n" +
                    "    //todo Atribuindo o Retrofit\n" +
                    "    private val classeRetrofitJsonPlaceHolder_MvvmApi by lazy {\n" +
                    "\n" +
                    "        RetrofitJsonPlaceHolder_MvvmApi.retrofit\n" +
                    "    }\n" +
                    "\n" +
                    "    suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi> {\n" +
                    "\n" +
                    "        val retorno_interface_recupetar_api_json_placeholder = classeRetrofitJsonPlaceHolder_MvvmApi.create (InterfaceRetrofitApiJsonPlaceHolder_MvvmApi::class.java)\n" +
                    "\n" +
                    "        //todo cep passado pela caixa de texto\n" +
                    "//        val dados_recebida_pelo_caixa_de_texto = \"posts\"\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            //todo metodo da interface\n" +
                    "            val retornaAsPostagens = retorno_interface_recupetar_api_json_placeholder.interfaceRecupetarPostagemApiJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)\n" +
                    "\n" +
                    "            if (retornaAsPostagens.isSuccessful) {\n" +
                    "\n" +
                    "                retornaAsPostagens.body()?.let { retornoDasPostagensApiRecuperadasPorLet ->\n" +
                    "\n" +
                    "                    return retornoDasPostagensApiRecuperadasPorLet\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            //todo teste de erro\n" +
                    "        } catch (erro_postagens: Exception) {\n" +
                    "\n" +
                    "            erro_postagens.printStackTrace()\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View Model //////////////////\n" +
                    "class ViewModel_MvvmApi : ViewModel(){\n" +
                    "\n" +
                    "    //todo gera a listagem das postagens\n" +
                    "    val listaDePostagens = MutableLiveData< List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi> >()\n" +
                    "\n" +
                    "    fun recuperaPostagensApiJsonPlaceHolder() {\n" +
                    "\n" +
                    "        val postagemapijsonplaceholderMvpapi = PostagemApiJsonPlaceHolder_MvvmApi()\n" +
                    "\n" +
                    "        //todo controla o ciclo de vida da activity\n" +
                    "        viewModelScope.launch {\n" +
                    "\n" +
                    "            val postagemApiRecuperadasMvvmApi = postagemapijsonplaceholderMvpapi.funcaoRecuperaPostagens()\n" +
                    "\n" +
                    "            listaDePostagens.postValue( postagemApiRecuperadasMvvmApi )\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentMvvmApi : Fragment(), InterfaceCarregando {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentMvvmApiBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo viewmodel\n" +
                    "    private lateinit var viewModel: ViewModel_MvvmApi\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentMvvmApiBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        fun recuperandoAsPostagens() {\n" +
                    "\n" +
                    "            progressBar(true)\n" +
                    "\n" +
                    "            //todo instanciando viewmodel\n" +
                    "            this.viewModel = ViewModelProvider(this).get(ViewModel_MvvmApi::class.java)\n" +
                    "\n" +
                    "            //todo criando o observador\n" +
                    "            val observadorLiveData = this.viewModel.recuperaPostagensApiJsonPlaceHolder()\n" +
                    "            viewModel.listaDePostagens.observe(viewLifecycleOwner) { lista ->\n" +
                    "\n" +
                    "                //todo lista onde serao exibido as postagens\n" +
                    "                var textoSerExibido = \"\"\n" +
                    "\n" +
                    "                lista.forEach { postagensRecebidasApartirDaInterface ->\n" +
                    "\n" +
                    "                    textoSerExibido += \"\${postagensRecebidasApartirDaInterface.id} - \${postagensRecebidasApartirDaInterface.title} \n \"\n" +
                    "\n" +
                    "                    binding.textView.text = textoSerExibido\n" +
                    "\n" +
                    "                    progressBar(false)\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_MVVM_API))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.NAV_MVVM_API))\n" +
                    "\n" +
                    "            recuperandoAsPostagens()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(Carregando: Boolean) {\n" +
                    "\n" +
                    "        if (Carregando) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_POSTEGENS_MVVM_API\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "data class UsuariosMvvmSimples (\n" +
                    "val nome: String,\n" +
                    "val idade: Int\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// View Model /////////////////\n" +
                    "class ViewModelMvvmSimples : ViewModel() {\n" +
                    "\n" +
                    "    private val listaUsuarios = MutableLiveData<UsuariosMvvmSimples>()\n" +
                    "\n" +
                    "    init {\n" +
                    "\n" +
                    "        val recuperaUsuarios = UsuariosMvvmSimples(\"Ana\", 25)\n" +
                    "\n" +
                    "        listaUsuarios.value = recuperaUsuarios\n" +
                    "    }\n" +
                    "\n" +
                    "    fun getUser(): LiveData<UsuariosMvvmSimples> {\n" +
                    "\n" +
                    "        return listaUsuarios\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentMvvm_Simples : Fragment() {\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo instancia classe viewmodel\n" +
                    "    private lateinit var viewModelMvvmSimples: ViewModelMvvmSimples\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentMvvmSimplesBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?,\n" +
                    "        savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentMvvmSimplesBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        viewModelMvvmSimples = ViewModelProvider(this)[ViewModelMvvmSimples::class.java]\n" +
                    "\n" +
                    "        fun funcaoRecuperaUsuarios() {\n" +
                    "\n" +
                    "            viewModelMvvmSimples.getUser().observe(viewLifecycleOwner) { usuariosRecuperados ->\n" +
                    "\n" +
                    "                val resultadoUsuariosRecuperados =\n" +
                    "                    \"Nome: \${usuariosRecuperados.nome} , idade: \${usuariosRecuperados.idade} \n \n \"\n" +
                    "\n" +
                    "                binding.textView.text = resultadoUsuariosRecuperados\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(getString(R.string.NAV_MVVM_SIMPLES))\n" +
                    "\n" +
                    "            mensagemSnackBar(getString(R.string.NAV_MVVM_SIMPLES))\n" +
                    "\n" +
                    "            funcaoRecuperaUsuarios()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_USUARIO_MVVM_SIMPLES\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** CLEAN *************************
    fun cleanMvvm(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Api //////////////////\n" +
                    "interface InterfaceRetrofitApiJsonPlaceHolder_MvvmClean {\n" +
                    "\n" +
                    "    @GET( \"posts\" )\n" +
                    "\n" +
                    "    suspend fun interfaceRecupetarPostagemJsonPlaceHolder(  /*@Path( \"posts\" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>\n" +
                    "}\n" +
                    "\n" +
                    "//object RetrofitJsonPlaceHolder_MvpApi {\n" +
                    "    class RetrofitJsonPlaceHolder_MvvmClean {\n" +
                    "\n" +
                    "        /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitApiJsonPlaceHolder_MvvmApi {\n" +
                    "\n" +
                    "            return Retrofit.Builder()\n" +
                    "\n" +
                    "                //todo endereco base\n" +
                    "                .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "                //todo conversor para Json\n" +
                    "                .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "                .build()\n" +
                    "\n" +
                    "                .create( InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java )\n" +
                    "        }*/\n" +
                    "\n" +
                    "        companion object {\n" +
                    "\n" +
                    "            val retrofit = Retrofit.Builder()\n" +
                    "\n" +
                    "                //todo endereco base\n" +
                    "                .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "                //todo conversor para Json\n" +
                    "                .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "                .build()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "//todo ////////////////// Model /////////////////\n" +
                    "data class ClasseDeDadosAPIJsonPlaceHolder_MvvmClean(\n" +
                    "\n" +
                    "    val body: String,\n" +
                    "\n" +
                    "    val id: Int,\n" +
                    "\n" +
                    "    val title: String,\n" +
                    "\n" +
                    "    val userId: Int\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// Repository //////////////////\n" +
                    "interface InterfaceRepositorioData_MvvmClean { //todo todos os repositorios terao que implementar essas funcoes // CONTRATO //ABSTRACAO\n" +
                    "\n" +
                    "    //todo recupera a lista\n" +
                    "    val listaDePostagensRecuperadaDoRepositorio : MutableLiveData <List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>\n" +
                    "\n" +
                    "    //todo metodo recupera os dados\n" +
                    "    suspend fun funcaoRecuperaPostagens()\n" +
                    "}\n" +
                    "///\n" +
                    "class PostagemRepositorioDataApiJsonPlaceHolder_MvvmClean(val interfaceretrofitapijsonplaceholderMvvmclean: InterfaceRetrofitApiJsonPlaceHolder_MvvmClean) : InterfaceRepositorioData_MvvmClean{ //todo instanciando pelo construtor e baixando o acoplamento // injecao\n" +
                    "\n" +
                    "    //todo recupera a lista\n" +
                    "    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData <List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>()\n" +
                    "\n" +
                    "    //todo metodo que recupera as postagens\n" +
                    "    override suspend fun funcaoRecuperaPostagens(){\n" +
                    "\n" +
                    "        //todo dados passado pela caixa de texto\n" +
                    "        //val dados_recebida_pelo_caixa_de_texto = \"posts\"\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            //todo metodo da interface\n" +
                    "            val retornaAsPostagens = interfaceretrofitapijsonplaceholderMvvmclean.interfaceRecupetarPostagemJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)\n" +
                    "\n" +
                    "            if (retornaAsPostagens.isSuccessful && retornaAsPostagens.body() != null ) {\n" +
                    "\n" +
                    "                listaDePostagensRecuperadaDoRepositorio.postValue(  retornaAsPostagens.body()  )\n" +
                    "\n" +
                    "                }\n" +
                    "\n" +
                    "            //todo teste de erro\n" +
                    "        } catch (erro_postagens: Exception) {\n" +
                    "\n" +
                    "            erro_postagens.printStackTrace()\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "///\n" +
                    "class PostagemRepositorioDataFireBase_MvvmClean() : InterfaceRepositorioData_MvvmClean {\n" +
                    "\n" +
                    "    //todo recupera a lista\n" +
                    "    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>()\n" +
                    "\n" +
                    "    //todo metodo recupera os dados\n" +
                    "    override suspend fun funcaoRecuperaPostagens() {\n" +
                    "\n" +
                    "        //todo simula uma solicitacao por banco de dados ao inves de por api\n" +
                    "        val listaRecuperadaPeloRepositorio = listOf(\n" +
                    "\n" +
                    "            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean(\"corpo\" , 1,\"Sucesso FireBase Repositorio 1\" ,2 ) ,\n" +
                    "            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean(\"corpo\" , 2,\"Sucesso FireBase Repositorio 2 \" ,2 ) ,\n" +
                    "            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean(\"corpo\" , 3,\"Sucesso FireBase Repositorio 3\" ,2 )\n" +
                    "        )\n" +
                    "\n" +
                    "        listaDePostagensRecuperadaDoRepositorio.value = listaRecuperadaPeloRepositorio\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View Model //////////////////\n" +
                    "class ViewModelComMvvmClean( val interfaceRepositorio : InterfaceRepositorioData_MvvmClean) : ViewModel()  {//todo injecao do postagemrepositorioapijsonplaceholderMvvmclean\n" +
                    "\n" +
                    "    //todo gera a listagem das postagens\n" +
                    "    var listaDePostagens = MutableLiveData < List <ClasseDeDadosAPIJsonPlaceHolder_MvvmClean> >()\n" +
                    "\n" +
                    "        //todo recupera a lista de postagens recuperada do postagem repositorio\n" +
                    "        get() = interfaceRepositorio.listaDePostagensRecuperadaDoRepositorio\n" +
                    "\n" +
                    "    fun recuperaPostagensApiJsonPlaceHolder() {\n" +
                    "\n" +
                    "        //todo controla o ciclo de vida da activity\n" +
                    "        viewModelScope.launch {\n" +
                    "\n" +
                    "            interfaceRepositorio.funcaoRecuperaPostagens()\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class ViewModelComMvvmCleanFactory( val interfaceRepositorio : InterfaceRepositorioData_MvvmClean) : ViewModelProvider.Factory {\n" +
                    "\n" +
                    "    override fun <T : ViewModel> create(modelClass: Class<T>): T {\n" +
                    "\n" +
                    "        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment\n" +
                    "        return ViewModelComMvvmClean(  interfaceRepositorio ) as T\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentCleanMvvm : Fragment(), InterfaceCarregando {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentCleanMvvmBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo chama o viewmodel\n" +
                    "    private lateinit var classeViewModel: ViewModelComMvvmClean\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentCleanMvvmBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instanciando postagem repositoty firebase\n" +
                    "        val postagemrepositorioapijsonplaceholderMvvmclean =\n" +
                    "            PostagemRepositorioDataFireBase_MvvmClean()\n" +
                    "\n" +
                    "        //todo instanciando viewmodel Factory\n" +
                    "        classeViewModel = ViewModelProvider(\n" +
                    "            this, ViewModelComMvvmCleanFactory(postagemrepositorioapijsonplaceholderMvvmclean)\n" +
                    "        )[ViewModelComMvvmClean::class.java]\n" +
                    "\n" +
                    "        fun recuperandoAsPostagens() {\n" +
                    "\n" +
                    "            progressBar(true)\n" +
                    "\n" +
                    "            //todo criando o observador\n" +
                    "            val observadorLiveData = this.classeViewModel.recuperaPostagensApiJsonPlaceHolder()\n" +
                    "            classeViewModel.listaDePostagens.observe(viewLifecycleOwner) { lista ->\n" +
                    "\n" +
                    "                //todo lista onde serao exibido as postagens\n" +
                    "                var textoSerExibido = \"\"\n" +
                    "\n" +
                    "                lista.forEach { postagensRecebidasApartirDaInterface ->\n" +
                    "\n" +
                    "                    textoSerExibido += \"\${postagensRecebidasApartirDaInterface.id} - \${postagensRecebidasApartirDaInterface.title} \n \"\n" +
                    "\n" +
                    "                    binding.textView.text = textoSerExibido\n" +
                    "\n" +
                    "                    progressBar(false)\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_CLEAN_ARCHITECTURE_MVVM)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            recuperandoAsPostagens()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(Carregando: Boolean) {\n" +
                    "\n" +
                    "        if (Carregando) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun cleanMvvmXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_POSTEGENS_MVVM_CLEAN_ARCHITECTURE\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun cleanDomain(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Api //////////////////\n" +
                    "interface InterfaceRetrofitApi_Domain {\n" +
                    "\n" +
                    "    @GET( \"posts\" )\n" +
                    "\n" +
                    "    suspend fun interfaceRecupetarPostagemJsonPlaceHolder_Domain(  /*@Path( \"posts\" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDados_Domain_Resposta>>\n" +
                    "}\n" +
                    "//\n" +
                    "//class RetrofitJsonPlaceHolder_Domain {\n" +
                    "\n" +
                    "    object Retrofit_Domain {\n" +
                    "\n" +
                    "        fun recuperaPostagensApi_Domain(): InterfaceRetrofitApi_Domain {\n" +
                    "\n" +
                    "            return Retrofit.Builder()\n" +
                    "\n" +
                    "                //todo endereco base\n" +
                    "                .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "                //todo conversor para Json\n" +
                    "                .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "                .build()\n" +
                    "\n" +
                    "                .create(InterfaceRetrofitApi_Domain::class.java)\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    /*companion object {\n" +
                    "\n" +
                    "        val retrofit = Retrofit.Builder()\n" +
                    "\n" +
                    "            //todo endereco base\n" +
                    "            .baseUrl(\"https://jsonplaceholder.typicode.com/\")\n" +
                    "\n" +
                    "            //todo conversor para Json\n" +
                    "            .addConverterFactory(GsonConverterFactory.create())\n" +
                    "\n" +
                    "            .build()\n" +
                    "    }\n" +
                    "}*/\n" +
                    "\n" +
                    "//todo ////////////////// Model /////////////////\n" +
                    "data class ClasseDeDados_Domain_Resposta(\n" +
                    "\n" +
                    "    val body: String,\n" +
                    "    val id: Int,\n" +
                    "    val title: String,\n" +
                    "    val userId: Int\n" +
                    ")\n" +
                    "\n" +
                    "fun ClasseDeDados_Domain_Resposta.paraPostagemDomainMap() : ClasseDeDadosPostagem_Model_Domain {\n" +
                    "\n" +
                    "    return ClasseDeDadosPostagem_Model_Domain(\n" +
                    "\n" +
                    "        //descrisao = RetornoDasPostagensPorMap.corpodamensagem, //todo exemplo nao é mas body agora é corpodamensagem\n" +
                    "\n" +
                    "        descrisao = this.body,\n" +
                    "        titulo = this.title,\n" +
                    "        codigo = this.id,\n" +
                    "        usuarioId = this.userId\n" +
                    "    )\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Repository //////////////////\n" +
                    "interface InterfaceRepositorio_Domain {\n" +
                    "\n" +
                    "    //tod o metodo recupera os dados\n" +
                    "    suspend fun funcaoRecuperaPostagens() : List<ClasseDeDadosPostagem_Model_Domain>\n" +
                    "}\n" +
                    "///\n" +
                    "class PostagemRepositorio_Domain(  ) : InterfaceRepositorio_Domain { //todo instanciando pelo construtor e baixando o acoplamento // injecao\n" +
                    "\n" +
                    "    //todo metodo que recupera as postagens\n" +
                    "    override suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosPostagem_Model_Domain> {\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            //todo metodo da interface\n" +
                    "            val retornaDasPostagens = Retrofit_Domain.recuperaPostagensApi_Domain().interfaceRecupetarPostagemJsonPlaceHolder_Domain()\n" +
                    "\n" +
                    "            if ( retornaDasPostagens.isSuccessful && retornaDasPostagens.body() != null) {\n" +
                    "\n" +
                    "                val listaDePostagensRespostaRetornada = retornaDasPostagens.body()\n" +
                    "\n" +
                    "                val listaDePostagemMap = listaDePostagensRespostaRetornada?.map { retornoDasPostagensPorMap ->\n" +
                    "\n" +
                    "                    //todo retorna uma lista tipo map que facilita a troca das informacoes\n" +
                    "\n" +
                    "                    //todo retorno da classe de dados model domain\n" +
                    "                    retornoDasPostagensPorMap.paraPostagemDomainMap()\n" +
                    "                }\n" +
                    "\n" +
                    "                if (listaDePostagemMap != null) {\n" +
                    "\n" +
                    "                    return listaDePostagemMap\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            //todo teste de erro\n" +
                    "        } catch (erro_postagens: Exception) {\n" +
                    "\n" +
                    "            erro_postagens.printStackTrace()\n" +
                    "        }\n" +
                    "\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class PostagemRepositorioFireBase_Domain() : InterfaceRepositorio_Domain {\n" +
                    "\n" +
                    "    //todo recupera a lista\n" +
                    "     val listaDePostagensRecuperadaDoRepositorio = MutableLiveData<List<ClasseDeDados_Domain_Resposta>>()\n" +
                    "\n" +
                    "    //todo metodo recupera os dados\n" +
                    "    override suspend fun funcaoRecuperaPostagens(  ): List<ClasseDeDadosPostagem_Model_Domain> {\n" +
                    "\n" +
                    "        //todo simula uma solicitacao por banco de dados ao inves de por api\n" +
                    "        val listaRecuperadaPeloRepositorio = listOf(\n" +
                    "\n" +
                    "            ClasseDeDados_Domain_Resposta(\"corpo\" , 1,\"Sucesso FireBase Repositorio 1\" ,2 ) ,\n" +
                    "            ClasseDeDados_Domain_Resposta(\"corpo\" , 2,\"Sucesso FireBase Repositorio 2 \" ,2 ) ,\n" +
                    "            ClasseDeDados_Domain_Resposta(\"corpo\" , 3,\"Sucesso FireBase Repositorio 3\" ,2 )\n" +
                    "        )\n" +
                    "\n" +
                    "        listaDePostagensRecuperadaDoRepositorio.value = listaRecuperadaPeloRepositorio\n" +
                    "\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Domain //////////////////\n" +
                    "data class ClasseDeDadosPostagem_Model_Domain (\n" +
                    "\n" +
                    "    val descrisao: String,\n" +
                    "\n" +
                    "    val codigo: Int,\n" +
                    "\n" +
                    "    val titulo: String,\n" +
                    "\n" +
                    "    val usuarioId: Int\n" +
                    "\n" +
                    ") {\n" +
                    "\n" +
                    "    fun validarClasseDeDados_Model_Domain(): Unit {\n" +
                    "\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Use Case //////////////////\n" +
                    "//todo exemplos de nomes UseCase pode comecar pos Get ou Set\n" +
                    "class PostagemUseCase( val repositorioDomain : InterfaceRepositorio_Domain) { //todo reconhece a classe postagem domain\n" +
                    "\n" +
                    "               /* todo Get ou todo Set */\n" +
                    "//    suspend fun recuperarPostagensUseCase(  ) : List<ClasseDeDadosPostagem_Model_Domain>{//todo sem invoke\n" +
                    "suspend operator fun invoke(  ) : List<ClasseDeDadosPostagem_Model_Domain>{//todo com invoke\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            //todo exemplos de recuperacao de dados com , fotos\n" +
                    "            //todo exemplos de recuperacao de dados com , listas\n" +
                    "            //todo exemplos de recuperacao de dados com , postagem\n" +
                    "            //todo exemplos de recuperacao de dados com , album\n" +
                    "            //todo exemplos de recuperacao de dados com , tags\n" +
                    "\n" +
                    "            return repositorioDomain.funcaoRecuperaPostagens(  )//todo com invoke\n" +
                    "\n" +
                    "        } catch (erro_postagensUseCase: Exception) {\n" +
                    "\n" +
                    "            erro_postagensUseCase.printStackTrace()\n" +
                    "        }\n" +
                    "\n" +
                    "        return  emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View Model //////////////////\n" +
                    "class ViewModelDomain(val postagemUseCase: PostagemUseCase, /*val interfacecarregandoDomain : InterfaceCarregando_Domain*/ ) : ViewModel() {//todo injecao do postagemrepositorioapijsonplaceholderMvvmDomainclean\n" +
                    "\n" +
                    "    //todo gera a listagem das postagens\n" +
                    "    var listaDePostagens = MutableLiveData < List <ClasseDeDadosPostagem_Model_Domain> >()\n" +
                    "\n" +
                    "    fun recuperaPostagensApiJsonPlaceHolder() {\n" +
                    "\n" +
                    "        //todo controla o ciclo de vida da activity\n" +
                    "        viewModelScope.launch {\n" +
                    "\n" +
                    "//            val listaDePostagensRecuperadasUseCase = postagemUseCase.recuperarPostagensUseCase()//todo sem invoke\n" +
                    "val listaDePostagensRecuperadasUseCase = postagemUseCase()//todo com invoke\n" +
                    "\n" +
                    "            listaDePostagens.postValue( listaDePostagensRecuperadasUseCase )\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class ViewModelFactoryDomain (private val postagemUseCase: PostagemUseCase) : ViewModelProvider.Factory {\n" +
                    "\n" +
                    "    override fun <T : ViewModel> create(modelClass: Class<T>): T {\n" +
                    "\n" +
                    "        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment\n" +
                    "        return ViewModelDomain(  postagemUseCase ) as T\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentCleanDomain : Fragment(), InterfaceCarregando {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentCleanDomainBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo chama o viewmodel\n" +
                    "    private lateinit var viewModel: ViewModelDomain\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View? {\n" +
                    "\n" +
                    "        _binding = FragmentCleanDomainBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instanciando postagem interface retrofit\n" +
                    "        val classeRetrofit = Retrofit_Domain.recuperaPostagensApi_Domain()\n" +
                    "\n" +
                    "        ////todo instanciando postagem repositorio\n" +
                    "        val postagemRepositorioDomain = PostagemRepositorio_Domain()\n" +
                    "\n" +
                    "        //todo instanciando postagem repositoty firebase\n" +
                    "        val postagemRepositorioFireBaseDomain = PostagemRepositorioFireBase_Domain()\n" +
                    "\n" +
                    "        //todo instanciando postagem usecase\n" +
                    "        val postagemUseCase = PostagemUseCase(postagemRepositorioDomain)\n" +
                    "\n" +
                    "        //todo instanciando viewmodel Factory\n" +
                    "        viewModel = ViewModelProvider(\n" +
                    "            this, ViewModelFactoryDomain(postagemUseCase)\n" +
                    "        )[ViewModelDomain::class.java]\n" +
                    "\n" +
                    "        fun recuperandoAsPostagens() {\n" +
                    "\n" +
                    "            progressBar(true)\n" +
                    "\n" +
                    "            //todo criando o observador\n" +
                    "            val observadorLiveData = this.viewModel.recuperaPostagensApiJsonPlaceHolder()\n" +
                    "            viewModel.listaDePostagens.observe(viewLifecycleOwner) { lista ->\n" +
                    "\n" +
                    "                //todo lista onde serao exibido as postagens\n" +
                    "                var textoSerExibido = \"\"\n" +
                    "\n" +
                    "                lista.forEach { postagensRecebidasApartirDaInterface ->\n" +
                    "\n" +
                    "                    textoSerExibido += \"\${postagensRecebidasApartirDaInterface.codigo} - \${postagensRecebidasApartirDaInterface.titulo} \n \"\n" +
                    "\n" +
                    "                    binding.textView.text = textoSerExibido\n" +
                    "\n" +
                    "                    progressBar(false)\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_CLEAN_ARCHITECTURE_DOMAIN)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            recuperandoAsPostagens()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(Carregando: Boolean) {\n" +
                    "\n" +
                    "        if (Carregando) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Operadores //////////////////\n" +
                    "class PostagemTeste() {\n" +
                    "\n" +
                    "    fun recuperarPostagens(): List<String> {\n" +
                    "\n" +
                    "        return listOf( \"maria\" , \"ana\" , \"carlos\" )\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "fun main() {\n" +
                    "\n" +
                    "    val postagensRetornada = PostagemTeste()\n" +
                    "    val lista = postagensRetornada.recuperarPostagens()\n" +
                    "\n" +
                    "    println( lista )\n" +
                    "}\n" +
                    "\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun cleanDomainXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_RECUPERA_POSTAGENS_MVVM_CLEAN_ARCHITECTURE_CAMADA_DOMAIN_API\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** HILT *************************
    fun hiltCleanDomainProdutos(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Api//////////////////\n" +
                    "interface InterfaceDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "    // getUsers()\n" +
                    "    @GET(\"products\")\n" +
                    "    suspend fun recuperarUsuarios(): Response<ClasseDeDadosDummyProdutos>\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "data class ClasseDeDadosDummyProdutos(\n" +
                    "val limit: Int,\n" +
                    "val products: List<Product>,\n" +
                    "val skip: Int,\n" +
                    "val total: Int\n" +
                    ")\n" +
                    "///\n" +
                    "data class Dimensions(\n" +
                    "val depth: Double,\n" +
                    "val height: Double,\n" +
                    "val width: Double\n" +
                    ")\n" +
                    "///\n" +
                    "data class Meta(\n" +
                    "val barcode: String,\n" +
                    "val createdAt: String,\n" +
                    "val qrCode: String,\n" +
                    "val updatedAt: String\n" +
                    ")\n" +
                    "///\n" +
                    "data class Product(\n" +
                    "val availabilityStatus: String,\n" +
                    "val brand: String,\n" +
                    "val category: String,\n" +
                    "val description: String,\n" +
                    "val dimensions: Dimensions,\n" +
                    "val discountPercentage: Double,\n" +
                    "val id: Int,\n" +
                    "val images: List<String>,\n" +
                    "val meta: Meta,\n" +
                    "val minimumOrderQuantity: Int,\n" +
                    "val price: Double,\n" +
                    "val rating: Double,\n" +
                    "val returnPolicy: String,\n" +
                    "val reviews: List<Review>,\n" +
                    "val shippingInformation: String,\n" +
                    "val sku: String,\n" +
                    "val stock: Int,\n" +
                    "val tags: List<String>,\n" +
                    "val thumbnail: String,\n" +
                    "val title: String,\n" +
                    "val warrantyInformation: String,\n" +
                    "val weight: Int\n" +
                    ")\n" +
                    "\n" +
                    "fun Product.toUsuario() : EstruturaDeRetornoDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "    return EstruturaDeRetornoDomainApiDummy_Produtos(\n" +
                    "\n" +
                    "        produto = this.title,\n" +
                    "        descricao = this.category,\n" +
                    "        preco = this.price\n" +
                    "\n" +
                    "        )\n" +
                    "}\n" +
                    "///\n" +
                    "data class Review(\n" +
                    "val comment: String,\n" +
                    "val date: String,\n" +
                    "val rating: Int,\n" +
                    "val reviewerEmail: String,\n" +
                    "val reviewerName: String\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// Repository Model /////////////////\n" +
                    "class InterfaceRepositoryDataImplementacaoDomainApiDummyApiDummy_Produtos @Inject constructor(\n" +
                    "private val interfacedomainapiJson: InterfaceDomainApiDummy_Produtos\n" +
                    ") : InterfaceRepositoryDomainApiDummy_Produtos {\n" +
                    "override suspend fun recuperarUsuarios(): List<Product> {\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            val resposta = interfacedomainapiJson.recuperarUsuarios()\n" +
                    "            if (resposta.isSuccessful && resposta.body() != null) {\n" +
                    "                val resultadoAPIDTO = resposta.body()\n" +
                    "                val listaUsuarios = resultadoAPIDTO?.products\n" +
                    "                if (listaUsuarios != null) {\n" +
                    "                    /*val usuarios = listaUsuarios.map {\n" +
                    "                        usuarioDTO.toUsuario()\n" +
                    "                    }*/\n" +
                    "                    return listaUsuarios.map { it }\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                Log.i(\"lista_usuarios\", resposta.message())\n" +
                    "            }\n" +
                    "\n" +
                    "        } catch (erroRecuperarUsuarios: Exception) {\n" +
                    "            erroRecuperarUsuarios.printStackTrace()\n" +
                    "        }\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Domain /////////////////\n" +
                    "data class EstruturaDeRetornoDomainApiDummy_Produtos(\n" +
                    "val produto : String,\n" +
                    "val descricao: String,\n" +
                    "val preco: Double\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// Repository Domain /////////////////\n" +
                    "interface InterfaceRepositoryDomainApiDummy_Produtos {\n" +
                    "suspend fun recuperarUsuarios() : List<Product>\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Use Case /////////////////\n" +
                    "class GetMotoristaUseCaseDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "    fun recuperarMotorista() {}\n" +
                    "    fun notificarMotorista() {}\n" +
                    "}\n" +
                    "///\n" +
                    "class GetUseCaseDomainApiDummy_Produtos @Inject constructor(\n" +
                    "private val interfaceRepositoryDomain_ApiJson: InterfaceRepositoryDomainApiDummy_Produtos\n" +
                    ") {\n" +
                    "suspend operator fun invoke(): List<Product> {\n" +
                    "return try {\n" +
                    "\n" +
                    "            //Regras de negócios\n" +
                    "            interfaceRepositoryDomain_ApiJson.recuperarUsuarios()\n" +
                    "\n" +
                    "        } catch (erroRecuperarUsuarios: Exception) {\n" +
                    "            erroRecuperarUsuarios.printStackTrace()\n" +
                    "            emptyList()\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View Model /////////////////\n" +
                    "@HiltViewModel\n" +
                    "class ViewModelDomainApiDummy_Produtos @Inject constructor( private val produtosUseCase: GetUseCaseDomainApiDummy_Produtos\n" +
                    ") : ViewModel() {\n" +
                    "\n" +
                    "    //LiveData Privado\n" +
                    "    private val _produtos = MutableLiveData<List<Product>>()\n" +
                    "\n" +
                    "    //LiveData Público\n" +
                    "    val produtos: LiveData<List<Product>>\n" +
                    "        get() = _produtos\n" +
                    "\n" +
                    "    init {\n" +
                    "\n" +
                    "        recuperarProdutos(  )\n" +
                    "    }\n" +
                    "\n" +
                    "    fun recuperarProdutos(  ) {\n" +
                    "\n" +
                    "        viewModelScope.launch {\n" +
                    "            val listaUsuarios = produtosUseCase()\n" +
                    "            _produtos.postValue(listaUsuarios)\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "@AndroidEntryPoint\n" +
                    "class FragmentHiltDomainApiDummy_Produtos : Fragment() , InterfaceCarregando {\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentHiltDomainApiDummyProdutosBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo viewmodel\n" +
                    "    private val viewModelDummyApi: ViewModelDomainApiDummy_Produtos by viewModels()\n" +
                    "    //private val viewModelDummyApi by viewModels<ViewModelDomainApiDummy_Produtos>()\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?,\n" +
                    "        savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentHiltDomainApiDummyProdutosBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo lista onde serao exibido os usuarios\n" +
                    "        fun funcaoRecuperaProdutos() {\n" +
                    "\n" +
                    "            progressBar(true)\n" +
                    "\n" +
                    "            /*viewModelDummyApi = ViewModelProvider(this)[ViewModelDomainApiDummy_Produtos::class.java]*/\n" +
                    "\n" +
                    "            viewModelDummyApi.produtos.observe(viewLifecycleOwner) { listaProdutos ->\n" +
                    "\n" +
                    "                var listaResultado = \"\"\n" +
                    "\n" +
                    "                listaProdutos.forEach { produtos ->\n" +
                    "\n" +
                    "                    val produto = produtos.title\n" +
                    "                    val descricao = produtos.category\n" +
                    "                    val preço = produtos.price\n" +
                    "\n" +
                    "                    listaResultado += \" Produto: \$produto \n Descriçao: \$descricao \n Preço: \$\$preço \n\n\"\n" +
                    "                }\n" +
                    "\n" +
                    "                binding.textView.text = listaResultado\n" +
                    "\n" +
                    "                progressBar(false)\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_HILT_DOMAIN_API_DUMMY_PRODUTOS)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            funcaoRecuperaProdutos()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(Carregando : Boolean ) {\n" +
                    "\n" +
                    "        if (Carregando ) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltCleanDomainProdutosXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_CLEAN_ARCHITECTURE_DOMAIN_API_DUMMY_PRODUTOS_HILT\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltCleanDomainUsuarios(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Api //////////////////\n" +
                    "interface InterfaceDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "    // getUsers()\n" +
                    "    @GET(\"users\")\n" +
                    "    suspend fun recuperarUsuarios(): Response<ResultadoClasseDeDadosDomainApiDummy_Usuarios>\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Model //////////////////\n" +
                    "data class Address(\n" +
                    "val address: String,\n" +
                    "val city: String,\n" +
                    "val coordinates: Coordinates,\n" +
                    "val country: String,\n" +
                    "val postalCode: String,\n" +
                    "val state: String,\n" +
                    "val stateCode: String\n" +
                    ")\n" +
                    "///\n" +
                    "data class Bank(\n" +
                    "val cardExpire: String,\n" +
                    "val cardNumber: String,\n" +
                    "val cardType: String,\n" +
                    "val currency: String,\n" +
                    "val iban: String\n" +
                    ")\n" +
                    "///\n" +
                    "data class ClasseDeDadosDataApiDummy_Domain(\n" +
                    "val address: Address,\n" +
                    "val age: Int,\n" +
                    "val bank: Bank,\n" +
                    "val birthDate: String,\n" +
                    "val bloodGroup: String,\n" +
                    "val company: Company,\n" +
                    "val crypto: Crypto,\n" +
                    "val ein: String,\n" +
                    "val email: String,\n" +
                    "val eyeColor: String,\n" +
                    "val firstName: String,\n" +
                    "val gender: String,\n" +
                    "val hair: Hair,\n" +
                    "val height: Double,\n" +
                    "val id: Int,\n" +
                    "val image: String,\n" +
                    "val ip: String,\n" +
                    "val lastName: String,\n" +
                    "val macAddress: String,\n" +
                    "val maidenName: String,\n" +
                    "val password: String,\n" +
                    "val phone: String,\n" +
                    "val role: String,\n" +
                    "val ssn: String,\n" +
                    "val university: String,\n" +
                    "val userAgent: String,\n" +
                    "val username: String,\n" +
                    "val weight: Double\n" +
                    ")\n" +
                    "\n" +
                    "fun ClasseDeDadosDataApiDummy_Domain.toUsuario() : EstruturaDeRetornoDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "    return EstruturaDeRetornoDomainApiDummy_Usuarios(\n" +
                    "\n" +
                    "        nome = this.firstName,\n" +
                    "        sobrenome = this.lastName,\n" +
                    "        idade = this.age,\n" +
                    "        email = this.email,\n" +
                    "        telefone = this.phone,\n" +
                    "        imagem = this.image,\n" +
                    "    )\n" +
                    "}\n" +
                    "///\n" +
                    "data class Company(\n" +
                    "val address: Address,\n" +
                    "val department: String,\n" +
                    "val name: String,\n" +
                    "val title: String\n" +
                    ")\n" +
                    "///\n" +
                    "data class Coordinates(\n" +
                    "val lat: Double,\n" +
                    "val lng: Double\n" +
                    ")\n" +
                    "///\n" +
                    "data class Crypto(\n" +
                    "val coin: String,\n" +
                    "val network: String,\n" +
                    "val wallet: String\n" +
                    ")\n" +
                    "data class Hair(\n" +
                    "val color: String,\n" +
                    "val type: String\n" +
                    ")\n" +
                    "///\n" +
                    "data class ResultadoClasseDeDadosDomainApiDummy_Usuarios(\n" +
                    "val limit: Int,\n" +
                    "val skip: Int,\n" +
                    "val total: Int,\n" +
                    "val users: List<ClasseDeDadosDataApiDummy_Domain>\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// Repository Model /////////////////\n" +
                    "class InterfaceRepositoryDataImplementacaoDomainApiDummy_Usuarios @Inject constructor(private val interface_DomainApiDummy: InterfaceDomainApiDummy_Usuarios) :\n" +
                    "InterfaceRepositoryDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "    override suspend fun recuperarUsuarios(): List<ClasseDeDadosDataApiDummy_Domain> {\n" +
                    "\n" +
                    "        try {\n" +
                    "\n" +
                    "            val resposta = interface_DomainApiDummy.recuperarUsuarios()\n" +
                    "            if (resposta.isSuccessful && resposta.body() != null) {\n" +
                    "                val resultadoAPIDTO = resposta.body()\n" +
                    "                val listaUsuarios = resultadoAPIDTO?.users\n" +
                    "                if (listaUsuarios != null) {\n" +
                    "                    /*val usuarios = listaUsuarios.map {\n" +
                    "                        usuarioDTO.toUsuario()\n" +
                    "                    }*/\n" +
                    "                    return listaUsuarios.map { it }\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                Log.i(\"lista_usuarios\", resposta.message())\n" +
                    "            }\n" +
                    "\n" +
                    "        } catch (erroRecuperarUsuarios: Exception) {\n" +
                    "            erroRecuperarUsuarios.printStackTrace()\n" +
                    "        }\n" +
                    "        return emptyList()\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Domain Model /////////////////\n" +
                    "data class EstruturaDeRetornoDomainApiDummy_Usuarios(\n" +
                    "val nome: String,\n" +
                    "val sobrenome: String,\n" +
                    "val idade: Int,\n" +
                    "val email: String,\n" +
                    "val telefone: String,\n" +
                    "val imagem: String\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// Repository Domain /////////////////\n" +
                    "interface InterfaceRepositoryDomainApiDummy_Usuarios {\n" +
                    "suspend fun recuperarUsuarios() : List<ClasseDeDadosDataApiDummy_Domain>\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Use Case /////////////////\n" +
                    "class GetUseCaseDomainApiDummy_Usuarios @Inject constructor(\n" +
                    "private val interfacerepository_DomainApiDummy : InterfaceRepositoryDomainApiDummy_Usuarios\n" +
                    ") {\n" +
                    "\n" +
                    "    suspend operator fun invoke(): List<ClasseDeDadosDataApiDummy_Domain> {\n" +
                    "        return try {\n" +
                    "\n" +
                    "            //Regras de negócios\n" +
                    "            interfacerepository_DomainApiDummy.recuperarUsuarios()\n" +
                    "\n" +
                    "        } catch (erroRecuperarUsuarios: Exception) {\n" +
                    "            erroRecuperarUsuarios.printStackTrace()\n" +
                    "            emptyList()\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View Model //////////////////\n" +
                    "@HiltViewModel\n" +
                    "class ViewModelDomainApiDummy_Usuarios @Inject constructor(private val useCase: GetUseCaseDomainApiDummy_Usuarios ) : ViewModel() {\n" +
                    "\n" +
                    "    //LiveData Privado\n" +
                    "    private val _usuarios = MutableLiveData<List<ClasseDeDadosDataApiDummy_Domain>>()\n" +
                    "\n" +
                    "    //LiveData Público\n" +
                    "    val usuarios: LiveData<List<ClasseDeDadosDataApiDummy_Domain>>\n" +
                    "        get() = _usuarios\n" +
                    "\n" +
                    "    init {\n" +
                    "\n" +
                    "        recuperarUsuarios(  )\n" +
                    "    }\n" +
                    "\n" +
                    "    fun recuperarUsuarios(  ) {\n" +
                    "\n" +
                    "\n" +
                    "        viewModelScope.launch {\n" +
                    "            val listaUsuarios = useCase()\n" +
                    "            _usuarios.postValue(listaUsuarios)\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "@AndroidEntryPoint\n" +
                    "class FragmentHiltDomainApiDummy_Usuarios : Fragment(), InterfaceCarregando {\n" +
                    "\n" +
                    "    //todo chamo o binding\n" +
                    "    private var _binding: FragmentHiltDomainApiDummyUsuariosBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    //todo chama o viewmodel\n" +
                    "    private val viewModel: ViewModelDomainApiDummy_Usuarios by viewModels()\n" +
                    "    //private val viewModelDummyApi by viewModels<ViewModel_DummyApi>()\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentHiltDomainApiDummyUsuariosBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo lista onde serao exibido os usuarios\n" +
                    "\n" +
                    "        fun funcaoRecuperaUsuarios(): Unit {\n" +
                    "\n" +
                    "            progressBar(true)\n" +
                    "\n" +
                    "            /*viewModelDummyApi = ViewModelProvider(this)[ViewModel_DummyApi::class.java]*/\n" +
                    "\n" +
                    "            viewModel.usuarios.observe(viewLifecycleOwner) { listaUsuarios ->\n" +
                    "\n" +
                    "                var listaResultado = \"\"\n" +
                    "\n" +
                    "                listaUsuarios.forEach { usuario ->\n" +
                    "\n" +
                    "                    val nome = usuario.username\n" +
                    "                    val sobrenome = usuario.lastName\n" +
                    "                    val idade = usuario.age\n" +
                    "\n" +
                    "                    listaResultado += \" Nome: \$nome \\n Sobre Nome: \$sobrenome \\n idade: \$idade \\n\\n\"\n" +
                    "                }\n" +
                    "\n" +
                    "                binding.textView.text = listaResultado\n" +
                    "\n" +
                    "                progressBar(false)\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_HILT_DOMAIN_API_DUMMY_USUARIOS)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            funcaoRecuperaUsuarios()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun progressBar(Carregando: Boolean) {\n" +
                    "\n" +
                    "        if (Carregando) {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.VISIBLE\n" +
                    "            binding.progressBar2.visibility = View.VISIBLE\n" +
                    "\n" +
                    "        } else {\n" +
                    "\n" +
                    "            binding.progressBar.visibility = View.GONE\n" +
                    "            binding.progressBar2.visibility = View.GONE\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltCleanDomainUsuariosXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_CLEAN_ARCHITECTURE_DOMAIN_API_DUMMY_USUARIOS_HILT\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:layout_marginBottom=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltDependenciasNomeadas(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Classes //////////////////\n" +
                    "class Banda @Inject constructor ( val guitarra : InterfaceInstrumento, val violao : InterfaceInstrumento, val bateria : InterfaceInstrumento ) {\n" +
                    "\n" +
                    "    fun tudoSendoTocado() : String {\n" +
                    "\n" +
                    "        val texto = \"Banda tocando\"\n" +
                    "\n" +
                    "        violao.sendoTocado()\n" +
                    "\n" +
                    "        bateria.sendoTocado()\n" +
                    "\n" +
                    "        guitarra.sendoTocado()\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", \"Banda tocando\")\n" +
                    "\n" +
                    "        return texto\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class Bateria : InterfaceInstrumento {\n" +
                    "\n" +
                    "    override fun sendoTocado() {\n" +
                    "\n" +
                    "        val texto = \"Bateria sendo tocada\"\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class Guitarra : InterfaceInstrumento {\n" +
                    "\n" +
                    "    override fun sendoTocado() {\n" +
                    "\n" +
                    "        val texto = \"Guitarra sendo tocado\"\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "interface InterfaceInstrumento {\n" +
                    "fun sendoTocado()\n" +
                    "}\n" +
                    "///\n" +
                    "class Musico @Inject constructor ( val interfaceInstrumento : InterfaceInstrumento , val context: Context ) {\n" +
                    "\n" +
                    "    fun tocar() : String  {\n" +
                    "\n" +
                    "        val texto = \"Musico tocando\"\n" +
                    "\n" +
                    "        interfaceInstrumento.sendoTocado()\n" +
                    "\n" +
                    "        mensagemToast( \"Musico tocando\" )\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "\n" +
                    "        return texto\n" +
                    "    }\n" +
                    "\n" +
                    "    fun mensagemToast ( mensagem : String )  {\n" +
                    "        //todo exibe a mensagem\n" +
                    "        val toast = Toast.makeText(context, mensagem, Toast.LENGTH_LONG)\n" +
                    "        //todo posicao do  toast\n" +
                    "        toast.setGravity(Gravity.CENTER, 0, 0)\n" +
                    "        //todo Mostra o toast\n" +
                    "        toast.show()\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class Violao : InterfaceInstrumento {\n" +
                    "\n" +
                    "    override fun sendoTocado() {\n" +
                    "\n" +
                    "        val texto = \"Violão sendo tocado\"\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "//todo notacao para o hilt saber que ha uma injecao de dependencia@AndroidEntryPoint\n" +
                    "@AndroidEntryPoint //todo chama o hilt\n" +
                    "class FragmentHiltDependenciasNomeadas : Fragment() {\n" +
                    "\n" +
                    "    //todo instanciando classe  com hilt\n" +
                    "    @Inject //todo notacao hilt de injecao\n" +
                    "    lateinit var musico: Musico\n" +
                    "\n" +
                    "    @Inject //todo notacao hilt de injecao\n" +
                    "    lateinit var banda: Banda\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentHiltDependenciasNomeadasBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentHiltDependenciasNomeadasBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_HILT_DEPENDENCIAS_NOMEADAS)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            binding.textView.setText(\" \${banda.tudoSendoTocado()}\")\n" +
                    "\n" +
                    "            binding.textView2.setText(\" \${musico.tocar()}\")\n" +
                    "\n" +
                    "            binding.textView3.setText(\" \${musico.mensagemToast(variavelMensagens)}\")//chama a fucao mensagemToast\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltDependenciasNomeadasXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "    <!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_DEPENDENCIAS_NOMEADAS\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"61dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView1\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView2\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"61dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView2\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView3\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"61dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView3\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView2\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"98dp\"\n" +
                    "        android:layout_height=\"112dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltInjecao(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Classes //////////////////\n" +
                    "class CarroComConstrutor @Inject constructor ( val interfaceMotor : InterfaceMotor ,  val context: Context)  {//\n" +
                    "\n" +
                    "    fun motoristaAcionaMotor() : String {\n" +
                    "\n" +
                    "        interfaceMotor.acionarMotorPelaInterface()\n" +
                    "\n" +
                    "        mensagemToast( \"Motorista Aciona Motor com construtor Hilt\" )\n" +
                    "\n" +
                    "        var texto = \"Motorista Aciona Motor com construtor Hilt\"\n" +
                    "\n" +
                    "        return texto\n" +
                    "\n" +
                    "    }\n" +
                    "        fun mensagemToast (msg : String )  {\n" +
                    "                //todo exibe a mensagem\n" +
                    "                val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)\n" +
                    "                //todo posicao do  toast\n" +
                    "                toast.setGravity(Gravity.CENTER, 0, 0)\n" +
                    "                //todo Mostra o toast\n" +
                    "                toast.show()\n" +
                    "            }\n" +
                    "}\n" +
                    "///\n" +
                    "class CarroSemConstrutor @Inject constructor ( ) {\n" +
                    "\n" +
                    "    fun motoristaAcionaMotor(): String {\n" +
                    "\n" +
                    "        var motorHyblido = MotorHyblido( \"Suzuki\" )\n" +
                    "\n" +
                    "        motorHyblido.acionarMotorPelaInterface()\n" +
                    "\n" +
                    "        var texto = \"Motorista Aciona Motor sem construtor Hilt\"\n" +
                    "\n" +
                    "        return texto\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "interface InterfaceMotor {\n" +
                    "\n" +
                    "    fun acionarMotorPelaInterface (  )\n" +
                    "}\n" +
                    "///\n" +
                    "class MotorGasolina( val marcaCarroGasolina : String ) : InterfaceMotor {\n" +
                    "\n" +
                    "    override fun acionarMotorPelaInterface() {\n" +
                    "\n" +
                    "        val texto = \"Carro acionado pela Interface \\n com Motor Gasolina com Hilt \\n Marca: \${marcaCarroGasolina}\"\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class MotorHyblido( val marcaCarroHybrido: String ) : InterfaceMotor {\n" +
                    "\n" +
                    "    override fun acionarMotorPelaInterface() {\n" +
                    "\n" +
                    "        val texto = \"Carro acionado pela Interface \\n com Motor Hybrido com Hilt \\n Marca: \${marcaCarroHybrido}\"\n" +
                    "\n" +
                    "        Log.w(\"msg_hilt\", texto)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "//todo notacao para o hilt saber que ha uma injecao de dependencia@AndroidEntryPoint\n" +
                    "@AndroidEntryPoint //todo chama o hilt\n" +
                    "class FragmentHiltInjecao : Fragment() {\n" +
                    "\n" +
                    "    @Inject //todo notacao hilt de injecao\n" +
                    "    lateinit var carroComConstrutor: CarroComConstrutor//todo instanciando classe carro com construtor com hilt\n" +
                    "\n" +
                    "    @Inject //todo notacao hilt de injecao\n" +
                    "    lateinit var carroSemConstrutor: CarroSemConstrutor//todo instanciando classe carro sem construtor com hilt\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentHiltInjecaoBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentHiltInjecaoBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_HILT_INJECAO)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "            mensagemSnackBar(variavelMensagens)\n" +
                    "\n" +
                    "            //todo instancia de carro com construtor\n" +
                    "            binding.textView1.setText(carroComConstrutor.motoristaAcionaMotor())\n" +
                    "\n" +
                    "            //todo instancia de carro sem construtor\n" +
                    "            binding.textView2.setText(carroSemConstrutor.motoristaAcionaMotor())\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltInjecaoXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:id=\"@+id/ConstraintLayout\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "<!--    tools:context=\".Fragment_de_Exemplo\">-->\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_INJECAO_COM_HILT\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView1\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"60dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView2\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"60dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView2\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/textView1\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        style=\"?android:attr/progressBarStyle\"\n" +
                    "        android:layout_width=\"98dp\"\n" +
                    "        android:layout_height=\"112dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Classe //////////////////\n" +
                    "class ClasseImplementacaoHiltSimples @Inject constructor() : InterfaceHiltSimples {//todo esta classe é somente para implementar o metodo da interface\n" +
                    "\n" +
                    "    override fun metodoDaInterfaceHiltSimples(): String {\n" +
                    "\n" +
                    "        var texto = \"Classe injetada no construtor por @Binds com Hilt\"\n" +
                    "\n" +
                    "        return texto\n" +
                    "    }\n" +
                    "}\n" +
                    "///\n" +
                    "class ClasseQueEstaSendoInjetada @Inject constructor(val interfaceHiltSimples: InterfaceHiltSimples) {//todo esta classe sera instanciado dentro da main activity\n" +
                    "\n" +
                    "}\n" +
                    "///\n" +
                    "\n" +
                    "//todo ////////////////// Interface //////////////////\n" +
                    "interface InterfaceHiltSimples {\n" +
                    "\n" +
                    "    fun metodoDaInterfaceHiltSimples(): String\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Modulo /////////////////\n" +
                    "@Module\n" +
                    "@InstallIn(FragmentComponent::class)\n" +
                    "\n" +
                    "abstract class ModuloHiltSimpleBinds_Abstract {\n" +
                    "\n" +
                    "    @Binds//todo esta notacao serve para a utilizacao de interfaces\n" +
                    "    abstract fun bindsInterfaceHiltSimples(classeImplementacaoHiltSimples: ClasseImplementacaoHiltSimples): InterfaceHiltSimples\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "@AndroidEntryPoint\n" +
                    "class FragmentHiltSimples : Fragment() {\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    @Inject //todo instancia da classe Que Esta Sendo Injetada\n" +
                    "    lateinit var classeQueEstaSendoInjetada: ClasseQueEstaSendoInjetada//todo dentro desta classe esta sendo injetada a interface\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentHiltSimplesBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentHiltSimplesBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        //todo instancia de string\n" +
                    "        val variavelMensagens = getString(R.string.NAV_HILT_INJECAO_SIMPLES)\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.btn01.setOnClickListener {\n" +
                    "\n" +
                    "            binding.textView.setText(classeQueEstaSendoInjetada.interfaceHiltSimples.metodoDaInterfaceHiltSimples())\n" +
                    "\n" +
                    "                mensagemToast(variavelMensagens)\n" +
                    "\n" +
                    "                mensagemSnackBar(variavelMensagens)\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btn_01\"\n" +
                    "        style=\"@style/Widget.Material3.Button\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"@string/INT_INJECAO_COM_HILT_SIMPLES\"\n" +
                    "        android:textSize=\"14sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"50dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        android:text=\"TextView\"\n" +
                    "        android:textSize=\"16sp\"\n" +
                    "        android:textStyle=\"bold\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/btn_01\" />\n" +
                    "\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "    <ProgressBar\n" +
                    "        android:id=\"@+id/progressBar\"\n" +
                    "        android:layout_width=\"300dp\"\n" +
                    "        android:layout_height=\"300dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "    <com.google.android.material.progressindicator.CircularProgressIndicator\n" +
                    "        android:id=\"@+id/progressBar2\"\n" +
                    "        style=\"@style/Widget.MaterialComponents.CircularProgressIndicator\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:indeterminate=\"true\"\n" +
                    "        android:indeterminateOnly=\"false\"\n" +
                    "        android:scrollbarSize=\"200dp\"\n" +
                    "        android:visibility=\"gone\"\n" +
                    "        app:indicatorColor=\"@android:color/holo_blue_dark\"\n" +
                    "        app:indicatorSize=\"200dp\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                    "        app:strokeWidth=\"200dp\"\n" +
                    "        app:trackColor=\"@android:color/tertiary_text_dark\"\n" +
                    "        app:trackThickness=\"@dimen/mtrl_progress_circular_radius\" />\n" +
                    "\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun hiltModuloEClasseAplication(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Modulo Api  //////////////////\n" +
                    "@Module\n" +
                    "//@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo\n" +
                    "//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo\n" +
                    "//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo\n" +
                    "@InstallIn(ViewModelComponent::class)// todo este componente estara ativo enquanto o viewmodel estiver ativo\n" +
                    "//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo\n" +
                    "\n" +
                    "object ModuloApi {\n" +
                    "\n" +
                    "    //todo prover retrofit dummy geral\n" +
                    "    @Provides\n" +
                    "    fun proverRetrofitDummy(): Retrofit {\n" +
                    "\n" +
                    "        return Retrofit.Builder().baseUrl(BASE_URL_API_DUMMY) .addConverterFactory(GsonConverterFactory.create()).build()\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover interface api dummy usuarios\n" +
                    "    @Provides\n" +
                    "    fun proverInterfaceApiDummy_Usuarios(retrofit: Retrofit): InterfaceDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "        return retrofit.create(InterfaceDomainApiDummy_Usuarios::class.java)\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover interface api dummy produtos\n" +
                    "    @Provides\n" +
                    "    fun proverInterfaceApiDummy_Produtos(retrofit: Retrofit): InterfaceDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "        return retrofit.create(InterfaceDomainApiDummy_Produtos::class.java)\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover interface repository domain dummy usuarios\n" +
                    "    @Provides\n" +
                    "    fun proverInterfaceRepositoryDomainApiDummy_Usuarios(interfacedomainapidummyUsuarios: InterfaceDomainApiDummy_Usuarios): InterfaceRepositoryDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "        return InterfaceRepositoryDataImplementacaoDomainApiDummy_Usuarios(interfacedomainapidummyUsuarios)\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover interface repository domain Produtos\n" +
                    "    @Provides\n" +
                    "    fun proverInterfaceRepositoryDomainApiDummy_Produtos(interfacedomainapidummyProdutos: InterfaceDomainApiDummy_Produtos): InterfaceRepositoryDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "        return InterfaceRepositoryDataImplementacaoDomainApiDummyApiDummy_Produtos(interfacedomainapidummyProdutos)\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover usecase dummy usuarios\n" +
                    "    @Provides\n" +
                    "    fun proverUseCaseDomainApiDummy_Usuarios(interfacerepositorydomainapidummyUsuarios: InterfaceRepositoryDomainApiDummy_Usuarios): GetUseCaseDomainApiDummy_Usuarios {\n" +
                    "\n" +
                    "        return GetUseCaseDomainApiDummy_Usuarios(interfacerepositorydomainapidummyUsuarios)\n" +
                    "    }\n" +
                    "\n" +
                    "    //todo prover usecase dummy produtos\n" +
                    "    @Provides\n" +
                    "    fun proverUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutos: InterfaceRepositoryDomainApiDummy_Produtos): GetUseCaseDomainApiDummy_Produtos {\n" +
                    "\n" +
                    "        return GetUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutos)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Modulo Carro //////////////////\n" +
                    "@Module\n" +
                    "@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo\n" +
                    "//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo\n" +
                    "//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo\n" +
                    "//@InstallIn( ViewModelComponent::class )// todo este componente estara ativo enquanto o viewmodel estiver ativo\n" +
                    "//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo\n" +
                    "\n" +
                    "object ModuloCarro {\n" +
                    "\n" +
                    "    ///////////////// CLASSE COM E SEM CONTRUTORES /////////////////\n" +
                    "    @Provides\n" +
                    "    fun proveCarroSemConstrutor( ) : CarroSemConstrutor {//todo forma 1 / sem construtor na classe motor / @ApplicationContext recupera o context\n" +
                    "          return CarroSemConstrutor(  )  //todo forma 2 / injetando a dependencia de motor sem construtor\n" +
                    "    }\n" +
                    "\n" +
                    "    @Provides\n" +
                    "    fun proveCarroComConstrutor(interfaceMotor: InterfaceMotor, @ApplicationContext context : Context ) : CarroComConstrutor {//todo forma 1 / sem construtor na classe motor / @ApplicationContext recupera o context\n" +
                    "        return CarroComConstrutor( interfaceMotor , context)  //todo forma 2 / injetando a dependencia de motor com construtor\n" +
                    "    }\n" +
                    "\n" +
                    "    @Provides\n" +
                    "    fun proveMotorHybrido( ) : InterfaceMotor {\n" +
                    "        return MotorHyblido( \"Corolla\" )//todo retorna motor hybrido\n" +
                    "    }\n" +
                    "\n" +
                    "    ///////////////// CLASSE COM DEPENDENCIAS NOMEADAS /////////////////\n" +
                    "    @Provides\n" +
                    "    fun proveMusico(@Named( \"violao\" ) interfaceInstrumento: InterfaceInstrumento, @ApplicationContext context : Context ) : Musico { //todo @Named define qual ,@Provides ira executor\n" +
                    "\n" +
                    "        return Musico( interfaceInstrumento , context )//todo\n" +
                    "    }\n" +
                    "\n" +
                    "    @Provides\n" +
                    "    @Named( \"violao\" )\n" +
                    "    fun proveViolao(  ) : InterfaceInstrumento {//todo\n" +
                    "\n" +
                    "        return Violao(  )//todo\n" +
                    "    }\n" +
                    "\n" +
                    "    @Provides\n" +
                    "    @Named( \"bateria\" )\n" +
                    "    fun proveBateria(  ) : InterfaceInstrumento {//todo\n" +
                    "\n" +
                    "        return Bateria(  )//todo\n" +
                    "    }\n" +
                    "\n" +
                    "@Provides\n" +
                    "@Named( \"guitarra\" )\n" +
                    "fun proveGuitarra(  ) : InterfaceInstrumento {//todo o modulo so utiliza o provides guitarra quando nao esta nomeada no construtor\n" +
                    "\n" +
                    "    return Guitarra(  )//todo\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Modulo Instrumentos /////////////////\n" +
                    "@Module\n" +
                    "@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo\n" +
                    "//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo\n" +
                    "//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo\n" +
                    "//@InstallIn( ViewModelComponent::class )// todo este componente estara ativo enquanto o viewmodel estiver ativo\n" +
                    "//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo\n" +
                    "\n" +
                    "object ModuloInstrumentos {\n" +
                    "\n" +
                    "    @Provides\n" +
                    "    fun proverBanda(@Named(\"violao\") violao : InterfaceInstrumento, @Named(\"bateria\") bateria : InterfaceInstrumento, @Named(\"guitarra\") guitarra : InterfaceInstrumento ) : Banda {\n" +
                    "\n" +
                    "        return Banda( violao, bateria , guitarra )\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Classe de Aplicacao //////////////////\n" +
                    "@HiltAndroidApp\n" +
                    "class ClasseDeAplicacao : Application()\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo*************** SEARCH VIEW *************************

    fun searchViewListView(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentSearchListView() : Fragment() {\n" +
                    "\n" +
                    "    private lateinit var searchView: SearchView\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentSearchListviewBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentSearchListviewBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    private val listaDeElementos = listOf(\n" +
                    "        \"Arquiterura\",\n" +
                    "        \"Abas\",\n" +
                    "        \"Activity\",\n" +
                    "        \"Alarm Manager\",\n" +
                    "        \"Alertas\", \"Api\",\n" +
                    "        \"Banco de Dados\",\n" +
                    "        \"Brodcast Receiver\",\n" +
                    "        \"Componentes de Checagem\",\n" +
                    "        \"Componentes de Listagem\",\n" +
                    "        \"Compose\",\n" +
                    "        \"Coroutine\",\n" +
                    "        \"Fab\",\n" +
                    "        \"Fragmens\",\n" +
                    "        \"Função Lambda\",\n" +
                    "        \"Git\",\n" +
                    "        \"Gps\",\n" +
                    "        \"Hilt\",\n" +
                    "        \"Interface\",\n" +
                    "        \"Menu\",\n" +
                    "        \"Modulo\",\n" +
                    "        \"Permissões\",\n" +
                    "        \"Services\",\n" +
                    "        \"Test\",\n" +
                    "        \"MVC\",\n" +
                    "        \"MVP\",\n" +
                    "        \"MVVM\",\n" +
                    "        \"View Model\",\n" +
                    "        \"LiveData\",\n" +
                    "        \"FireBase\",\n" +
                    "        \"Room\",\n" +
                    "        \"DataBinding\",\n" +
                    "        \"Clean Architecture\",\n" +
                    "        \"Thread\",\n" +
                    "        \"SearchView\",\n" +
                    "        \"ListView\",\n" +
                    "        \"RecyclerView\",\n" +
                    "        \"View Binding\"\n" +
                    "    )\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        val adapterListView by lazy {\n" +
                    "            ArrayAdapter(requireContext(), android.R.layout.simple_gallery_item, listaDeElementos)\n" +
                    "        }\n" +
                    "        binding.listView.adapter = adapterListView\n" +
                    "\n" +
                    "        binding.listView.setOnItemClickListener { parent, view, position, id ->\n" +
                    "            val itemSelecionado = parent.getItemAtPosition(position) as String\n" +
                    "            Toast.makeText(requireContext(), \" \$itemSelecionado\", Toast.LENGTH_SHORT).show()\n" +
                    "\n" +
                    "            if (itemSelecionado == \"Abas\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Activity\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Alarm Manager\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Alertas\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Api\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Arquiterura\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Arquitetura_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Banco de Dados\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Brodcast Receiver\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Componentes de Checagem\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Componentes de Listagem\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Compose\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Coroutine\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Fab\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Fragmens\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Função Lambda\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Git\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Gps\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Hilt\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Hilt_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Interface\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Menu\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Modulo\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Modulo_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Permissões\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Services\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Test\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"MVC\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Mvc)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"MVP\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Mvp_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"MVVM\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Mvvm_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"View Model\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_ViewModel_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"LiveData\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_LiveData_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"FireBase\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Room\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"DataBinding\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_DataBinding_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Clean Architecture\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Clean_Main)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Thread\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"View Binding\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"RecyclerView\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Toast\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"SnackBar\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"ProgressBar\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"ToolBar\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Spinner\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"CheckBox\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"RealmDB\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Switch\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Material Designer\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Navigation Drawer\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Readme\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"SQLite\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "if (itemSelecionado == \"Gradle\") {\n" +
                    "//                findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "\n" +
                    "        }\n" +
                    "        // Configura o SearchView\n" +
                    "        searchView = binding.searchView\n" +
                    "        searchView.queryHint = \"Pesquisar\"\n" +
                    "        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {\n" +
                    "\n" +
                    "            override fun onQueryTextSubmit(query: String?): Boolean {\n" +
                    "                // Aqui você pode executar a ação desejada quando o usuário clica em \"search\"\n" +
                    "                return false\n" +
                    "            }\n" +
                    "\n" +
                    "            override fun onQueryTextChange(caixaDeTexto: String?): Boolean {\n" +
                    "                // Aqui você pode executar a ação desejada quando o texto da pesquisa é alterado\n" +
                    "                adapterListView.filter.filter(caixaDeTexto)\n" +
                    "//                adapter.filter.filter(caixaDeTexto)\n" +
                    "return false\n" +
                    "}\n" +
                    "})\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun searchViewListViewXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <SearchView\n" +
                    "        android:id=\"@+id/searchView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"67dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "    <ListView\n" +
                    "        android:id=\"@+id/listView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        app:layout_constraintBottom_toTopOf=\"@+id/fabXml\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/searchView\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun searchViewRecyclerView(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "\n" +
                    "//todo ////////////////// Adapter //////////////////\n" +
                    "class AdapterSearchRecyclerView (val classeDeDadosSearchRecyclerView : List<ClasseDeDadosSearchRecyclerView>, val interfaceSearchRecyclerView: InterfaceSearchRecyclerView ) : RecyclerView.Adapter<AdapterSearchRecyclerView.ViewHolder>()  , Filterable {\n" +
                    "\n" +
                    "    private var filtro: List<ClasseDeDadosSearchRecyclerView> = classeDeDadosSearchRecyclerView\n" +
                    "\n" +
                    "    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {\n" +
                    "        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_titulos_botoes, parent, false)\n" +
                    "        return ViewHolder(view)\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onBindViewHolder(holder: ViewHolder, position: Int) {\n" +
                    "        holder.bind(filtro [position] , interfaceSearchRecyclerView)\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun getItemCount(): Int {\n" +
                    "        return filtro.size\n" +
                    "    }\n" +
                    "\n" +
                    "class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {\n" +
                    "\n" +
                    "        private val botao: Button = itemView.findViewById(R.id.botao)\n" +
                    "//        private val imageView: ImageView = itemView.findViewById(R.id.imageView)\n" +
                    "\n" +
                    "        fun bind(classeDeDadosSearchRecyclerView: ClasseDeDadosSearchRecyclerView, interfaceSearchRecyclerView: InterfaceSearchRecyclerView ) {\n" +
                    "\n" +
                    "            //Pegando o Context\n" +
                    "            val contexto = botao.context\n" +
                    "\n" +
                    "            botao.text = classeDeDadosSearchRecyclerView.name\n" +
                    "\n" +
                    "//            val imagem = imageView.setImageResource(classeDeDadosSearchRecyclerView.logo)\n" +
                    "\n" +
                    "            botao.setOnClickListener {\n" +
                    "\n" +
                    "                if (classeDeDadosSearchRecyclerView.name == \"Ana\") {\n" +
                    "\n" +
                    "                    interfaceSearchRecyclerView.ANA()\n" +
                    "\n" +
                    "                    Toast.makeText(contexto, \"Nome Ana Clicado\", Toast.LENGTH_SHORT).show()\n" +
                    "                }\n" +
                    "\n" +
                    "                if (classeDeDadosSearchRecyclerView.name  == \"Carlos\") {\n" +
                    "\n" +
                    "                    interfaceSearchRecyclerView.CARLOS()\n" +
                    "\n" +
                    "                    Toast.makeText(contexto, \"Nome Carlos Clicado\", Toast.LENGTH_SHORT).show()\n" +
                    "                }\n" +
                    "\n" +
                    "                if (classeDeDadosSearchRecyclerView.name == \"Maria\") {\n" +
                    "\n" +
                    "                    interfaceSearchRecyclerView.MARIA()\n" +
                    "\n" +
                    "                    Toast.makeText(contexto, \"Nome Maria Clicado\", Toast.LENGTH_SHORT).show()\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun getFilter(): Filter {\n" +
                    "        return object : Filter() {\n" +
                    "            override fun performFiltering(constraint: CharSequence?): FilterResults {\n" +
                    "                val filteredList = mutableListOf<ClasseDeDadosSearchRecyclerView>()\n" +
                    "                if (constraint.isNullOrEmpty()) {\n" +
                    "                    filteredList.addAll(classeDeDadosSearchRecyclerView)\n" +
                    "                } else {\n" +
                    "                    val filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim()\n" +
                    "                    classeDeDadosSearchRecyclerView.forEach {\n" +
                    "                        if (it.name.toLowerCase(Locale.ROOT).contains(filterPattern)) {\n" +
                    "                            filteredList.add(it)\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                val results = FilterResults()\n" +
                    "                results.values = filteredList\n" +
                    "                return results\n" +
                    "            }\n" +
                    "\n" +
                    "            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {\n" +
                    "\n" +
                    "                filtro = results?.values as List<ClasseDeDadosSearchRecyclerView>\n" +
                    "\n" +
                    "                notifyDataSetChanged()\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Interface //////////////////\n" +
                    "interface InterfaceSearchRecyclerView {\n" +
                    "\n" +
                    "    fun ANA()\n" +
                    "    fun CARLOS()\n" +
                    "    fun MARIA()\n" +
                    "}\n" +
                    "\n" +
                    "//todo ////////////////// Model /////////////////\n" +
                    "data class ClasseDeDadosSearchRecyclerView(\n" +
                    "\n" +
                    "    val name: String,     \n" +
                    "    val logo : Int\n" +
                    ")\n" +
                    "\n" +
                    "//todo ////////////////// View //////////////////\n" +
                    "class FragmentSearchRecyclerView() : Fragment() , InterfaceSearchRecyclerView {\n" +
                    "\n" +
                    "    private lateinit var searchView: SearchView\n" +
                    "    private lateinit var recyclerView: RecyclerView\n" +
                    "    private lateinit var adapter: AdapterSearchRecyclerView\n" +
                    "    private lateinit var classeDeDadosSearchRecyclerView: List<ClasseDeDadosSearchRecyclerView>\n" +
                    "\n" +
                    "    //todo instancia de classe onde estao os codigo e xml\n" +
                    "    val dados = modelCodigos()\n" +
                    "\n" +
                    "    //todo binding\n" +
                    "    private var _binding: FragmentSearchRecyclerviewBinding? = null\n" +
                    "    private val binding get() = _binding!!\n" +
                    "\n" +
                    "    override fun onCreateView(\n" +
                    "        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?\n" +
                    "    ): View {\n" +
                    "\n" +
                    "        _binding = FragmentSearchRecyclerviewBinding.inflate(inflater, container, false)\n" +
                    "        return binding.root\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {\n" +
                    "        super.onViewCreated(view, savedInstanceState)\n" +
                    "\n" +
                    "        val listaDeBotoes = listOf(\n" +
                    "            ClasseDeDadosSearchRecyclerView(\"Ana\" , R.drawable.java),\n" +
                    "            ClasseDeDadosSearchRecyclerView(\"Carlos\" , R.drawable.kotlin),\n" +
                    "            ClasseDeDadosSearchRecyclerView(\"Maria\" , R.drawable.python)\n" +
                    "        )\n" +
                    "        // Configura a RecyclerView\n" +
                    "        recyclerView = binding.recyclerview\n" +
                    "        recyclerView.layoutManager = LinearLayoutManager(context)\n" +
                    "        adapter = AdapterSearchRecyclerView(listaDeBotoes , this)\n" +
                    "        recyclerView.adapter = adapter\n" +
                    "\n" +
                    "        // Configura o SearchView\n" +
                    "        searchView = binding.searchView\n" +
                    "        searchView.queryHint = \"Pesquisar\"\n" +
                    "\n" +
                    "        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {\n" +
                    "            override fun onQueryTextSubmit(query: String?): Boolean {\n" +
                    "                return false\n" +
                    "            }\n" +
                    "\n" +
                    "            override fun onQueryTextChange(textoCaixaPesquisa: String?): Boolean {\n" +
                    "                adapter.filter.filter(textoCaixaPesquisa)\n" +
                    "                return false\n" +
                    "            }\n" +
                    "        })\n" +
                    "\n" +
                    "        //todo botoes\n" +
                    "        binding.fabCodigo.setOnClickListener {\n" +
                    "\n" +
                    "            codigo()\n" +
                    "        }\n" +
                    "\n" +
                    "        binding.fabXml.setOnClickListener {\n" +
                    "\n" +
                    "            codigoXml()\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun onDestroyView() {\n" +
                    "        super.onDestroyView()\n" +
                    "        _binding = null\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun ANA() {\n" +
                    "//        findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "}\n" +
                    "\n" +
                    "    override fun CARLOS() {\n" +
                    "//        findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    override fun MARIA() {\n" +
                    "//        findNavController().navigate(R.id.fragment_Codigo)\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigo() {\n" +
                    "\n" +
                    "        val bundle1 = Bundle().apply {\n" +
                    "            putString(\"codigo\", \"\${dados.mvc()}\")\n" +
                    "        }\n" +
                    "\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle1)\n" +
                    "    }\n" +
                    "\n" +
                    "    private fun codigoXml() {\n" +
                    "\n" +
                    "        val bundle2 = bundleOf(\"codigoXml\" to \"\${dados.mvcXml()}\")\n" +
                    "        findNavController().navigate(R.id.fragment_Codigo, bundle2)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun searchViewRecyclerViewXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <SearchView\n" +
                    "        android:id=\"@+id/searchView\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"67dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "\n" +
                    "    <androidx.recyclerview.widget.RecyclerView\n" +
                    "        android:id=\"@+id/recyclerview\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginStart=\"8dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:layout_marginEnd=\"8dp\"\n" +
                    "        app:layout_constraintBottom_toTopOf=\"@+id/fabXml\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toBottomOf=\"@+id/searchView\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabCodigo\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_code_2\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toStartOf=\"@+id/fabXml\" />\n" +
                    "\n" +
                    "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                    "        android:id=\"@+id/fabXml\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"0dp\"\n" +
                    "        android:layout_marginEnd=\"16dp\"\n" +
                    "        android:layout_marginBottom=\"70dp\"\n" +
                    "        android:clickable=\"true\"\n" +
                    "        android:focusable=\"true\"\n" +
                    "        android:src=\"@drawable/ic_xml\"\n" +
                    "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }

    //todo****************************************
    /*
    fun mvvmApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
*/
    //todo****************************************
   /*
    fun mvvmApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
*/
    //todo****************************************
    /*
    fun mvvmApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
*/
    //todo****************************************
  /*
    fun mvvmApi(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmApiXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimples(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
    fun mvvmSimplesXml(): List<String> {
        val lista = listOf(
            //todo **********AQUI PARA CIMA************

            " Copie daqui -> \n\n 👇 \n\n  " +


                    "Codigo_Aqui_dentro" +


                    "\n " +
                    "\n " +
                    "☝️"   +
                    "\n " +
                    "\n " +
                    "Ate Aqui" +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n " +
                    "\n "

            //todo **********AQUI PARA BAIXO************
        )
        return lista
    }
*/
    //todo****************************************

}


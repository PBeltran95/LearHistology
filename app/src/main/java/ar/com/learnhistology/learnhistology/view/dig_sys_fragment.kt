package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.CategoryModel
import ar.com.learnhistology.learnhistology.databinding.FragmentDigSysBinding
import com.google.android.gms.ads.AdRequest

class dig_sys_fragment : Fragment(), OnclickListener {
    companion object {
        const val BUTTON = "button"
    }

    private var _binding:FragmentDigSysBinding? = null
    private val binding get() = _binding!!
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var linearLayoutManager:RecyclerView.LayoutManager
    private lateinit var mGridLayout: GridLayoutManager
    private lateinit var buttonId:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            buttonId = it.getString(BUTTON).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDigSysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initLoadAds()

        when(buttonId){
            "1" -> initEpitelialAdapter()
            "2" -> initFatAdapter()
            "3" -> initDigestiveAdapter()
            "4" -> initRespiratoryAdapter()
            "5" -> initCardioAdapter()
            "6" -> initNervousAdapter()
            "7" -> initLinfaticAdapter()
            "8" -> initEndocrinAdapter()
            "9" -> initBoneAdapter()
            "10" -> initUrinaryAdapter()
            "11" -> initReproductorAdapter()
            "12" -> initMuscleAdapter()
            "13" -> initEyeAdapter()
            "14" -> initTegumentaryAdapter()
        }
        linearLayoutManager = LinearLayoutManager(requireContext())
        mGridLayout = GridLayoutManager(requireContext(), 2)
        binding.rvCategory.apply {
            layoutManager = mGridLayout
            adapter = categoryAdapter
        }
    }


    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }
    fun initEpitelialAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("1", "Epitelio cubico", R.drawable.epiteliocubico),
            CategoryModel("2", "Epitelio cilindrico", R.drawable.cilindric),
            CategoryModel("3", "Epitelio estratificado", R.drawable.estratificado)),this)
    }
    fun initFatAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("4", "Tejido adiposo", R.drawable.fat),
            CategoryModel("5", "Cartilago hialino", R.drawable.hialino),
            CategoryModel("6", "Cartilago Elastico", R.drawable.fibroso),
            CategoryModel("7", "Cartilago elastico", R.drawable.elastico)),this)
    }
    fun initDigestiveAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("8", "Lengua", R.drawable.fat),
            CategoryModel("9", "Glandula parotida", R.drawable.hialino),
            CategoryModel("10", "Glandula submandibular", R.drawable.fibroso),
            CategoryModel("11", "Glandula sublingual", R.drawable.fibroso),
            CategoryModel("12", "Diente y encia", R.drawable.fibroso),
            CategoryModel("13", "Esofago", R.drawable.fibroso),
            CategoryModel("14", "Estomago", R.drawable.fibroso),
            CategoryModel("15", "Duodeno", R.drawable.fibroso),
            CategoryModel("16", "Yeyuno", R.drawable.fibroso),
            CategoryModel("17", "Ileon", R.drawable.fibroso),
            CategoryModel("18", "Colon", R.drawable.fibroso),
            CategoryModel("19", "Apendice", R.drawable.fibroso),
            CategoryModel("20", "Conducto anal", R.drawable.fibroso),
            CategoryModel("21", "Higado", R.drawable.fibroso),
            CategoryModel("22", "Vesicula Biliar", R.drawable.fibroso),
            CategoryModel("23", "Pancreas", R.drawable.elastico)),this)
    }
    fun initRespiratoryAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("24", "Mucosa olfatoria", R.drawable.bulboolfatorio),
            CategoryModel("25", "Laringe", R.drawable.laringe),
            CategoryModel("26", "Traquea", R.drawable.traquea),
            CategoryModel("27", "Bronquio y bronquiolo", R.drawable.bronquio),
            CategoryModel("28", "Bronquiolo terminal y alveolo", R.drawable.alveolo)),this)
    }
    fun initCardioAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("29", "Corazon", R.drawable.cardio),
            CategoryModel("30", "Arterias coronarias", R.drawable.coronarias),
            CategoryModel("31", "Aorta", R.drawable.aorta),
            CategoryModel("32", "Arterias y Venas", R.drawable.arteriasvenas),
            CategoryModel("33", "Arteriolas y linfaticos", R.drawable.linfatic),
            CategoryModel("34", "Conducto toracico", R.drawable.conductotoracico)),this)
    }
    fun initNervousAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("35", "Nervio Periferico", R.drawable._688310),
            CategoryModel("36", "Perineuro", R.drawable.perineuro),
            CategoryModel("37", "Ganglios simpaticos", R.drawable.nervioso),
            CategoryModel("37", "Cerebro", R.drawable.cerebro),
            CategoryModel("37", "Cerebelo", R.drawable.cerebelo),
            CategoryModel("38", "Medula espinal", R.drawable.medulaespinal)),this)
    }
    fun initLinfaticAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("37", "Amigdala palatina", R.drawable.amigdala),
            CategoryModel("38", "Ganglio linfatico", R.drawable.ganglio),
            CategoryModel("39", "Bazo", R.drawable.bazo),
            CategoryModel("40", "Timo", R.drawable.timo)),this)
    }
    fun initEndocrinAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("41", "Hipofisis", R.drawable.hipotalamo),
            CategoryModel("42", "Glandula pineal", R.drawable.pineal),
            CategoryModel("43", "Tiroides", R.drawable.tiroides),
            CategoryModel("44", "Paratiroides", R.drawable.paratiroides),
            CategoryModel("45", "Suprarrenal", R.drawable.suprarrenal)),this)
    }
    fun initBoneAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("46", "Tejido Oseo", R.drawable.images),
            CategoryModel("47", "Osificacion endocondral", R.drawable.endocondral),
            CategoryModel("48", "Osificacion intramembranosa", R.drawable.endocondral),
            CategoryModel("49", "Eritrocitos y granulocitos", R.drawable.eritrocito),
            CategoryModel("50", "Agranulocitos y medula osea", R.drawable.medulaosea),
            CategoryModel("51", "Eritropoyesis y granulopoyesis", R.drawable.eritropoyesis)),this)
    }
    fun initUrinaryAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("52", "Riñon", R.drawable.suprarrenal),
            CategoryModel("53", "Ureter", R.drawable.ureter),
            CategoryModel("54", "Vejiga Urinaria", R.drawable.vejiga),
            CategoryModel("55", "Uretra", R.drawable.uretra)),this)
    }
    fun initReproductorAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("56", "Testiculo", R.drawable.testicuilo),
            CategoryModel("57", "Ovario", R.drawable.ovario),
            CategoryModel("58", "Epididimo y conductillos", R.drawable.epididimo),
            CategoryModel("59", "Cuerpo luteo", R.drawable.cuerpoluteojpg),
            CategoryModel("60", "Cordon espermatico", R.drawable.epididimo),
            CategoryModel("61", "Trompa uterina", R.drawable.trompafalopio),
            CategoryModel("62", "Cuerpo del pene", R.drawable.pene),
            CategoryModel("63", "Placenta", R.drawable.placenta),
            CategoryModel("64", "Prostata", R.drawable.prostata),
            CategoryModel("65", "Cordon umbilical", R.drawable.cordonumbilical),
            CategoryModel("66", "Vesicula seminal", R.drawable.vesiculaseminal),
            CategoryModel("67", "Vagina y vulva", R.drawable.ovario),
            CategoryModel("68", "Pezon", R.drawable.pezon),
            CategoryModel("69", "Glandula mamaria", R.drawable.glandulamamaria)),this)
    }
    fun initMuscleAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("70", "Musculo esqueletico", R.drawable.muscle),
            CategoryModel("71", "Union musculo tendinosa", R.drawable.tendon),
            CategoryModel("72", "Union neuromuscular", R.drawable.unionneuromuscular),
            CategoryModel("73", "Musculo cardiaco", R.drawable.musculocardiaco),
            CategoryModel("74", "Musculo liso", R.drawable.liso)),this)
    }
    fun initEyeAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("75", "Segmento anterior del ojo", R.drawable.eye),
            CategoryModel("76", "Esclera, cornea y cristalino", R.drawable.cornea__cristalino),
            CategoryModel("77", "S. posterior del ojo", R.drawable.posterioreye),
            CategoryModel("78", "Oido", R.drawable.oido),
            CategoryModel("79", "Organo de corti", R.drawable.organ_of_corti)),this)
    }
    fun initTegumentaryAdapter(){
        categoryAdapter = CategoryAdapter(listOf(
            CategoryModel("80", "Piel gruesa", R.drawable.piel_gruesa),
            CategoryModel("81", "Piel fina", R.drawable.pielfina),
            CategoryModel("82", "Glandulas sudoriparas", R.drawable.skin),
            CategoryModel("83", "Glandulas cebaceas", R.drawable.sudoripara),
            CategoryModel("84", "Foliculo piloso y uña", R.drawable.skin)),this)
    }

    override fun onClick(categoryModel: CategoryModel) {
        navigateToHistologyFragment(categoryModel)
    }

    private fun navigateToHistologyFragment(categoryModel: CategoryModel) {
        var button = ""
        when (categoryModel.CategoryName){
            //Epitelio
            "Epitelio cubico" -> button = "1"
            "Epitelio cilindrico" -> button = "2"
            "Epitelio estratificado" -> button = "3"

            //Adiposo y conectivo
            "Tejido adiposo"-> button = "4"
            "Cartilago hialino"-> button = "5"
            "Cartilago Elastico"-> button = "6"
            "Cartilago elastico"-> button = "7"

            //Digestivo
            "Lengua" -> button = "8"
            "Glandula parotida" -> button = "8"
            "Glandula submandibular" -> button = "9"
            "Glandula sublingual" -> button = "10"
            "Diente y encia" -> button = "11"
            "Esofago" -> button = "12"
            "Estomago" -> button = "13"
            "Duodeno" -> button = "14"
            "Yeyuno" -> button = "15"
            "Ileon" -> button = "16"
            "Colon" -> button =  "17"
            "Apendice" -> button = "18"
            "Conducto anal" -> button = "19"
            "Higado" -> button = "20"
            "Vesicula Biliar" -> button = "21"
            "Pancreas" -> button = "22"

            //Respiratorio
            "Mucosa olfatoria"-> button = "23"
            "Laringe"-> button = "24"
            "Traquea"-> button = "25"
            "Bronquio"-> button = "26"
            "Bronquiolo terminal y alveolo"-> button = "27"

            //Cardiovascular
            "Corazon"-> button = "28"
            "Arterias coronarias"-> button = "29"
            "Aorta"-> button = "30"
            "Arterias y Venas"-> button = "31"
            "Arteriolas y linfaticos"-> button = "32"
            "Conducto toracico"-> button = "33"

            //Nervioso
            "Nervio Periferico"-> button = "34"
            "Perineuro"-> button = "35"
            "Ganglios simpaticos"-> button = "36"
            "Cerebro"-> button = "37"
            "Cerebelo"-> button = "38"
            "Medula espinal"-> button = "39"
            //Linfatico
            "Amigdala palatina"-> button = "40"
            "Ganglio linfatico"-> button = "41"
            "Bazo"-> button = "42"
            "Timo"-> button = "43"
            //Endocrino
            "Hipofisis"-> button = "44"
            "Glandula pineal"-> button = "45"
            "Tiroides"-> button = "46"
            "Paratiroides"-> button = "47"
            "Suprarrenal"-> button = "48"

            //Oseo
            "Tejido Oseo"-> button = "49"
            "Osificacion endocondral"-> button = "50"
            "Osificacion intramembranosa"-> button = "51"
            "Eritrocitos y granulocitos"-> button = "52"
            "Agranulocitos y medula osea"-> button = "53"
            "Eritropoyesis y granulopoyesis"-> button = "54"

            //Urinario
            "Riñon"-> button = "55"
            "Ureter"-> button = "56"
            "Vejiga Urinaria"-> button = "57"
            "Uretra"-> button = "58"

            //Reproductor
            "Testiculo"-> button = "59"
            "Ovario"-> button = "60"
            "Epididimo y conductillos"-> button = "61"
            "Cuerpo luteo"-> button = "62"
            "Cordon espermatico"-> button = "63"
            "Trompa uterina"-> button = "64"
            "Cuerpo del pene"-> button = "65"
            "Placenta"-> button = "66"
            "Prostata"-> button = "67"
            "Cordon umbilical"-> button = "68"
            "Vesicula seminal"-> button = "69"
            "Vagina y vulva"-> button = "70"
            "Pezon"-> button = "71"
            "Glandula mamaria"-> button = "72"

            //Muscular
            "Musculo esqueletico"-> button = "73"
            "Union musculo tendinosa"-> button = "74"
            "Union neuromuscular"-> button = "75"
            "Musculo cardiaco"-> button = "76"
            "Musculo liso"-> button = "77"

            //Ojo y oido
            "Segmento anterior del ojo"-> button = "78"
            "Esclera, cornea y cristalino"-> button = "79"
            "S. posterior del ojo"-> button = "80"
            "Oido"-> button = "81"
            "Organo de corti"-> button = "82"

            //Tegumentario
            "Piel gruesa"-> button = "83"
            "Piel fina"-> button = "84"
            "Glandulas sudoriparas"-> button = "85"
            "Glandulas cebaceas"-> button = "86"
            "Foliculo piloso y uña"-> button = "87"
        }
            val buttonText = button
            dig_sys_fragmentDirections.actionDigSysFragmentToHistologicUrinary2(buttonText)
            view?.findNavController()?.navigate(dig_sys_fragmentDirections.actionDigSysFragmentToHistologicUrinary2(buttonText))

    }

}
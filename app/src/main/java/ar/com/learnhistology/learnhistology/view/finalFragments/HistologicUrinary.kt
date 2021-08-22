package ar.com.learnhistology.learnhistology.view.finalFragments

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentHistologicUrinaryBinding
import ar.com.learnhistology.learnhistology.view.finalFragments.respiratory.ImageAdapter
import com.afollestad.viewpagerdots.DotsIndicator
import com.google.android.gms.ads.AdRequest

class HistologicUrinary : Fragment() {

    lateinit var mViewPager: ViewPager


    companion object {
        const val ORGAN = "organ"
    }

    private var _binding: FragmentHistologicUrinaryBinding? = null
    private val binding get() = _binding!!
    private lateinit var organId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            organId = it.getString(ORGAN).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHistologicUrinaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val text1 = getString(R.string.epitelios)
        val text2 = getString(R.string.conectivoLaxo)
        val text3 = getString(R.string.conectivoDenso)
        val text4 = getString(R.string.tejidoAdiposo)
        val text5 = getString(R.string.cartilagoHialino)
        val text6 = getString(R.string.cartilagoFibroso)
        val text7 = getString(R.string.cartilagoElastico)
        when (organId) {
            "1" -> binding.expandTextView.text = text1
            "2" -> binding.expandTextView.text = text2
            "3" -> binding.expandTextView.text = text3
            "4" -> binding.expandTextView.text = text4
            "5" -> binding.expandTextView.text = text5
            "6" -> binding.expandTextView.text = text6
            "7" -> binding.expandTextView.text = text7
            "8" -> binding.expandTextView.setText(text1)
            "9" -> binding.expandTextView.setText(text2)
            "10" -> binding.expandTextView.setText(text3)
            "11" -> binding.expandTextView.setText(text4)
            "12" -> binding.expandTextView.setText(text4)
            "13" -> binding.expandTextView.setText(text4)
            "14" -> binding.expandTextView.setText(text4)
            "15" -> binding.expandTextView.setText(text4)
            "16" -> binding.expandTextView.setText(text4)
            "17" -> binding.expandTextView.setText(text4)
            "18" -> binding.expandTextView.setText(text1)
            "19" -> binding.expandTextView.setText(text2)
            "20" -> binding.expandTextView.setText(text3)
            "21" -> binding.expandTextView.setText(text4)
            "22" -> binding.expandTextView.setText(text4)
            "23" -> binding.expandTextView.setText(text4)
            "24" -> binding.expandTextView.setText(text4)
            "25" -> binding.expandTextView.setText(text4)
            "26" -> binding.expandTextView.setText(text4)
            "27" -> binding.expandTextView.setText(text4)
            "28" -> binding.expandTextView.setText(text1)
            "29" -> binding.expandTextView.setText(text2)
            "30" -> binding.expandTextView.setText(text3)
            "31" -> binding.expandTextView.setText(text4)
            "32" -> binding.expandTextView.setText(text4)
            "33" -> binding.expandTextView.setText(text4)
            "34" -> binding.expandTextView.setText(text4)
            "35" -> binding.expandTextView.setText(text4)
            "36" -> binding.expandTextView.setText(text4)
            "37" -> binding.expandTextView.setText(text4)
            "38" -> binding.expandTextView.setText(text1)
            "39" -> binding.expandTextView.setText(text2)
            "40" -> binding.expandTextView.setText(text3)
            "41" -> binding.expandTextView.setText(text4)
            "42" -> binding.expandTextView.setText(text4)
            "43" -> binding.expandTextView.setText(text4)
            "44" -> binding.expandTextView.setText(text4)
            "45" -> binding.expandTextView.setText(text4)
            "46" -> binding.expandTextView.setText(text4)
            "47" -> binding.expandTextView.setText(text4)
            "48" -> binding.expandTextView.setText(text1)
            "49" -> binding.expandTextView.setText(text2)
            "50" -> binding.expandTextView.setText(text3)
            "51" -> binding.expandTextView.setText(text4)
            "52" -> binding.expandTextView.setText(text4)
            "53" -> binding.expandTextView.setText(text4)
            "54" -> binding.expandTextView.setText(text4)
            "55" -> binding.expandTextView.setText(text4)
            "56" -> binding.expandTextView.setText(text4)
            "57" -> binding.expandTextView.setText(text4)
            "58" -> binding.expandTextView.setText(text1)
            "59" -> binding.expandTextView.setText(text2)
            "60" -> binding.expandTextView.setText(text3)
            "61" -> binding.expandTextView.setText(text4)
            "62" -> binding.expandTextView.setText(text4)
            "63" -> binding.expandTextView.setText(text4)
            "64" -> binding.expandTextView.setText(text4)
            "65" -> binding.expandTextView.setText(text4)
            "66" -> binding.expandTextView.setText(text4)
            "67" -> binding.expandTextView.setText(text4)
            "68" -> binding.expandTextView.setText(text1)
            "69" -> binding.expandTextView.setText(text2)
            "70" -> binding.expandTextView.setText(text3)
            "71" -> binding.expandTextView.setText(text4)
            "72" -> binding.expandTextView.setText(text4)
            "73" -> binding.expandTextView.setText(text4)
            "74" -> binding.expandTextView.setText(text4)
            "75" -> binding.expandTextView.setText(text4)
            "76" -> binding.expandTextView.setText(text4)
            "77" -> binding.expandTextView.setText(text4)
            "78" -> binding.expandTextView.setText(text1)
            "79" -> binding.expandTextView.setText(text2)
            "80" -> binding.expandTextView.setText(text3)
            "81" -> binding.expandTextView.setText(text4)
            "82" -> binding.expandTextView.setText(text4)
            "83" -> binding.expandTextView.setText(text4)
            "84" -> binding.expandTextView.setText(text4)
            "85" -> binding.expandTextView.setText(text4)
            "86" -> binding.expandTextView.setText(text4)
            "87" -> binding.expandTextView.setText(text4)
        }
        var images= arrayOf(R.drawable.epitelio, R.drawable.urinary, R.drawable.endocrin)
        when (organId) {
            //Primer seccion
            "1" -> images = arrayOf(R.drawable.epplano1, R.drawable.epcilindrico2, R.drawable.epestratificado3)
            "2" -> images = arrayOf(R.drawable.conjuntivo_laxo_irregular, R.drawable.conectivo_fibras_elasticas_colageno)
            "3" -> images = arrayOf(R.drawable.conectivo_denso_regular, R.drawable.conectivo_denso_irregular)
            //Adiposo y cartilago
            "4" -> images = arrayOf(R.drawable.adipocitos, R.drawable.adipocitos2)
            "5" -> images = arrayOf(R.drawable.cartilago_hialino,R.drawable.cartilago_hialino2)
            "6" -> images = arrayOf(R.drawable.fibrocartilago1, R.drawable.fibrocartilago2)
            "7" -> images = arrayOf(R.drawable.cartilago_elastico)
            //Digestivo
            "8" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "9" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "10" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "11" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "12" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "13" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "14" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "15" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "16" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "17" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "18" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "19" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "20" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "21" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "22" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "23" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //Respiratorio
            "24" -> images = arrayOf(R.drawable.mucosa_olfatoria, R.drawable.mucosa_olfatoria_2)
            "25" -> images = arrayOf(R.drawable.laringe_epiglotis, R.drawable.laringe_epiglotis_2,
                R.drawable.laringe_vestibulo, R.drawable.laringe_vestibulo_2, R.drawable.laringe_cuerdas_volcales_1,
                R.drawable.laringe_cuerdas_vocales_2)

            "26" -> images = arrayOf(R.drawable.traquea_1, R.drawable.traquea_2)
            "27" -> images = arrayOf(R.drawable.bronquio_1, R.drawable.bronquio_2, R.drawable.bronquio_3,
                R.drawable.bronquiolo, R.drawable.bronquiolo_2)

            "28" -> images = arrayOf(R.drawable.bronquiolo_respiratorio, R.drawable.bronquiolo_respiratorio_2, R.drawable.alveolo_1)
            //Cardiaco
            "29" -> images = arrayOf(R.drawable.corazon_epicaridio_1, R.drawable.coraon_epicardio_2,
                R.drawable.corazon_miocardio, R.drawable.corazon_miocardio_2, R.drawable.corazon_endocardio_1,
                R.drawable.corazon_endocardio_2)

            "30" -> images = arrayOf(R.drawable.arteria_coronaria)
            "31" -> images = arrayOf(R.drawable.aorta_, R.drawable.aorta_2, R.drawable.aorta_3_endotelio,
                R.drawable.aorta_4_adventicia)
            "32" -> images = arrayOf(R.drawable.arteria_elastica, R.drawable.arteria_muscular,
                R.drawable.capilar, R.drawable.vena)
            "33" -> images = arrayOf(R.drawable.arteriola_1, R.drawable.arteriola_linfatico)
            "34" -> images = arrayOf(R.drawable.conducto_toracico)
            //Nervioso
            "35" -> images = arrayOf(R.drawable.nervio_periferico)
            "36" -> images = arrayOf(R.drawable.perineuro_1)
            "37" -> images = arrayOf(R.drawable.ganglio_simpatico, R.drawable.ganglio_simpatico_2)
            "38" -> images = arrayOf(R.drawable.cerebro_1, R.drawable.cerebro_2, R.drawable.cerebro_3, R.drawable.cerebro_4)
            "39" -> images = arrayOf(R.drawable.cerebelo_1, R.drawable.cerebelo_2)
            "40" -> images = arrayOf(R.drawable.medula_espinal, R.drawable.medula_espinal2,
                R.drawable.medula_espinal_3, R.drawable.medula_espinal_4)
            //Linfatico
            "41" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "42" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "43" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "44" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //endocrino
            "45" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "46" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "47" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "48" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "49" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //sistemaOseo
            "50" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "51" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "52" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "53" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "54" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "55" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //urinario
            "56" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "57" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "58" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "59" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //reproductor
            "60" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "61" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "62" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "63" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "64" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "65" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "66" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "67" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "68" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "69" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "70" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "71" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "72" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "73" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //muscular
            "74" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "75" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "76" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "77" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "78" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //EyeandEar
            "79" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "80" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "81" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "82" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "83" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            //tegumentario
            "84" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "85" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "86" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "87" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "88" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
        }


//Declaracion de viewPagerBinding y su adaptador, tambien le envie el contexto porque lo necesita.
        mViewPager = binding.viewPager

        val mImageAdapter = ImageAdapter(requireContext(), images)

        mViewPager.adapter = mImageAdapter

//Aca se configuran y se condicionan de que color van los puntos del viewPager
        val dots: DotsIndicator = binding.dots
        dots.attachViewPager(mViewPager)
        val mode = context?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)
        when (mode) {
            Configuration.UI_MODE_NIGHT_YES -> {
                dots.setDotTintRes(R.color.white)
            }
            Configuration.UI_MODE_NIGHT_NO -> {
                dots.setDotTintRes(R.color.black)
            }
        }
        initLoadAds()
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }
}
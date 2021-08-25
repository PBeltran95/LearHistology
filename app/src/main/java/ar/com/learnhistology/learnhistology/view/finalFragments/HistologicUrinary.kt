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
            "8" -> images = arrayOf(R.drawable.lengua_1, R.drawable.lengua_2, R.drawable.lengua_3, R.drawable.lengua_4)
            "9" -> images = arrayOf(R.drawable.glandulaparotida, R.drawable.glandulaparotida2)
            "10" -> images = arrayOf(R.drawable.glandulasubmandibular, R.drawable.glandulasubmandibular2)
            "11" -> images = arrayOf(R.drawable.glandula_sublingual_1, R.drawable.glandula_sublingual2)
            "12" -> images = arrayOf(R.drawable.diente, R.drawable.encia)
            "13" -> images = arrayOf(R.drawable.esofago_1, R.drawable.esofago_2)
            "14" -> images = arrayOf(R.drawable.estomago_1, R.drawable.estomago_2, R.drawable.estomago_3_pilorico,
                R.drawable.estomago_5_fundus, R.drawable.estomago_6_epitelio_superficial,
                R.drawable.estomago_7_glandulas_fundicas, R.drawable.estomago_glandula)
            "15" -> images = arrayOf(R.drawable.duodeno_1, R.drawable.duodeno_2, R.drawable.duodeno_3, R.drawable.duodeno_4)
            "16" -> images = arrayOf(R.drawable.yeyuna_1)
            "17" -> images = arrayOf(R.drawable.ileon_1, R.drawable.ileon_2)
            "18" -> images = arrayOf(R.drawable.colon_1, R.drawable.colon_2, R.drawable.colon_3)
            "19" -> images = arrayOf(R.drawable.apendice_1, R.drawable.apendice_2, R.drawable.apendice_3)
            "20" -> images = arrayOf(R.drawable.canal_anal_1, R.drawable.canal_anal_2, R.drawable.canal_anal_3)
            "21" -> images = arrayOf(R.drawable.higado_1, R.drawable.higado_2, R.drawable.higado_3)
            "22" -> images = arrayOf(R.drawable.vesicula_1, R.drawable.vesicula_biliar_2, R.drawable.vesicula_biliar_3)
            "23" -> images = arrayOf(R.drawable.pancreas_exocrino_1, R.drawable.pancreas_exocrino_2, R.drawable.pancreas_endocrino_3, R.drawable.pancreas_endocrino_4)
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
            "41" -> images = arrayOf(R.drawable.amigdala_palatina)
            "42" -> images = arrayOf(R.drawable.ganglio_linfatico, R.drawable.ganglio_linfatico_2, R.drawable.ganglio_linfatico_3)
            "43" -> images = arrayOf(R.drawable.bazo_capsula_1, R.drawable.bazo_capsula_2,
                R.drawable.bazo_pulpa_blanca_3, R.drawable.bazo_pulpa_blanca_4, R.drawable.bazo_pulpa_blanca_5,
                R.drawable.bazo_6, R.drawable.bazo_7, R.drawable.bazo_8)
            "44" -> images = arrayOf(R.drawable.timo_1, R.drawable.timo_2, R.drawable.timo_3)
            //endocrino
            "45" -> images = arrayOf(R.drawable.hipofisis_1, R.drawable.adenohipofisis, R.drawable.neurohipofisis)
            "46" -> images = arrayOf(R.drawable.glandula_pineal)
            "47" -> images = arrayOf(R.drawable.tiroides_1, R.drawable.tiroides_2)
            "48" -> images = arrayOf(R.drawable.paratiroides_1, R.drawable.paratiroides_2)
            "49" -> images = arrayOf(R.drawable.glandula_suprarrenal_1, R.drawable.glandula_suprarrenal_2,
                R.drawable.glandula_suprarrenal_3, R.drawable.glandula_suprarrenal_4, R.drawable.glandula_suprarrenal_5)
            //sistemaOseo
            "50" -> images = arrayOf(R.drawable.tejido_oseo_1, R.drawable.tejido_ose_2,
                R.drawable.tejido_oseo_3, R.drawable.tejido_oseo_4, R.drawable.tejido_oseo_5, R.drawable.tejido_oseo_6)
            "51" -> images = arrayOf(R.drawable.osificacion_endocondral_1)
            "52" -> images = arrayOf(R.drawable.osificacion_intramembranosa)
            "53" -> images = arrayOf(R.drawable.eritrocitos_1, R.drawable.eritrocitos_2, R.drawable.eritrocitos_3)
            "54" -> images = arrayOf(R.drawable.agranulocitos_1, R.drawable.medula_osea_1)
            "55" -> images = arrayOf(R.drawable.eritropoyesis_1, R.drawable.eritropoyesis_2, R.drawable.eritropoyesis_3,
                R.drawable.eritropoyesis_4, R.drawable.eritropoyesis_5, R.drawable.eritropoyesis_6,
                R.drawable.grannulopoyesis_cadena_neutrofila, R.drawable.grannulopoyesis_cadena_neutrofila_2,
                R.drawable.grannulopoyesis_cadena_1, R.drawable.granulopoyesis_cadena_2, R.drawable.granulopoyesis_1)
            //urinario
            "56" -> images = arrayOf(R.drawable.renal_1, R.drawable.renal_2, R.drawable.renal_3,
                R.drawable.renal_4, R.drawable.renal_5, R.drawable.renal_6,R.drawable.renal_7,
                R.drawable.renal_8, R.drawable.renal_9, R.drawable.renal_10)
            "57" -> images = arrayOf(R.drawable.ureter_1, R.drawable.ureter_2, R.drawable.ureter_3)
            "58" -> images = arrayOf(R.drawable.vejiga_1, R.drawable.vejiga_2, R.drawable.vejiga_3)
            "59" -> images = arrayOf(R.drawable.uretra_1, R.drawable.uretra_2)
            //reproductor
            "60" -> images = arrayOf(R.drawable.testiculo_1, R.drawable.testiculo_2, R.drawable.testiculo_3,
                R.drawable.testiculo_4, R.drawable.testiculo_5, R.drawable.testiculo_6, R.drawable.testiculo_7)
            "61" -> images = arrayOf(R.drawable.ovario_1, R.drawable.ovario_2, R.drawable.ovario_3,
                R.drawable.ovario_4, R.drawable.ovario_5)
            "62" -> images = arrayOf(R.drawable.epididimo_1, R.drawable.epididimo_2, R.drawable.epididimo_3,
                R.drawable.epididimo_4, R.drawable.epididimo_5, R.drawable.epididimo_6,)
            "63" -> images = arrayOf(R.drawable.luteo_1_, R.drawable.luteo_2,
                R.drawable.luteo_3, R.drawable.luteo_4, R.drawable.luteo_5,)
            "64" -> images = arrayOf(R.drawable.deferente_1, R.drawable.deferente_2, R.drawable.deferente_3)
            "65" -> images = arrayOf(R.drawable.trompa_uterina_1, R.drawable.trompa_uterina_2, R.drawable.trompa_uterina_3,
                R.drawable.trompa_uterina_4, R.drawable.trompa_uterina_5, R.drawable.trompa_uterina_6 )
            "66" -> images = arrayOf(R.drawable.pene_1, R.drawable.pene_2, R.drawable.pene_3)
            "67" -> images = arrayOf(R.drawable.placenta_1, R.drawable.placenta_2)
            "68" -> images = arrayOf(R.drawable.prostata_1, R.drawable.prostata_2, R.drawable.prostata_3)
            "69" -> images = arrayOf(R.drawable.cordon_1, R.drawable.cordon_2, R.drawable.cordon_3)
            "70" -> images = arrayOf(R.drawable.seminal_1, R.drawable.seminal_2, R.drawable.seminal_3)
            "71" -> images = arrayOf(R.drawable.utero_1, R.drawable.utero_2, R.drawable.utero_3,
                R.drawable.utero_4, R.drawable.utero_5, R.drawable.utero_6)
            "72" -> images = arrayOf(R.drawable.utero_7, R.drawable.utero_8, R.drawable.utero_9, R.drawable.utero_10, R.drawable.utero_11,
                R.drawable.utero_12, R.drawable.utero_13, R.drawable.utero_14)//utero
            "73" -> images = arrayOf(R.drawable.mamaria_1, R.drawable.mamaria_2, R.drawable.mamaria_3,
                R.drawable.mamaria_4, R.drawable.mamaria_5, R.drawable.mamaria_6, R.drawable.mamaria_7)
            //muscular
            "74" -> images = arrayOf(R.drawable.celula_muscular_estriada_1, R.drawable.celula_muscular_estriada_2)
            "75" -> images = arrayOf(R.drawable.tendon_1)
            "76" -> images = arrayOf(R.drawable.placa_neuromuscular_1)
            "77" -> images = arrayOf(R.drawable.musculo_cardiaco, R.drawable.musculo_cardiaco_2)
            "78" -> images = arrayOf(R.drawable.musculo_liso)
            //EyeandEar
            "79" -> images = arrayOf(R.drawable.ojo_1, R.drawable.segmento_anterior_1, R.drawable.segmento_anterior_2)
            "80" -> images = arrayOf(R.drawable.esclera_1, R.drawable.esclera_2, R.drawable.cristalino_1,
                R.drawable.cornea_1, R.drawable.cornea_2, )
            "81" -> images = arrayOf(R.drawable.segmento_posterior_1, R.drawable.segmento_posterior_2)
            "82" -> images = arrayOf(R.drawable.oido_1, R.drawable.oido_2, R.drawable.oido_3)
            "83" -> images = arrayOf(R.drawable.organo_corti_1, R.drawable.organo_corti_2, R.drawable.organo_corti_3)
            //tegumentario
            "84" -> images = arrayOf(R.drawable.piel_gruesa_1, R.drawable.piel_gruesa_2)
            "85" -> images = arrayOf(R.drawable.piel_fina_epidermis_1, R.drawable.piel_fina_epidermis_2,
                R.drawable.piel_fina_dermis_3, R.drawable.piel_fina_dermis_4)
            "86" -> images = arrayOf(R.drawable.glandula_sudoripara_1, R.drawable.glandula_sudoripara_2, R.drawable.glandula_sudoripara_3)
            "87" -> images = arrayOf(R.drawable.glandula_cebacea_1, R.drawable.glandula_cebacea_2)
            "88" -> images = arrayOf(R.drawable.foliculo_piloso_1, R.drawable.foliculo_piloso_2, R.drawable.unia_1)
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
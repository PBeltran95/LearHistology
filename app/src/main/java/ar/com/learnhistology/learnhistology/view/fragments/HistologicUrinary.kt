package ar.com.learnhistology.learnhistology.view.fragments

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentHistologicUrinaryBinding
import ar.com.learnhistology.learnhistology.view.adapters.ImageAdapter
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

        val text8 = getString(R.string.lengua)
        val text9 = getString(R.string.glandulas_salivales)
        val text10 = getString(R.string.glandulas_salivales)
        val text11 = getString(R.string.glandulas_salivales)
        val text12 = getString(R.string.diente)
        val text13 = getString(R.string.esofago)
        val text14 = getString(R.string.estomago)
        val text15 = getString(R.string.duodeno)
        val text16 = getString(R.string.yeyuno)
        val text17 = getString(R.string.ileon)
        val text18 = getString(R.string.colon)
        val text19 = getString(R.string.apendice)
        val text20 = getString(R.string.cond_anal)
        val text21 = getString(R.string.higado)
        val text22 = getString(R.string.vesicula_biliar)
        val text23 = getString(R.string.pancreas)
        val text24 = getString(R.string.mucosa_olfatoria)
        val text25 = getString(R.string.laringe)
        val text26 = getString(R.string.traquea)
        val text27 = getString(R.string.bronquio_bronquiolo)
        val text28 = getString(R.string.alveolo)
        val text29 = getString(R.string.corazon)
        val text30 = getString(R.string.coronaria)
        val text31 = getString(R.string.aorta)
        val text32 = getString(R.string.arterias_venas)
        val text33 = getString(R.string.linfaticos)
        val text34 = getString(R.string.conducto_toracico)
        val text35 = getString(R.string.nervio_periferico)
        val text36 = getString(R.string.perineuro)
        val text37 = getString(R.string.ganglios_simpaticos)
        val text38 = getString(R.string.cerebro)
        val text39 = getString(R.string.cerebelo)
        val text40 = getString(R.string.medula_espinal)
        val text41 = getString(R.string.amigdala_palatina)
        val text42 = getString(R.string.ganglio_linfatico)
        val text43 = getString(R.string.bazo)
        val text44 = getString(R.string.timo)
        val text45 = getString(R.string.hipofisis)
        val text46 = getString(R.string.glandula_pineal)
        val text47 = getString(R.string.tiroides)
        val text48 = getString(R.string.paratiroides)
        val text49 = getString(R.string.suprarrenal)

        val text50 = getString(R.string.tejido_oseo)
        val text51 = getString(R.string.osificacion_endocondral)
        val text52 = getString(R.string.osificacion_intramembranosoa)
        val text53 = getString(R.string.eritrocitos_granulocitos)
        val text54 = getString(R.string.agranulocitos_medula_osea)
        val text55 = getString(R.string.eritropoyesis_granulopoyesis)

        val text56 = getString(R.string.kidney)
        val text57 = getString(R.string.ureter)
        val text58 = getString(R.string.vejiga)
        val text59 = getString(R.string.uretra)

        val text60 = getString(R.string.testiculo)
        val text61 = getString(R.string.ovario)
        val text62 = getString(R.string.epididimo)
        val text63 = getString(R.string.cuerpo_luteo)
        val text64 = getString(R.string.conducto_deferente)
        val text65 = getString(R.string.trompa_uterina)
        val text66 = getString(R.string.cuerpo_del_pene)
        val text67 = getString(R.string.placenta)
        val text68 = getString(R.string.prostata)
        val text69 = getString(R.string.cordon_umbilical)
        val text70 = getString(R.string.vesiculas_seminales)
        val text71 = getString(R.string.utero1)
        val text72 = getString(R.string.utero2)
        val text73 = getString(R.string.glandula_mamaria)

        val text74 = getString(R.string.musculo_esqueletico)
        val text75 = getString(R.string.union_musculo_tendinosa)
        val text76 = getString(R.string.union_neuromuscular)
        val text77 = getString(R.string.musculo_cardiaco)
        val text78 = getString(R.string.musculo_liso)

        val text79 = getString(R.string.anterior_ojo)
        val text80 = getString(R.string.esclera_cornea_cristalino)
        val text81 = getString(R.string.posterior_del_ojo)
        val text82 = getString(R.string.oido)
        val text83 = getString(R.string.organo_corti)
        val text84 = getString(R.string.piel_gruesa)
        val text85 = getString(R.string.piel_fina)
        val text86 = getString(R.string.sudoriparas)
        val text87 = getString(R.string.cebaceas)
        val text88 = getString(R.string.foliculo_piloso)
        when (organId) {
            "1" -> binding.expandTextView.text = text1
            "2" -> binding.expandTextView.text = text2
            "3" -> binding.expandTextView.text = text3
            "4" -> binding.expandTextView.text = text4
            "5" -> binding.expandTextView.text = text5
            "6" -> binding.expandTextView.text = text6
            "7" -> binding.expandTextView.text = text7
            "8" -> binding.expandTextView.text = text8
            "9" -> binding.expandTextView.text = text9
            "10" -> binding.expandTextView.text = text10
            "11" -> binding.expandTextView.text = text11
            "12" -> binding.expandTextView.text = text12
            "13" -> binding.expandTextView.text = text13
            "14" -> binding.expandTextView.text = text14
            "15" -> binding.expandTextView.text = text15
            "16" -> binding.expandTextView.text = text16
            "17" -> binding.expandTextView.text = text17
            "18" -> binding.expandTextView.text = text18
            "19" -> binding.expandTextView.text = text19
            "20" -> binding.expandTextView.text = text20
            "21" -> binding.expandTextView.text = text21
            "22" -> binding.expandTextView.text = text22
            "23" -> binding.expandTextView.text = text23
            "24" -> binding.expandTextView.text = text24
            "25" -> binding.expandTextView.text = text25
            "26" -> binding.expandTextView.text = text26
            "27" -> binding.expandTextView.text = text27
            "28" -> binding.expandTextView.text = text28
            "29" -> binding.expandTextView.text = text29
            "30" -> binding.expandTextView.text = text30
            "31" -> binding.expandTextView.text = text31
            "32" -> binding.expandTextView.text = text32
            "33" -> binding.expandTextView.text = text33
            "34" -> binding.expandTextView.text = text34
            "35" -> binding.expandTextView.text = text35
            "36" -> binding.expandTextView.text = text36
            "37" -> binding.expandTextView.text = text37
            "38" -> binding.expandTextView.text = text38
            "39" -> binding.expandTextView.text = text39
            "40" -> binding.expandTextView.text = text40
            "41" -> binding.expandTextView.text = text41
            "42" -> binding.expandTextView.text = text42
            "43" -> binding.expandTextView.text = text43
            "44" -> binding.expandTextView.text = text44
            "45" -> binding.expandTextView.text = text45
            "46" -> binding.expandTextView.text = text46
            "47" -> binding.expandTextView.text = text47
            "48" -> binding.expandTextView.text = text48
            "49" -> binding.expandTextView.text = text49
            "50" -> binding.expandTextView.text = text50
            "51" -> binding.expandTextView.text = text51
            "52" -> binding.expandTextView.text = text52
            "53" -> binding.expandTextView.text = text53
            "54" -> binding.expandTextView.text = text54
            "55" -> binding.expandTextView.text = text55
            "56" -> binding.expandTextView.text = text56
            "57" -> binding.expandTextView.text = text57
            "58" -> binding.expandTextView.text = text58
            "59" -> binding.expandTextView.text = text59
            "60" -> binding.expandTextView.text = text60
            "61" -> binding.expandTextView.text = text61
            "62" -> binding.expandTextView.text = text62
            "63" -> binding.expandTextView.text = text63
            "64" -> binding.expandTextView.text = text64
            "65" -> binding.expandTextView.text = text65
            "66" -> binding.expandTextView.text = text66
            "67" -> binding.expandTextView.text = text67
            "68" -> binding.expandTextView.text = text68
            "69" -> binding.expandTextView.text = text69
            "70" -> binding.expandTextView.text = text70
            "71" -> binding.expandTextView.text = text71
            "72" -> binding.expandTextView.text = text72
            "73" -> binding.expandTextView.text = text73
            "74" -> binding.expandTextView.text = text74
            "75" -> binding.expandTextView.text = text75
            "76" -> binding.expandTextView.text = text76
            "77" -> binding.expandTextView.text = text77
            "78" -> binding.expandTextView.text = text78
            "79" -> binding.expandTextView.text = text79
            "80" -> binding.expandTextView.text = text80
            "81" -> binding.expandTextView.text = text81
            "82" -> binding.expandTextView.text = text82
            "83" -> binding.expandTextView.text = text83
            "84" -> binding.expandTextView.text = text84
            "85" -> binding.expandTextView.text = text85
            "86" -> binding.expandTextView.text = text86
            "87" -> binding.expandTextView.text = text87
            "88" -> binding.expandTextView.text = text88
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
            "8" -> images = arrayOf(R.drawable.papilas,R.drawable.lengua_1, R.drawable.lengua_2, R.drawable.lengua_3, R.drawable.lengua_4)
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
        when (context?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)) {
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
    }

}
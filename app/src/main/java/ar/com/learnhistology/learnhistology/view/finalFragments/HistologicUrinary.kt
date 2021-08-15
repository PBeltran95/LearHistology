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
        val text1 = getString(R.string.example)
        val text2 = getString(R.string.laringeExample)
        val text3 = getString(R.string.traquea)
        val text4 = getString(R.string.Bronquio)
        when (organId) {
            "1" -> binding.expandTextView.setText(text1)
            "2" -> binding.expandTextView.setText(text2)
            "3" -> binding.expandTextView.setText(text3)
            "4" -> binding.expandTextView.setText(text4)
            "5" -> binding.expandTextView.setText(text4)
            "6" -> binding.expandTextView.setText(text4)
            "7" -> binding.expandTextView.setText(text4)
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
            "Epitelio cubico" -> images = arrayOf(R.drawable.epitelio, R.drawable.urinary, R.drawable.endocrin)
            "Epitelio cilindrico" -> images = arrayOf(R.drawable.alveolo, R.drawable.cardio, R.drawable.digestivo)
            "Epitelio estratificado" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "Tejido adiposo" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "Cartilago hialino" -> images = arrayOf(R.drawable.alveolo, R.drawable.cardio, R.drawable.digestivo)
            "Cartilago Elastico" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "Cartilago elastico" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)

            "1" -> images = arrayOf(R.drawable.epitelio, R.drawable.urinary, R.drawable.endocrin)
            "2" -> images = arrayOf(R.drawable.alveolo, R.drawable.cardio, R.drawable.digestivo)
            "3" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "4" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "5" -> images = arrayOf(R.drawable.alveolo, R.drawable.cardio, R.drawable.digestivo)
            "6" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "7" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
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
            "24" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "25" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "26" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "27" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "28" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "29" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "30" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "31" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "32" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "33" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "34" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "35" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "36" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "37" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "38" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "39" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "40" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "41" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "42" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "43" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "44" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "45" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "46" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "47" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "48" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "49" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "50" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "51" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "52" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "53" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "54" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "55" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "56" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "57" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "58" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "59" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
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
            "74" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "75" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "76" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "77" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "78" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "79" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "80" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "81" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "82" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "83" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "84" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "85" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "86" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "87" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
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
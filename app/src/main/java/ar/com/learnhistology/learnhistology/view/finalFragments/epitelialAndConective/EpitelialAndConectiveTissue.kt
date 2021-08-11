package ar.com.learnhistology.learnhistology.view.finalFragments.epitelialAndConective

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentHistologicEpiteliumConectiveTissueBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentHistologicRespiratoryBinding
import ar.com.learnhistology.learnhistology.view.finalFragments.respiratory.ImageAdapter
import com.afollestad.viewpagerdots.DotsIndicator

class EpitelialAndConectiveTissue : Fragment() {

    lateinit var mViewPager: ViewPager


    companion object {
        const val ORGAN = "organ"
    }

    private var _binding: FragmentHistologicEpiteliumConectiveTissueBinding? = null
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
        _binding = FragmentHistologicEpiteliumConectiveTissueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val text1 = getString(R.string.example)
        val text2 = getString(R.string.laringeExample)
        val text3 = getString(R.string.traquea)
        val text4 = getString(R.string.Bronquio)
        val text5 = getString(R.string.alveolo)
        when (organId) {
            "1" -> binding.expandTextView.setText(text1)
            "2" -> binding.expandTextView.setText(text2)
            "3" -> binding.expandTextView.setText(text3)
            "4" -> binding.expandTextView.setText(text4)
            "5" -> binding.expandTextView.setText(text5)
            "6" -> binding.expandTextView.setText(text1)
        }
        var images= arrayOf(R.drawable.epitelium, R.drawable.urinary, R.drawable.endocrin)
        when (organId) {
            "1" -> images = arrayOf(R.drawable.epitelium, R.drawable.urinary, R.drawable.endocrin)
            "2" -> images = arrayOf(R.drawable.alveolo, R.drawable.cardio, R.drawable.digestivo)
            "3" -> images = arrayOf(R.drawable.eye, R.drawable.fat, R.drawable.bronquio)
            "4" -> images = arrayOf(R.drawable.bulboolfatorio, R.drawable.bulboolfatorio, R.drawable.bulboolfatorio)
            "5" -> images = arrayOf(R.drawable.traquea, R.drawable.traquea, R.drawable.traquea)
            "6" -> images = arrayOf(R.drawable.epitelium, R.drawable.urinary, R.drawable.endocrin)
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
    }

}
package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentLinfaticSysBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentUrinarySysBinding
import com.google.android.gms.ads.AdRequest

class linfatic_sys : Fragment() {

    private var _binding: FragmentLinfaticSysBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLinfaticSysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toHistologic()
        initLoadAds()
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }

    private fun toHistologic() {
        binding.cardio1.setOnClickListener {
            val button = binding.tvId
            val buttonText = button.text.toString()
            linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText)
            view?.findNavController()?.navigate(linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText))
        }
        binding.cardio2.setOnClickListener {
            val button = binding.tvId2
            val buttonText = button.text.toString()
            linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText)
            view?.findNavController()?.navigate(linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText))
        }
        binding.cardio3.setOnClickListener {
            val button = binding.tvId3
            val buttonText = button.text.toString()
            linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText)
            view?.findNavController()?.navigate(linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText))
        }
        binding.cardio4.setOnClickListener {
            val button = binding.tvId4
            val buttonText = button.text.toString()
            linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText)
            view?.findNavController()?.navigate(linfatic_sysDirections.actionLinfaticSysToHistologicLinfatic(buttonText))
        }
    }
}
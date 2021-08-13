package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentBoneSysBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentUrinarySysBinding
import com.google.android.gms.ads.AdRequest

class bone_sys : Fragment() {

    private var _binding: FragmentBoneSysBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBoneSysBinding.inflate(inflater, container, false)
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
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
        binding.cardio2.setOnClickListener {
            val button = binding.tvId2
            val buttonText = button.text.toString()
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
        binding.cardio3.setOnClickListener {
            val button = binding.tvId3
            val buttonText = button.text.toString()
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
        binding.cardio4.setOnClickListener {
            val button = binding.tvId4
            val buttonText = button.text.toString()
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
        binding.cardio5.setOnClickListener {
            val button = binding.tvId5
            val buttonText = button.text.toString()
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
        binding.cardio6.setOnClickListener {
            val button = binding.tvId6
            val buttonText = button.text.toString()
            bone_sysDirections.actionBoneSysToHistologicBone(buttonText)
            view?.findNavController()?.navigate(bone_sysDirections.actionBoneSysToHistologicBone(buttonText))
        }
    }
}
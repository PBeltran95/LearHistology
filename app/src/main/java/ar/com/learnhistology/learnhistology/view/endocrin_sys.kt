package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentEndocrinSysBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentUrinarySysBinding

class endocrin_sys : Fragment() {

    private var _binding: FragmentEndocrinSysBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEndocrinSysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toHistologic()
    }

    private fun toHistologic() {
        binding.cardio1.setOnClickListener {
            val button = binding.tvId
            val buttonText = button.text.toString()
            endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText)
            view?.findNavController()?.navigate(endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText))
        }
        binding.cardio2.setOnClickListener {
            val button = binding.tvId2
            val buttonText = button.text.toString()
            endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText)
            view?.findNavController()?.navigate(endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText))
        }
        binding.cardio3.setOnClickListener {
            val button = binding.tvId3
            val buttonText = button.text.toString()
            endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText)
            view?.findNavController()?.navigate(endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText))
        }
        binding.cardio4.setOnClickListener {
            val button = binding.tvId4
            val buttonText = button.text.toString()
            endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText)
            view?.findNavController()?.navigate(endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText))
        }
        binding.cardio5.setOnClickListener {
            val button = binding.tvId5
            val buttonText = button.text.toString()
            endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText)
            view?.findNavController()?.navigate(endocrin_sysDirections.actionEndocrinSysToHistologicEndocrin(buttonText))
        }
    }
}
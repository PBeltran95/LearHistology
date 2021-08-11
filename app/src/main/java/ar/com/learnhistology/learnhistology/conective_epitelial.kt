package ar.com.learnhistology.learnhistology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.databinding.FragmentConectiveEpitelialBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentRespiratorySysBinding
import ar.com.learnhistology.learnhistology.view.respiratory_sysDirections

class conective_epitelial : Fragment() {

    private var _binding: FragmentConectiveEpitelialBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConectiveEpitelialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toHistologic()
    }

    private fun toHistologic() {
        binding.cardio1.setOnClickListener {
            val button = binding.tvId
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
        binding.cardio2.setOnClickListener {
            val button = binding.tvId2
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
        binding.cardio3.setOnClickListener {
            val button = binding.tvId3
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
        binding.cardio4.setOnClickListener {
            val button = binding.tvId4
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
        binding.cardio5.setOnClickListener {
            val button = binding.tvId5
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
        binding.cardio6.setOnClickListener {
            val button = binding.tvId6
            val buttonText = button.text.toString()
            conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText)
            view?.findNavController()?.navigate(conective_epitelialDirections.actionConectiveEpitelialToEpitelialAndConectiveTissue(buttonText))
        }
    }
}
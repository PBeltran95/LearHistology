package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentReproducerSysBinding
import ar.com.learnhistology.learnhistology.databinding.FragmentUrinarySysBinding

class reproducer_sys : Fragment() {

    private var _binding: FragmentReproducerSysBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReproducerSysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toHistologic()
    }

    private fun toHistologic() {
        binding.card.setOnClickListener {
            val button = binding.tvId
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card2.setOnClickListener {
            val button = binding.tvId2
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card3.setOnClickListener {
            val button = binding.tvId3
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card4.setOnClickListener {
            val button = binding.tvId4
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card5.setOnClickListener {
            val button = binding.tvId5
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card6.setOnClickListener {
            val button = binding.tvId6
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card7.setOnClickListener {
            val button = binding.tvId7
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card8.setOnClickListener {
            val button = binding.tvId8
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card9.setOnClickListener {
            val button = binding.tvId9
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card10.setOnClickListener {
            val button = binding.tvId10
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card11.setOnClickListener {
            val button = binding.tvId11
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card12.setOnClickListener {
            val button = binding.tvId12
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card13.setOnClickListener {
            val button = binding.tvId13
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
        binding.card14.setOnClickListener {
            val button = binding.tvId14
            val buttonText = button.text.toString()
            reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText)
            view?.findNavController()?.navigate(reproducer_sysDirections.actionReproducerSysToHistologicReproductor(buttonText))
        }
    }
}
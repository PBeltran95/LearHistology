package ar.com.learnhistology.learnhistology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.databinding.FragmentMainMenuBinding
import com.google.android.gms.ads.AdRequest

class main_menu : Fragment() {

    private var _binding: FragmentMainMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        chooseLayout()
        initLoadAds()
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }

    private fun chooseLayout() {
        binding.card13.setOnClickListener {
            val button = binding.buttonIdNum
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card14.setOnClickListener {
            val button = binding.buttonIdNum2
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card.setOnClickListener {
            val button = binding.buttonIdNum3
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card2.setOnClickListener {
            val button = binding.buttonIdNum4
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card3.setOnClickListener {
            val button = binding.buttonIdNum5
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card4.setOnClickListener {
            val button = binding.buttonIdNum6
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card5.setOnClickListener {
            val button = binding.buttonIdNum7
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card6.setOnClickListener {
            val button = binding.buttonIdNum8
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card7.setOnClickListener {
            val button = binding.buttonIdNum9
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card8.setOnClickListener {
            val button = binding.buttonIdNum10
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card9.setOnClickListener {
            val button = binding.buttonIdNum11
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card10.setOnClickListener {
            val button = binding.buttonIdNum12
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card11.setOnClickListener {
            val button = binding.buttonIdNum13
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.card12.setOnClickListener {
            val button = binding.buttonIdNum14
            val buttonText = button.text.toString()
            main_menuDirections.actionMainMenuToDigSysFragment(buttonText)
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToDigSysFragment(buttonText))
        }
        binding.btnQuiz.setOnClickListener {
            main_menuDirections.actionMainMenuToQuizFragment()
            view?.findNavController()?.navigate(main_menuDirections.actionMainMenuToQuizFragment())
        }

    }
        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }

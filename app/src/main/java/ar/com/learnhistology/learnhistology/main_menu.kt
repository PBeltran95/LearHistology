package ar.com.learnhistology.learnhistology

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.databinding.FragmentMainMenuBinding
import com.bumptech.glide.Glide

class main_menu : Fragment() {

    private var _binding: FragmentMainMenuBinding? = null
    private val binding get() = _binding!!

    private val TODIG = main_menuDirections.actionMainMenuToDigSysFragment()
    private val TORESPIRATORY = main_menuDirections.actionMainMenuToRespiratorySys()
    private val TOCARDIO = main_menuDirections.actionMainMenuToCardiovSys()
    private val TONERVEUS = main_menuDirections.actionMainMenuToNervousSys()
    private val TOLINFATIC = main_menuDirections.actionMainMenuToLinfaticSys()
    private val TOENDOCRIN = main_menuDirections.actionMainMenuToEndocrinSys()
    private val TOBONE = main_menuDirections.actionMainMenuToBoneSys()
    private val TOURINARY = main_menuDirections.actionMainMenuToUrinarySys()
    private val TOREPRODUCER = main_menuDirections.actionMainMenuToReproducerSys()
    private val TOMUSCLE = main_menuDirections.actionMainMenuToMuscleSys()
    private val TOEYE = main_menuDirections.actionMainMenuToEyeEar()
    private val TOTEGUMENTARY = main_menuDirections.actionMainMenuToTegumentarySys()
    private val TOEPITELIUM = main_menuDirections.actionMainMenuToConectiveEpitelial()
    private val TOFAT = main_menuDirections.actionMainMenuToFat()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        chooseLayout()
    }


    private fun chooseLayout() {

        binding.card.setOnClickListener {
            TODIG
            view?.findNavController()?.navigate(TODIG)
        }

            binding.card2.setOnClickListener {
                  TORESPIRATORY
                view?.findNavController()?.navigate(TORESPIRATORY)
            }

            binding.card3.setOnClickListener {
                 TOCARDIO
                view?.findNavController()?.navigate(TOCARDIO)
            }

            binding.card4.setOnClickListener {
                 TONERVEUS
                view?.findNavController()?.navigate(TONERVEUS)

            }

            binding.card5.setOnClickListener {
                TOLINFATIC
                view?.findNavController()?.navigate(TOLINFATIC)
            }

             binding.card6.setOnClickListener {
                TOENDOCRIN
                view?.findNavController()?.navigate(TOENDOCRIN)
             }

            binding.card7.setOnClickListener {
                    TOBONE
                    view?.findNavController()?.navigate(TOBONE)
            }

            binding.card8.setOnClickListener {
                TOURINARY
                view?.findNavController()?.navigate(TOURINARY)
            }

            binding.card9.setOnClickListener {
                 TOREPRODUCER
                view?.findNavController()?.navigate(TOREPRODUCER)
            }

            binding.card10.setOnClickListener {
                TOMUSCLE
                view?.findNavController()?.navigate(TOMUSCLE)
            }

            binding.card11.setOnClickListener {
                TOEYE
                view?.findNavController()?.navigate(TOEYE)
            }

            binding.card12.setOnClickListener {
                TOTEGUMENTARY
                view?.findNavController()?.navigate(TOTEGUMENTARY)
            }

            binding.card13.setOnClickListener {
                TOEPITELIUM
                view?.findNavController()?.navigate(TOEPITELIUM)
            }

            binding.card14.setOnClickListener {
                TOFAT
                view?.findNavController()?.navigate(TOFAT)
            }


    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }

package ar.com.learnhistology.learnhistology.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.databinding.FragmentQuizBinding
import com.google.android.gms.ads.AdRequest

class QuizFragment : Fragment() {


    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toQuiz()
        initLoadAds()
    }

    private fun toQuiz() {
        binding.btnStart.setOnClickListener {
            QuizFragmentDirections.actionQuizFragmentToRealQuizScreen()
            view?.findNavController()?.navigate(QuizFragmentDirections.actionQuizFragmentToRealQuizScreen())
        }
    }


    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
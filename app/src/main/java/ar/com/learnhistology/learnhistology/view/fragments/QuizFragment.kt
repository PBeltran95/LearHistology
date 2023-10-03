package ar.com.learnhistology.learnhistology.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.FragmentQuizBinding
import com.google.android.gms.ads.AdRequest

class QuizFragment : Fragment(R.layout.fragment_quiz) {

    private lateinit var binding: FragmentQuizBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentQuizBinding.bind(view)
        toQuiz()
    }

    private fun toQuiz() {
        binding.btnStart.setOnClickListener {
            QuizFragmentDirections.actionQuizFragmentToRealQuizScreen()
            view?.findNavController()?.navigate(QuizFragmentDirections.actionQuizFragmentToRealQuizScreen())
        }
    }
}
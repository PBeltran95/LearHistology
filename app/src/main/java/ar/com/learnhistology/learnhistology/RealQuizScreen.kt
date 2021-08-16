package ar.com.learnhistology.learnhistology

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.forEach
import androidx.core.view.get
import androidx.core.view.isVisible
import ar.com.learnhistology.learnhistology.data.CategoryObjects
import ar.com.learnhistology.learnhistology.databinding.FragmentRealQuizScreenBinding
import com.google.android.gms.ads.AdRequest

class RealQuizScreen : Fragment() {

    private var _binding: FragmentRealQuizScreenBinding? = null
    private val binding get() = _binding!!

    private var currentPosition:Int = 0
    val questionList = CategoryObjects.questions
    var score = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRealQuizScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initLoadAds()
        setQuestion(currentPosition)
        nextQuestion()
        checkAnswer(currentPosition)
    }

    private fun finishQuiz(currentPosition:Int) {
        if (currentPosition == 21){
            binding.tvPresentation.text = "Felicitaciones tu puntaje fue de $score"
            binding.tvQuestion.isVisible = false
            binding.radiogroup.isVisible = false
            binding.btnNext.isVisible = false
            binding.btnConfirm.isVisible = false
            binding.imgGratz.isVisible = true
        }
    }

    private fun nextQuestion() {
        binding.btnNext.setOnClickListener {if (binding.radiogroup.checkedRadioButtonId == -1 ){
            Toast.makeText(requireContext(), "Por favor selecciona una respuesta",
                Toast.LENGTH_SHORT).show()
        }else{
            this.currentPosition +=1
            binding.radiogroup.forEach {
                (it as RadioButton).apply {
                    if (isChecked){
                        setBackgroundColor(android.R.drawable.btn_radio)
                    }else setBackgroundColor(android.R.drawable.btn_radio)
                }
            }
            setQuestion(currentPosition)
            checkAnswer(currentPosition)
            finishQuiz(currentPosition)
            }
        }
    }

    private fun checkAnswer(currentPosition:Int) {
        val answer = questionList[currentPosition].correctAnswer
        binding.btnConfirm.setOnClickListener {
            if (getAnswer() == answer){
                score += 1
                binding.radiogroup.forEach {
                    (it as RadioButton).apply {
                        if (isChecked){
                            setBackgroundColor(Color.GREEN)
                        }else setBackgroundColor(Color.RED)
                    }
                }
            }else Toast.makeText(requireContext(), "Te equivocaste ;)",
                Toast.LENGTH_SHORT).show()

        }
    }
    //Obtiene un valor del 1 al 4 dependiendo de que casilla este presionada
    private fun getAnswer():Int {
        var answerOption:Int = 0
        if (binding.option1.isChecked){ answerOption = 1}
        if (binding.option2.isChecked){ answerOption = 2}
        if (binding.option3.isChecked){ answerOption = 3}
        if (binding.option4.isChecked){ answerOption = 4}
        return answerOption
    }

    private fun setQuestion(currentPosition:Int) {
        val questionList = CategoryObjects.questions
        var numQuestion = questionList.size
        binding.tvQuestion.text = questionList[currentPosition].question
        binding.option1.text = questionList[currentPosition].optionOne
        binding.option2.text = questionList[currentPosition].optionTwo
        binding.option3.text = questionList[currentPosition].optionThree
        binding.option4.text = questionList[currentPosition].optionFour

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
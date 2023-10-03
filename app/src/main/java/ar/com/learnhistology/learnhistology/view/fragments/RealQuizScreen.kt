package ar.com.learnhistology.learnhistology.view.fragments

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.forEach
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.CategoryObjects
import ar.com.learnhistology.learnhistology.databinding.FragmentRealQuizScreenBinding
import com.google.android.gms.ads.AdRequest

class RealQuizScreen : Fragment(R.layout.fragment_real_quiz_screen) {
    private var isConfirmed = false

    private lateinit var binding: FragmentRealQuizScreenBinding

    private var currentPosition:Int = 0
    private val questionList = CategoryObjects.questions
    var score = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRealQuizScreenBinding.bind(view)
        setQuestion(currentPosition)
        nextQuestion()
        checkAnswer(currentPosition)
    }

    private fun finishQuiz(currentPosition:Int) {
        if (currentPosition == 20){
            binding.tvPresentation.text = "Felicitaciones tu puntaje fue de $score"
            binding.tvQuestion.isVisible = false
            binding.radiogroup.isVisible = false
            binding.btnNext.isVisible = false
            binding.btnConfirm.isVisible = false
            binding.imgGratz.isVisible = true
        }
    }

    private fun nextQuestion() {
        binding.btnNext.setOnClickListener {if (binding.radiogroup.checkedRadioButtonId == -1 || !isConfirmed){
            Toast.makeText(requireContext(), "Por favor selecciona una respuesta y confirmela",
                Toast.LENGTH_SHORT).show()
        }else{
            this.currentPosition +=1
            isConfirmed = false
            binding.btnConfirm.isVisible = true
            binding.option1.isChecked = false
            binding.option2.isChecked = false
            binding.option3.isChecked = false
            binding.option4.isChecked = false
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
                isConfirmed = true
                binding.btnConfirm.isVisible = false
                binding.radiogroup.forEach {
                    (it as RadioButton).apply {
                        if (isChecked){
                            setBackgroundResource(R.drawable.radio_normal)
                        }else setBackgroundResource(R.drawable.radio_incorrect)
                    }
                }
            }else Toast.makeText(requireContext(), "Te equivocaste ;)",
                Toast.LENGTH_SHORT).show()
            score -= 1


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
}
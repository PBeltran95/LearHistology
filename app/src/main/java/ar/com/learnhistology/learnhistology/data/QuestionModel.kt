package ar.com.learnhistology.learnhistology.data

data class QuestionModel(
    val id:Int,
    val question:String,

    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,

    val correctAnswer:Int
)
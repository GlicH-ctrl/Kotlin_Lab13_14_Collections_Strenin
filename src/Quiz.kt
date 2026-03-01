// Quiz.kt - Интерфейсы

enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    
    val question1 = Question<String>("Речка спятила с ума – По домам пошла сама.", "водопровод", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("Земля круглая?", true, Difficulty.EASY)
    val question3 = Question<Int>("Сколько будет 2 + 2?", 4, Difficulty.HARD)
    
    companion object StudentProgress {
        var total: Int = 3
        var answered: Int = 1
    }
    
    override val progressText: String
        get() = "${Quiz.answered} of ${Quiz.total} answered"
    
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("x") }
        repeat(Quiz.total - Quiz.answered) { print("X") }
        println()
        println(progressText)
    }
    
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

fun main() {
    val quiz = Quiz()
    quiz.printProgressBar()
    println()
    quiz.printQuiz()
}
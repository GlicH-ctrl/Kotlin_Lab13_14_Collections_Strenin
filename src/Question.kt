enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

object StudentProgress {
    var total: Int = 0
    var answered: Int = 0
}

class Quiz {
    val question1 = Question<String>("Речка спятила с ума – По домам пошла сама.", "водопровод", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("Земля круглая?", true, Difficulty.EASY)
    val question3 = Question<Int>("Сколько будет 2 + 2?", 4, Difficulty.HARD)
    
    companion object StudentProgress {
        var total: Int = 3
        var answered: Int = 1
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

val Quiz.StudentProgress.progressText: String
    get() = "${Quiz.answered} of ${Quiz.total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("░") }
    println()
    println(Quiz.StudentProgress.progressText)
}

fun main() {
    Quiz().apply {
        printQuiz()
    }
    
    println()
    Quiz.StudentProgress.printProgressBar()
}
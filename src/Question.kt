enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = Question<String>("Речка спятила с ума – По домам пошла сама.", "водопровод", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("Земля круглая?", true, Difficulty.EASY)
    val question3 = Question<Int>("Сколько будет 2 + 2?", 4, Difficulty.HARD)
    
    println(question1)
    println(question2)
    println(question3)
}
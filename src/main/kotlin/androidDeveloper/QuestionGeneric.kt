package androidDeveloper



data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Quiz : ProgressPrintable{

   companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 7
       val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
       val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
       val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)


   }
    override val progressText: String
        get() = "${answered} of ${total} answered from override"
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}
fun main() {
    println(Quiz.question1.questionText)
    println(Quiz.question1.difficulty)
    println(Quiz.question1.answer)
    println()
    println(Quiz.question2.questionText)
    println(Quiz.question2.difficulty)
    println(Quiz.question2.answer)
    println()
    println(Quiz.question3.questionText)
    println(Quiz.question3.difficulty)
    println(Quiz.question3.answer)
    println()
    println("${Quiz.answered} of ${Quiz.total} answered. from companion")

    Quiz().printProgressBar()
    println()
    println()

    Quiz().apply {
        printQuiz()
    }
}

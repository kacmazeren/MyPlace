import java.time.LocalDate
import java.time.LocalTime

fun main(args: Array<String>)  {
    println("Hello world")
    dayOfWeek()
    var time : LocalTime = LocalTime.now()
    var greeting = when{
        time < LocalTime.NOON -> "Good morning, Kotlin"
        else -> "Good night, Kotlin"
    }
    println(greeting)
    getFortuneCookie()
    getBirthday()
    println(getFortune())
    }  // uygulama iki kez yaş sorup sonuç vererek kapanıyor.
fun dayOfWeek() {
    val today = LocalDate.now()
    val todaysName = today.dayOfWeek
    println("What day is it today? $todaysName")
}
fun getFortuneCookie(): MutableList<String> {
    val fortunes = mutableListOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return fortunes
}
fun getBirthday(): Int {
    println("Enter your birthday: ")
    var birthday: Int? = readLine()?.toIntOrNull() // buna niye elvis yapamadım ?: = 1
    if (birthday == null) {
        birthday = 1
    }
        return birthday
}
fun getFortune(): String {
    val fortunes = getFortuneCookie()
    val index = getBirthday() % fortunes.size
    var birthday = getBirthday()

    when (birthday){
        28, 31 -> println("This is the best age have fun!!")
        // hem bunu veriyor hem de genelden geleni veriyor çıktı olarak
    }
    return fortunes[index]
}



    /*var fortune: Int? = getBirthday()?.div(fortunes.size)
    println(fortune)
    print("Your fortune is: ")
    println(fortunes[fortune!!])

    if (fortune == 5) {
        println("that was the last")
    } else println("continue")*/





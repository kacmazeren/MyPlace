import java.util.random.RandomGenerator
import kotlin.random.Random

fun main(args: Array<String>) {
//LAMBDA
    var rollDice : () -> Int = {(1..12).random() }
    var rollDice1 = {side : Int -> if(side>0) {
        (1..side).random() } else 0 }

    val rollDice2: (Int) -> Int = { sides -> if (sides > 0) (1..sides).random() else 0 }

    /* var ya da val değerinin hemen ardından type tanımlanıyor ve = operatöründen sonra
    * kıvırcık parantezle fonksiyon alanı açılıyor. İçerisine istenilen fonkisyonlar yazılabilir. */
    println("gamePlay dice")
    gamePlay(rollDice2(4))
    println("first dice 1 to 12")
    println("${rollDice.invoke()}")
    println("${rollDice.invoke()}")
    println("${rollDice.invoke()}")
    println("with sides of 6")
    println("${rollDice1.invoke(6)}")
    println("${rollDice1.invoke(6)}")
    println("${rollDice1.invoke(6)}")
    println("with sides of 0")
    println("${rollDice1.invoke(0)}")
    println("${rollDice1.invoke(0)}")
    println("${rollDice1.invoke(0)}")
    println("with sides of 6 and dice2")
    println("${rollDice2.invoke(6)}")
    println("${rollDice2.invoke(6)}")
    println("${rollDice2.invoke(6)}")


}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}




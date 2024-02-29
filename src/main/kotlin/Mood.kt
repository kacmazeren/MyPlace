fun main() {


    whatShouldIDoToday()
}

fun whatShouldIDoToday( weather: String ="Sunny", temperature: Int =24) {
    println("How is your mood today?" )
    var mood: String = readln()
    println("$mood")
  when(mood){
      "good" -> println("Go for a walk")
      "bad" -> println("Stay home and watch movie")
      "sad"  -> if (mood=="sad" || weather=="rainy" || temperature==0){
          println("stay in bed")

      } else {
          println("Not today")
      }
  }
    when(temperature){
        35 -> println("Go swimming")
    }
}

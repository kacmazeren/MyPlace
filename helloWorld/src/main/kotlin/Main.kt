import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    greeting("Hello, World!")
    greeting("Welcome to 30 Days of Code!")

   /* var i = 4
    var d = 4.0
    var s = "HackerRank"
    var int = readln().toInt() + i
    var doub = readln().toDouble() + d
    var str = readln().toString()
    println(int)
    println(doub)
    println("$s $str")
*/
   // println(superDigit("1233643", 323))
   // fizzBuzz(3)
   // fizzBuzz(5)
    //fizzBuzz(15)
    //fizzBuzz(17)

   /* solve(10.25, 17, 5)

    val myArray = arrayOf(1, 2, 3, 4, 5)
    println(simpleArraySum(myArray))

    println(compareTriplets(arrayOf(1,2,3) , arrayOf(3,2,1)).contentToString())
    */
    weirdNumber()

}

fun greeting( stdin : String ){
    println(stdin)
}

fun superDigit(n: String, k: Int): Int {
    // Write your code here
    var p = n.repeat(k).toLong()
                var sum : Long = 0
                do {
                    sum += p % 10
                    p = p / 10
                }while (p> 0)

                 val superDigitNumber : Int
                    if(sum>9){
                         superDigitNumber = superDigit("$sum",1)

                    }else superDigitNumber = sum.toInt()
                return superDigitNumber
}

fun fizzBuzz(n: Int): Unit {
    // Write your code here

for (i in 1..n)
       if (i % 15 == 0) {
        println("FizzBuzz")
       }else if (i % 5 == 0){
           println("Buzz")
       }else if (i % 3 == 0){
           println("Fizz")
       }else println("$i")
}

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    // Write your code here
    var total = (meal_cost * tip_percent/100) + (meal_cost * tax_percent/100) + meal_cost
    println(total.roundToInt())

}
fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0
    for(i in ar){
        sum += i
    }
    return sum
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0
    for (i in a.indices)
        when (a.isNotEmpty()) {
            a[i] > b[i] -> alice++
            a[i] < b[i] -> bob++
            else -> bob + 1
        }
    return arrayOf(alice, bob)
}

fun weirdNumber (){
    val n = readLine()!!.toInt()

    if (n % 2 == 1){
         println("Weird")
    }else if (n % 2 == 0 && 2<=n && 5>=n){
        println("Not Weird")
    }else if (n % 2 == 0 && 6<=n && 20>=n){
        println("Weird")
    }else if (n % 2 == 0 && 20>=n){
        println("Not Weird")
    }
}

fun git(){
    println("git için commit denemesi yapmaya çalışıyorum")
    println("acaba nasıl olacak")
    println("bu dosya yerelden açıldı kayıt gidecek mi deye kontrol ediyorum")
    println("acaba gitDiff bunu farkedecek mi")
}
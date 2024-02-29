package Book

import Book.Constant.BASE_URL
import kotlin.random.Random

class Book1 (val title:String, val author: String, val year: Int, var pages: Int){
    fun Book1.weight() : Double { return (pages * 1.5) }
    fun tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0


var titleAuthor = title to author
var titleAuthorYear = title to author to year

    val canBorrow = false
fun canBorrow(): Boolean{
    when (borrow<=10) {
        canBorrow -> {
            "You borrowed less then 10 books"
        }

        else -> {
            "You cant borrow more then 10 books"
        }
    }
    return canBorrow
}
    companion object {  // bunun yerine Constant içindeki baseurl değeri de alınabilir.
        val BASE_URL = "http://www.turtlecare.net/"
    }
fun printUrl(){
    println("the book url is: ${BASE_URL}/${titleAuthor.first}.html")
}


}


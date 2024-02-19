package Book

import kotlin.random.Random

fun main(args: Array<String>) {

    val book = Book("tsdff", "dvxcxczx")

    println("Title: ${book.title} Author: ${book.author} Page ${book.currentPage}")

    val ebook = ebook("text", "text")
    ebook.readPage()
    println("Ebook words read: ${ebook.getWordsRead()}")

    val book1 = Book1("X", "Y", 2000,888)
    println(book1.titleAuthorYear.first.first)
    println(book1.titleAuthor)
    println(book1.titleAuthorYear)
    println("Here is your book ${book1.titleAuthor.first} written by ${book1.titleAuthor.second} in ${book1.titleAuthorYear.second}.")

    val allBooks = setOf<String>("Hamlet", "Macbeth", "Romeo and Juliet")
    val library = mapOf<String, Set<String> >(("WS" to allBooks))
    println( library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf<String,String>("Machbet" to "WS")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

    book1.printUrl()

    val puppy = Puppy()
    while (book1.pages > 0) {
        puppy.playWithBook(book1)
        println("${book1.pages} left in ${book1.title}")
    }
    println("Sad puppy, no more pages in ${book1.title}. ")

}




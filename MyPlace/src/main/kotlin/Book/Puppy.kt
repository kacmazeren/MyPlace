package Book

import kotlin.random.Random
class Puppy() {
    fun playWithBook(book1: Book1) {
        book1.tornPages(Random.nextInt(12))
    }
}
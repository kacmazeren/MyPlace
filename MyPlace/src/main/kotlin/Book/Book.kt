package Book

open class Book(var title:String , var author:String) {

  var currentPage = 0

    open fun readPage(){
        currentPage += 1
    }

}

  class ebook(title: String, author: String):Book(title.toString(), author.toString()){

      private var words =0
      override fun readPage() {
          super.readPage()
          words+=250
      }
      fun getWordsRead(): Int {
          return words
      }

  }


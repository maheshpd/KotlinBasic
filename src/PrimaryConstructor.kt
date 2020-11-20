class PrimaryConstructor(val name:String, var price: Int, var authorName:String) {

    fun bookName():String{
        return name
    }

    fun bookPrice(): Int {
        return price
    }

    fun BookAuthor(): String {
        return authorName
    }

}

fun main(){
   val result =  PrimaryConstructor("Science",200,"Hetvi")
    println(result.bookName())
    println(result.bookPrice())
    println(result.BookAuthor())
}

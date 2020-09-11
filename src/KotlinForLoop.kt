fun main() {
    for(n in 0..5) {
        println(n)
    }

//    Kotlin for loop using Array
    val myArray = arrayOf("ab","bc","cd","12","23","34")
    for (i in myArray)
        println(i)

    //Koltin for Loop iterating through array indices

    for (n in myArray.indices)
    {


        println("myArray[$n]: ${myArray[n]}")
    }
}
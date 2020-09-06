fun main(){

    // +,-,! //Not ==,++,--

    /*var a = 2

   a++  //3
    println("Increment Operator $a")
   a++ //4
    println("Increment Operator $a")

    a-- //4-1 = 3
    println("Decrement Operator $a")
    a-- //3-1 = 2
    println("Decrement Operator $a")*/

//    'A','B'
//    "Hello"
//    """Hello"""

    var name1 = "Welcome"  //from i index to 3 index
    var name2 = "welcome"


    println(name1.length)

    //Equal
    println("String Equals? : ${name1 != name2}")

    println("3rd index Char: ${name1[3]}")
    println("3rd index Char: ${name1.get(3)}")


    //Substring
    println("Index from 0 to 3: ${name1.subSequence(0,3)}")

    var email = "Test@gmail.com"
    println("Contains @ :${email.contains("@")}")



}
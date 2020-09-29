fun main() {

    /*Using Standard Library Function
    var num = 25
    println("Sqaure root of $num is: ${Math.sqrt(num.toDouble())}")

    User- defined function
   var result =  sayHello(10,"Hetvi")
    println(result)

    var addition = sum(2,3) //5
    addition  = 2

    println(addition)

//    val addtion = sum(2,3)
    println(sum(2,3))
    var principleAmount = sum(3,2)
    principleAmount +=2

    println(principleAmount)

    val addi = sum(2,3)
    println(addi)
    val names = GetName("Hetvi")
    println(names)

    println(10+20)

    println(addtion(2, 3))  //5
    println(sub(3, 1)) //2
    println(mul(2, 2)) //4

    /addtion
 mul
    sub
    division*/

      val  result =  sum(2,3)
        println(result)

        sayHello(1,"Hello1")

}

//Non-return type
fun sayHello(n: Int, name: String) {
    println("Number is $n and name is $name ")
}

//2nd example
fun sum(a: Int, b: Int): Int {
    return a + b
}

//String function
fun GetName(name: String): String {
    return name
}

fun addtion(n1: Int, n2: Int): Int {
    return n1 + n2

}

fun sub(n1: Int, n2: Int): Int {
    return n1 - n2
}

fun mul(n1: Int, n2: Int): Int {
    return n1 * n2
}

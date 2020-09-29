fun main() {

//    defaultValueArgument(10,'P')

    class10("Hello",20)
    class10(number = 50)
    class10(firstNumber = "World")
    class10()
//    class10(200,100, "Hello")

}

fun class10(firstNumber:String = "Hetvi", number: Int = 100,number2: Int = 30) {
    println("Name is: $firstNumber and number is $number")
}





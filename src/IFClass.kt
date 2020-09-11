fun main() {
    val a=5
    val b=6

    if (a!=b){
        println("Not Equal")
    }

    //if Statement
    val number = 100
    //if expression


    if (number%2 == 0)
        println("Even Number")


    //If Else Statement
     val marks = 5
     if (marks<=30) {  1..30
         println("Father will get angery")
     } else {
         println("Father will give you Gift")
    }

    //if..else  if..else ladder

    val num = 99
    if (num<0) {
        println("Number is Negative")
    } else if (num> 0 && num<10)
        println("Single digit number")
    else if (num >= 10 && num <100)
        println("Double digit number")
    else
        println("number has 3 or more digit")

    //Nested If else Statement
    val num1 = 101
    if (num1 < 0)
        println("Negative Number")
    else {
        //Nested Expression
        if (num1%2 == 0)
            println("Even Number")
        else
            println("Odd Number")
    }
}
fun main() {
    var ch = 'A'

    when(ch) {
        'A' -> println("A is Vowel")
        'E' -> println("E is Vowel")
        'I' -> println("I is Vowel")
        'O' -> println("O is Vowel")
        'U' -> println("U is Vowel")

        else -> println("$ch is a Consonant")
    }

    when(ch) {  // -> = (lambda)
        'A','E','I','O','U' -> println("$ch is a Vowel")
        else -> println("$ch is a Consonant")
    }

    //Koltin when expression with ranges

    val num = 5
    when(num) {
        in 1..9 -> println("$num is a single digit number")
        in 10..99 -> println("$num is a two digit number")
        in 100..999 -> println("$num is a three digit number")
        else -> println("$num has more than three digit")
    }

//    Arithmetic oeration inside when expression
    var age = 91
    when(age) {
        in 1..17 -> {
            val num = 18 - age
            println("You will be eligible for voting in $num years")
        }
        in 18..90 ->  println("You are eligible for voting")
    }

}
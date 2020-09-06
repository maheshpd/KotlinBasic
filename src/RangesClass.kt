fun main() {

    //1,2,3,4,5
    //1..5


    //A,B,C,D
    //A..E

    //Find range Method
    val number = 1..5
    println("Find 6 in number ${6 in number}")

    var cha = 'A'..'D'
    println("Find F in Cha: ${'C' in cha}")

    //Second Range Method
    val oneToFive = 1.rangeTo(5)
    val AToZ = 'A'.rangeTo('Z')
    println("rangeTo:")
    for (x in oneToFive) {
        println(x)
    }

    //DownTo
    println("Down To")
    val sixToOne = 6.downTo(4)
    for (down in sixToOne)
        println(down)

    val oneToTen = 1..10
    val odd = oneToTen.step(3)
    println("End")

    //Setp
    for (s in odd) {
        println(s)
    }

    println("Reversed")
    val oneToFive1 = 1..5
    for (n in oneToFive1.reversed())
    {
        println(n)
    }



//    println("Character")
//    for (cha1 in AToZ)
//        println(cha1)

//    for (int in 'A'..'D') {
//        print("Find F in Rang of AtOD: ${'F' in cha}")
//    }


}
import java.lang.reflect.Array

fun main ()
{
    val sums = {num1: Int, num2: Int -> num1 + num2}
    println("2+3 : ${sums(2,3)}")

    println(sums(1,3))

}

   fun sums(n11: Int, n22:Int):Int {
    return n11+n22
}
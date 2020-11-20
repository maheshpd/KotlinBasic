class SecondaryConstructor {

    constructor(name:String, age: Int) {
        println("Student Name: ${name.toLowerCase()}")
        println("Student Age: $age")
    }
}

fun main(){
    val result = SecondaryConstructor("hetvi",14)

}
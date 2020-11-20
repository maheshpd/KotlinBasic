open class ABC {
   open fun name() {
        print("Hey! Whats your name?")
    }
}

class BCD : ABC() {


    override fun name() {
        print("My Name is Hetvi")
    }
}

fun main() {
    val b = BCD()
    b.name()
}
fun main() {
    println(true && true) // true
    println(true && false) // false
    println(false && false) // false

    println("-----")

    println(true || true) // true
    println(true || false) // true
    println(false || false) // false

    println("-----")

    println(!true) // false
    println(!false) // true

    println("-----")

    println(5 > 3) // true
    println(5 < 3) // false
    println(5 == 3) // false
    println(4 >= 4) // true
    println(5 != 3) // true
    println(4 != 4) // false

    println("-----")
    println((true && false) || (true && false)) // false
    println((true && false) || (true || false)) // true
}
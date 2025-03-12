fun main() {
    val onlyEvenNumbers = arrayListOf(2, 4, 6, 7, 8, 10)
    var isOnlyEven = true

    println("Are there only even numbers?")

    loop@for (number in onlyEvenNumbers) {
        if (number % 2 != 0) {
            isOnlyEven = false
            break@loop
        }
    }
    println(if (isOnlyEven) "YES" else "NO")
}
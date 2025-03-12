fun main() {
    val onlyEvenNumbers = arrayListOf(2, 4, 6, 7, 8, 10)
    var isOnlyEven = true

    println("Are there only even numbers?")

    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) {
            isOnlyEven = false
            break
        }
    }
    println(if (isOnlyEven) "YES" else "NO")
}
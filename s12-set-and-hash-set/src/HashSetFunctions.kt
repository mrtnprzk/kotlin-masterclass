fun main() {
    val numbers = hashSetOf("one", "two", "three", "four")
    val newNumbers = hashSetOf("six", "two", "ten", "four")
    println(numbers.intersect(newNumbers))

    numbers.clear()
    println(numbers)
    println(numbers.isEmpty())
}
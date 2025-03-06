fun main() {
    val numbers = setOf("one", "two", "three", null)
    println(numbers.size)
    println(numbers.contains("one"))
    println(numbers.contains("four"))

    println(numbers.containsAll(setOf("one", "three")))
    println(numbers.containsAll(setOf("one", "four")))

    println(numbers.isEmpty())
    println(setOf<Int>().isEmpty())
}
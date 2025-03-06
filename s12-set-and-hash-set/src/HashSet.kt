fun main() {
    val numbers = hashSetOf(4, 3, 2, 5, null)
    val noNumbers = hashSetOf<Int>()
    println(numbers)
    println(noNumbers)

    numbers.add(1)
    println(numbers)

    val newNumbers = hashSetOf(5, 6, 7, null, 10)
    numbers.addAll(newNumbers)
    println(numbers)
    numbers.remove(10)
    println(numbers)

    val toRemove = hashSetOf<Int>(3,5,11)
    numbers.removeAll(toRemove)
    println(numbers)
}
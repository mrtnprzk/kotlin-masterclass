fun main() {
    val numbers = setOf(1, 2, 3, 2)
    println(numbers) // [1, 2, 3]

    val numbers2 = setOf<Int>()
    println(numbers2)

    val numbers3 = setOf<Int?>(1, 2, 3, null, 1, null, 2, null, 3)
    println(numbers3)
}
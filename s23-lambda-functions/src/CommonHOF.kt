fun main() {
    val clients = arrayOf("Alice", "Bob", "Jack")
    clients.forEach { println("Hello, $it!") }
    clients.filter { it.length < 4 }.forEach { println("Hello filtered, $it!") }

    val sizes = clients.map {it.length}
    println("Sizes: $sizes")

    val sorted = clients.sortedBy { it.length }
    println("Sorted list: $sorted")

    val max = clients.maxBy { it.length }
    println("Max: $max")

    val min = clients.minBy { it.length }
    println("Min: $min")
}
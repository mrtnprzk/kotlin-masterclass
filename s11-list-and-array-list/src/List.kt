fun main() {
    val colors = listOf("Red", "Green", "Blue")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("Red", "Green", null, null, "Pink")
    println(colors3)
    println(colors3[1])
    println(colors3.get(1))
    println(colors3.size)
}
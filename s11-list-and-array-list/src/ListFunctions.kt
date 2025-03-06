fun main() {
    val colors = listOf("red", "green", "blue", "yellow", "red", "blue")
    println(colors.size)
    println(colors.contains("yellow"))
    println(colors.contains("pink"))

    val newColors = listOf("blue", "green")
    println(colors.containsAll(newColors))

    println(colors.indexOf("blue"))
    println(colors.lastIndexOf("blue"))
}
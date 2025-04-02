fun main() {
    val name = "Michael"
    println(name.slim())
}

fun String.slim(): String {
    return this.substring(1, length - 1)
}
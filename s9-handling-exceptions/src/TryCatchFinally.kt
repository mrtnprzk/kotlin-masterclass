fun main() {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
        e.printStackTrace()
    } finally {
        println("Finally")
    }
}
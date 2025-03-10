fun main() {
    val animal = "wolf"
    val action = when (animal) {
        "cat" -> "Pet it"
        "dog" -> "Feed it"
        "wolf" -> "Run away"
        else -> println("Google it")
    }
    println(action)

    println("---------------------------------")

    val month = "January"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println(days)
}
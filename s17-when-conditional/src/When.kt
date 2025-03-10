fun main() {
    val animal = "cat"
    var action = ""

    when (animal) {
        "dog" -> {
            action = "Pet the Dog"
        }
        "cat" -> {
            action = "Feed the Cat"
        }
        else -> {
            action = "Google this animal"
        }
    }

    println(action)

    println("---------------------------------")

    val number = 10
    when (number % 2) {
        1 -> println("The number is Odd")
        else -> println("The number is Even")
    }
}
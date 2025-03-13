fun main() {
    val r = 10
    val area = calculateCircleArea(r)
    println("A circle with the radius $r has area of $area")

    val listOfPeople = listOf("Anna", "Martin", "Brad")
    for (person in listOfPeople) {
        val message = personalizedGreeting(person)
        println(message)
    }
}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun personalizedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you OK? $person"
        'B' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}
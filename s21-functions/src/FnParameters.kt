fun main() {
    for (i in 0..4) {
        double(i)
    }
    sayHelloTOPeople(listOf("Martin", "Peter", "Adam"))
}

fun double(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

fun sayHelloTOPeople(people: Collection<String>) {
    for (person in people) {
        println("Hello $person")
    }
}
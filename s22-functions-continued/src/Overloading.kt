fun main() {
    val case1 = multiply(4)
    val case2 = multiply(4, 4)

    println("Case1: $case1 ... case2: $case2")

    sayHello("Martin")
    sayHello(listOf("Martin", "Adam", "Faye"))
}

fun multiply(number: Int): Int = number * 2
fun multiply(number: Int, multiplier: Int): Int = number * multiplier

fun sayHello(person: String) {
    println("Hello from String $person!")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hello from Collection $person!")
    }
}
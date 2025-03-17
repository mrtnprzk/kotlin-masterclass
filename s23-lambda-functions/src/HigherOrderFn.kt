fun main() {
    val names = arrayListOf("John", "Denise", "Jan")
    val myLambda = { name: String -> println("Hello, $name!") }
    sayHello(names, myLambda)
    // or
    sayHello(names, { name: String -> println("Hello, $name!") })
    // or
    sayHello(names) { name: String -> println("Hello, $name!") }
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}
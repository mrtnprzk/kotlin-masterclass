fun main() {
sayHello("A", "B", "C", "D")
}

fun sayHello(vararg names: String) {
 for (name in names) {
     println("Hello $name!")
 }
}
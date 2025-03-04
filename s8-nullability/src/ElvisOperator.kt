fun main() {
    var name: String? = null
    println(name?:"No name") // No name
    name = "Martin"
    println(name?:"No name") // Martin
}
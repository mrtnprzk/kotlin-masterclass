fun main() {
    val string = "string functions"
    println(string.length)
    println(string.get(3)) // i
    println(string[3]) // i
    println(string.substring(3)) // ing functions
    println(string.substring(3, 9)) // ing fu
    println(string.capitalize())

    val string2 = "DECAPITALIZE"
    println(string2.decapitalize())

    val string3 = "        trim pls         "
    println(string3.trim())
}
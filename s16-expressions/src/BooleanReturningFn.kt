fun main() {
    val animals = arrayListOf<String>()

    if (animals.isEmpty()) {
        animals.add("dog")
    }

    if (animals.add("horse")) {
        println("Horse was added")
    }

    println(animals)
}
fun main() {
    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = false

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println(" Buy only cat")
        }
    } else {
        println("Ask the pet store owner to get a cat")
    }
}
fun main() {
    listAnimals()
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("Animal: $animal")
    }

    val myAnimals = arrayListOf("cat", "dog", "cow")
    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}
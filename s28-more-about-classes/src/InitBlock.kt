fun main() {
    var myPet = Pet()
}

class Pet {
    var type: String? = "no type"
    var topSpeed = 100

    init {
        println("Type $type top speed $topSpeed")
    }
}
fun main() {
    val child = Child()

    child.raisePet()
}

interface Pet {
    var cutenessLevel: Int

    fun startPlaying()
    fun feed()
}

class Puppy : Pet {
    override var cutenessLevel: Int = 8

    override fun startPlaying() {
        println("Running jumping and barking")
    }

    override fun feed() {
        println("Give doggy treats")
    }

}

class Child {
    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
        }
        pet.feed()
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}
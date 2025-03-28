fun main() {
    val myOven: Oven? = null

    myOven?.turnOn()
    myOven?.cook(150)
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}
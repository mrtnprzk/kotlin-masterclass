fun main() {
    val myOven: Oven = getOven()

    myOven.turnOn()
    myOven.cook(90)
    myOven.turnOff()
}

class Bosch : Oven {
    override val temperature: Int = 180

    override fun turnOn() {
        println("Turning ON.")
    }

    override fun turnOff() {
        println("Turning OFF.")
    }
}

fun getOven() : Oven {
    return Bosch()
}
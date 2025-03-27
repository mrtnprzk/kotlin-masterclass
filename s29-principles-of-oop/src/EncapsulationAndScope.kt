fun main() {

}

open class Airplane {
    //if I would set type and fly as a private, I would get error in other classes
    //if I would set type and fly as a protective, I would get error only in MyCar class

    var type = "Airbus"

    fun fly() {
        println("flying")
    }
}

class MyAirplane : Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}
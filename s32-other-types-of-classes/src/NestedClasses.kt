fun main() {
    val myCar = Car()
    myCar.drive()
}

class Car {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at speed $speed")
    }

    private inner class Engine {
        val rpm = 1000
        fun run() {
            this@Car.speed = 50
            println("Engine is running at $rpm rpm")
//            this@Car.drive()
        }
    }
}
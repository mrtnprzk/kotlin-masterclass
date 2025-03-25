fun main() {
    val myCar: Car = Car()
    val yourCar: Car = Car()

    myCar.model = "Tesla"
    yourCar.model = "BMW"

    myCar.start()
    myCar.drive(130)

    yourCar.start()
    yourCar.drive(120)
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}
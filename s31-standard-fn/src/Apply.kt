fun main() {
    val myCar = MyCar().apply {
        speed = 50
        color = "red"
        startCar()
    }
    println("ID: $myCar")
}

class MyCar {
    var speed = 10
    var color = "blue"

    fun startCar() {
        println("Starting the car, speed is $speed, color is $color.")
    }
}
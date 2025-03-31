fun main() {
    val car1 = NewCar().run {
        speed = 70
        drive()
        println("First new car is driving")
        this
    }
    
    println("WTF? $car1")

    run {
        val car2 = NewCar()
        car2.speed = 50
        car2.drive()
    }
}

class NewCar {
    var speed = 10
    fun drive() {
        println("Car is driving at $speed")
    }
}
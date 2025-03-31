fun main() {
    Car().apply {
        speed = 75
        drive()
    }.also { car ->
        println("Car is running")
        println("Car speed is ${car.speed}")
    }
}


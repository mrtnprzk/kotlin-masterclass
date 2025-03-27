fun main() {
    val vehicle = Vehicle()
    vehicle.speed = 100
    println("Name is ${vehicle.name}")
    println("Speed is ${vehicle.speed}")
}

class Vehicle {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "$value"
        }
}
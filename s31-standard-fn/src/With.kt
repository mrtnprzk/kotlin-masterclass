fun main() {
    with(Car()) {
        brand = "Audi"
        speed = 80
        drive()
        println("Car is driving")
    }
    
    with(Car()){
        drive()
    }
}

class Car {
    var brand = "Tesla"
    var speed = 50
    fun drive() {
        println("Driving car $brand at speed $speed")
    }
}